package g.a.b;

import g.A;
import g.C3339a;
import g.C3350k;
import g.C3352m;
import g.E;
import g.F;
import g.H;
import g.K;
import g.N;
import g.a.a;
import g.a.d.b;
import g.a.e;
import g.a.e.n;
import g.a.e.t;
import g.a.h.d;
import g.y;
import h.f;
import h.g;
import h.p;
import h.w;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class c extends n.b implements C3350k {

    /* renamed from: b  reason: collision with root package name */
    private final C3352m f14958b;

    /* renamed from: c  reason: collision with root package name */
    private final N f14959c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f14960d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f14961e;

    /* renamed from: f  reason: collision with root package name */
    private y f14962f;

    /* renamed from: g  reason: collision with root package name */
    private F f14963g;

    /* renamed from: h  reason: collision with root package name */
    private n f14964h;
    private g i;
    private f j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(C3352m mVar, N n2) {
        this.f14958b = mVar;
        this.f14959c = n2;
    }

    private H a(int i2, int i3, H h2, A a2) {
        String str = "CONNECT " + e.a(a2, true) + " HTTP/1.1";
        while (true) {
            b bVar = new b((E) null, (g) null, this.i, this.j);
            this.i.timeout().a((long) i2, TimeUnit.MILLISECONDS);
            this.j.timeout().a((long) i3, TimeUnit.MILLISECONDS);
            bVar.a(h2.c(), str);
            bVar.a();
            K.a a3 = bVar.a(false);
            a3.a(h2);
            K a4 = a3.a();
            long a5 = g.a.c.f.a(a4);
            if (a5 == -1) {
                a5 = 0;
            }
            w b2 = bVar.b(a5);
            e.b(b2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b2.close();
            int s = a4.s();
            if (s != 200) {
                if (s == 407) {
                    H a6 = this.f14959c.a().g().a(this.f14959c, a4);
                    if (a6 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(a4.e("Connection"))) {
                        return a6;
                    } else {
                        h2 = a6;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + a4.s());
                }
            } else if (this.i.b().e() && this.j.b().e()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private void a(int i2, int i3) {
        Proxy b2 = this.f14959c.b();
        this.f14960d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.f14959c.a().i().createSocket() : new Socket(b2);
        this.f14960d.setSoTimeout(i3);
        try {
            g.a.f.e.a().a(this.f14960d, this.f14959c.d(), i2);
            this.i = p.a(p.b(this.f14960d));
            this.j = p.a(p.a(this.f14960d));
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f14959c.d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void a(int i2, int i3, int i4) {
        H e2 = e();
        A g2 = e2.g();
        int i5 = 0;
        while (true) {
            i5++;
            if (i5 <= 21) {
                a(i2, i3);
                e2 = a(i3, i4, e2, g2);
                if (e2 != null) {
                    e.a(this.f14960d);
                    this.f14960d = null;
                    this.j = null;
                    this.i = null;
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Too many tunnel connections attempted: " + 21);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0115 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(g.a.b.b r8) {
        /*
            r7 = this;
            g.N r0 = r7.f14959c
            g.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.j()
            r2 = 0
            java.net.Socket r3 = r7.f14960d     // Catch:{ AssertionError -> 0x010e }
            g.A r4 = r0.k()     // Catch:{ AssertionError -> 0x010e }
            java.lang.String r4 = r4.g()     // Catch:{ AssertionError -> 0x010e }
            g.A r5 = r0.k()     // Catch:{ AssertionError -> 0x010e }
            int r5 = r5.j()     // Catch:{ AssertionError -> 0x010e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x010e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x010e }
            g.n r8 = r8.a((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            boolean r3 = r8.c()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            if (r3 == 0) goto L_0x0041
            g.a.f.e r3 = g.a.f.e.a()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            g.A r4 = r0.k()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r4 = r4.g()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.util.List r5 = r0.e()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.a((javax.net.ssl.SSLSocket) r1, (java.lang.String) r4, (java.util.List<g.F>) r5)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            g.y r3 = g.y.a(r3)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            javax.net.ssl.HostnameVerifier r4 = r0.d()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            g.A r5 = r0.k()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r5 = r5.g()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            javax.net.ssl.SSLSession r6 = r1.getSession()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            boolean r4 = r4.verify(r5, r6)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            if (r4 == 0) goto L_0x00b4
            g.h r4 = r0.a()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            g.A r0 = r0.k()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = r0.g()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.util.List r5 = r3.b()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r4.a(r0, r5)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            boolean r8 = r8.c()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            if (r8 == 0) goto L_0x0083
            g.a.f.e r8 = g.a.f.e.a()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r2 = r8.b((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
        L_0x0083:
            r7.f14961e = r1     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.net.Socket r8 = r7.f14961e     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            h.w r8 = h.p.b(r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            h.g r8 = h.p.a((h.w) r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r7.i = r8     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.net.Socket r8 = r7.f14961e     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            h.v r8 = h.p.a((java.net.Socket) r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            h.f r8 = h.p.a((h.v) r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r7.j = r8     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r7.f14962f = r3     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            if (r2 == 0) goto L_0x00a6
            g.F r8 = g.F.a(r2)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            goto L_0x00a8
        L_0x00a6:
            g.F r8 = g.F.HTTP_1_1     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
        L_0x00a8:
            r7.f14963g = r8     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            if (r1 == 0) goto L_0x00b3
            g.a.f.e r8 = g.a.f.e.a()
            r8.a((javax.net.ssl.SSLSocket) r1)
        L_0x00b3:
            return
        L_0x00b4:
            java.util.List r8 = r3.b()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.<init>()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r4 = "Hostname "
            r3.append(r4)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            g.A r0 = r0.k()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = r0.g()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = g.C3347h.a((java.security.cert.Certificate) r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.util.List r8 = g.a.h.d.a(r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
            throw r2     // Catch:{ AssertionError -> 0x0108, all -> 0x0106 }
        L_0x0106:
            r8 = move-exception
            goto L_0x011c
        L_0x0108:
            r8 = move-exception
            r2 = r1
            goto L_0x010f
        L_0x010b:
            r8 = move-exception
            r1 = r2
            goto L_0x011c
        L_0x010e:
            r8 = move-exception
        L_0x010f:
            boolean r0 = g.a.e.a((java.lang.AssertionError) r8)     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x011b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x010b }
            r0.<init>(r8)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x011b:
            throw r8     // Catch:{ all -> 0x010b }
        L_0x011c:
            if (r1 == 0) goto L_0x0125
            g.a.f.e r0 = g.a.f.e.a()
            r0.a((javax.net.ssl.SSLSocket) r1)
        L_0x0125:
            g.a.e.a((java.net.Socket) r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.b.c.a(g.a.b.b):void");
    }

    private void b(b bVar) {
        if (this.f14959c.a().j() == null) {
            this.f14963g = F.HTTP_1_1;
            this.f14961e = this.f14960d;
            return;
        }
        a(bVar);
        if (this.f14963g == F.HTTP_2) {
            this.f14961e.setSoTimeout(0);
            n.a aVar = new n.a(true);
            aVar.a(this.f14961e, this.f14959c.a().k().g(), this.i, this.j);
            aVar.a(this);
            this.f14964h = aVar.a();
            this.f14964h.s();
        }
    }

    private H e() {
        H.a aVar = new H.a();
        aVar.a(this.f14959c.a().k());
        aVar.a("Host", e.a(this.f14959c.a().k(), true));
        aVar.a("Proxy-Connection", "Keep-Alive");
        aVar.a("User-Agent", g.a.f.a());
        return aVar.a();
    }

    public N a() {
        return this.f14959c;
    }

    public g.a.c.c a(E e2, g gVar) {
        n nVar = this.f14964h;
        if (nVar != null) {
            return new g.a.e.f(e2, gVar, nVar);
        }
        this.f14961e.setSoTimeout(e2.v());
        this.i.timeout().a((long) e2.v(), TimeUnit.MILLISECONDS);
        this.j.timeout().a((long) e2.z(), TimeUnit.MILLISECONDS);
        return new b(e2, gVar, this.i, this.j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078 A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            g.F r0 = r5.f14963g
            if (r0 != 0) goto L_0x00c5
            g.N r0 = r5.f14959c
            g.a r0 = r0.a()
            java.util.List r0 = r0.b()
            g.a.b.b r1 = new g.a.b.b
            r1.<init>(r0)
            g.N r2 = r5.f14959c
            g.a r2 = r2.a()
            javax.net.ssl.SSLSocketFactory r2 = r2.j()
            if (r2 != 0) goto L_0x006e
            g.n r2 = g.C3353n.f15277d
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0061
            g.N r0 = r5.f14959c
            g.a r0 = r0.a()
            g.A r0 = r0.k()
            java.lang.String r0 = r0.g()
            g.a.f.e r2 = g.a.f.e.a()
            boolean r2 = r2.b((java.lang.String) r0)
            if (r2 == 0) goto L_0x0040
            goto L_0x006e
        L_0x0040:
            g.a.b.e r6 = new g.a.b.e
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "CLEARTEXT communication to "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = " not permitted by network security policy"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x0061:
            g.a.b.e r6 = new g.a.b.e
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication not enabled for client"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x006e:
            r0 = 0
            r2 = r0
        L_0x0070:
            g.N r3 = r5.f14959c     // Catch:{ IOException -> 0x0097 }
            boolean r3 = r3.c()     // Catch:{ IOException -> 0x0097 }
            if (r3 == 0) goto L_0x007c
            r5.a(r6, r7, r8)     // Catch:{ IOException -> 0x0097 }
            goto L_0x007f
        L_0x007c:
            r5.a((int) r6, (int) r7)     // Catch:{ IOException -> 0x0097 }
        L_0x007f:
            r5.b(r1)     // Catch:{ IOException -> 0x0097 }
            g.a.e.n r6 = r5.f14964h
            if (r6 == 0) goto L_0x0096
            g.m r6 = r5.f14958b
            monitor-enter(r6)
            g.a.e.n r7 = r5.f14964h     // Catch:{ all -> 0x0093 }
            int r7 = r7.r()     // Catch:{ all -> 0x0093 }
            r5.m = r7     // Catch:{ all -> 0x0093 }
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x0096
        L_0x0093:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            throw r7
        L_0x0096:
            return
        L_0x0097:
            r3 = move-exception
            java.net.Socket r4 = r5.f14961e
            g.a.e.a((java.net.Socket) r4)
            java.net.Socket r4 = r5.f14960d
            g.a.e.a((java.net.Socket) r4)
            r5.f14961e = r0
            r5.f14960d = r0
            r5.i = r0
            r5.j = r0
            r5.f14962f = r0
            r5.f14963g = r0
            r5.f14964h = r0
            if (r2 != 0) goto L_0x00b8
            g.a.b.e r2 = new g.a.b.e
            r2.<init>(r3)
            goto L_0x00bb
        L_0x00b8:
            r2.a(r3)
        L_0x00bb:
            if (r9 == 0) goto L_0x00c4
            boolean r3 = r1.a((java.io.IOException) r3)
            if (r3 == 0) goto L_0x00c4
            goto L_0x0070
        L_0x00c4:
            throw r2
        L_0x00c5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "already connected"
            r6.<init>(r7)
            goto L_0x00ce
        L_0x00cd:
            throw r6
        L_0x00ce:
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.b.c.a(int, int, int, boolean):void");
    }

    public void a(n nVar) {
        synchronized (this.f14958b) {
            this.m = nVar.r();
        }
    }

    public void a(t tVar) {
        tVar.a(g.a.e.b.REFUSED_STREAM);
    }

    public boolean a(A a2) {
        if (a2.j() != this.f14959c.a().k().j()) {
            return false;
        }
        if (!a2.g().equals(this.f14959c.a().k().g())) {
            return this.f14962f != null && d.f15229a.verify(a2.g(), (X509Certificate) this.f14962f.b().get(0));
        }
        return true;
    }

    public boolean a(C3339a aVar, N n2) {
        if (this.n.size() >= this.m || this.k || !a.f14935a.a(this.f14959c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(a().a().k().g())) {
            return true;
        }
        if (this.f14964h == null || n2 == null || n2.b().type() != Proxy.Type.DIRECT || this.f14959c.b().type() != Proxy.Type.DIRECT || !this.f14959c.d().equals(n2.d()) || n2.a().d() != d.f15229a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(boolean z) {
        int soTimeout;
        if (this.f14961e.isClosed() || this.f14961e.isInputShutdown() || this.f14961e.isOutputShutdown()) {
            return false;
        }
        n nVar = this.f14964h;
        if (nVar != null) {
            return !nVar.a();
        }
        if (z) {
            try {
                soTimeout = this.f14961e.getSoTimeout();
                this.f14961e.setSoTimeout(1);
                if (this.i.e()) {
                    this.f14961e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f14961e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f14961e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public y b() {
        return this.f14962f;
    }

    public boolean c() {
        return this.f14964h != null;
    }

    public Socket d() {
        return this.f14961e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f14959c.a().k().g());
        sb.append(":");
        sb.append(this.f14959c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.f14959c.b());
        sb.append(" hostAddress=");
        sb.append(this.f14959c.d());
        sb.append(" cipherSuite=");
        y yVar = this.f14962f;
        sb.append(yVar != null ? yVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f14963g);
        sb.append('}');
        return sb.toString();
    }
}
