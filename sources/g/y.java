package g;

import g.a.e;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final O f15310a;

    /* renamed from: b  reason: collision with root package name */
    private final C3349j f15311b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f15312c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f15313d;

    private y(O o, C3349j jVar, List<Certificate> list, List<Certificate> list2) {
        this.f15310a = o;
        this.f15311b = jVar;
        this.f15312c = list;
        this.f15313d = list2;
    }

    public static y a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            C3349j a2 = C3349j.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                O a3 = O.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List a4 = certificateArr != null ? e.a((T[]) certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new y(a3, a2, a4, localCertificates != null ? e.a((T[]) localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public C3349j a() {
        return this.f15311b;
    }

    public List<Certificate> b() {
        return this.f15312c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return e.a((Object) this.f15311b, (Object) yVar.f15311b) && this.f15311b.equals(yVar.f15311b) && this.f15312c.equals(yVar.f15312c) && this.f15313d.equals(yVar.f15313d);
    }

    public int hashCode() {
        O o = this.f15310a;
        return ((((((527 + (o != null ? o.hashCode() : 0)) * 31) + this.f15311b.hashCode()) * 31) + this.f15312c.hashCode()) * 31) + this.f15313d.hashCode();
    }
}
