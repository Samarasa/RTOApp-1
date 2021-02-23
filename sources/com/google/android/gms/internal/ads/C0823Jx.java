package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jx  reason: case insensitive filesystem */
public final class C0823Jx implements Xga<C0849Kx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f7516a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1644fV> f7517b;

    private C0823Jx(C1876iha<C2988yS> iha, C1876iha<C1644fV> iha2) {
        this.f7516a = iha;
        this.f7517b = iha2;
    }

    public static C0823Jx a(C1876iha<C2988yS> iha, C1876iha<C1644fV> iha2) {
        return new C0823Jx(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C0849Kx(this.f7516a.get(), this.f7517b.get());
    }
}
