package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cB  reason: case insensitive filesystem */
final /* synthetic */ class C1412cB implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final LY f9995a;

    C1412cB(LY ly) {
        this.f9995a = ly;
    }

    public final LY a(Object obj) {
        LY ly = this.f9995a;
        C2313on onVar = (C2313on) obj;
        if (onVar != null && onVar.e() != null) {
            return ly;
        }
        throw new C1986kJ(C2351pT.INTERNAL_ERROR, "Retrieve video view in instream ad response failed.");
    }
}
