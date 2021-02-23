package g.a.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public abstract class e {

    static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f15230a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f15231b;

        a(X509TrustManager x509TrustManager, Method method) {
            this.f15231b = method;
            this.f15230a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f15231b.invoke(this.f15230a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15230a.equals(aVar.f15230a) && this.f15231b.equals(aVar.f15231b);
        }

        public int hashCode() {
            return this.f15230a.hashCode() + (this.f15231b.hashCode() * 31);
        }
    }

    static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final Map<X500Principal, Set<X509Certificate>> f15232a = new LinkedHashMap();

        public b(X509Certificate... x509CertificateArr) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                Set set = this.f15232a.get(subjectX500Principal);
                if (set == null) {
                    set = new LinkedHashSet(1);
                    this.f15232a.put(subjectX500Principal, set);
                }
                set.add(x509Certificate);
            }
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            Set<X509Certificate> set = this.f15232a.get(x509Certificate.getIssuerX500Principal());
            if (set == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : set) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).f15232a.equals(this.f15232a);
        }

        public int hashCode() {
            return this.f15232a.hashCode();
        }
    }

    public static e a(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return a(x509TrustManager.getAcceptedIssuers());
        }
    }

    public static e a(X509Certificate... x509CertificateArr) {
        return new b(x509CertificateArr);
    }

    public abstract X509Certificate a(X509Certificate x509Certificate);
}
