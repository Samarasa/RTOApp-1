package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.C0644Da;
import com.google.android.gms.internal.ads.C1018Rk;

public final class fa extends C1018Rk {
    public static boolean a() {
        return C1018Rk.a(2) && C0644Da.f6572a.a().booleanValue();
    }

    public static void e(String str, Throwable th) {
        if (a()) {
            Log.v("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (a()) {
            Log.v("Ads", str);
        }
    }
}
