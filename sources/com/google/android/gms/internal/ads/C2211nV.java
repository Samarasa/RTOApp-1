package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nV  reason: case insensitive filesystem */
public final class C2211nV {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f11472a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f11473b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f11474c = f11473b;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f11475d = f11472a;

    private static X509Certificate a(String str) {
        try {
            X509Certificate[][] a2 = C2451ql.a(str);
            if (a2.length == 1) {
                return a2[0][0];
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (C2800via e2) {
            throw new GeneralSecurityException("Package is not signed", e2);
        } catch (IOException | RuntimeException e3) {
            throw new GeneralSecurityException("Failed to verify signatures", e3);
        }
    }

    public final boolean a(File file) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(a(file.getAbsolutePath()).getEncoded());
        if (!Arrays.equals(this.f11475d, digest)) {
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f11474c, digest);
        }
        return true;
    }
}
