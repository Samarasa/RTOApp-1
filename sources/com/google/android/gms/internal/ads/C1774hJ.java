package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hJ  reason: case insensitive filesystem */
public final class C1774hJ implements Xga<C1845iJ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1642fT> f10656a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<_C> f10657b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1627fE> f10658c;

    private C1774hJ(C1876iha<C1642fT> iha, C1876iha<_C> iha2, C1876iha<C1627fE> iha3) {
        this.f10656a = iha;
        this.f10657b = iha2;
        this.f10658c = iha3;
    }

    public static C1774hJ a(C1876iha<C1642fT> iha, C1876iha<_C> iha2, C1876iha<C1627fE> iha3) {
        return new C1774hJ(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C1845iJ(this.f10656a.get(), this.f10657b.get(), this.f10658c.get());
    }
}
