package com.google.android.gms.common.util;

import android.os.Build;
import android.util.Log;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f6051a;

    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 15;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean n() {
        boolean z = false;
        if (!m()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.CODENAME.equals("REL")) {
            return true;
        }
        if (!(Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z')) {
            return false;
        }
        Boolean bool = f6051a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ("google".equals(Build.BRAND) && !Build.ID.startsWith("RPP1") && !Build.ID.startsWith("RPP2") && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457) {
                z = true;
            }
            f6051a = Boolean.valueOf(z);
        } catch (NumberFormatException unused) {
            f6051a = true;
        }
        if (!f6051a.booleanValue()) {
            Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore");
        }
        return f6051a.booleanValue();
    }
}
