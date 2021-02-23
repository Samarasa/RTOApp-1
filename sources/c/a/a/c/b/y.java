package c.a.a.c.b;

import android.os.Looper;
import c.a.a.c.h;
import c.a.a.i.i;

class y<Z> implements F<Z> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3235a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3236b;

    /* renamed from: c  reason: collision with root package name */
    private a f3237c;

    /* renamed from: d  reason: collision with root package name */
    private h f3238d;

    /* renamed from: e  reason: collision with root package name */
    private int f3239e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3240f;

    /* renamed from: g  reason: collision with root package name */
    private final F<Z> f3241g;

    interface a {
        void a(h hVar, y<?> yVar);
    }

    y(F<Z> f2, boolean z, boolean z2) {
        i.a(f2);
        this.f3241g = f2;
        this.f3235a = z;
        this.f3236b = z2;
    }

    public void a() {
        if (this.f3239e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f3240f) {
            this.f3240f = true;
            if (this.f3236b) {
                this.f3241g.a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, a aVar) {
        this.f3238d = hVar;
        this.f3237c = aVar;
    }

    public int b() {
        return this.f3241g.b();
    }

    public Class<Z> c() {
        return this.f3241g.c();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f3240f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f3239e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* access modifiers changed from: package-private */
    public F<Z> e() {
        return this.f3241g;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f3235a;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f3239e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f3239e - 1;
            this.f3239e = i;
            if (i == 0) {
                this.f3237c.a(this.f3238d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public Z get() {
        return this.f3241g.get();
    }

    public String toString() {
        return "EngineResource{isCacheable=" + this.f3235a + ", listener=" + this.f3237c + ", key=" + this.f3238d + ", acquired=" + this.f3239e + ", isRecycled=" + this.f3240f + ", resource=" + this.f3241g + '}';
    }
}
