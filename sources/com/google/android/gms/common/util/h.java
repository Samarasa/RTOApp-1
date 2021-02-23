package com.google.android.gms.common.util;

import android.os.SystemClock;

public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f6044a = new h();

    private h() {
    }

    public static e d() {
        return f6044a;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return System.nanoTime();
    }
}
