package g.a.b;

import g.A;
import g.C3339a;
import g.N;
import g.a.e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final C3339a f14968a;

    /* renamed from: b  reason: collision with root package name */
    private final d f14969b;

    /* renamed from: c  reason: collision with root package name */
    private Proxy f14970c;

    /* renamed from: d  reason: collision with root package name */
    private InetSocketAddress f14971d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f14972e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f14973f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f14974g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private int f14975h;
    private final List<N> i = new ArrayList();

    public f(C3339a aVar, d dVar) {
        this.f14968a = aVar;
        this.f14969b = dVar;
        a(aVar.k(), aVar.f());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private void a(A a2, Proxy proxy) {
        List<Proxy> a3;
        if (proxy != null) {
            a3 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f14968a.h().select(a2.n());
            if (select == null || select.isEmpty()) {
                a3 = e.a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                a3 = e.a(select);
            }
        }
        this.f14972e = a3;
        this.f14973f = 0;
    }

    private void a(Proxy proxy) {
        String str;
        int i2;
        this.f14974g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f14968a.k().g();
            i2 = this.f14968a.k().j();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = a(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i2 < 1 || i2 > 65535) {
            throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f14974g.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            List<InetAddress> lookup = this.f14968a.c().lookup(str);
            int size = lookup.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f14974g.add(new InetSocketAddress(lookup.get(i3), i2));
            }
        }
        this.f14975h = 0;
    }

    private boolean c() {
        return this.f14975h < this.f14974g.size();
    }

    private boolean d() {
        return !this.i.isEmpty();
    }

    private boolean e() {
        return this.f14973f < this.f14972e.size();
    }

    private InetSocketAddress f() {
        if (c()) {
            List<InetSocketAddress> list = this.f14974g;
            int i2 = this.f14975h;
            this.f14975h = i2 + 1;
            return list.get(i2);
        }
        throw new SocketException("No route to " + this.f14968a.k().g() + "; exhausted inet socket addresses: " + this.f14974g);
    }

    private N g() {
        return this.i.remove(0);
    }

    private Proxy h() {
        if (e()) {
            List<Proxy> list = this.f14972e;
            int i2 = this.f14973f;
            this.f14973f = i2 + 1;
            Proxy proxy = list.get(i2);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f14968a.k().g() + "; exhausted proxy configurations: " + this.f14972e);
    }

    public void a(N n, IOException iOException) {
        if (!(n.b().type() == Proxy.Type.DIRECT || this.f14968a.h() == null)) {
            this.f14968a.h().connectFailed(this.f14968a.k().n(), n.b().address(), iOException);
        }
        this.f14969b.b(n);
    }

    public boolean a() {
        return c() || e() || d();
    }

    public N b() {
        if (!c()) {
            if (e()) {
                this.f14970c = h();
            } else if (d()) {
                return g();
            } else {
                throw new NoSuchElementException();
            }
        }
        this.f14971d = f();
        N n = new N(this.f14968a, this.f14970c, this.f14971d);
        if (!this.f14969b.c(n)) {
            return n;
        }
        this.i.add(n);
        return b();
    }
}
