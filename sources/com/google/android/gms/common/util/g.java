package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.C0563t;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f6038a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b  reason: collision with root package name */
    private static DropBoxManager f6039b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6040c = false;

    /* renamed from: d  reason: collision with root package name */
    private static int f6041d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f6042e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static int f6043f = 0;

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) {
        try {
            C0563t.a(context);
            C0563t.a(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
