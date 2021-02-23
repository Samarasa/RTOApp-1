package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class K {
    public static void a(I i, J j) {
        if (j.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(j.b())) {
            i.a(j.a(), j.b(), j.c(), j.d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
