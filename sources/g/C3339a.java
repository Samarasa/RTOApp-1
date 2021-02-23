package g;

import g.A;
import g.a.e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: g.a  reason: case insensitive filesystem */
public final class C3339a {

    /* renamed from: a  reason: collision with root package name */
    final A f14927a;

    /* renamed from: b  reason: collision with root package name */
    final t f14928b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f14929c;

    /* renamed from: d  reason: collision with root package name */
    final C3342c f14930d;

    /* renamed from: e  reason: collision with root package name */
    final List<F> f14931e;

    /* renamed from: f  reason: collision with root package name */
    final List<C3353n> f14932f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f14933g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f14934h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final C3347h k;

    public C3339a(String str, int i2, t tVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3347h hVar, C3342c cVar, Proxy proxy, List<F> list, List<C3353n> list2, ProxySelector proxySelector) {
        A.a aVar = new A.a();
        aVar.d(sSLSocketFactory != null ? "https" : "http");
        aVar.b(str);
        aVar.a(i2);
        this.f14927a = aVar.a();
        if (tVar != null) {
            this.f14928b = tVar;
            if (socketFactory != null) {
                this.f14929c = socketFactory;
                if (cVar != null) {
                    this.f14930d = cVar;
                    if (list != null) {
                        this.f14931e = e.a(list);
                        if (list2 != null) {
                            this.f14932f = e.a(list2);
                            if (proxySelector != null) {
                                this.f14933g = proxySelector;
                                this.f14934h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = hVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public C3347h a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public boolean a(C3339a aVar) {
        return this.f14928b.equals(aVar.f14928b) && this.f14930d.equals(aVar.f14930d) && this.f14931e.equals(aVar.f14931e) && this.f14932f.equals(aVar.f14932f) && this.f14933g.equals(aVar.f14933g) && e.a((Object) this.f14934h, (Object) aVar.f14934h) && e.a((Object) this.i, (Object) aVar.i) && e.a((Object) this.j, (Object) aVar.j) && e.a((Object) this.k, (Object) aVar.k) && k().j() == aVar.k().j();
    }

    public List<C3353n> b() {
        return this.f14932f;
    }

    public t c() {
        return this.f14928b;
    }

    public HostnameVerifier d() {
        return this.j;
    }

    public List<F> e() {
        return this.f14931e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3339a) {
            C3339a aVar = (C3339a) obj;
            return this.f14927a.equals(aVar.f14927a) && a(aVar);
        }
    }

    public Proxy f() {
        return this.f14934h;
    }

    public C3342c g() {
        return this.f14930d;
    }

    public ProxySelector h() {
        return this.f14933g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f14927a.hashCode()) * 31) + this.f14928b.hashCode()) * 31) + this.f14930d.hashCode()) * 31) + this.f14931e.hashCode()) * 31) + this.f14932f.hashCode()) * 31) + this.f14933g.hashCode()) * 31;
        Proxy proxy = this.f14934h;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C3347h hVar = this.k;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public SocketFactory i() {
        return this.f14929c;
    }

    public SSLSocketFactory j() {
        return this.i;
    }

    public A k() {
        return this.f14927a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f14927a.g());
        sb.append(":");
        sb.append(this.f14927a.j());
        if (this.f14934h != null) {
            sb.append(", proxy=");
            obj = this.f14934h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f14933g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
