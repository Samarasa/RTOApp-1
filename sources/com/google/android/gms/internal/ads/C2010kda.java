package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.kda  reason: case insensitive filesystem */
public final class C2010kda implements Raa {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f11072a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f11073b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f11074c = Jca.a(this.f11073b);

    public C2010kda(byte[] bArr) {
        C2719uda.a(bArr.length);
        this.f11072a = new SecretKeySpec(bArr, "AES");
        Cipher a2 = a();
        a2.init(1, this.f11072a);
        this.f11073b = Jca.a(a2.doFinal(new byte[16]));
    }

    private static Cipher a() {
        return Zca.f9560c.a("AES/ECB/NoPadding");
    }

    public final byte[] a(byte[] bArr, int i) {
        byte[] bArr2;
        if (i <= 16) {
            Cipher a2 = a();
            a2.init(1, this.f11072a);
            double length = (double) bArr.length;
            Double.isNaN(length);
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if ((max << 4) == bArr.length) {
                bArr2 = Ica.a(bArr, (max - 1) << 4, this.f11073b, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    bArr2 = Ica.a(copyOf, this.f11074c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = a2.doFinal(Ica.a(bArr3, 0, bArr, i2 << 4, 16));
            }
            return Arrays.copyOf(a2.doFinal(Ica.a(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
