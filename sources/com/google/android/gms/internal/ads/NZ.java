package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;

public final class NZ extends C2569sZ<Yaa> {
    NZ() {
        super(Yaa.class, new QZ(C1648fZ.class));
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Yaa.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Yaa yaa = (Yaa) ifa;
        C2719uda.a(yaa.o(), 0);
        new SZ();
        SZ.a(yaa.p());
        new Jaa();
        Jaa.a(yaa.q());
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<Zaa, Yaa> f() {
        return new PZ(this, Zaa.class);
    }
}
