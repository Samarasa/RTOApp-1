package g.a.h;

import g.a.f.e;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public abstract class b {
    public static b a(X509TrustManager x509TrustManager) {
        return e.a().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
