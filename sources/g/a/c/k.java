package g.a.c;

import g.A;
import g.B;
import g.C3339a;
import g.C3347h;
import g.E;
import g.H;
import g.J;
import g.K;
import g.M;
import g.N;
import g.a.b.c;
import g.a.b.g;
import g.a.e;
import g.a.e.C3340a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class k implements B {

    /* renamed from: a  reason: collision with root package name */
    private final E f15000a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15001b;

    /* renamed from: c  reason: collision with root package name */
    private g f15002c;

    /* renamed from: d  reason: collision with root package name */
    private Object f15003d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f15004e;

    public k(E e2, boolean z) {
        this.f15000a = e2;
        this.f15001b = z;
    }

    private H a(K k) {
        String e2;
        A e3;
        if (k != null) {
            c b2 = this.f15002c.b();
            J j = null;
            N a2 = b2 != null ? b2.a() : null;
            int s = k.s();
            String e4 = k.x().e();
            if (s == 307 || s == 308) {
                if (!e4.equals("GET") && !e4.equals("HEAD")) {
                    return null;
                }
            } else if (s == 401) {
                return this.f15000a.a().a(a2, k);
            } else {
                if (s == 407) {
                    if ((a2 != null ? a2.b() : this.f15000a.s()).type() == Proxy.Type.HTTP) {
                        return this.f15000a.t().a(a2, k);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (s != 408) {
                    switch (s) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else {
                    k.x().a();
                    return k.x();
                }
            }
            if (!this.f15000a.l() || (e2 = k.e("Location")) == null || (e3 = k.x().g().e(e2)) == null) {
                return null;
            }
            if (!e3.m().equals(k.x().g().m()) && !this.f15000a.m()) {
                return null;
            }
            H.a f2 = k.x().f();
            if (g.b(e4)) {
                boolean d2 = g.d(e4);
                if (g.c(e4)) {
                    f2.a("GET", (J) null);
                } else {
                    if (d2) {
                        j = k.x().a();
                    }
                    f2.a(e4, j);
                }
                if (!d2) {
                    f2.a("Transfer-Encoding");
                    f2.a("Content-Length");
                    f2.a("Content-Type");
                }
            }
            if (!a(k, e3)) {
                f2.a("Authorization");
            }
            f2.a(e3);
            return f2.a();
        }
        throw new IllegalStateException();
    }

    private C3339a a(A a2) {
        C3347h hVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (a2.h()) {
            SSLSocketFactory y = this.f15000a.y();
            hostnameVerifier = this.f15000a.n();
            sSLSocketFactory = y;
            hVar = this.f15000a.b();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            hVar = null;
        }
        return new C3339a(a2.g(), a2.j(), this.f15000a.j(), this.f15000a.x(), sSLSocketFactory, hostnameVerifier, hVar, this.f15000a.t(), this.f15000a.s(), this.f15000a.r(), this.f15000a.g(), this.f15000a.u());
    }

    private boolean a(K k, A a2) {
        A g2 = k.x().g();
        return g2.g().equals(a2.g()) && g2.j() == a2.j() && g2.m().equals(a2.m());
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private boolean a(IOException iOException, boolean z, H h2) {
        this.f15002c.a(iOException);
        if (!this.f15000a.w()) {
            return false;
        }
        if (z) {
            h2.a();
        }
        return a(iOException, z) && this.f15002c.c();
    }

    public K a(B.a aVar) {
        H request = aVar.request();
        this.f15002c = new g(this.f15000a.f(), a(request.g()), this.f15003d);
        K k = null;
        int i = 0;
        while (!this.f15004e) {
            try {
                K a2 = ((h) aVar).a(request, this.f15002c, (c) null, (c) null);
                if (k != null) {
                    K.a v = a2.v();
                    K.a v2 = k.v();
                    v2.a((M) null);
                    v.c(v2.a());
                    a2 = v.a();
                }
                k = a2;
                request = a(k);
                if (request == null) {
                    if (!this.f15001b) {
                        this.f15002c.e();
                    }
                    return k;
                }
                e.a((Closeable) k.a());
                i++;
                if (i <= 20) {
                    request.a();
                    if (!a(k, request.g())) {
                        this.f15002c.e();
                        this.f15002c = new g(this.f15000a.f(), a(request.g()), this.f15003d);
                    } else if (this.f15002c.a() != null) {
                        throw new IllegalStateException("Closing the body of " + k + " didn't close its backing stream. Bad interceptor?");
                    }
                } else {
                    this.f15002c.e();
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
            } catch (g.a.b.e e2) {
                if (!a(e2.a(), false, request)) {
                    throw e2.a();
                }
            } catch (IOException e3) {
                if (!a(e3, !(e3 instanceof C3340a), request)) {
                    throw e3;
                }
            } catch (Throwable th) {
                this.f15002c.a((IOException) null);
                this.f15002c.e();
                throw th;
            }
        }
        this.f15002c.e();
        throw new IOException("Canceled");
    }

    public void a(Object obj) {
        this.f15003d = obj;
    }

    public boolean a() {
        return this.f15004e;
    }
}
