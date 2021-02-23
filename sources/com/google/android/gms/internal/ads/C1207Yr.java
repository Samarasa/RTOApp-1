package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yr  reason: case insensitive filesystem */
public final class C1207Yr implements Xga<C2480rH<C0583Ar>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Boolean> f9502a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1278aJ> f9503b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<TJ<C0583Ar, C1925jT, C2127mI>> f9504c;

    public C1207Yr(C1876iha<Boolean> iha, C1876iha<C1278aJ> iha2, C1876iha<TJ<C0583Ar, C1925jT, C2127mI>> iha3) {
        this.f9502a = iha;
        this.f9503b = iha2;
        this.f9504c = iha3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f9502a.get().booleanValue();
        C2480rH rHVar = (C1278aJ) this.f9503b.get();
        C2480rH rHVar2 = (TJ) this.f9504c.get();
        if (!booleanValue) {
            rHVar = rHVar2;
        }
        C1452cha.a(rHVar, "Cannot return null from a non-@Nullable @Provides method");
        return rHVar;
    }
}
