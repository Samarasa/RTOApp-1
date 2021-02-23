package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

public final class Jaa extends C2569sZ<Tba> {
    public Jaa() {
        super(Tba.class, new Iaa(C2995yZ.class));
    }

    public static void a(Tba tba) {
        C2719uda.a(tba.o(), 0);
        if (tba.p().size() >= 16) {
            b(tba.q());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* access modifiers changed from: private */
    public static void b(Xba xba) {
        if (xba.o() >= 10) {
            int i = Kaa.f7568a[xba.p().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xba.o() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xba.o() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xba.o() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Tba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        a((Tba) ifa);
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<Uba, Tba> f() {
        return new Laa(this, Uba.class);
    }
}
