package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yaa;

final class PZ extends C2498rZ<Zaa, Yaa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ NZ f8223b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PZ(NZ nz, Class cls) {
        super(cls);
        this.f8223b = nz;
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Zaa.a(lda, C2012kea.a());
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Zaa zaa = (Zaa) ifa;
        new SZ().f().a(zaa.o());
        new Jaa().f().a(zaa.p());
        C2719uda.a(zaa.o().o());
    }

    public final /* synthetic */ Object b(C1872ifa ifa) {
        Zaa zaa = (Zaa) ifa;
        Yaa.a r = Yaa.r();
        r.a(new SZ().f().b(zaa.o()));
        r.a(new Jaa().f().b(zaa.p()));
        r.a(0);
        return (Yaa) r.k();
    }
}
