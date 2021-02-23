package c.a.a.c.b.a;

import c.a.a.c.b.a.m;
import c.a.a.i.k;
import java.util.Queue;

abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<T> f3037a = k.a(20);

    d() {
    }

    /* access modifiers changed from: package-private */
    public abstract T a();

    public void a(T t) {
        if (this.f3037a.size() < 20) {
            this.f3037a.offer(t);
        }
    }

    /* access modifiers changed from: package-private */
    public T b() {
        T t = (m) this.f3037a.poll();
        return t == null ? a() : t;
    }
}
