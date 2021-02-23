package c.a.a.d;

import c.a.a.g.a.h;
import c.a.a.i.k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class r implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Set<h<?>> f3537a = Collections.newSetFromMap(new WeakHashMap());

    public void a(h<?> hVar) {
        this.f3537a.add(hVar);
    }

    public void b() {
        this.f3537a.clear();
    }

    public void b(h<?> hVar) {
        this.f3537a.remove(hVar);
    }

    public List<h<?>> c() {
        return k.a(this.f3537a);
    }

    public void m() {
        for (T m : k.a(this.f3537a)) {
            m.m();
        }
    }

    public void n() {
        for (T n : k.a(this.f3537a)) {
            n.n();
        }
    }

    public void onDestroy() {
        for (T onDestroy : k.a(this.f3537a)) {
            onDestroy.onDestroy();
        }
    }
}
