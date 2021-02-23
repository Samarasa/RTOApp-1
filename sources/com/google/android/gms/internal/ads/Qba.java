package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class Qba {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f8357a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: b  reason: collision with root package name */
    private String f8358b = "googleads.g.doubleclick.net";

    /* renamed from: c  reason: collision with root package name */
    private String f8359c = "/pagead/ads";

    /* renamed from: d  reason: collision with root package name */
    private String f8360d = "ad.doubleclick.net";

    /* renamed from: e  reason: collision with root package name */
    private String[] f8361e = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f  reason: collision with root package name */
    private HW f8362f;

    public Qba(HW hw) {
        this.f8362f = hw;
    }

    private final Uri a(Uri uri, String str) {
        try {
            boolean c2 = c(uri);
            if (c2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new C2506rda("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new C2506rda("Query parameter already exists: ms");
            }
            if (c2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new C2506rda("Provided Uri is not in a valid state");
        }
    }

    private final boolean c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f8360d);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final Uri a(Uri uri, Context context) {
        return a(uri, this.f8362f.a(context));
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, this.f8362f.a(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C2506rda("Provided Uri is not in a valid state");
        }
    }

    public final HW a() {
        return this.f8362f;
    }

    public final void a(MotionEvent motionEvent) {
        this.f8362f.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f8361e) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    public final boolean b(Uri uri) {
        if (a(uri)) {
            for (String endsWith : f8357a) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
