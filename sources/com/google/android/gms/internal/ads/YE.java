package com.google.android.gms.internal.ads;

public final class YE implements Xga<UE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f9326a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f9327b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JF> f9328c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2054lG> f9329d;

    private YE(C1876iha<PY> iha, C1876iha<PY> iha2, C1876iha<JF> iha3, C1876iha<C2054lG> iha4) {
        this.f9326a = iha;
        this.f9327b = iha2;
        this.f9328c = iha3;
        this.f9329d = iha4;
    }

    public static YE a(C1876iha<PY> iha, C1876iha<PY> iha2, C1876iha<JF> iha3, C1876iha<C2054lG> iha4) {
        return new YE(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new UE(this.f9326a.get(), this.f9327b.get(), this.f9328c.get(), Yga.b(this.f9329d));
    }
}
