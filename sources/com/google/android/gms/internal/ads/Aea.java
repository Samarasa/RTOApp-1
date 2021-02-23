package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class Aea {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f6145a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f6146b = Charset.forName(CharEncoding.ISO_8859_1);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6147c;

    /* renamed from: d  reason: collision with root package name */
    private static final ByteBuffer f6148d;

    /* renamed from: e  reason: collision with root package name */
    private static final C1304aea f6149e;

    static {
        byte[] bArr = new byte[0];
        f6147c = bArr;
        f6148d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f6147c;
        f6149e = C1304aea.a(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static Object a(Object obj, Object obj2) {
        C1802hfa b2 = ((C1872ifa) obj).b();
        b2.a((C1872ifa) obj2);
        return b2.d();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean b(byte[] bArr) {
        return C1521dga.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, f6145a);
    }
}
