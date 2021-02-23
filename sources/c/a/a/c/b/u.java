package c.a.a.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.a.a.c.b.C0238j;
import c.a.a.c.h;
import c.a.a.g.f;
import c.a.a.i.a.d;
import c.a.a.i.a.g;
import c.a.a.i.k;
import java.util.ArrayList;
import java.util.List;

class u<R> implements C0238j.a<R>, d.c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f3219a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f3220b = new Handler(Looper.getMainLooper(), new b());

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f3221c;

    /* renamed from: d  reason: collision with root package name */
    private final g f3222d;

    /* renamed from: e  reason: collision with root package name */
    private final b.h.i.d<u<?>> f3223e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3224f;

    /* renamed from: g  reason: collision with root package name */
    private final v f3225g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.c.b.c.b f3226h;
    private final c.a.a.c.b.c.b i;
    private final c.a.a.c.b.c.b j;
    private final c.a.a.c.b.c.b k;
    private h l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private F<?> q;
    private c.a.a.c.a r;
    private boolean s;
    private z t;
    private boolean u;
    private List<f> v;
    private y<?> w;
    private C0238j<R> x;
    private volatile boolean y;

    static class a {
        a() {
        }

        public <R> y<R> a(F<R> f2, boolean z) {
            return new y<>(f2, z, true);
        }
    }

    private static class b implements Handler.Callback {
        b() {
        }

        public boolean handleMessage(Message message) {
            u uVar = (u) message.obj;
            int i = message.what;
            if (i == 1) {
                uVar.e();
            } else if (i == 2) {
                uVar.c();
            } else if (i == 3) {
                uVar.b();
            } else {
                throw new IllegalStateException("Unrecognized message: " + message.what);
            }
            return true;
        }
    }

    u(c.a.a.c.b.c.b bVar, c.a.a.c.b.c.b bVar2, c.a.a.c.b.c.b bVar3, c.a.a.c.b.c.b bVar4, v vVar, b.h.i.d<u<?>> dVar) {
        this(bVar, bVar2, bVar3, bVar4, vVar, dVar, f3219a);
    }

    u(c.a.a.c.b.c.b bVar, c.a.a.c.b.c.b bVar2, c.a.a.c.b.c.b bVar3, c.a.a.c.b.c.b bVar4, v vVar, b.h.i.d<u<?>> dVar, a aVar) {
        this.f3221c = new ArrayList(2);
        this.f3222d = g.a();
        this.f3226h = bVar;
        this.i = bVar2;
        this.j = bVar3;
        this.k = bVar4;
        this.f3225g = vVar;
        this.f3223e = dVar;
        this.f3224f = aVar;
    }

    private void a(boolean z) {
        k.a();
        this.f3221c.clear();
        this.l = null;
        this.w = null;
        this.q = null;
        List<f> list = this.v;
        if (list != null) {
            list.clear();
        }
        this.u = false;
        this.y = false;
        this.s = false;
        this.x.a(z);
        this.x = null;
        this.t = null;
        this.r = null;
        this.f3223e.a(this);
    }

    private void c(f fVar) {
        if (this.v == null) {
            this.v = new ArrayList(2);
        }
        if (!this.v.contains(fVar)) {
            this.v.add(fVar);
        }
    }

    private boolean d(f fVar) {
        List<f> list = this.v;
        return list != null && list.contains(fVar);
    }

    private c.a.a.c.b.c.b g() {
        return this.n ? this.j : this.o ? this.k : this.i;
    }

    /* access modifiers changed from: package-private */
    public u<R> a(h hVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.l = hVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.u && !this.s && !this.y) {
            this.y = true;
            this.x.a();
            this.f3225g.a(this, this.l);
        }
    }

    public void a(F<R> f2, c.a.a.c.a aVar) {
        this.q = f2;
        this.r = aVar;
        f3220b.obtainMessage(1, this).sendToTarget();
    }

    public void a(C0238j<?> jVar) {
        g().execute(jVar);
    }

    public void a(z zVar) {
        this.t = zVar;
        f3220b.obtainMessage(2, this).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        k.a();
        this.f3222d.b();
        if (this.s) {
            fVar.a(this.w, this.r);
        } else if (this.u) {
            fVar.a(this.t);
        } else {
            this.f3221c.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3222d.b();
        if (this.y) {
            this.f3225g.a(this, this.l);
            a(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    public void b(C0238j<R> jVar) {
        this.x = jVar;
        (jVar.m() ? this.f3226h : g()).execute(jVar);
    }

    /* access modifiers changed from: package-private */
    public void b(f fVar) {
        k.a();
        this.f3222d.b();
        if (this.s || this.u) {
            c(fVar);
            return;
        }
        this.f3221c.remove(fVar);
        if (this.f3221c.isEmpty()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f3222d.b();
        if (this.y) {
            a(false);
        } else if (this.f3221c.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (!this.u) {
            this.u = true;
            this.f3225g.a(this, this.l, (y<?>) null);
            for (f next : this.f3221c) {
                if (!d(next)) {
                    next.a(this.t);
                }
            }
            a(false);
        } else {
            throw new IllegalStateException("Already failed once");
        }
    }

    public g d() {
        return this.f3222d;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f3222d.b();
        if (this.y) {
            this.q.a();
        } else if (this.f3221c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else if (!this.s) {
            this.w = this.f3224f.a(this.q, this.m);
            this.s = true;
            this.w.d();
            this.f3225g.a(this, this.l, this.w);
            int size = this.f3221c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f3221c.get(i2);
                if (!d(fVar)) {
                    this.w.d();
                    fVar.a(this.w, this.r);
                }
            }
            this.w.g();
        } else {
            throw new IllegalStateException("Already have resource");
        }
        a(false);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.p;
    }
}
