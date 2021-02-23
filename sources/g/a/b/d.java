package g.a.b;

import g.N;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<N> f14965a = new LinkedHashSet();

    public synchronized void a(N n) {
        this.f14965a.remove(n);
    }

    public synchronized void b(N n) {
        this.f14965a.add(n);
    }

    public synchronized boolean c(N n) {
        return this.f14965a.contains(n);
    }
}
