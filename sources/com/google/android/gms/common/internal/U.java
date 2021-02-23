package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import c.b.b.b.b.c.c;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    private static Object f5921a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5922b;

    /* renamed from: c  reason: collision with root package name */
    private static String f5923c;

    /* renamed from: d  reason: collision with root package name */
    private static int f5924d;

    public static String a(Context context) {
        c(context);
        return f5923c;
    }

    public static int b(Context context) {
        c(context);
        return f5924d;
    }

    private static void c(Context context) {
        synchronized (f5921a) {
            if (!f5922b) {
                f5922b = true;
                try {
                    Bundle bundle = c.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f5923c = bundle.getString("com.google.app.id");
                        f5924d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
