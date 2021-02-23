package c.a.a.c.b;

import android.util.Log;
import c.a.a.c.b.C0238j;
import c.a.a.c.b.b.a;
import c.a.a.c.b.b.i;
import c.a.a.c.b.y;
import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.c.n;
import c.a.a.e;
import c.a.a.g.f;
import java.util.Map;

public class s implements v, i.a, y.a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3197a = Log.isLoggable("Engine", 2);

    /* renamed from: b  reason: collision with root package name */
    private final B f3198b;

    /* renamed from: c  reason: collision with root package name */
    private final x f3199c;

    /* renamed from: d  reason: collision with root package name */
    private final i f3200d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3201e;

    /* renamed from: f  reason: collision with root package name */
    private final I f3202f;

    /* renamed from: g  reason: collision with root package name */
    private final c f3203g;

    /* renamed from: h  reason: collision with root package name */
    private final a f3204h;
    private final C0231c i;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final C0238j.d f3205a;

        /* renamed from: b  reason: collision with root package name */
        final b.h.i.d<C0238j<?>> f3206b = c.a.a.i.a.d.a(150, new r(this));

        /* renamed from: c  reason: collision with root package name */
        private int f3207c;

        a(C0238j.d dVar) {
            this.f3205a = dVar;
        }

        /* access modifiers changed from: package-private */
        public <R> C0238j<R> a(e eVar, Object obj, w wVar, h hVar, int i, int i2, Class<?> cls, Class<R> cls2, c.a.a.h hVar2, q qVar, Map<Class<?>, n<?>> map, boolean z, boolean z2, boolean z3, k kVar, C0238j.a<R> aVar) {
            C0238j<R> a2 = this.f3206b.a();
            c.a.a.i.i.a(a2);
            C0238j<R> jVar = a2;
            int i3 = this.f3207c;
            int i4 = i3;
            this.f3207c = i3 + 1;
            jVar.a(eVar, obj, wVar, hVar, i, i2, cls, cls2, hVar2, qVar, map, z, z2, z3, kVar, aVar, i4);
            return jVar;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final c.a.a.c.b.c.b f3208a;

        /* renamed from: b  reason: collision with root package name */
        final c.a.a.c.b.c.b f3209b;

        /* renamed from: c  reason: collision with root package name */
        final c.a.a.c.b.c.b f3210c;

        /* renamed from: d  reason: collision with root package name */
        final c.a.a.c.b.c.b f3211d;

        /* renamed from: e  reason: collision with root package name */
        final v f3212e;

        /* renamed from: f  reason: collision with root package name */
        final b.h.i.d<u<?>> f3213f = c.a.a.i.a.d.a(150, new t(this));

        b(c.a.a.c.b.c.b bVar, c.a.a.c.b.c.b bVar2, c.a.a.c.b.c.b bVar3, c.a.a.c.b.c.b bVar4, v vVar) {
            this.f3208a = bVar;
            this.f3209b = bVar2;
            this.f3210c = bVar3;
            this.f3211d = bVar4;
            this.f3212e = vVar;
        }

        /* access modifiers changed from: package-private */
        public <R> u<R> a(h hVar, boolean z, boolean z2, boolean z3, boolean z4) {
            u<R> a2 = this.f3213f.a();
            c.a.a.i.i.a(a2);
            u<R> uVar = a2;
            uVar.a(hVar, z, z2, z3, z4);
            return uVar;
        }
    }

    private static class c implements C0238j.d {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0046a f3214a;

        /* renamed from: b  reason: collision with root package name */
        private volatile c.a.a.c.b.b.a f3215b;

        c(a.C0046a aVar) {
            this.f3214a = aVar;
        }

        public c.a.a.c.b.b.a a() {
            if (this.f3215b == null) {
                synchronized (this) {
                    if (this.f3215b == null) {
                        this.f3215b = this.f3214a.build();
                    }
                    if (this.f3215b == null) {
                        this.f3215b = new c.a.a.c.b.b.b();
                    }
                }
            }
            return this.f3215b;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final u<?> f3216a;

        /* renamed from: b  reason: collision with root package name */
        private final f f3217b;

        d(f fVar, u<?> uVar) {
            this.f3217b = fVar;
            this.f3216a = uVar;
        }

        public void a() {
            this.f3216a.b(this.f3217b);
        }
    }

    s(i iVar, a.C0046a aVar, c.a.a.c.b.c.b bVar, c.a.a.c.b.c.b bVar2, c.a.a.c.b.c.b bVar3, c.a.a.c.b.c.b bVar4, B b2, x xVar, C0231c cVar, b bVar5, a aVar2, I i2, boolean z) {
        this.f3200d = iVar;
        a.C0046a aVar3 = aVar;
        this.f3203g = new c(aVar);
        C0231c cVar2 = cVar == null ? new C0231c(z) : cVar;
        this.i = cVar2;
        cVar2.a((y.a) this);
        this.f3199c = xVar == null ? new x() : xVar;
        this.f3198b = b2 == null ? new B() : b2;
        this.f3201e = bVar5 == null ? new b(bVar, bVar2, bVar3, bVar4, this) : bVar5;
        this.f3204h = aVar2 == null ? new a(this.f3203g) : aVar2;
        this.f3202f = i2 == null ? new I() : i2;
        iVar.a((i.a) this);
    }

    public s(i iVar, a.C0046a aVar, c.a.a.c.b.c.b bVar, c.a.a.c.b.c.b bVar2, c.a.a.c.b.c.b bVar3, c.a.a.c.b.c.b bVar4, boolean z) {
        this(iVar, aVar, bVar, bVar2, bVar3, bVar4, (B) null, (x) null, (C0231c) null, (b) null, (a) null, (I) null, z);
    }

    private y<?> a(h hVar) {
        F<?> a2 = this.f3200d.a(hVar);
        if (a2 == null) {
            return null;
        }
        return a2 instanceof y ? (y) a2 : new y<>(a2, true, true);
    }

    private y<?> a(h hVar, boolean z) {
        if (!z) {
            return null;
        }
        y<?> b2 = this.i.b(hVar);
        if (b2 != null) {
            b2.d();
        }
        return b2;
    }

    private static void a(String str, long j, h hVar) {
        Log.v("Engine", str + " in " + c.a.a.i.e.a(j) + "ms, key: " + hVar);
    }

    private y<?> b(h hVar, boolean z) {
        if (!z) {
            return null;
        }
        y<?> a2 = a(hVar);
        if (a2 != null) {
            a2.d();
            this.i.a(hVar, a2);
        }
        return a2;
    }

    public <R> d a(e eVar, Object obj, h hVar, int i2, int i3, Class<?> cls, Class<R> cls2, c.a.a.h hVar2, q qVar, Map<Class<?>, n<?>> map, boolean z, boolean z2, k kVar, boolean z3, boolean z4, boolean z5, boolean z6, f fVar) {
        boolean z7 = z3;
        f fVar2 = fVar;
        c.a.a.i.k.a();
        long a2 = f3197a ? c.a.a.i.e.a() : 0;
        w a3 = this.f3199c.a(obj, hVar, i2, i3, map, cls, cls2, kVar);
        y<?> a4 = a((h) a3, z7);
        if (a4 != null) {
            fVar2.a(a4, c.a.a.c.a.MEMORY_CACHE);
            if (f3197a) {
                a("Loaded resource from active resources", a2, (h) a3);
            }
            return null;
        }
        y<?> b2 = b(a3, z7);
        if (b2 != null) {
            fVar2.a(b2, c.a.a.c.a.MEMORY_CACHE);
            if (f3197a) {
                a("Loaded resource from cache", a2, (h) a3);
            }
            return null;
        }
        u<?> a5 = this.f3198b.a((h) a3, z6);
        if (a5 != null) {
            a5.a(fVar2);
            if (f3197a) {
                a("Added to existing load", a2, (h) a3);
            }
            return new d(fVar2, a5);
        }
        u a6 = this.f3201e.a(a3, z3, z4, z5, z6);
        C0238j<R> a7 = this.f3204h.a(eVar, obj, a3, hVar, i2, i3, cls, cls2, hVar2, qVar, map, z, z2, z6, kVar, a6);
        this.f3198b.a((h) a3, (u<?>) a6);
        a6.a(fVar2);
        a6.b(a7);
        if (f3197a) {
            a("Started new load", a2, (h) a3);
        }
        return new d(fVar2, a6);
    }

    public void a(F<?> f2) {
        c.a.a.i.k.a();
        this.f3202f.a(f2);
    }

    public void a(u<?> uVar, h hVar) {
        c.a.a.i.k.a();
        this.f3198b.b(hVar, uVar);
    }

    public void a(u<?> uVar, h hVar, y<?> yVar) {
        c.a.a.i.k.a();
        if (yVar != null) {
            yVar.a(hVar, this);
            if (yVar.f()) {
                this.i.a(hVar, yVar);
            }
        }
        this.f3198b.b(hVar, uVar);
    }

    public void a(h hVar, y<?> yVar) {
        c.a.a.i.k.a();
        this.i.a(hVar);
        if (yVar.f()) {
            this.f3200d.a(hVar, yVar);
        } else {
            this.f3202f.a(yVar);
        }
    }

    public void b(F<?> f2) {
        c.a.a.i.k.a();
        if (f2 instanceof y) {
            ((y) f2).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
