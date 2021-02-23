package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import c.b.b.b.b.c.c;

public class d {
    public static boolean a() {
        return false;
    }

    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (c.a(context).a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
