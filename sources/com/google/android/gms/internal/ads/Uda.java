package com.google.android.gms.internal.ads;

final class Uda {

    /* renamed from: a  reason: collision with root package name */
    private final C1658fea f8912a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8913b;

    private Uda(int i) {
        this.f8913b = new byte[i];
        this.f8912a = C1658fea.a(this.f8913b);
    }

    /* synthetic */ Uda(int i, Oda oda) {
        this(i);
    }

    public final Lda a() {
        this.f8912a.b();
        return new Wda(this.f8913b);
    }

    public final C1658fea b() {
        return this.f8912a;
    }
}
