package c.a.a.c.d.e;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c.a.a.c.b.a.e;
import c.a.a.c.b.q;
import c.a.a.g.a.f;
import c.a.a.g.a.h;
import c.a.a.i.i;
import c.a.a.k;
import c.a.a.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final c.a.a.b.a f3455a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3456b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f3457c;

    /* renamed from: d  reason: collision with root package name */
    final n f3458d;

    /* renamed from: e  reason: collision with root package name */
    private final e f3459e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3460f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3461g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3462h;
    private k<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private c.a.a.c.n<Bitmap> n;
    private a o;
    private d p;

    static class a extends f<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f3463d;

        /* renamed from: e  reason: collision with root package name */
        final int f3464e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3465f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f3466g;

        a(Handler handler, int i, long j) {
            this.f3463d = handler;
            this.f3464e = i;
            this.f3465f = j;
        }

        public void a(Bitmap bitmap, c.a.a.g.b.b<? super Bitmap> bVar) {
            this.f3466g = bitmap;
            this.f3463d.sendMessageAtTime(this.f3463d.obtainMessage(1, this), this.f3465f);
        }

        /* access modifiers changed from: package-private */
        public Bitmap b() {
            return this.f3466g;
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                g.this.a((a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                g.this.f3458d.a((h<?>) (a) message.obj);
                return false;
            }
        }
    }

    interface d {
        void a();
    }

    g(e eVar, n nVar, c.a.a.b.a aVar, Handler handler, k<Bitmap> kVar, c.a.a.c.n<Bitmap> nVar2, Bitmap bitmap) {
        this.f3457c = new ArrayList();
        this.f3458d = nVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3459e = eVar;
        this.f3456b = handler;
        this.i = kVar;
        this.f3455a = aVar;
        a(nVar2, bitmap);
    }

    g(c.a.a.c cVar, c.a.a.b.a aVar, int i2, int i3, c.a.a.c.n<Bitmap> nVar, Bitmap bitmap) {
        this(cVar.c(), c.a.a.c.b(cVar.e()), aVar, (Handler) null, a(c.a.a.c.b(cVar.e()), i2, i3), nVar, bitmap);
    }

    private static k<Bitmap> a(n nVar, int i2, int i3) {
        k<Bitmap> b2 = nVar.b();
        b2.a(c.a.a.g.e.b(q.f3192b).b(true).a(true).a(i2, i3));
        return b2;
    }

    private static c.a.a.c.h j() {
        return new c.a.a.h.c(Double.valueOf(Math.random()));
    }

    private int k() {
        return c.a.a.i.k.a(c().getWidth(), c().getHeight(), c().getConfig());
    }

    private void l() {
        if (this.f3460f && !this.f3461g) {
            if (this.f3462h) {
                i.a(this.o == null, "Pending target must be null when starting from the first frame");
                this.f3455a.d();
                this.f3462h = false;
            }
            a aVar = this.o;
            if (aVar != null) {
                this.o = null;
                a(aVar);
                return;
            }
            this.f3461g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f3455a.c());
            this.f3455a.advance();
            this.l = new a(this.f3456b, this.f3455a.e(), uptimeMillis);
            k<Bitmap> kVar = this.i;
            kVar.a(c.a.a.g.e.b(j()));
            kVar.a((Object) this.f3455a);
            kVar.a(this.l);
        }
    }

    private void m() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.f3459e.a(bitmap);
            this.m = null;
        }
    }

    private void n() {
        if (!this.f3460f) {
            this.f3460f = true;
            this.k = false;
            l();
        }
    }

    private void o() {
        this.f3460f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f3457c.clear();
        m();
        o();
        a aVar = this.j;
        if (aVar != null) {
            this.f3458d.a((h<?>) aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.f3458d.a((h<?>) aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.f3458d.a((h<?>) aVar3);
            this.o = null;
        }
        this.f3455a.clear();
        this.k = true;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.f3461g = false;
        if (this.k) {
            this.f3456b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f3460f) {
            this.o = aVar;
        } else {
            if (aVar.b() != null) {
                m();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.f3457c.size() - 1; size >= 0; size--) {
                    this.f3457c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f3456b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f3457c.contains(bVar)) {
            boolean isEmpty = this.f3457c.isEmpty();
            this.f3457c.add(bVar);
            if (isEmpty) {
                n();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c.a.a.c.n<Bitmap> nVar, Bitmap bitmap) {
        i.a(nVar);
        this.n = nVar;
        i.a(bitmap);
        this.m = bitmap;
        k<Bitmap> kVar = this.i;
        kVar.a(new c.a.a.g.e().a(nVar));
        this.i = kVar;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f3455a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar) {
        this.f3457c.remove(bVar);
        if (this.f3457c.isEmpty()) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.b() : this.m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.f3464e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f3455a.b();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return c().getHeight();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f3455a.f() + k();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return c().getWidth();
    }
}
