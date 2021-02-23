package androidx.lifecycle;

import androidx.lifecycle.g;
import b.b.a.a.c;
import b.b.a.b.b;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Object f1197a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final Object f1198b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b<t<? super T>, LiveData<T>.a> f1199c = new b<>();

    /* renamed from: d  reason: collision with root package name */
    int f1200d = 0;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f1201e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f1202f;

    /* renamed from: g  reason: collision with root package name */
    private int f1203g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1204h;
    private boolean i;
    private final Runnable j;

    class LifecycleBoundObserver extends LiveData<T>.a implements f {

        /* renamed from: e  reason: collision with root package name */
        final k f1205e;

        LifecycleBoundObserver(k kVar, t<? super T> tVar) {
            super(tVar);
            this.f1205e = kVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1205e.getLifecycle().b(this);
        }

        public void a(k kVar, g.a aVar) {
            if (this.f1205e.getLifecycle().a() == g.b.DESTROYED) {
                LiveData.this.a(this.f1207a);
            } else {
                a(b());
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(k kVar) {
            return this.f1205e == kVar;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f1205e.getLifecycle().a().a(g.b.STARTED);
        }
    }

    private abstract class a {

        /* renamed from: a  reason: collision with root package name */
        final t<? super T> f1207a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1208b;

        /* renamed from: c  reason: collision with root package name */
        int f1209c = -1;

        a(t<? super T> tVar) {
            this.f1207a = tVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            if (z != this.f1208b) {
                this.f1208b = z;
                int i = 1;
                boolean z2 = LiveData.this.f1200d == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f1200d;
                if (!this.f1208b) {
                    i = -1;
                }
                liveData.f1200d = i2 + i;
                if (z2 && this.f1208b) {
                    LiveData.this.a();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f1200d == 0 && !this.f1208b) {
                    liveData2.b();
                }
                if (this.f1208b) {
                    LiveData.this.a((LiveData<T>.a) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(k kVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b();
    }

    public LiveData() {
        Object obj = f1197a;
        this.f1201e = obj;
        this.f1202f = obj;
        this.f1203g = -1;
        this.j = new q(this);
    }

    private static void a(String str) {
        if (!c.c().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f1208b) {
            if (!aVar.b()) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.f1209c;
            int i3 = this.f1203g;
            if (i2 < i3) {
                aVar.f1209c = i3;
                aVar.f1207a.a(this.f1201e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: package-private */
    public void a(LiveData<T>.a aVar) {
        if (this.f1204h) {
            this.i = true;
            return;
        }
        this.f1204h = true;
        do {
            this.i = false;
            if (aVar == null) {
                b<K, V>.d d2 = this.f1199c.d();
                while (d2.hasNext()) {
                    b((LiveData<T>.a) (a) ((Map.Entry) d2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.i);
        this.f1204h = false;
    }

    public void a(k kVar, t<? super T> tVar) {
        a("observe");
        if (kVar.getLifecycle().a() != g.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, tVar);
            a b2 = this.f1199c.b(tVar, lifecycleBoundObserver);
            if (b2 != null && !b2.a(kVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b2 == null) {
                kVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(t<? super T> tVar) {
        a("removeObserver");
        a remove = this.f1199c.remove(tVar);
        if (remove != null) {
            remove.a();
            remove.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        boolean z;
        synchronized (this.f1198b) {
            z = this.f1202f == f1197a;
            this.f1202f = t;
        }
        if (z) {
            c.c().b(this.j);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.f1203g++;
        this.f1201e = t;
        a((LiveData<T>.a) null);
    }
}
