package c.b.b.b.g;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C0528h;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C0563t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class D<TResult> extends i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4698a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final A<TResult> f4699b = new A<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f4700c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f4701d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f4702e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f4703f;

    private static class a extends LifecycleCallback {

        /* renamed from: b  reason: collision with root package name */
        private final List<WeakReference<B<?>>> f4704b = new ArrayList();

        private a(C0528h hVar) {
            super(hVar);
            this.f5815a.a("TaskOnStopCallback", (LifecycleCallback) this);
        }

        public static a b(Activity activity) {
            C0528h a2 = LifecycleCallback.a(activity);
            a aVar = (a) a2.a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(a2) : aVar;
        }

        public final <T> void a(B<T> b2) {
            synchronized (this.f4704b) {
                this.f4704b.add(new WeakReference(b2));
            }
        }

        public void d() {
            synchronized (this.f4704b) {
                for (WeakReference<B<?>> weakReference : this.f4704b) {
                    B b2 = (B) weakReference.get();
                    if (b2 != null) {
                        b2.a();
                    }
                }
                this.f4704b.clear();
            }
        }
    }

    D() {
    }

    private final void g() {
        C0563t.b(this.f4700c, "Task is not yet complete");
    }

    private final void h() {
        if (this.f4700c) {
            throw C0469b.a(this);
        }
    }

    private final void i() {
        if (this.f4701d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.f4698a) {
            if (this.f4700c) {
                this.f4699b.a(this);
            }
        }
    }

    public final i<TResult> a(Activity activity, C0471d<TResult> dVar) {
        Executor executor = k.f4711a;
        E.a(executor);
        s sVar = new s(executor, dVar);
        this.f4699b.a(sVar);
        a.b(activity).a(sVar);
        j();
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> a(C0468a<TResult, i<TContinuationResult>> aVar) {
        return b(k.f4711a, aVar);
    }

    public final i<TResult> a(C0471d<TResult> dVar) {
        a(k.f4711a, dVar);
        return this;
    }

    public final i<TResult> a(C0472e eVar) {
        a(k.f4711a, eVar);
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> a(C0475h<TResult, TContinuationResult> hVar) {
        return a(k.f4711a, hVar);
    }

    public final <TContinuationResult> i<TContinuationResult> a(Executor executor, C0468a<TResult, TContinuationResult> aVar) {
        D d2 = new D();
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new m(executor, aVar, d2));
        j();
        return d2;
    }

    public final i<TResult> a(Executor executor, C0470c cVar) {
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new r(executor, cVar));
        j();
        return this;
    }

    public final i<TResult> a(Executor executor, C0471d<TResult> dVar) {
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new s(executor, dVar));
        j();
        return this;
    }

    public final i<TResult> a(Executor executor, C0472e eVar) {
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new v(executor, eVar));
        j();
        return this;
    }

    public final i<TResult> a(Executor executor, C0473f<? super TResult> fVar) {
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new w(executor, fVar));
        j();
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> a(Executor executor, C0475h<TResult, TContinuationResult> hVar) {
        D d2 = new D();
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new z(executor, hVar, d2));
        j();
        return d2;
    }

    public final Exception a() {
        Exception exc;
        synchronized (this.f4698a) {
            exc = this.f4703f;
        }
        return exc;
    }

    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f4698a) {
            g();
            i();
            if (cls.isInstance(this.f4703f)) {
                throw ((Throwable) cls.cast(this.f4703f));
            } else if (this.f4703f == null) {
                tresult = this.f4702e;
            } else {
                throw new C0474g(this.f4703f);
            }
        }
        return tresult;
    }

    public final void a(Exception exc) {
        C0563t.a(exc, (Object) "Exception must not be null");
        synchronized (this.f4698a) {
            h();
            this.f4700c = true;
            this.f4703f = exc;
        }
        this.f4699b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.f4698a) {
            h();
            this.f4700c = true;
            this.f4702e = tresult;
        }
        this.f4699b.a(this);
    }

    public final <TContinuationResult> i<TContinuationResult> b(Executor executor, C0468a<TResult, i<TContinuationResult>> aVar) {
        D d2 = new D();
        A<TResult> a2 = this.f4699b;
        E.a(executor);
        a2.a((B<TResult>) new n(executor, aVar, d2));
        j();
        return d2;
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.f4698a) {
            g();
            i();
            if (this.f4703f == null) {
                tresult = this.f4702e;
            } else {
                throw new C0474g(this.f4703f);
            }
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        C0563t.a(exc, (Object) "Exception must not be null");
        synchronized (this.f4698a) {
            if (this.f4700c) {
                return false;
            }
            this.f4700c = true;
            this.f4703f = exc;
            this.f4699b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.f4698a) {
            if (this.f4700c) {
                return false;
            }
            this.f4700c = true;
            this.f4702e = tresult;
            this.f4699b.a(this);
            return true;
        }
    }

    public final boolean c() {
        return this.f4701d;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f4698a) {
            z = this.f4700c;
        }
        return z;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.f4698a) {
            z = this.f4700c && !this.f4701d && this.f4703f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.f4698a) {
            if (this.f4700c) {
                return false;
            }
            this.f4700c = true;
            this.f4701d = true;
            this.f4699b.a(this);
            return true;
        }
    }
}
