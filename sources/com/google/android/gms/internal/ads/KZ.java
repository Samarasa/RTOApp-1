package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1796hca;
import com.google.android.gms.internal.ads.C1867ica;
import com.google.android.gms.internal.ads.Yba;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class KZ {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f7565a = Charset.forName("UTF-8");

    public static C1867ica a(C1796hca hca) {
        C1867ica.a o = C1867ica.o();
        o.a(hca.o());
        for (C1796hca.a next : hca.p()) {
            C1867ica.b.a o2 = C1867ica.b.o();
            o2.a(next.r().o());
            o2.a(next.o());
            o2.a(next.p());
            o2.a(next.s());
            o.a((C1867ica.b) o2.k());
        }
        return (C1867ica) o.k();
    }

    public static void b(C1796hca hca) {
        int o = hca.o();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C1796hca.a next : hca.p()) {
            if (next.o() == C1371bca.ENABLED) {
                if (!next.q()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.s())}));
                } else if (next.p() == C2717uca.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.s())}));
                } else if (next.o() != C1371bca.UNKNOWN_STATUS) {
                    if (next.s() == o) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.r().q() != Yba.b.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.s())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
