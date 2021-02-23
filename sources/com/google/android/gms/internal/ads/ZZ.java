package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yba;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class ZZ extends C2569sZ<C2573sba> {
    ZZ() {
        super(C2573sba.class, new C1367baa(C1648fZ.class));
    }

    public static void a(boolean z) {
        if (g()) {
            DZ.a(new ZZ(), true);
        }
    }

    private static boolean g() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final /* synthetic */ C1872ifa a(Lda lda) {
        return C2573sba.a(lda, C2012kea.a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* synthetic */ void a(C1872ifa ifa) {
        C2573sba sba = (C2573sba) ifa;
        C2719uda.a(sba.o(), 0);
        C2719uda.a(sba.p().size());
    }

    public final Yba.b c() {
        return Yba.b.SYMMETRIC;
    }

    public final C2498rZ<C2644tba, C2573sba> f() {
        return new C1296aaa(this, C2644tba.class);
    }
}
