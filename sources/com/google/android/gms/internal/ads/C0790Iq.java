package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Iq  reason: case insensitive filesystem */
public final class C0790Iq implements Xga<C2084lf> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1730gf> f7352a;

    private C0790Iq(C1876iha<C1730gf> iha) {
        this.f7352a = iha;
    }

    public static C0790Iq a(C1876iha<C1730gf> iha) {
        return new C0790Iq(iha);
    }

    public final /* synthetic */ Object get() {
        C2084lf a2 = this.f7352a.get().a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
