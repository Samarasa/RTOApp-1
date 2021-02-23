package g;

import g.a.e;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: g.n  reason: case insensitive filesystem */
public final class C3353n {

    /* renamed from: a  reason: collision with root package name */
    private static final C3349j[] f15274a = {C3349j.Ya, C3349j.bb, C3349j.Za, C3349j.cb, C3349j.ib, C3349j.hb, C3349j.za, C3349j.Ja, C3349j.Aa, C3349j.Ka, C3349j.ha, C3349j.ia, C3349j.F, C3349j.J, C3349j.j};

    /* renamed from: b  reason: collision with root package name */
    public static final C3353n f15275b;

    /* renamed from: c  reason: collision with root package name */
    public static final C3353n f15276c;

    /* renamed from: d  reason: collision with root package name */
    public static final C3353n f15277d = new a(false).a();

    /* renamed from: e  reason: collision with root package name */
    final boolean f15278e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f15279f;

    /* renamed from: g  reason: collision with root package name */
    final String[] f15280g;

    /* renamed from: h  reason: collision with root package name */
    final String[] f15281h;

    /* renamed from: g.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f15282a;

        /* renamed from: b  reason: collision with root package name */
        String[] f15283b;

        /* renamed from: c  reason: collision with root package name */
        String[] f15284c;

        /* renamed from: d  reason: collision with root package name */
        boolean f15285d;

        public a(C3353n nVar) {
            this.f15282a = nVar.f15278e;
            this.f15283b = nVar.f15280g;
            this.f15284c = nVar.f15281h;
            this.f15285d = nVar.f15279f;
        }

        a(boolean z) {
            this.f15282a = z;
        }

        public a a(boolean z) {
            if (this.f15282a) {
                this.f15285d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a a(O... oArr) {
            if (this.f15282a) {
                String[] strArr = new String[oArr.length];
                for (int i = 0; i < oArr.length; i++) {
                    strArr[i] = oArr[i].f14926g;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(C3349j... jVarArr) {
            if (this.f15282a) {
                String[] strArr = new String[jVarArr.length];
                for (int i = 0; i < jVarArr.length; i++) {
                    strArr[i] = jVarArr[i].jb;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(String... strArr) {
            if (!this.f15282a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f15283b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public C3353n a() {
            return new C3353n(this);
        }

        public a b(String... strArr) {
            if (!this.f15282a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f15284c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        a aVar = new a(true);
        aVar.a(f15274a);
        aVar.a(O.TLS_1_3, O.TLS_1_2, O.TLS_1_1, O.TLS_1_0);
        aVar.a(true);
        f15275b = aVar.a();
        a aVar2 = new a(f15275b);
        aVar2.a(O.TLS_1_0);
        aVar2.a(true);
        f15276c = aVar2.a();
    }

    C3353n(a aVar) {
        this.f15278e = aVar.f15282a;
        this.f15280g = aVar.f15283b;
        this.f15281h = aVar.f15284c;
        this.f15279f = aVar.f15285d;
    }

    private C3353n b(SSLSocket sSLSocket, boolean z) {
        String[] a2 = this.f15280g != null ? e.a((Comparator<? super String>) C3349j.f15258a, sSLSocket.getEnabledCipherSuites(), this.f15280g) : sSLSocket.getEnabledCipherSuites();
        String[] a3 = this.f15281h != null ? e.a((Comparator<? super String>) e.p, sSLSocket.getEnabledProtocols(), this.f15281h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a4 = e.a(C3349j.f15258a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a4 != -1) {
            a2 = e.a(a2, supportedCipherSuites[a4]);
        }
        a aVar = new a(this);
        aVar.a(a2);
        aVar.b(a3);
        return aVar.a();
    }

    public List<C3349j> a() {
        String[] strArr = this.f15280g;
        if (strArr != null) {
            return C3349j.a(strArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        C3353n b2 = b(sSLSocket, z);
        String[] strArr = b2.f15281h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b2.f15280g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f15278e) {
            return false;
        }
        String[] strArr = this.f15281h;
        if (strArr != null && !e.b(e.p, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f15280g;
        return strArr2 == null || e.b(C3349j.f15258a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.f15278e;
    }

    public boolean c() {
        return this.f15279f;
    }

    public List<O> d() {
        String[] strArr = this.f15281h;
        if (strArr != null) {
            return O.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3353n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3353n nVar = (C3353n) obj;
        boolean z = this.f15278e;
        if (z != nVar.f15278e) {
            return false;
        }
        return !z || (Arrays.equals(this.f15280g, nVar.f15280g) && Arrays.equals(this.f15281h, nVar.f15281h) && this.f15279f == nVar.f15279f);
    }

    public int hashCode() {
        if (this.f15278e) {
            return ((((527 + Arrays.hashCode(this.f15280g)) * 31) + Arrays.hashCode(this.f15281h)) * 31) + (this.f15279f ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f15278e) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f15280g != null ? a().toString() : str;
        if (this.f15281h != null) {
            str = d().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f15279f + ")";
    }
}
