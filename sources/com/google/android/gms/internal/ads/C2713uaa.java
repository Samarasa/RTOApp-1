package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.ads.uaa  reason: case insensitive filesystem */
final class C2713uaa extends C2711uZ<C1931jZ, Hba> {
    C2713uaa(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) {
        Hba hba = (Hba) obj;
        Gba p = hba.q().p();
        Lba o = p.o();
        Yca a2 = Daa.a(o.o());
        byte[] c2 = hba.p().c();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, c2), Wca.a(a2));
        return new Oca((ECPrivateKey) Zca.i.a("EC").generatePrivate(eCPrivateKeySpec), o.q().c(), Daa.a(o.p()), Daa.a(p.q()), new Faa(p.p().o()));
    }
}
