package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Bca implements C1869ida {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f6326a = new Dca();

    /* renamed from: b  reason: collision with root package name */
    private final SecretKeySpec f6327b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6328c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6329d = f6326a.get().getBlockSize();

    public Bca(byte[] bArr, int i) {
        C2719uda.a(bArr.length);
        this.f6327b = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f6329d) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6328c = i;
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f6328c;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a2 = C2294oda.a(i);
            System.arraycopy(a2, 0, bArr2, 0, this.f6328c);
            int length2 = bArr.length;
            int i2 = this.f6328c;
            Cipher cipher = f6326a.get();
            byte[] bArr3 = new byte[this.f6329d];
            System.arraycopy(a2, 0, bArr3, 0, this.f6328c);
            cipher.init(1, this.f6327b, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i3);
        throw new GeneralSecurityException(sb.toString());
    }
}
