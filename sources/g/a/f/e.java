package g.a.f;

import g.E;
import g.F;
import g.a.h.a;
import g.a.h.b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final e f15211a = b();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f15212b = Logger.getLogger(E.class.getName());

    public static e a() {
        return f15211a;
    }

    public static List<String> a(List<F> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            F f2 = list.get(i);
            if (f2 != F.HTTP_1_0) {
                arrayList.add(f2.toString());
            }
        }
        return arrayList;
    }

    private static e b() {
        e b2 = a.b();
        if (b2 != null) {
            return b2;
        }
        b b3 = b.b();
        if (b3 != null) {
            return b3;
        }
        e b4 = c.b();
        return b4 != null ? b4 : new e();
    }

    static byte[] b(List<F> list) {
        h.e eVar = new h.e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            F f2 = list.get(i);
            if (f2 != F.HTTP_1_0) {
                eVar.writeByte(f2.toString().length());
                eVar.a(f2.toString());
            }
        }
        return eVar.l();
    }

    public b a(X509TrustManager x509TrustManager) {
        return new a(g.a.h.e.a(x509TrustManager));
    }

    public Object a(String str) {
        if (f15212b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(int i, String str, Throwable th) {
        f15212b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<F> list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String str) {
        return true;
    }
}
