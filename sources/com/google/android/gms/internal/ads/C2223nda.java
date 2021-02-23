package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.nda  reason: case insensitive filesystem */
public final class C2223nda implements Raa {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Mac> f11477a = new C2152mda(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f11478b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Key f11479c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11480d;

    public C2223nda(String str, Key key) {
        int i;
        this.f11478b = str;
        this.f11479c = key;
        if (key.getEncoded().length >= 16) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                i = 20;
            } else if (c2 == 1) {
                i = 32;
            } else if (c2 == 2) {
                i = 48;
            } else if (c2 != 3) {
                String valueOf = String.valueOf(str);
                throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
            } else {
                i = 64;
            }
            this.f11480d = i;
            this.f11477a.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public final byte[] a(byte[] bArr, int i) {
        if (i <= this.f11480d) {
            this.f11477a.get().update(bArr);
            return Arrays.copyOf(this.f11477a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
