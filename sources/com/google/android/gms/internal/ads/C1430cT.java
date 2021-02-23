package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cT  reason: case insensitive filesystem */
public final class C1430cT implements Xga<_S> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1701gH> f10040a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1644fV> f10041b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2988yS> f10042c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<DS> f10043d;

    private C1430cT(C1876iha<C1701gH> iha, C1876iha<C1644fV> iha2, C1876iha<C2988yS> iha3, C1876iha<DS> iha4) {
        this.f10040a = iha;
        this.f10041b = iha2;
        this.f10042c = iha3;
        this.f10043d = iha4;
    }

    public static C1430cT a(C1876iha<C1701gH> iha, C1876iha<C1644fV> iha2, C1876iha<C2988yS> iha3, C1876iha<DS> iha4) {
        return new C1430cT(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new _S(this.f10040a.get(), this.f10041b.get(), this.f10042c.get(), this.f10043d.get());
    }
}
