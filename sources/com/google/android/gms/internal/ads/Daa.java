package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class Daa {
    public static Xca a(Aba aba) {
        int i = Caa.f6435c[aba.ordinal()];
        if (i == 1) {
            return Xca.UNCOMPRESSED;
        }
        if (i == 2) {
            return Xca.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return Xca.COMPRESSED;
        }
        String valueOf = String.valueOf(aba);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static Yca a(Oba oba) {
        int i = Caa.f6434b[oba.ordinal()];
        if (i == 1) {
            return Yca.NIST_P256;
        }
        if (i == 2) {
            return Yca.NIST_P384;
        }
        if (i == 3) {
            return Yca.NIST_P521;
        }
        String valueOf = String.valueOf(oba);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String a(Rba rba) {
        int i = Caa.f6433a[rba.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(rba);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void a(Gba gba) {
        Wca.a(a(gba.o().o()));
        a(gba.o().p());
        if (gba.q() != Aba.UNKNOWN_FORMAT) {
            DZ.a(gba.p().o());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
