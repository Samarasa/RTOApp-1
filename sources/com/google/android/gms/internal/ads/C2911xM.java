package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xM  reason: case insensitive filesystem */
public final class C2911xM implements Xga<C2769vM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f12753a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<SS> f12754b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f12755c;

    private C2911xM(C1876iha<PY> iha, C1876iha<SS> iha2, C1876iha<C1200Yk> iha3) {
        this.f12753a = iha;
        this.f12754b = iha2;
        this.f12755c = iha3;
    }

    public static C2911xM a(C1876iha<PY> iha, C1876iha<SS> iha2, C1876iha<C1200Yk> iha3) {
        return new C2911xM(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2769vM(this.f12753a.get(), this.f12754b.get(), this.f12755c.get());
    }
}
