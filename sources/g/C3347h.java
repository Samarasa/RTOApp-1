package g;

import g.a.e;
import h.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: g.h  reason: case insensitive filesystem */
public final class C3347h {

    /* renamed from: a  reason: collision with root package name */
    public static final C3347h f15250a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f15251b;

    /* renamed from: c  reason: collision with root package name */
    private final g.a.h.b f15252c;

    /* renamed from: g.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f15253a = new ArrayList();

        public C3347h a() {
            return new C3347h(new LinkedHashSet(this.f15253a), (g.a.h.b) null);
        }
    }

    /* renamed from: g.h$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f15254a;

        /* renamed from: b  reason: collision with root package name */
        final String f15255b;

        /* renamed from: c  reason: collision with root package name */
        final String f15256c;

        /* renamed from: d  reason: collision with root package name */
        final h f15257d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.f15254a.startsWith("*.")) {
                return str.equals(this.f15255b);
            }
            String str2 = this.f15255b;
            return str.regionMatches(false, str.indexOf(46) + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f15254a.equals(bVar.f15254a) && this.f15256c.equals(bVar.f15256c) && this.f15257d.equals(bVar.f15257d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f15254a.hashCode()) * 31) + this.f15256c.hashCode()) * 31) + this.f15257d.hashCode();
        }

        public String toString() {
            return this.f15256c + this.f15257d.a();
        }
    }

    C3347h(Set<b> set, g.a.h.b bVar) {
        this.f15251b = set;
        this.f15252c = bVar;
    }

    static h a(X509Certificate x509Certificate) {
        return h.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static h b(X509Certificate x509Certificate) {
        return h.a(x509Certificate.getPublicKey().getEncoded()).m();
    }

    /* access modifiers changed from: package-private */
    public C3347h a(g.a.h.b bVar) {
        return e.a((Object) this.f15252c, (Object) bVar) ? this : new C3347h(this.f15251b, bVar);
    }

    /* access modifiers changed from: package-private */
    public List<b> a(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.f15251b) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public void a(String str, List<Certificate> list) {
        List<b> a2 = a(str);
        if (!a2.isEmpty()) {
            g.a.h.b bVar = this.f15252c;
            if (bVar != null) {
                list = bVar.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a2.size();
                h hVar = null;
                h hVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar2 = a2.get(i2);
                    if (bVar2.f15256c.equals("sha256/")) {
                        if (hVar == null) {
                            hVar = b(x509Certificate);
                        }
                        if (bVar2.f15257d.equals(hVar)) {
                            return;
                        }
                    } else if (bVar2.f15256c.equals("sha1/")) {
                        if (hVar2 == null) {
                            hVar2 = a(x509Certificate);
                        }
                        if (bVar2.f15257d.equals(hVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(a((Certificate) x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = a2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(a2.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3347h) {
            C3347h hVar = (C3347h) obj;
            return e.a((Object) this.f15252c, (Object) hVar.f15252c) && this.f15251b.equals(hVar.f15251b);
        }
    }

    public int hashCode() {
        g.a.h.b bVar = this.f15252c;
        return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.f15251b.hashCode();
    }
}
