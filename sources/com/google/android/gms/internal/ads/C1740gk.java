package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.gk  reason: case insensitive filesystem */
public final class C1740gk {
    private static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String a(Uri uri, Context context) {
        if (!p.A().g(context)) {
            return uri.toString();
        }
        String d2 = p.A().d(context);
        if (d2 == null) {
            return uri.toString();
        }
        if (((Boolean) Qqa.e().a(F.X)).booleanValue()) {
            String str = (String) Qqa.e().a(F.Y);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                p.A().d(context, d2);
                return a(uri2, context).replace(str, d2);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = a(a(uri.toString(), context), "fbs_aeid", d2).toString();
            p.A().d(context, d2);
            return uri3;
        }
        return uri.toString();
    }

    private static String a(String str, Context context) {
        String b2 = p.A().b(context);
        String c2 = p.A().c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(b2)) {
            str = a(str, "gmp_app_id", b2).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(c2)) ? str : a(str, "fbs_aiid", c2).toString();
    }

    public static String a(String str, Context context, boolean z) {
        String d2;
        if ((((Boolean) Qqa.e().a(F.fa)).booleanValue() && !z) || !p.A().g(context) || TextUtils.isEmpty(str) || (d2 = p.A().d(context)) == null) {
            return str;
        }
        if (((Boolean) Qqa.e().a(F.X)).booleanValue()) {
            String str2 = (String) Qqa.e().a(F.Y);
            if (!str.contains(str2)) {
                return str;
            }
            if (p.c().c(str)) {
                p.A().d(context, d2);
                return a(str, context).replace(str2, d2);
            } else if (!p.c().d(str)) {
                return str;
            } else {
                p.A().e(context, d2);
                return a(str, context).replace(str2, d2);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (p.c().c(str)) {
                p.A().d(context, d2);
                return a(a(str, context), "fbs_aeid", d2).toString();
            } else if (!p.c().d(str)) {
                return str;
            } else {
                p.A().e(context, d2);
                return a(a(str, context), "fbs_aeid", d2).toString();
            }
        }
    }
}
