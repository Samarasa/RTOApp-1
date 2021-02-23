package g.a.c;

import g.A;
import g.C3354o;
import g.K;
import g.q;
import g.z;
import java.util.List;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f14990a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long a(K k) {
        return a(k.u());
    }

    public static long a(z zVar) {
        return a(zVar.a("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void a(q qVar, A a2, z zVar) {
        if (qVar != q.f15294a) {
            List<C3354o> a3 = C3354o.a(a2, zVar);
            if (!a3.isEmpty()) {
                qVar.a(a2, a3);
            }
        }
    }

    public static int b(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    public static boolean b(K k) {
        if (k.x().e().equals("HEAD")) {
            return false;
        }
        int s = k.s();
        return (((s >= 100 && s < 200) || s == 204 || s == 304) && a(k) == -1 && !"chunked".equalsIgnoreCase(k.e("Transfer-Encoding"))) ? false : true;
    }
}
