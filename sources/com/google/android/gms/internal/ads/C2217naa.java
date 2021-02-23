package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.naa  reason: case insensitive filesystem */
public final class C2217naa extends C2569sZ<C2930xca> {
    C2217naa() {
        super(C2930xca.class, new C2146maa(C1648fZ.class));
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C2930xca.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        C2930xca xca = (C2930xca) ifa;
        C2719uda.a(xca.o(), 0);
        if (xca.p().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<Aca, C2930xca> f() {
        return new C2430qaa(this, Aca.class);
    }
}
