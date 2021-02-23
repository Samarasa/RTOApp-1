package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tM  reason: case insensitive filesystem */
public final class C2627tM implements Xga<C2485rM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f12184a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f12185b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1555eD> f12186c;

    private C2627tM(C1876iha<String> iha, C1876iha<PY> iha2, C1876iha<C1555eD> iha3) {
        this.f12184a = iha;
        this.f12185b = iha2;
        this.f12186c = iha3;
    }

    public static C2627tM a(C1876iha<String> iha, C1876iha<PY> iha2, C1876iha<C1555eD> iha3) {
        return new C2627tM(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2485rM(this.f12184a.get(), this.f12185b.get(), this.f12186c.get());
    }
}
