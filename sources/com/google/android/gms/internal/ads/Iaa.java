package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class Iaa extends C2711uZ<C2995yZ, Tba> {
    Iaa(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) {
        Tba tba = (Tba) obj;
        Rba p = tba.q().p();
        SecretKeySpec secretKeySpec = new SecretKeySpec(tba.p().c(), "HMAC");
        int o = tba.q().o();
        int i = Kaa.f7568a[p.ordinal()];
        if (i == 1) {
            return new C2365pda(new C2223nda("HMACSHA1", secretKeySpec), o);
        }
        if (i == 2) {
            return new C2365pda(new C2223nda("HMACSHA256", secretKeySpec), o);
        }
        if (i == 3) {
            return new C2365pda(new C2223nda("HMACSHA512", secretKeySpec), o);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
