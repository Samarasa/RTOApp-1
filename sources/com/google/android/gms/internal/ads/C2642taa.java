package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Hba;
import com.google.android.gms.internal.ads.Kba;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.taa  reason: case insensitive filesystem */
final class C2642taa extends C2498rZ<Dba, Hba> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2500raa f12216b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2642taa(C2500raa raa, Class cls) {
        super(cls);
        this.f12216b = raa;
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Dba.a(lda, C2012kea.a());
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Daa.a(((Dba) ifa).o());
    }

    public final /* synthetic */ Object b(C1872ifa ifa) {
        Dba dba = (Dba) ifa;
        KeyPair a2 = Wca.a(Wca.a(Daa.a(dba.o().o().o())));
        ECPoint w = ((ECPublicKey) a2.getPublic()).getW();
        Kba.a s = Kba.s();
        s.a(0);
        s.a(dba.o());
        s.a(Lda.a(w.getAffineX().toByteArray()));
        s.b(Lda.a(w.getAffineY().toByteArray()));
        Hba.a r = Hba.r();
        r.a(0);
        r.a((Kba) s.k());
        r.a(Lda.a(((ECPrivateKey) a2.getPrivate()).getS().toByteArray()));
        return (Hba) r.k();
    }
}
