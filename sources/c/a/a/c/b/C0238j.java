package c.a.a.c.b;

import android.os.Build;
import android.util.Log;
import c.a.a.c.b.C0235g;
import c.a.a.c.b.k;
import c.a.a.c.d.a.l;
import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.c.m;
import c.a.a.c.n;
import c.a.a.i.a.d;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.c.b.j  reason: case insensitive filesystem */
class C0238j<R> implements C0235g.a, Runnable, Comparable<C0238j<?>>, d.c {
    private c.a.a.c.a A;
    private c.a.a.c.a.d<?> B;
    private volatile C0235g C;
    private volatile boolean D;
    private volatile boolean E;

    /* renamed from: a  reason: collision with root package name */
    private final C0236h<R> f3159a = new C0236h<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<Throwable> f3160b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.i.a.g f3161c = c.a.a.i.a.g.a();

    /* renamed from: d  reason: collision with root package name */
    private final d f3162d;

    /* renamed from: e  reason: collision with root package name */
    private final b.h.i.d<C0238j<?>> f3163e;

    /* renamed from: f  reason: collision with root package name */
    private final c<?> f3164f = new c<>();

    /* renamed from: g  reason: collision with root package name */
    private final e f3165g = new e();

    /* renamed from: h  reason: collision with root package name */
    private c.a.a.e f3166h;
    private h i;
    private c.a.a.h j;
    private w k;
    private int l;
    private int m;
    private q n;
    private k o;
    private a<R> p;
    private int q;
    private g r;
    private f s;
    private long t;
    private boolean u;
    private Object v;
    private Thread w;
    private h x;
    private h y;
    private Object z;

    /* renamed from: c.a.a.c.b.j$a */
    interface a<R> {
        void a(F<R> f2, c.a.a.c.a aVar);

        void a(C0238j<?> jVar);

        void a(z zVar);
    }

    /* renamed from: c.a.a.c.b.j$b */
    private final class b<Z> implements k.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final c.a.a.c.a f3167a;

        b(c.a.a.c.a aVar) {
            this.f3167a = aVar;
        }

