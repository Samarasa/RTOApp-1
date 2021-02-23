package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cN  reason: case insensitive filesystem */
public final class C1424cN implements Xga<C1282aN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f10022a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1697gD> f10023b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f10024c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<String> f10025d;

    private C1424cN(C1876iha<PY> iha, C1876iha<C1697gD> iha2, C1876iha<SS> iha3, C1876iha<String> iha4) {
        this.f10022a = iha;
        this.f10023b = iha2;
        this.f10024c = iha3;
        this.f10025d = iha4;
    }

    public static C1424cN a(C1876iha<PY> iha, C1876iha<C1697gD> iha2, C1876iha<SS> iha3, C1876iha<String> iha4) {
        return new C1424cN(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new C1282aN(this.f10022a.get(), this.f10023b.get(), this.f10024c.get(), this.f10025d.get());
    }
}
