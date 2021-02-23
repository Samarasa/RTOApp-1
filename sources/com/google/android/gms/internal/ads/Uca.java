package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Uca {

    /* renamed from: a  reason: collision with root package name */
    private ECPublicKey f8911a;

    public Uca(ECPublicKey eCPublicKey) {
        this.f8911a = eCPublicKey;
    }

    public final Tca a(String str, byte[] bArr, byte[] bArr2, int i, Xca xca) {
        byte[] bArr3;
        KeyPair a2 = Wca.a(this.f8911a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a2.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a2.getPrivate();
        ECPublicKey eCPublicKey2 = this.f8911a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            int i2 = 1;
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                byte[] a3 = Wca.a(eCPrivateKey, eCPublicKey2.getW());
                EllipticCurve curve = eCPublicKey.getParams().getCurve();
                ECPoint w = eCPublicKey.getW();
                Wca.a(w, curve);
                int bitLength = (Wca.a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i3 = Vca.f9058a[xca.ordinal()];
                if (i3 == 1) {
                    int i4 = (bitLength * 2) + 1;
                    bArr3 = new byte[i4];
                    byte[] byteArray = w.getAffineX().toByteArray();
                    byte[] byteArray2 = w.getAffineY().toByteArray();
                    System.arraycopy(byteArray2, 0, bArr3, i4 - byteArray2.length, byteArray2.length);
                    System.arraycopy(byteArray, 0, bArr3, (bitLength + 1) - byteArray.length, byteArray.length);
                    bArr3[0] = 4;
                } else if (i3 != 2) {
                    int i5 = 3;
                    if (i3 == 3) {
                        int i6 = bitLength + 1;
                        byte[] bArr4 = new byte[i6];
                        byte[] byteArray3 = w.getAffineX().toByteArray();
                        System.arraycopy(byteArray3, 0, bArr4, i6 - byteArray3.length, byteArray3.length);
                        if (!w.getAffineY().testBit(0)) {
                            i5 = 2;
                        }
                        bArr4[0] = (byte) i5;
                        bArr3 = bArr4;
                    } else {
                        String valueOf = String.valueOf(xca);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                        sb.append("invalid format:");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                } else {
                    int i7 = bitLength * 2;
                    bArr3 = new byte[i7];
                    byte[] byteArray4 = w.getAffineX().toByteArray();
                    if (byteArray4.length > bitLength) {
                        byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - bitLength, byteArray4.length);
                    }
                    byte[] byteArray5 = w.getAffineY().toByteArray();
                    if (byteArray5.length > bitLength) {
                        byteArray5 = Arrays.copyOfRange(byteArray5, byteArray5.length - bitLength, byteArray5.length);
                    }
                    System.arraycopy(byteArray5, 0, bArr3, i7 - byteArray5.length, byteArray5.length);
                    System.arraycopy(byteArray4, 0, bArr3, bitLength - byteArray4.length, byteArray4.length);
                }
                byte[] a4 = Ica.a(bArr3, a3);
                Mac a5 = Zca.f9561d.a(str);
                if (i <= a5.getMacLength() * 255) {
                    if (bArr == null || bArr.length == 0) {
                        a5.init(new SecretKeySpec(new byte[a5.getMacLength()], str));
                    } else {
                        a5.init(new SecretKeySpec(bArr, str));
                    }
                    byte[] doFinal = a5.doFinal(a4);
                    byte[] bArr5 = new byte[i];
                    a5.init(new SecretKeySpec(doFinal, str));
                    byte[] bArr6 = new byte[0];
                    int i8 = 0;
                    while (true) {
                        a5.update(bArr6);
                        a5.update(bArr2);
                        a5.update((byte) i2);
                        bArr6 = a5.doFinal();
                        if (bArr6.length + i8 < i) {
                            System.arraycopy(bArr6, 0, bArr5, i8, bArr6.length);
                            i8 += bArr6.length;
                            i2++;
                        } else {
                            System.arraycopy(bArr6, 0, bArr5, i8, i - i8);
                            return new Tca(bArr3, bArr5);
                        }
                    }
                } else {
                    throw new GeneralSecurityException("size too large");
                }
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}
