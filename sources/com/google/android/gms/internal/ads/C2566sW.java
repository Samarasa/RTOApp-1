package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sW  reason: case insensitive filesystem */
public final class C2566sW extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f12091a;

    public C2566sW(int i, String str) {
        super(str);
        this.f12091a = i;
    }

    public C2566sW(int i, Throwable th) {
        super(th);
        this.f12091a = i;
    }

    public final int a() {
        return this.f12091a;
    }
}
