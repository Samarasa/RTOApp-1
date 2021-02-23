package c.a.a.g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c.a.a.c.b.F;
import c.a.a.c.b.s;
import c.a.a.c.b.z;
import c.a.a.e;
import c.a.a.g.a.g;
import c.a.a.g.b.c;
import c.a.a.i.a.d;
import c.a.a.i.k;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

public final class h<R> implements b, g, f, d.c {

    /* renamed from: a  reason: collision with root package name */
    private static final b.h.i.d<h<?>> f3598a = d.a(150, new g());

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f3599b = Log.isLoggable("Request", 2);
    private int A;
    private int B;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3600c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3601d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.i.a.g f3602e;

    /* renamed from: f  reason: collision with root package name */
    private d<R> f3603f;

    /* renamed from: g  reason: collision with root package name */
    private c f3604g;

    /* renamed from: h  reason: collision with root package name */
    private Context f3605h;
    private e i;
    private Object j;
    private Class<R> k;
    private e l;
    private int m;
    private int n;
    private c.a.a.h o;
    private c.a.a.g.a.h<R> p;
    private List<d<R>> q;
    private s r;
    private c<? super R> s;
    private F<R> t;
    private s.d u;
    private long v;
    private a w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    h() {
        this.f3601d = f3599b ? String.valueOf(super.hashCode()) : null;
        this.f3602e = c.a.a.i.a.g.a();
    }

