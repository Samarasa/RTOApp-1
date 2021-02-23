package g.a.c;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import g.F;
import java.net.ProtocolException;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final F f15005a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15006b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15007c;

    public l(F f2, int i, String str) {
        this.f15005a = f2;
        this.f15006b = i;
        this.f15007c = str;
    }

    public static l a(String str) {
        F f2;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                f2 = F.HTTP_1_0;
            } else if (charAt == 1) {
                f2 = F.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            f2 = F.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = BuildConfig.FLAVOR;
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new l(f2, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15005a == F.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15006b);
        if (this.f15007c != null) {
            sb.append(' ');
            sb.append(this.f15007c);
        }
        return sb.toString();
    }
}
