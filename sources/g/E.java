package g;

import g.C3345f;
import g.a.e;
import g.a.h.b;
import g.a.h.d;
import g.w;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class E implements Cloneable, C3345f.a, P {

    /* renamed from: a  reason: collision with root package name */
    static final List<F> f14853a = e.a((T[]) new F[]{F.HTTP_2, F.HTTP_1_1});

    /* renamed from: b  reason: collision with root package name */
    static final List<C3353n> f14854b = e.a((T[]) new C3353n[]{C3353n.f15275b, C3353n.f15277d});
    final int A;
    final int B;
    final int C;

    /* renamed from: c  reason: collision with root package name */
    final r f14855c;

    /* renamed from: d  reason: collision with root package name */
    final Proxy f14856d;

    /* renamed from: e  reason: collision with root package name */
    final List<F> f14857e;

    /* renamed from: f  reason: collision with root package name */
    final List<C3353n> f14858f;

    /* renamed from: g  reason: collision with root package name */
    final List<B> f14859g;

    /* renamed from: h  reason: collision with root package name */
    final List<B> f14860h;
    final w.a i;
    final ProxySelector j;
    final q k;
    final C3343d l;
    final g.a.a.e m;
    final SocketFactory n;
    final SSLSocketFactory o;
    final b p;
    final HostnameVerifier q;
    final C3347h r;
    final C3342c s;
    final C3342c t;
    final C3352m u;
    final t v;
    final boolean w;
    final boolean x;
    final boolean y;
    final int z;

    public static final class a {
        int A;

        /* renamed from: a  reason: collision with root package name */
        r f14861a = new r();

        /* renamed from: b  reason: collision with root package name */
        Proxy f14862b;

        /* renamed from: c  reason: collision with root package name */
        List<F> f14863c = E.f14853a;

        /* renamed from: d  reason: collision with root package name */
        List<C3353n> f14864d = E.f14854b;

        /* renamed from: e  reason: collision with root package name */
        final List<B> f14865e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<B> f14866f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        w.a f14867g = w.a(w.f15304a);

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f14868h = ProxySelector.getDefault();
        q i = q.f15294a;
        C3343d j;
        g.a.a.e k;
        SocketFactory l = SocketFactory.getDefault();
        SSLSocketFactory m;
        b n;
        HostnameVerifier o = d.f15229a;
        C3347h p = C3347h.f15250a;
        C3342c q;
        C3342c r;
        C3352m s;
        t t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public a() {
            C3342c cVar = C3342c.f15233a;
            this.q = cVar;
            this.r = cVar;
            this.s = new C3352m();
            this.t = t.f15302a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.A = 0;
        }

        private static int a(String str, long j2, TimeUnit timeUnit) {
            if (j2 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j2);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || j2 <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        public a a(long j2, TimeUnit timeUnit) {
            this.x = a("timeout", j2, timeUnit);
            return this;
        }

        public E a() {
            return new E(this);
        }

        public a b(long j2, TimeUnit timeUnit) {
            this.y = a("timeout", j2, timeUnit);
            return this;
        }

        public a c(long j2, TimeUnit timeUnit) {
            this.z = a("timeout", j2, timeUnit);
            return this;
        }
    }

    static {
        g.a.a.f14935a = new D();
    }

    public E() {
        this(new a());
    }

    E(a aVar) {
        boolean z2;
        b bVar;
        this.f14855c = aVar.f14861a;
        this.f14856d = aVar.f14862b;
        this.f14857e = aVar.f14863c;
        this.f14858f = aVar.f14864d;
        this.f14859g = e.a(aVar.f14865e);
        this.f14860h = e.a(aVar.f14866f);
        this.i = aVar.f14867g;
        this.j = aVar.f14868h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        Iterator<C3353n> it = this.f14858f.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C3353n next = it.next();
                if (z2 || next.b()) {
                    z2 = true;
                }
            }
        }
        if (aVar.m != null || !z2) {
            this.o = aVar.m;
            bVar = aVar.n;
        } else {
            X509TrustManager A2 = A();
            this.o = a(A2);
            bVar = b.a(A2);
        }
        this.p = bVar;
        this.q = aVar.o;
        this.r = aVar.p.a(this.p);
        this.s = aVar.q;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
    }

    private X509TrustManager A() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return instance.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public C3342c a() {
        return this.t;
    }

    public C3345f a(H h2) {
        return new G(this, h2, false);
    }

    public C3347h b() {
        return this.r;
    }

    public int e() {
        return this.z;
    }

    public C3352m f() {
        return this.u;
    }

    public List<C3353n> g() {
        return this.f14858f;
    }

    public q h() {
        return this.k;
    }

    public r i() {
        return this.f14855c;
    }

    public t j() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public w.a k() {
        return this.i;
    }

    public boolean l() {
        return this.x;
    }

    public boolean m() {
        return this.w;
    }

    public HostnameVerifier n() {
        return this.q;
    }

    public List<B> o() {
        return this.f14859g;
    }

    /* access modifiers changed from: package-private */
    public g.a.a.e p() {
        C3343d dVar = this.l;
        return dVar != null ? dVar.f15234a : this.m;
    }

    public List<B> q() {
        return this.f14860h;
    }

    public List<F> r() {
        return this.f14857e;
    }

    public Proxy s() {
        return this.f14856d;
    }

    public C3342c t() {
        return this.s;
    }

    public ProxySelector u() {
        return this.j;
    }

    public int v() {
        return this.A;
    }

    public boolean w() {
        return this.y;
    }

    public SocketFactory x() {
        return this.n;
    }

    public SSLSocketFactory y() {
        return this.o;
    }

    public int z() {
        return this.B;
    }
}
