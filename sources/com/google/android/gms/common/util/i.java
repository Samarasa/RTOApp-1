package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f6045a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f6046b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f6047c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f6048d;

    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    public static boolean a(Context context) {
        if (f6047c == null) {
            PackageManager packageManager = context.getPackageManager();
            f6047c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f6047c.booleanValue();
    }

    @TargetApi(20)
    public static boolean a(PackageManager packageManager) {
        if (f6045a == null) {
            f6045a = Boolean.valueOf(m.g() && packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f6045a.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        return f(context);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        return a(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context)) {
            return false;
        }
        if (m.j()) {
            return f(context) && !m.k();
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f6048d == null) {
            f6048d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f6048d.booleanValue();
    }

    @TargetApi(21)
    private static boolean f(Context context) {
        if (f6046b == null) {
            f6046b = Boolean.valueOf(m.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6046b.booleanValue();
    }
}
