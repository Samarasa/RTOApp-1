package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.wL  reason: case insensitive filesystem */
final class C2839wL implements Runnable {
    private C2839wL() {
    }

    public final void run() {
        try {
            MessageDigest unused = C2767vK.f12484b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            C2767vK.f12487e.countDown();
            throw th;
        }
        C2767vK.f12487e.countDown();
    }
}
