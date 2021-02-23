package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.raa  reason: case insensitive filesystem */
public final class C2500raa extends EZ<Hba, Kba> {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f11991e = new byte[0];

    C2500raa() {
        super(Hba.class, Kba.class, new C2713uaa(C1931jZ.class));
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Hba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Hba hba = (Hba) ifa;
        if (!hba.p().isEmpty()) {
            C2719uda.a(hba.o(), 0);
            Daa.a(hba.q().p());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final Yba.b c() {
        return Yba.b.ASYMMETRIC_PRIVATE;
    }

    public final C2498rZ<Dba, Hba> f() {
        return new C2642taa(this, Dba.class);
    }
}
