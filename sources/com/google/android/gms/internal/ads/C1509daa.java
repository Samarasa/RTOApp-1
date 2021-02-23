package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.daa  reason: case insensitive filesystem */
public final class C1509daa extends C2569sZ<C2857wba> {
    C1509daa() {
        super(C2857wba.class, new C1438caa(C1648fZ.class));
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C2857wba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        C2857wba wba = (C2857wba) ifa;
        C2719uda.a(wba.o(), 0);
        if (wba.p().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<C2928xba, C2857wba> f() {
        return new C1650faa(this, C2928xba.class);
    }
}
