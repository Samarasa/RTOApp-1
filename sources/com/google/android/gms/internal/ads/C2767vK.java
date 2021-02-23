package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;
import com.google.android.gms.internal.ads.C2120mB;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.vK  reason: case insensitive filesystem */
final class C2767vK {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12483a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static MessageDigest f12484b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12485c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f12486d = new Object();

    /* renamed from: e  reason: collision with root package name */
    static CountDownLatch f12487e = new CountDownLatch(1);

    private static C1766hB a(C1766hB.d dVar) {
        C1766hB.a v = C1766hB.v();
        v.u((long) dVar.a());
        return (C1766hB) v.k();
    }

    static String a(C1766hB hBVar, String str) {
        byte[] bArr;
        C1872ifa k;
        byte[] f2 = hBVar.f();
        if (((Boolean) Qqa.e().a(F.Ob)).booleanValue()) {
            Vector<byte[]> a2 = a(f2, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = a(a(C1766hB.d.PSN_ENCODE_SIZE_FAIL).f(), str, true);
                return C2695uJ.a(bArr, true);
            }
            C2120mB.a o = C2120mB.o();
            Iterator<byte[]> it = a2.iterator();
            while (it.hasNext()) {
                o.a(Lda.a(a(it.next(), str, false)));
            }
            o.b(Lda.a(a(f2)));
            k = o.k();
        } else if (C3082zha.f13092a != null) {
            byte[] a3 = C3082zha.f13092a.a(f2, str != null ? str.getBytes() : new byte[0]);
            C2120mB.a o2 = C2120mB.o();
            o2.a(Lda.a(a3));
            o2.a(QE.TINK_HYBRID);
            k = o2.k();
        } else {
            throw new GeneralSecurityException();
        }
        bArr = ((C2120mB) k).f();
        return C2695uJ.a(bArr, true);
    }

    private static Vector<byte[]> a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (f12486d) {
            if (!f12483a) {
                f12483a = true;
                new Thread(new C2839wL()).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (f12485c) {
            MessageDigest b2 = b();
            if (b2 != null) {
                b2.reset();
                b2.update(bArr);
                digest = f12484b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = a(C1766hB.d.PSN_ENCODE_SIZE_FAIL).f();
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (_N a2 : new ZM().Lc) {
            a2.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new Dda(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        boolean z;
        MessageDigest messageDigest;
        a();
        try {
            z = f12487e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f12484b) != null) {
            return messageDigest;
        }
        return null;
    }
}
