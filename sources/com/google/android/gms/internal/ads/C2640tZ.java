package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tZ  reason: case insensitive filesystem */
public final class C2640tZ {

    /* renamed from: a  reason: collision with root package name */
    private final C1796hca f12211a;

    private C2640tZ(C1796hca hca) {
        this.f12211a = hca;
    }

    static final C2640tZ a(C1796hca hca) {
        if (hca != null && hca.q() > 0) {
            return new C2640tZ(hca);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final C1796hca a() {
        return this.f12211a;
    }

    public final String toString() {
        return KZ.a(this.f12211a).toString();
    }
}
