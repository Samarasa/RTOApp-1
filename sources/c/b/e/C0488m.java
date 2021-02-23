package c.b.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.b.e.m  reason: case insensitive filesystem */
public final class C0488m {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f5054a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f5055b = Charset.forName(CharEncoding.ISO_8859_1);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5056c = new byte[0];

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f5057d = ByteBuffer.wrap(f5056c);

    /* renamed from: e  reason: collision with root package name */
    public static final C0481f f5058e = C0481f.a(f5056c);

    /* renamed from: c.b.e.m$a */
    public interface a<E> extends List<E>, RandomAccess {
        a<E> d(int i);

        void p();

        boolean q();
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
}
