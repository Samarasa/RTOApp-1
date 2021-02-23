package c.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import c.a.a.c.b.q;
import c.a.a.d.c;
import c.a.a.d.d;
import c.a.a.d.i;
import c.a.a.d.j;
import c.a.a.d.o;
import c.a.a.d.p;
import c.a.a.d.r;
import c.a.a.g.a.h;
import c.a.a.g.b;
import c.a.a.g.e;
import c.a.a.i.k;

public class n implements j, g<k<Drawable>> {

    /* renamed from: a  reason: collision with root package name */
    private static final e f3674a;

    /* renamed from: b  reason: collision with root package name */
    private static final e f3675b;

    /* renamed from: c  reason: collision with root package name */
    private static final e f3676c = e.b(q.f3193c).a(h.LOW).a(true);

    /* renamed from: d  reason: collision with root package name */
    protected final c f3677d;

    /* renamed from: e  reason: collision with root package name */
    protected final Context f3678e;

    /* renamed from: f  reason: collision with root package name */
    final i f3679f;

    /* renamed from: g  reason: collision with root package name */
    private final p f3680g;

    /* renamed from: h  reason: collision with root package name */
    private final o f3681h;
    private final r i;
    private final Runnable j;
    private final Handler k;
    private final c l;
    private e m;

    private static class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final p f3682a;

        a(p pVar) {
            this.f3682a = pVar;
        }

        public void a(boolean z) {
            if (z) {
                this.f3682a.c();
            }
        }
    }

    static {
        e b2 = e.b((Class<?>) Bitmap.class);
        b2.D();
        f3674a = b2;
        e b3 = e.b((Class<?>) c.a.a.c.d.e.c.class);
        b3.D();
        f3675b = b3;
    }

    public n(c cVar, i iVar, o oVar, Context context) {
        this(cVar, iVar, oVar, new p(), cVar.d(), context);
    }

    n(c cVar, i iVar, o oVar, p pVar, d dVar, Context context) {
        this.i = new r();
        this.j = new l(this);
        this.k = new Handler(Looper.getMainLooper());
        this.f3677d = cVar;
        this.f3679f = iVar;
        this.f3681h = oVar;
        this.f3680g = pVar;
        this.f3678e = context;
        this.l = dVar.a(context.getApplicationContext(), new a(pVar));
        if (k.b()) {
            this.k.post(this.j);
        } else {
            iVar.a(this);
        }
        iVar.a(this.l);
        a(cVar.f().b());
        cVar.a(this);
    }

    private void c(h<?> hVar) {
        if (!b(hVar) && !this.f3677d.a(hVar) && hVar.a() != null) {
            b a2 = hVar.a();
            hVar.a((b) null);
            a2.clear();
        }
    }

    public k<Drawable> a(Uri uri) {
        k<Drawable> c2 = c();
        c2.a(uri);
        return c2;
    }

    public <ResourceType> k<ResourceType> a(Class<ResourceType> cls) {
        return new k<>(this.f3677d, this, cls, this.f3678e);
    }

    public k<Drawable> a(Integer num) {
        k<Drawable> c2 = c();
        c2.a(num);
        return c2;
    }

    public k<Drawable> a(String str) {
        k<Drawable> c2 = c();
        c2.a(str);
        return c2;
    }

    public void a(h<?> hVar) {
        if (hVar != null) {
            if (k.c()) {
                c(hVar);
            } else {
                this.k.post(new m(this, hVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h<?> hVar, b bVar) {
        this.i.a(hVar);
        this.f3680g.b(bVar);
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        e clone = eVar.clone();
        clone.a();
        this.m = clone;
    }

    public k<Bitmap> b() {
        k<Bitmap> a2 = a(Bitmap.class);
        a2.a(f3674a);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public <T> o<?, T> b(Class<T> cls) {
        return this.f3677d.f().a(cls);
    }

    /* access modifiers changed from: package-private */
    public boolean b(h<?> hVar) {
        b a2 = hVar.a();
        if (a2 == null) {
            return true;
        }
        if (!this.f3680g.a(a2)) {
            return false;
        }
        this.i.b(hVar);
        hVar.a((b) null);
        return true;
    }

    public k<Drawable> c() {
        return a(Drawable.class);
    }

    /* access modifiers changed from: package-private */
    public e d() {
        return this.m;
    }

    public void e() {
        k.a();
        this.f3680g.b();
    }

    public void f() {
        k.a();
        this.f3680g.d();
    }

    public void m() {
        f();
        this.i.m();
    }

    public void n() {
        e();
        this.i.n();
    }

    public void onDestroy() {
        this.i.onDestroy();
        for (h<?> a2 : this.i.c()) {
            a(a2);
        }
        this.i.b();
        this.f3680g.a();
        this.f3679f.b(this);
        this.f3679f.b(this.l);
        this.k.removeCallbacks(this.j);
        this.f3677d.b(this);
    }

    public String toString() {
        return super.toString() + "{tracker=" + this.f3680g + ", treeNode=" + this.f3681h + "}";
    }
}
