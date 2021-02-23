package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.es  reason: case insensitive filesystem */
public final class C1614es implements Xga<C2480rH<C0583Ar>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f10323a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f10324b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ZH> f10325c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<PJ> f10326d;

    public C1614es(C1876iha<VU> iha, C1876iha<PY> iha2, C1876iha<ZH> iha3, C1876iha<PJ> iha4) {
        this.f10323a = iha;
        this.f10324b = iha2;
        this.f10325c = iha3;
        this.f10326d = iha4;
    }

    public final /* synthetic */ Object get() {
        TJ tj = new TJ(this.f10323a.get(), this.f10324b.get(), this.f10326d.get(), this.f10325c.get());
        C1452cha.a(tj, "Cannot return null from a non-@Nullable @Provides method");
        return tj;
    }
}
