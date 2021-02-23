package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lo  reason: case insensitive filesystem */
public final class C0866Lo implements Xga<C2906xH<C1925jT, C2340pI>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f7750a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1555eD> f7751b;

    public C0866Lo(C0684Eo eo, C1876iha<C1555eD> iha) {
        this.f7750a = eo;
        this.f7751b = iha;
    }

    public final /* synthetic */ Object get() {
        C2837wJ wJVar = new C2837wJ(this.f7751b.get());
        C1452cha.a(wJVar, "Cannot return null from a non-@Nullable @Provides method");
        return wJVar;
    }
}
