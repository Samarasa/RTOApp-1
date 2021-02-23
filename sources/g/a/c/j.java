package g.a.c;

import g.A;
import g.H;
import java.net.Proxy;

public final class j {
    public static String a(A a2) {
        String c2 = a2.c();
        String e2 = a2.e();
        if (e2 == null) {
            return c2;
        }
        return c2 + '?' + e2;
    }

    public static String a(H h2, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(h2.e());
        sb.append(' ');
        if (b(h2, type)) {
            sb.append(h2.g());
        } else {
            sb.append(a(h2.g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(H h2, Proxy.Type type) {
        return !h2.d() && type == Proxy.Type.HTTP;
    }
}
