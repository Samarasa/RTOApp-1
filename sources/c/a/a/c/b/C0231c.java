package c.a.a.c.b;

import android.os.Handler;
import android.os.Looper;
import c.a.a.c.b.y;
import c.a.a.c.h;
import c.a.a.i.i;
import c.a.a.i.k;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.a.c.b.c  reason: case insensitive filesystem */
final class C0231c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3107a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3108b = new Handler(Looper.getMainLooper(), new C0229a(this));

    /* renamed from: c  reason: collision with root package name */
    final Map<h, b> f3109c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private y.a f3110d;

    /* renamed from: e  reason: collision with root package name */
    private ReferenceQueue<y<?>> f3111e;

    /* renamed from: f  reason: collision with root package name */
    private Thread f3112f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f3113g;

    /* renamed from: h  reason: collision with root package name */
    private volatile a f3114h;

    /* renamed from: c.a.a.c.b.c$a */
    interface a {
        void a();
    }

    /* renamed from: c.a.a.c.b.c$b */
    static final class b extends WeakReference<y<?>> {

        /* renamed from: a  reason: collision with root package name */
        final h f3116a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f3117b;

        /* renamed from: c  reason: collision with root package name */
        F<?> f3118c;

        b(h hVar, y<?> yVar, ReferenceQueue<? super y<?>> referenceQueue, boolean z) {
            super(yVar, referenceQueue);
            F<?> f2;
            i.a(hVar);
            this.f3116a = hVar;
            if (!yVar.f() || !z) {
                f2 = null;
            } else {
                F<?> e2 = yVar.e();
                i.a(e2);
                f2 = e2;
            }
            this.f3118c = f2;
            this.f3117b = yVar.f();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3118c = null;
            clear();
        }
    }

    C0231c(boolean z) {
        this.f3107a = z;
    }

    private ReferenceQueue<y<?>> b() {
        if (this.f3111e == null) {
            this.f3111e = new ReferenceQueue<>();
            this.f3112f = new Thread(new C0230b(this), "glide-active-resources");
            this.f3112f.start();
        }
        return this.f3111e;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        while (!this.f3113g) {
            try {
                this.f3108b.obtainMessage(1, (b) this.f3111e.remove()).sendToTarget();
                a aVar = this.f3114h;
                if (aVar != null) {
                    aVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        F<?> f2;
        k.a();
        this.f3109c.remove(bVar.f3116a);
        if (bVar.f3117b && (f2 = bVar.f3118c) != null) {
            y yVar = new y(f2, true, false);
            yVar.a(bVar.f3116a, this.f3110d);
            this.f3110d.a(bVar.f3116a, yVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(y.a aVar) {
        this.f3110d = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar) {
        b remove = this.f3109c.remove(hVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, y<?> yVar) {
        b put = this.f3109c.put(hVar, new b(hVar, yVar, b(), this.f3107a));
        if (put != null) {
            put.a();
        }
    }

    /* access modifiers changed from: package-private */
    public y<?> b(h hVar) {
        b bVar = this.f3109c.get(hVar);
        if (bVar == null) {
            return null;
        }
        y<?> yVar = (y) bVar.get();
        if (yVar == null) {
            a(bVar);
        }
        return yVar;
    }
}