        public F<Z> a(F<Z> f2) {
            return C0238j.this.a(this.f3167a, f2);
        }
    }

    /* renamed from: c.a.a.c.b.j$c */
    private static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        private h f3169a;

        /* renamed from: b  reason: collision with root package name */
        private m<Z> f3170b;

        /* renamed from: c  reason: collision with root package name */
        private E<Z> f3171c;

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3169a = null;
            this.f3170b = null;
            this.f3171c = null;
        }

        /* access modifiers changed from: package-private */
        public void a(d dVar, c.a.a.c.k kVar) {
            c.a.a.i.a.e.a("DecodeJob.encode");
            try {
                dVar.a().a(this.f3169a, new C0234f(this.f3170b, this.f3171c, kVar));
            } finally {
                this.f3171c.e();
                c.a.a.i.a.e.a();
            }
        }

        /* access modifiers changed from: package-private */
        public <X> void a(h hVar, m<X> mVar, E<X> e2) {
            this.f3169a = hVar;
            this.f3170b = mVar;
            this.f3171c = e2;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f3171c != null;
        }
    }

    /* renamed from: c.a.a.c.b.j$d */
    interface d {
        c.a.a.c.b.b.a a();
    }

    /* renamed from: c.a.a.c.b.j$e */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3172a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3173b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3174c;

        e() {
        }

        private boolean b(boolean z) {
            return (this.f3174c || z || this.f3173b) && this.f3172a;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean a() {
            this.f3173b = true;
            return b(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean a(boolean z) {
            this.f3172a = true;
            return b(z);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.f3174c = true;
            return b(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized void c() {
            this.f3173b = false;
            this.f3172a = false;
            this.f3174c = false;
        }
    }

    /* renamed from: c.a.a.c.b.j$f */
    private enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: c.a.a.c.b.j$g */
    private enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C0238j(d dVar, b.h.i.d<C0238j<?>> dVar2) {
        this.f3162d = dVar;
        this.f3163e = dVar2;
    }

    private <Data> F<R> a(c.a.a.c.a.d<?> dVar, Data data, c.a.a.c.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long a2 = c.a.a.i.e.a();
            F<R> a3 = a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded result " + a3, a2);
            }
            return a3;
        } finally {
            dVar.b();
        }
    }

    private <Data> F<R> a(Data data, c.a.a.c.a aVar) {
        return a(data, aVar, this.f3159a.a(data.getClass()));
    }

    private <Data, ResourceType> F<R> a(Data data, c.a.a.c.a aVar, C<Data, ResourceType, R> c2) {
        c.a.a.c.k a2 = a(aVar);
        c.a.a.c.a.e b2 = this.f3166h.e().b(data);
        try {
            return c2.a(b2, a2, this.l, this.m, new b(aVar));
        } finally {
            b2.b();
        }
    }

    private g a(g gVar) {
        int i2 = C0237i.f3157b[gVar.ordinal()];
        if (i2 == 1) {
            return this.n.a() ? g.DATA_CACHE : a(g.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.u ? g.FINISHED : g.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return g.FINISHED;
        }
        if (i2 == 5) {
            return this.n.b() ? g.RESOURCE_CACHE : a(g.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    private c.a.a.c.k a(c.a.a.c.a aVar) {
        c.a.a.c.k kVar = this.o;
        if (Build.VERSION.SDK_INT < 26) {
            return kVar;
        }
        boolean z2 = aVar == c.a.a.c.a.RESOURCE_DISK_CACHE || this.f3159a.n();
        Boolean bool = (Boolean) kVar.a(l.f3394d);
        if (bool != null && (!bool.booleanValue() || z2)) {
            return kVar;
        }
        c.a.a.c.k kVar2 = new c.a.a.c.k();
        kVar2.a(this.o);
        kVar2.a(l.f3394d, Boolean.valueOf(z2));
        return kVar2;
    }

    private void a(F<R> f2, c.a.a.c.a aVar) {
        w();
        this.p.a(f2, aVar);
    }

    private void a(String str, long j2) {
        a(str, j2, (String) null);
    }

    private void a(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(c.a.a.i.e.a(j2));
        sb.append(", load key: ");
        sb.append(this.k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void b(F<R> f2, c.a.a.c.a aVar) {
        if (f2 instanceof A) {
            ((A) f2).p();
        }
        E<R> e2 = null;
        E<R> e3 = f2;
        if (this.f3164f.b()) {
            E<R> a2 = E.a(f2);
            e2 = a2;
            e3 = a2;
        }
        a(e3, aVar);
        this.r = g.ENCODE;
        try {
            if (this.f3164f.b()) {
                this.f3164f.a(this.f3162d, this.o);
            }
            r();
        } finally {
            if (e2 != null) {
                e2.e();
            }
        }
    }

    private void n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.t;
            a("Retrieved data", j2, "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B);
        }
        F<R> f2 = null;
        try {
            f2 = a(this.B, this.z, this.A);
        } catch (z e2) {
            e2.a(this.y, this.A);
            this.f3160b.add(e2);
        }
        if (f2 != null) {
            b(f2, this.A);
        } else {
            u();
        }
    }

    private C0235g o() {
        int i2 = C0237i.f3157b[this.r.ordinal()];
        if (i2 == 1) {
            return new G(this.f3159a, this);
        }
        if (i2 == 2) {
            return new C0232d(this.f3159a, this);
        }
        if (i2 == 3) {
            return new J(this.f3159a, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.r);
    }

    private int p() {
        return this.j.ordinal();
    }

    private void q() {
        w();
        this.p.a(new z("Failed to load resource", (List<Throwable>) new ArrayList(this.f3160b)));
        s();
    }

    private void r() {
        if (this.f3165g.a()) {
            t();
        }
    }

    private void s() {
        if (this.f3165g.b()) {
            t();
        }
    }

    private void t() {
        this.f3165g.c();
        this.f3164f.a();
        this.f3159a.a();
        this.D = false;
        this.f3166h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0;
        this.E = false;
        this.v = null;
        this.f3160b.clear();
        this.f3163e.a(this);
    }

    private void u() {
        this.w = Thread.currentThread();
        this.t = c.a.a.i.e.a();
        boolean z2 = false;
        while (!this.E && this.C != null && !(z2 = this.C.a())) {
            this.r = a(this.r);
            this.C = o();
            if (this.r == g.SOURCE) {
                c();
                return;
            }
        }
        if ((this.r == g.FINISHED || this.E) && !z2) {
            q();
        }
    }

    private void v() {
        int i2 = C0237i.f3156a[this.s.ordinal()];
        if (i2 == 1) {
            this.r = a(g.INITIALIZE);
            this.C = o();
        } else if (i2 != 2) {
            if (i2 == 3) {
                n();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.s);
        }
        u();
    }

    private void w() {
        this.f3161c.b();
        if (!this.D) {
            this.D = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    /* renamed from: a */
    public int compareTo(C0238j<?> jVar) {
        int p2 = p() - jVar.p();
        return p2 == 0 ? this.q - jVar.q : p2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: c.a.a.c.b.H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: c.a.a.c.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: c.a.a.c.b.H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: c.a.a.c.b.H} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> c.a.a.c.b.F<Z> a(c.a.a.c.a r12, c.a.a.c.b.F<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            c.a.a.c.a r0 = c.a.a.c.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            c.a.a.c.b.h<R> r0 = r11.f3159a
            c.a.a.c.n r0 = r0.b(r8)
            c.a.a.e r2 = r11.f3166h
            int r3 = r11.l
            int r4 = r11.m
            c.a.a.c.b.F r2 = r0.a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.a()
        L_0x002b:
            c.a.a.c.b.h<R> r13 = r11.f3159a
            boolean r13 = r13.b((c.a.a.c.b.F<?>) r0)
            if (r13 == 0) goto L_0x0040
            c.a.a.c.b.h<R> r13 = r11.f3159a
            c.a.a.c.m r1 = r13.a(r0)
            c.a.a.c.k r13 = r11.o
            c.a.a.c.c r13 = r1.a(r13)
            goto L_0x0042
        L_0x0040:
            c.a.a.c.c r13 = c.a.a.c.c.NONE
        L_0x0042:
            r10 = r1
            c.a.a.c.b.h<R> r1 = r11.f3159a
            c.a.a.c.h r2 = r11.x
            boolean r1 = r1.a((c.a.a.c.h) r2)
            r2 = 1
            r1 = r1 ^ r2
            c.a.a.c.b.q r3 = r11.n
            boolean r12 = r3.a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = c.a.a.c.b.C0237i.f3158c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            c.a.a.c.b.H r12 = new c.a.a.c.b.H
            c.a.a.c.b.h<R> r13 = r11.f3159a
            c.a.a.c.b.a.b r2 = r13.b()
            c.a.a.c.h r3 = r11.x
            c.a.a.c.h r4 = r11.i
            int r5 = r11.l
            int r6 = r11.m
            c.a.a.c.k r9 = r11.o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            c.a.a.c.b.e r12 = new c.a.a.c.b.e
            c.a.a.c.h r13 = r11.x
            c.a.a.c.h r1 = r11.i
            r12.<init>(r13, r1)
        L_0x009b:
            c.a.a.c.b.E r0 = c.a.a.c.b.E.a(r0)
            c.a.a.c.b.j$c<?> r13 = r11.f3164f
            r13.a(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            c.a.a.i$d r12 = new c.a.a.i$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.b.C0238j.a(c.a.a.c.a, c.a.a.c.b.F):c.a.a.c.b.F");
    }

    /* access modifiers changed from: package-private */
    public C0238j<R> a(c.a.a.e eVar, Object obj, w wVar, h hVar, int i2, int i3, Class<?> cls, Class<R> cls2, c.a.a.h hVar2, q qVar, Map<Class<?>, n<?>> map, boolean z2, boolean z3, boolean z4, c.a.a.c.k kVar, a<R> aVar, int i4) {
        this.f3159a.a(eVar, obj, hVar, i2, i3, qVar, cls, cls2, hVar2, kVar, map, z2, z3, this.f3162d);
        this.f3166h = eVar;
        this.i = hVar;
        this.j = hVar2;
        this.k = wVar;
        this.l = i2;
        this.m = i3;
        this.n = qVar;
        this.u = z4;
        this.o = kVar;
        this.p = aVar;
        this.q = i4;
        this.s = f.INITIALIZE;
        this.v = obj;
        return this;
    }

    public void a() {
        this.E = true;
        C0235g gVar = this.C;
        if (gVar != null) {
            gVar.cancel();
        }
    }

    public void a(h hVar, Exception exc, c.a.a.c.a.d<?> dVar, c.a.a.c.a aVar) {
        dVar.b();
        z zVar = new z("Fetching data failed", (Throwable) exc);
        zVar.a(hVar, aVar, dVar.a());
        this.f3160b.add(zVar);
        if (Thread.currentThread() != this.w) {
            this.s = f.SWITCH_TO_SOURCE_SERVICE;
            this.p.a((C0238j<?>) this);
            return;
        }
        u();
    }

    public void a(h hVar, Object obj, c.a.a.c.a.d<?> dVar, c.a.a.c.a aVar, h hVar2) {
        this.x = hVar;
        this.z = obj;
        this.B = dVar;
        this.A = aVar;
        this.y = hVar2;
        if (Thread.currentThread() != this.w) {
            this.s = f.DECODE_DATA;
            this.p.a((C0238j<?>) this);
            return;
        }
        c.a.a.i.a.e.a("DecodeJob.decodeFromRetrievedData");
        try {
            n();
        } finally {
            c.a.a.i.a.e.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        if (this.f3165g.a(z2)) {
            t();
        }
    }

    public void c() {
        this.s = f.SWITCH_TO_SOURCE_SERVICE;
        this.p.a((C0238j<?>) this);
    }

    public c.a.a.i.a.g d() {
        return this.f3161c;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        g a2 = a(g.INITIALIZE);
        return a2 == g.RESOURCE_CACHE || a2 == g.DATA_CACHE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.String r0 = "DecodeJob"
            java.lang.Object r1 = r5.v
            java.lang.String r2 = "DecodeJob#run(model=%s)"
            c.a.a.i.a.e.a(r2, r1)
            c.a.a.c.a.d<?> r1 = r5.B
            boolean r2 = r5.E     // Catch:{ Throwable -> 0x0029 }
            if (r2 == 0) goto L_0x001b
            r5.q()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0017
            r1.b()
        L_0x0017:
            c.a.a.i.a.e.a()
            return
        L_0x001b:
            r5.v()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0023
        L_0x0020:
            r1.b()
        L_0x0023:
            c.a.a.i.a.e.a()
            goto L_0x0066
        L_0x0027:
            r0 = move-exception
            goto L_0x0068
        L_0x0029:
            r2 = move-exception
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0051
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r3.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = "DecodeJob threw unexpectedly, isCancelled: "
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            boolean r4 = r5.E     // Catch:{ all -> 0x0027 }
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = ", stage: "
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            c.a.a.c.b.j$g r4 = r5.r     // Catch:{ all -> 0x0027 }
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0027 }
            android.util.Log.d(r0, r3, r2)     // Catch:{ all -> 0x0027 }
        L_0x0051:
            c.a.a.c.b.j$g r0 = r5.r     // Catch:{ all -> 0x0027 }
            c.a.a.c.b.j$g r3 = c.a.a.c.b.C0238j.g.ENCODE     // Catch:{ all -> 0x0027 }
            if (r0 == r3) goto L_0x005f
            java.util.List<java.lang.Throwable> r0 = r5.f3160b     // Catch:{ all -> 0x0027 }
            r0.add(r2)     // Catch:{ all -> 0x0027 }
            r5.q()     // Catch:{ all -> 0x0027 }
        L_0x005f:
            boolean r0 = r5.E     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0023
            goto L_0x0020
        L_0x0066:
            return
        L_0x0067:
            throw r2     // Catch:{ all -> 0x0027 }
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.b()
        L_0x006d:
            c.a.a.i.a.e.a()
            goto L_0x0072
        L_0x0071:
            throw r0
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.b.C0238j.run():void");
    }
}
