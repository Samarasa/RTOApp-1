package c.a.a.c.b;

import c.a.a.i.a.d;
import c.a.a.i.a.g;
import c.a.a.i.i;

final class E<Z> implements F<Z>, d.c {

    /* renamed from: a  reason: collision with root package name */
    private static final b.h.i.d<E<?>> f3000a = d.b(20, new D());

    /* renamed from: b  reason: collision with root package name */
    private final g f3001b = g.a();

    /* renamed from: c  reason: collision with root package name */
    private F<Z> f3002c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3003d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3004e;

    E() {
    }

    static <Z> E<Z> a(F<Z> f2) {
        E<Z> a2 = f3000a.a();
        i.a(a2);
        E<Z> e2 = a2;
        e2.b(f2);
        return e2;
    }

    private void b(F<Z> f2) {
        this.f3004e = false;
        this.f3003d = true;
        this.f3002c = f2;
    }

    private void f() {
        this.f3002c = null;
        f3000a.a(this);
    }

    public synchronized void a() {
        this.f3001b.b();
        this.f3004e = true;
        if (!this.f3003d) {
            this.f3002c.a();
            f();
        }
    }

    public int b() {
        return this.f3002c.b();
    }

    public Class<Z> c() {
        return this.f3002c.c();
    }

    public g d() {
        return this.f3001b;
    }

    /* access modifiers changed from: package-private */
    public synchronized void e() {
        this.f3001b.b();
        if (this.f3003d) {
            this.f3003d = false;
            if (this.f3004e) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f3002c.get();
    }
}
