package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yC  reason: case insensitive filesystem */
public final class C2972yC implements Xga<C2480rH<C2405qC>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<TJ<C2405qC, C1925jT, C2340pI>> f12875a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<TJ<C2405qC, C1925jT, C2127mI>> f12876b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f12877c;

    public C2972yC(C1876iha<TJ<C2405qC, C1925jT, C2340pI>> iha, C1876iha<TJ<C2405qC, C1925jT, C2127mI>> iha2, C1876iha<SS> iha3) {
        this.f12875a = iha;
        this.f12876b = iha2;
        this.f12877c = iha3;
    }

    public final /* synthetic */ Object get() {
        C2480rH rHVar = (C2480rH) (C2759vC.f12464a[this.f12877c.get().n.f6849a - 1] != 1 ? this.f12876b.get() : this.f12875a.get());
        C1452cha.a(rHVar, "Cannot return null from a non-@Nullable @Provides method");
        return rHVar;
    }
}
