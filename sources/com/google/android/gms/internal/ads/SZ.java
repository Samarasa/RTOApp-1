package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

public final class SZ extends C2569sZ<C1369bba> {
    SZ() {
        super(C1369bba.class, new RZ(C1869ida.class));
    }

    public static void a(C1369bba bba) {
        C2719uda.a(bba.o(), 0);
        C2719uda.a(bba.p().size());
        a(bba.q());
    }

    /* access modifiers changed from: private */
    public static void a(C1652fba fba) {
        if (fba.o() < 12 || fba.o() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C1369bba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        a((C1369bba) ifa);
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<C1440cba, C1369bba> f() {
        return new UZ(this, C1440cba.class);
    }
}
