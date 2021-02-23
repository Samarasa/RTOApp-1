package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1796hca;
import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.xZ  reason: case insensitive filesystem */
public final class C2924xZ {
    @Deprecated
    public static final C2640tZ a(byte[] bArr) {
        try {
            C1796hca a2 = C1796hca.a(bArr, C2012kea.a());
            for (C1796hca.a next : a2.p()) {
                if (next.r().q() == Yba.b.UNKNOWN_KEYMATERIAL || next.r().q() == Yba.b.SYMMETRIC || next.r().q() == Yba.b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return C2640tZ.a(a2);
        } catch (Iea unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
