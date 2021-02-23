package g.a.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import h.h;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final h f15076a = h.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f15077b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f15078c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    static final String[] f15079d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f15079d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = g.a.e.a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f15078c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 : iArr) {
            f15078c[i3 | 8] = f15078c[i3] + "|PADDED";
        }
        String[] strArr3 = f15078c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        for (int i4 : new int[]{4, 32, 36}) {
            for (int i5 : iArr) {
                int i6 = i5 | i4;
                f15078c[i6] = f15078c[i5] + '|' + f15078c[i4];
                f15078c[i6 | 8] = f15078c[i5] + '|' + f15078c[i4] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = f15078c;
            if (i < strArr4.length) {
                if (strArr4[i] == null) {
                    strArr4[i] = f15079d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(g.a.e.a(str, objArr));
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (!(b2 == 2 || b2 == 3)) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : f15079d[b3];
            }
            if (!(b2 == 7 || b2 == 8)) {
                String[] strArr = f15078c;
                String str = b3 < strArr.length ? strArr[b3] : f15079d[b3];
                return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f15079d[b3];
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = f15077b;
        String a2 = b2 < strArr.length ? strArr[b2] : g.a.e.a("0x%02x", Byte.valueOf(b2));
        String a3 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = a3;
        return g.a.e.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(g.a.e.a(str, objArr));
    }
}
