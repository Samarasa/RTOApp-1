package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

public final class Eaa extends C2569sZ<Qaa> {
    Eaa() {
        super(Qaa.class, new Haa(C2995yZ.class));
    }

    /* access modifiers changed from: private */
    public static void b(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* access modifiers changed from: private */
    public static void b(Vaa vaa) {
        if (vaa.o() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (vaa.o() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Qaa.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Qaa qaa = (Qaa) ifa;
        C2719uda.a(qaa.o(), 0);
        b(qaa.p().size());
        b(qaa.q());
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<Uaa, Qaa> f() {
        return new Gaa(this, Uaa.class);
    }
}
