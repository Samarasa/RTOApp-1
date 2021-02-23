package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class Aia extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f6163a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6164b;

    private Aia(int i, String str, Throwable th, int i2) {
        super((String) null, th);
        this.f6163a = i;
        this.f6164b = i2;
    }

    public static Aia a(IOException iOException) {
        return new Aia(0, (String) null, iOException, -1);
    }

    public static Aia a(Exception exc, int i) {
        return new Aia(1, (String) null, exc, i);
    }

    static Aia a(RuntimeException runtimeException) {
        return new Aia(2, (String) null, runtimeException, -1);
    }
}
