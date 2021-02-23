package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Tba;
import java.security.GeneralSecurityException;

final class Laa extends C2498rZ<Uba, Tba> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Jaa f7686b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Laa(Jaa jaa, Class cls) {
        super(cls);
        this.f7686b = jaa;
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return Uba.a(lda, C2012kea.a());
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        Uba uba = (Uba) ifa;
        if (uba.o() >= 16) {
            Jaa.b(uba.p());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ Object b(C1872ifa ifa) {
        Uba uba = (Uba) ifa;
        Tba.a r = Tba.r();
        r.a(0);
        r.a(uba.p());
        r.a(Lda.a(C2294oda.a(uba.o())));
        return (Tba) r.k();
    }
}
