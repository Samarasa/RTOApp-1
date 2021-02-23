package c.a.a.c.b;

import c.a.a.c.b.C0238j;
import c.a.a.c.b.a.b;
import c.a.a.c.b.b.a;
import c.a.a.c.c.u;
import c.a.a.c.d;
import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.c.m;
import c.a.a.c.n;
import c.a.a.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.c.b.h  reason: case insensitive filesystem */
final class C0236h<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final List<u.a<?>> f3148a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<h> f3149b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private e f3150c;

    /* renamed from: d  reason: collision with root package name */
    private Object f3151d;

    /* renamed from: e  reason: collision with root package name */
    private int f3152e;

    /* renamed from: f  reason: collision with root package name */
    private int f3153f;

    /* renamed from: g  reason: collision with root package name */
    private Class<?> f3154g;

    /* renamed from: h  reason: collision with root package name */
    private C0238j.d f3155h;
    private k i;
    private Map<Class<?>, n<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private h n;
    private c.a.a.h o;
    private q p;
    private boolean q;
    private boolean r;

    C0236h() {
    }

    /* access modifiers changed from: package-private */
    public <Data> C<Data, ?, Transcode> a(Class<Data> cls) {
        return this.f3150c.e().a(cls, this.f3154g, this.k);
    }

    /* access modifiers changed from: package-private */
    public <X> d<X> a(X x) {
        return this.f3150c.e().c(x);
    }

    /* access modifiers changed from: package-private */
    public <Z> m<Z> a(F<Z> f2) {
        return this.f3150c.e().a(f2);
    }

    /* access modifiers changed from: package-private */
    public List<u<File, ?>> a(File file) {
        return this.f3150c.e().a(file);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f3150c = null;
        this.f3151d = null;
        this.n = null;
        this.f3154g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.f3148a.clear();
        this.l = false;
        this.f3149b.clear();
        this.m = false;
    }

    /* access modifiers changed from: package-private */
    public <R> void a(e eVar, Object obj, h hVar, int i2, int i3, q qVar, Class<?> cls, Class<R> cls2, c.a.a.h hVar2, k kVar, Map<Class<?>, n<?>> map, boolean z, boolean z2, C0238j.d dVar) {
        this.f3150c = eVar;
        this.f3151d = obj;
        this.n = hVar;
        this.f3152e = i2;
        this.f3153f = i3;
        this.p = qVar;
        this.f3154g = cls;
        this.f3155h = dVar;
        this.k = cls2;
        this.o = hVar2;
        this.i = kVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(h hVar) {
        List<u.a<?>> g2 = g();
        int size = g2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (g2.get(i2).f3326a.equals(hVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public b b() {
        return this.f3150c.a();
    }

    /* access modifiers changed from: package-private */
    public <Z> n<Z> b(Class<Z> cls) {
        n<Z> nVar = this.j.get(cls);
        if (nVar == null) {
            Iterator<Map.Entry<Class<?>, n<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) next.getValue();
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return c.a.a.c.d.b.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public boolean b(F<?> f2) {
        return this.f3150c.e().b(f2);
    }

    /* access modifiers changed from: package-private */
    public List<h> c() {
        if (!this.m) {
            this.m = true;
            this.f3149b.clear();
            List<u.a<?>> g2 = g();
            int size = g2.size();
            for (int i2 = 0; i2 < size; i2++) {
                u.a aVar = g2.get(i2);
                if (!this.f3149b.contains(aVar.f3326a)) {
                    this.f3149b.add(aVar.f3326a);
                }
                for (int i3 = 0; i3 < aVar.f3327b.size(); i3++) {
                    if (!this.f3149b.contains(aVar.f3327b.get(i3))) {
                        this.f3149b.add(aVar.f3327b.get(i3));
                    }
                }
            }
        }
        return this.f3149b;
    }

    /* access modifiers changed from: package-private */
    public boolean c(Class<?> cls) {
        return a(cls) != null;
    }

    /* access modifiers changed from: package-private */
    public a d() {
        return this.f3155h.a();
    }

    /* access modifiers changed from: package-private */
    public q e() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f3153f;
    }

    /* access modifiers changed from: package-private */
    public List<u.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.f3148a.clear();
            List a2 = this.f3150c.e().a(this.f3151d);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                u.a a3 = ((u) a2.get(i2)).a(this.f3151d, this.f3152e, this.f3153f, this.i);
                if (a3 != null) {
                    this.f3148a.add(a3);
                }
            }
        }
        return this.f3148a;
    }

    /* access modifiers changed from: package-private */
    public k h() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public c.a.a.h i() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public List<Class<?>> j() {
        return this.f3150c.e().b(this.f3151d.getClass(), this.f3154g, this.k);
    }

    /* access modifiers changed from: package-private */
    public h k() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public Class<?> l() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f3152e;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.r;
    }
}
