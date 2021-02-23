package c.b.b.b.d.f;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class Nb {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f4241a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f4242b = Charset.forName(CharEncoding.ISO_8859_1);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4243c;

    /* renamed from: d  reason: collision with root package name */
    private static final ByteBuffer f4244d;

    /* renamed from: e  reason: collision with root package name */
    private static final C0403qb f4245e;

    static {
        byte[] bArr = new byte[0];
        f4243c = bArr;
        f4244d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f4243c;
        f4245e = C0403qb.a(bArr2, 0, bArr2.length, false);
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

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static Object a(Object obj, Object obj2) {
        C0438vc e2 = ((C0445wc) obj).e();
        e2.a((C0445wc) obj2);
        return e2.c();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(byte[] bArr) {
        return C0356jd.a(bArr);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, f4241a);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
