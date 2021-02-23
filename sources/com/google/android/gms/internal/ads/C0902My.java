package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.My  reason: case insensitive filesystem */
public final class C0902My implements Xga<C2480rH<C1337ay>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f7930a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f7931b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<BI> f7932c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<PJ> f7933d;

    public C0902My(C1876iha<VU> iha, C1876iha<PY> iha2, C1876iha<BI> iha3, C1876iha<PJ> iha4) {
        this.f7930a = iha;
        this.f7931b = iha2;
        this.f7932c = iha3;
        this.f7933d = iha4;
    }

    public final /* synthetic */ Object get() {
        TJ tj = new TJ(this.f7930a.get(), this.f7931b.get(), this.f7933d.get(), this.f7932c.get());
        C1452cha.a(tj, "Cannot return null from a non-@Nullable @Provides method");
        return tj;
    }
}
