package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.oda  reason: case insensitive filesystem */
public final class C2294oda {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f11597a = new C2577sda();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        f11597a.get().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
