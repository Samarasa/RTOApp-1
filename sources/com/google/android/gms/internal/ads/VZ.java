package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1723gba;
import java.security.GeneralSecurityException;

final class VZ extends C2498rZ<C1935jba, C1723gba> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ TZ f9052b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VZ(TZ tz, Class cls) {
        super(cls);
        this.f9052b = tz;
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C1935jba.a(lda, C2012kea.a());
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        C1935jba jba = (C1935jba) ifa;
        C2719uda.a(jba.o());
        if (jba.p().o() != 12 && jba.p().o() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ Object b(C1872ifa ifa) {
        C1935jba jba = (C1935jba) ifa;
        C1723gba.a r = C1723gba.r();
        r.a(Lda.a(C2294oda.a(jba.o())));
        r.a(jba.p());
        r.a(0);
        return (C1723gba) r.k();
    }
}
