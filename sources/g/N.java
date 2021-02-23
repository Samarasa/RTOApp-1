package g;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    final C3339a f14917a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f14918b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f14919c;

    public N(C3339a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f14917a = aVar;
            this.f14918b = proxy;
            this.f14919c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public C3339a a() {
        return this.f14917a;
    }

    public Proxy b() {
        return this.f14918b;
    }

    public boolean c() {
        return this.f14917a.i != null && this.f14918b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f14919c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return this.f14917a.equals(n.f14917a) && this.f14918b.equals(n.f14918b) && this.f14919c.equals(n.f14919c);
    }

    public int hashCode() {
        return ((((527 + this.f14917a.hashCode()) * 31) + this.f14918b.hashCode()) * 31) + this.f14919c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f14919c + "}";
    }
}
