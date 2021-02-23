package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

public final class TZ extends C2569sZ<C1723gba> {
    TZ() {
        super(C1723gba.class, new WZ(C1648fZ.class));
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C1723gba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        C1723gba gba = (C1723gba) ifa;
        C2719uda.a(gba.o(), 0);
        C2719uda.a(gba.p().size());
        if (gba.q().o() != 12 && gba.q().o() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<C1935jba, C1723gba> f() {
        return new VZ(this, C1935jba.class);
    }
}
