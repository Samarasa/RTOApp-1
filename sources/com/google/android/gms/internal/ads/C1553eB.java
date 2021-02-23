package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eB  reason: case insensitive filesystem */
final /* synthetic */ class C1553eB implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final LY f10226a;

    C1553eB(LY ly) {
        this.f10226a = ly;
    }

    public final LY a(Object obj) {
        return obj != null ? this.f10226a : DY.a((Throwable) new C1986kJ(C2351pT.INTERNAL_ERROR, "Retrieve required value in native ad response failed."));
    }
}
