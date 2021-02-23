package c.a.a.c.b;

import android.util.Log;
import c.a.a.c.a;
import c.a.a.c.a.d;
import c.a.a.c.b.C0235g;
import c.a.a.c.c.u;
import c.a.a.c.h;
import c.a.a.i.e;
import java.util.Collections;
import java.util.List;

class J implements C0235g, d.a<Object>, C0235g.a {

    /* renamed from: a  reason: collision with root package name */
    private final C0236h<?> f3023a;

    /* renamed from: b  reason: collision with root package name */
    private final C0235g.a f3024b;

    /* renamed from: c  reason: collision with root package name */
    private int f3025c;

    /* renamed from: d  reason: collision with root package name */
    private C0232d f3026d;

    /* renamed from: e  reason: collision with root package name */
    private Object f3027e;

    /* renamed from: f  reason: collision with root package name */
    private volatile u.a<?> f3028f;

    /* renamed from: g  reason: collision with root package name */
    private C0233e f3029g;

    J(C0236h<?> hVar, C0235g.a aVar) {
        this.f3023a = hVar;
        this.f3024b = aVar;
    }

    /* JADX INFO: finally extract failed */
    private void b(Object obj) {
        long a2 = e.a();
        try {
            c.a.a.c.d<X> a3 = this.f3023a.a(obj);
            C0234f fVar = new C0234f(a3, obj, this.f3023a.h());
            this.f3029g = new C0233e(this.f3028f.f3326a, this.f3023a.k());
            this.f3023a.d().a(this.f3029g, fVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f3029g + ", data: " + obj + ", encoder: " + a3 + ", duration: " + e.a(a2));
            }
            this.f3028f.f3328c.b();
            this.f3026d = new C0232d(Collections.singletonList(this.f3028f.f3326a), this.f3023a, this);
        } catch (Throwable th) {
            this.f3028f.f3328c.b();
            throw th;
        }
    }

    private boolean b() {
        return this.f3025c < this.f3023a.g().size();
    }

    public void a(h hVar, Exception exc, d<?> dVar, a aVar) {
        this.f3024b.a(hVar, exc, dVar, this.f3028f.f3328c.c());
    }

    public void a(h hVar, Object obj, d<?> dVar, a aVar, h hVar2) {
        this.f3024b.a(hVar, obj, dVar, this.f3028f.f3328c.c(), hVar);
    }

    public void a(Exception exc) {
        this.f3024b.a(this.f3029g, exc, this.f3028f.f3328c, this.f3028f.f3328c.c());
    }

    public void a(Object obj) {
        q e2 = this.f3023a.e();
        if (obj == null || !e2.a(this.f3028f.f3328c.c())) {
            this.f3024b.a(this.f3028f.f3326a, obj, this.f3028f.f3328c, this.f3028f.f3328c.c(), this.f3029g);
            return;
        }
        this.f3027e = obj;
        this.f3024b.c();
    }

    public boolean a() {
        Object obj = this.f3027e;
        if (obj != null) {
            this.f3027e = null;
            b(obj);
        }
        C0232d dVar = this.f3026d;
        if (dVar != null && dVar.a()) {
            return true;
        }
        this.f3026d = null;
        this.f3028f = null;
        boolean z = false;
        while (!z && b()) {
            List<u.a<?>> g2 = this.f3023a.g();
            int i = this.f3025c;
            this.f3025c = i + 1;
            this.f3028f = g2.get(i);
            if (this.f3028f != null && (this.f3023a.e().a(this.f3028f.f3328c.c()) || this.f3023a.c(this.f3028f.f3328c.a()))) {
                this.f3028f.f3328c.a(this.f3023a.i(), this);
                z = true;
            }
        }
        return z;
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void cancel() {
        u.a<?> aVar = this.f3028f;
        if (aVar != null) {
            aVar.f3328c.cancel();
        }
    }
}
