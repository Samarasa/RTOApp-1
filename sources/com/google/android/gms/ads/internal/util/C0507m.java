package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.LY;
import com.google.android.gms.internal.ads.Qqa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.m  reason: case insensitive filesystem */
public final class C0507m {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5618a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private String f5619b = BuildConfig.FLAVOR;

    /* renamed from: c  reason: collision with root package name */
    private String f5620c = BuildConfig.FLAVOR;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5621d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f5622e = BuildConfig.FLAVOR;

    private final String a(Context context) {
        String str;
        synchronized (this.f5618a) {
            if (TextUtils.isEmpty(this.f5619b)) {
                p.c();
                this.f5619b = oa.c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f5619b)) {
                    p.c();
                    this.f5619b = oa.a();
                    p.c();
                    oa.b(context, "debug_signals_id.txt", this.f5619b);
                }
            }
            str = this.f5619b;
        }
        return str;
    }

    private final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C1018Rk.c("Can not create dialog without Activity Context");
        } else {
            oa.f5628a.post(new C0510p(this, context, str, z, z2));
        }
    }

    private final boolean b(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) Qqa.e().a(F._c), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            C1018Rk.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.f5622e = jSONObject.optString("status");
            synchronized (this.f5618a) {
                this.f5620c = optString;
            }
            return true;
        } catch (JSONException e2) {
            C1018Rk.c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    private final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) Qqa.e().a(F.bd), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        p.c();
        oa.a(context, str, buildUpon.build().toString());
    }

    private final boolean c(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) Qqa.e().a(F.ad), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            C1018Rk.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.f5618a) {
                this.f5621d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            C1018Rk.c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    private final Uri d(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private static String d(Context context, String str, String str2) {
        String str3;
        Throwable e2;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", p.c().b(context, str2));
        LY<String> a2 = new C0518y(context).a(str, hashMap);
        try {
            return a2.get((long) ((Integer) Qqa.e().a(F.cd)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e3) {
            e2 = e3;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C1018Rk.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C1018Rk.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C1018Rk.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C1018Rk.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (Exception e5) {
            String valueOf = String.valueOf(str);
            C1018Rk.b(valueOf.length() != 0 ? "Error retriving a response from: ".concat(valueOf) : new String("Error retriving a response from: "), e5);
            return null;
        }
    }

    private final void e(Context context, String str, String str2) {
        p.c();
        oa.b(context, d(context, (String) Qqa.e().a(F.Zc), str, str2));
    }

    public final String a() {
        String str;
        synchronized (this.f5618a) {
            str = this.f5620c;
        }
        return str;
    }

    public final void a(Context context, String str, String str2) {
        if (!b(context, str, str2)) {
            a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f5622e)) {
            C1018Rk.a("Creative is not pushed for this device.");
            a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f5622e)) {
            C1018Rk.a("The app is not linked for creative preview.");
            e(context, str, str2);
        } else if ("0".equals(this.f5622e)) {
            C1018Rk.a("Device is linked for in app preview.");
            a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean b2 = b();
        if (c(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                c(context, str2, str3, str);
            }
            C1018Rk.a("Device is linked for debug signals.");
            a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        e(context, str, str2);
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f5618a) {
            z = this.f5621d;
        }
        return z;
    }

    public final boolean b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !p.m().b()) {
            return false;
        }
        C1018Rk.a("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }
}
