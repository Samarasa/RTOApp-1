package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mo  reason: case insensitive filesystem */
public final class C0892Mo implements Xga<C2906xH<C1925jT, C2127mI>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f7900a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1555eD> f7901b;

    public C0892Mo(C0684Eo eo, C1876iha<C1555eD> iha) {
        this.f7900a = eo;
        this.f7901b = iha;
    }

    public final /* synthetic */ Object get() {
        FI fi = new FI(this.f7901b.get());
        C1452cha.a(fi, "Cannot return null from a non-@Nullable @Provides method");
        return fi;
    }
}
