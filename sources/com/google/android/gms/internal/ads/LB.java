package com.google.android.gms.internal.ads;

public final class LB implements Xga<GB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C3110zz> f7642a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0877Lz> f7643b;

    private LB(C1876iha<C3110zz> iha, C1876iha<C0877Lz> iha2) {
        this.f7642a = iha;
        this.f7643b = iha2;
    }

    public static LB a(C1876iha<C3110zz> iha, C1876iha<C0877Lz> iha2) {
        return new LB(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new GB(this.f7642a.get(), this.f7643b.get());
    }
}