    private static int a(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * ((float) i2));
    }

    private Drawable a(int i2) {
        return c.a.a.c.d.c.a.a((Context) this.i, i2, this.l.s() != null ? this.l.s() : this.f3605h.getTheme());
    }

    public static <R> h<R> a(Context context, e eVar, Object obj, Class<R> cls, e eVar2, int i2, int i3, c.a.a.h hVar, c.a.a.g.a.h<R> hVar2, d<R> dVar, List<d<R>> list, c cVar, s sVar, c<? super R> cVar2) {
        h<R> a2 = f3598a.a();
        if (a2 == null) {
            a2 = new h<>();
        }
        a2.b(context, eVar, obj, cls, eVar2, i2, i3, hVar, hVar2, dVar, list, cVar, sVar, cVar2);
        return a2;
    }

    private void a(F<?> f2) {
        this.r.b(f2);
        this.t = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab A[Catch:{ all -> 0x00bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(c.a.a.c.b.F<R> r11, R r12, c.a.a.c.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.o()
            c.a.a.g.h$a r0 = c.a.a.g.h.a.COMPLETE
            r10.w = r0
            r10.t = r11
            c.a.a.e r11 = r10.i
            int r11 = r11.d()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.j
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.B
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.v
            double r0 = c.a.a.i.e.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f3600c = r11
            r7 = 0
            java.util.List<c.a.a.g.d<R>> r0 = r10.q     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0092
            java.util.List<c.a.a.g.d<R>> r0 = r10.q     // Catch:{ all -> 0x00bc }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00bc }
            r9 = 0
        L_0x0079:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00bc }
            c.a.a.g.d r0 = (c.a.a.g.d) r0     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.j     // Catch:{ all -> 0x00bc }
            c.a.a.g.a.h<R> r3 = r10.p     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            r9 = r9 | r0
            goto L_0x0079
        L_0x0092:
            r9 = 0
        L_0x0093:
            c.a.a.g.d<R> r0 = r10.f3603f     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            c.a.a.g.d<R> r0 = r10.f3603f     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.j     // Catch:{ all -> 0x00bc }
            c.a.a.g.a.h<R> r3 = r10.p     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b6
            c.a.a.g.b.c<? super R> r11 = r10.s     // Catch:{ all -> 0x00bc }
            c.a.a.g.b.b r11 = r11.a(r13, r6)     // Catch:{ all -> 0x00bc }
            c.a.a.g.a.h<R> r13 = r10.p     // Catch:{ all -> 0x00bc }
            r13.a(r12, r11)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            r10.f3600c = r7
            r10.q()
            return
        L_0x00bc:
            r11 = move-exception
            r10.f3600c = r7
            goto L_0x00c1
        L_0x00c0:
            throw r11
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.g.h.a(c.a.a.c.b.F, java.lang.Object, c.a.a.c.a):void");
    }

    /* JADX INFO: finally extract failed */
    private void a(z zVar, int i2) {
        boolean z2;
        this.f3602e.b();
        int d2 = this.i.d();
        if (d2 <= i2) {
            Log.w("Glide", "Load failed for " + this.j + " with size [" + this.A + "x" + this.B + "]", zVar);
            if (d2 <= 4) {
                zVar.a("Glide");
            }
        }
        this.u = null;
        this.w = a.FAILED;
        boolean z3 = true;
        this.f3600c = true;
        try {
            if (this.q != null) {
                z2 = false;
                for (d<R> onLoadFailed : this.q) {
                    z2 |= onLoadFailed.onLoadFailed(zVar, this.j, this.p, o());
                }
            } else {
                z2 = false;
            }
            if (this.f3603f == null || !this.f3603f.onLoadFailed(zVar, this.j, this.p, o())) {
                z3 = false;
            }
            if (!z2 && !z3) {
                r();
            }
            this.f3600c = false;
            p();
        } catch (Throwable th) {
            this.f3600c = false;
            throw th;
        }
    }

    private void a(String str) {
        Log.v("Request", str + " this: " + this.f3601d);
    }

    private static boolean a(h<?> hVar, h<?> hVar2) {
        List<d<R>> list = hVar.q;
        int size = list == null ? 0 : list.size();
        List<d<R>> list2 = hVar2.q;
        return size == (list2 == null ? 0 : list2.size());
    }

    private void b(Context context, e eVar, Object obj, Class<R> cls, e eVar2, int i2, int i3, c.a.a.h hVar, c.a.a.g.a.h<R> hVar2, d<R> dVar, List<d<R>> list, c cVar, s sVar, c<? super R> cVar2) {
        this.f3605h = context;
        this.i = eVar;
        this.j = obj;
        this.k = cls;
        this.l = eVar2;
        this.m = i2;
        this.n = i3;
        this.o = hVar;
        this.p = hVar2;
        this.f3603f = dVar;
        this.q = list;
        this.f3604g = cVar;
        this.r = sVar;
        this.s = cVar2;
        this.w = a.PENDING;
    }

    private void g() {
        if (this.f3600c) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean h() {
        c cVar = this.f3604g;
        return cVar == null || cVar.f(this);
    }

    private boolean i() {
        c cVar = this.f3604g;
        return cVar == null || cVar.c(this);
    }

    private boolean j() {
        c cVar = this.f3604g;
        return cVar == null || cVar.d(this);
    }

    private void k() {
        g();
        this.f3602e.b();
        this.p.a((g) this);
        s.d dVar = this.u;
        if (dVar != null) {
            dVar.a();
            this.u = null;
        }
    }

    private Drawable l() {
        if (this.x == null) {
            this.x = this.l.f();
            if (this.x == null && this.l.e() > 0) {
                this.x = a(this.l.e());
            }
        }
        return this.x;
    }

    private Drawable m() {
        if (this.z == null) {
            this.z = this.l.g();
            if (this.z == null && this.l.h() > 0) {
                this.z = a(this.l.h());
            }
        }
        return this.z;
    }

    private Drawable n() {
        if (this.y == null) {
            this.y = this.l.m();
            if (this.y == null && this.l.n() > 0) {
                this.y = a(this.l.n());
            }
        }
        return this.y;
    }

    private boolean o() {
        c cVar = this.f3604g;
        return cVar == null || !cVar.d();
    }

    private void p() {
        c cVar = this.f3604g;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    private void q() {
        c cVar = this.f3604g;
        if (cVar != null) {
            cVar.e(this);
        }
    }

    private void r() {
        if (i()) {
            Drawable drawable = null;
            if (this.j == null) {
                drawable = m();
            }
            if (drawable == null) {
                drawable = l();
            }
            if (drawable == null) {
                drawable = n();
            }
            this.p.a(drawable);
        }
    }

    public void a() {
        g();
        this.f3605h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = -1;
        this.p = null;
        this.q = null;
        this.f3603f = null;
        this.f3604g = null;
        this.s = null;
        this.u = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = -1;
        f3598a.a(this);
    }

    public void a(int i2, int i3) {
        this.f3602e.b();
        if (f3599b) {
            a("Got onSizeReady in " + c.a.a.i.e.a(this.v));
        }
        if (this.w == a.WAITING_FOR_SIZE) {
            this.w = a.RUNNING;
            float r2 = this.l.r();
            this.A = a(i2, r2);
            this.B = a(i3, r2);
            if (f3599b) {
                a("finished setup for calling load in " + c.a.a.i.e.a(this.v));
            }
            s sVar = this.r;
            e eVar = this.i;
            s.d a2 = sVar.a(eVar, this.j, this.l.q(), this.A, this.B, this.l.p(), this.k, this.o, this.l.b(), this.l.t(), this.l.A(), this.l.y(), this.l.j(), this.l.w(), this.l.v(), this.l.u(), this.l.i(), this);
            this.u = a2;
            if (this.w != a.RUNNING) {
                this.u = null;
            }
            if (f3599b) {
                a("finished onSizeReady in " + c.a.a.i.e.a(this.v));
            }
        }
    }

    public void a(F<?> f2, c.a.a.c.a aVar) {
        this.f3602e.b();
        this.u = null;
        if (f2 == null) {
            a(new z("Expected to receive a Resource<R> with an object of " + this.k + " inside, but instead got null."));
            return;
        }
        Object obj = f2.get();
        if (obj == null || !this.k.isAssignableFrom(obj.getClass())) {
            a(f2);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to receive an object of ");
            sb.append(this.k);
            sb.append(" but instead got ");
            String str = BuildConfig.FLAVOR;
            sb.append(obj != null ? obj.getClass() : str);
            sb.append("{");
            sb.append(obj);
            sb.append("} inside Resource{");
            sb.append(f2);
            sb.append("}.");
            if (obj == null) {
                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            sb.append(str);
            a(new z(sb.toString()));
        } else if (!j()) {
            a(f2);
            this.w = a.COMPLETE;
        } else {
            a(f2, obj, aVar);
        }
    }

    public void a(z zVar) {
        a(zVar, 5);
    }

    public boolean a(b bVar) {
        if (!(bVar instanceof h)) {
            return false;
        }
        h hVar = (h) bVar;
        return this.m == hVar.m && this.n == hVar.n && k.a(this.j, hVar.j) && this.k.equals(hVar.k) && this.l.equals(hVar.l) && this.o == hVar.o && a((h<?>) this, (h<?>) hVar);
    }

    public boolean b() {
        return isComplete();
    }

    public boolean c() {
        return this.w == a.FAILED;
    }

    public void clear() {
        k.a();
        g();
        this.f3602e.b();
        if (this.w != a.CLEARED) {
            k();
            F<R> f2 = this.t;
            if (f2 != null) {
                a((F<?>) f2);
            }
            if (h()) {
                this.p.c(n());
            }
            this.w = a.CLEARED;
        }
    }

    public c.a.a.i.a.g d() {
        return this.f3602e;
    }

    public boolean e() {
        return this.w == a.CLEARED;
    }

    public void f() {
        g();
        this.f3602e.b();
        this.v = c.a.a.i.e.a();
        if (this.j == null) {
            if (k.b(this.m, this.n)) {
                this.A = this.m;
                this.B = this.n;
            }
            a(new z("Received null model"), m() == null ? 5 : 3);
            return;
        }
        a aVar = this.w;
        if (aVar == a.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (aVar == a.COMPLETE) {
            a((F<?>) this.t, c.a.a.c.a.MEMORY_CACHE);
        } else {
            this.w = a.WAITING_FOR_SIZE;
            if (k.b(this.m, this.n)) {
                a(this.m, this.n);
            } else {
                this.p.b((g) this);
            }
            a aVar2 = this.w;
            if ((aVar2 == a.RUNNING || aVar2 == a.WAITING_FOR_SIZE) && i()) {
                this.p.b(n());
            }
            if (f3599b) {
                a("finished run method in " + c.a.a.i.e.a(this.v));
            }
        }
    }

    public boolean isComplete() {
        return this.w == a.COMPLETE;
    }

    public boolean isRunning() {
        a aVar = this.w;
        return aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
    }
}
