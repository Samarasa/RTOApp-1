package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f93a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<d> f94b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements f, a {

        /* renamed from: a  reason: collision with root package name */
        private final g f95a;

        /* renamed from: b  reason: collision with root package name */
        private final d f96b;

        /* renamed from: c  reason: collision with root package name */
        private a f97c;

        LifecycleOnBackPressedCancellable(g gVar, d dVar) {
            this.f95a = gVar;
            this.f96b = dVar;
            gVar.a(this);
        }

        public void a(k kVar, g.a aVar) {
            if (aVar == g.a.ON_START) {
                this.f97c = OnBackPressedDispatcher.this.a(this.f96b);
            } else if (aVar == g.a.ON_STOP) {
                a aVar2 = this.f97c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == g.a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f95a.b(this);
            this.f96b.b(this);
            a aVar = this.f97c;
            if (aVar != null) {
                aVar.cancel();
                this.f97c = null;
            }
        }
    }

    private class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final d f99a;

        a(d dVar) {
            this.f99a = dVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f94b.remove(this.f99a);
            this.f99a.b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f93a = runnable;
    }

    /* access modifiers changed from: package-private */
    public a a(d dVar) {
        this.f94b.add(dVar);
        a aVar = new a(dVar);
        dVar.a((a) aVar);
        return aVar;
    }

    public void a() {
        Iterator<d> descendingIterator = this.f94b.descendingIterator();
        while (descendingIterator.hasNext()) {
            d next = descendingIterator.next();
            if (next.b()) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f93a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(k kVar, d dVar) {
        g lifecycle = kVar.getLifecycle();
        if (lifecycle.a() != g.b.DESTROYED) {
            dVar.a((a) new LifecycleOnBackPressedCancellable(lifecycle, dVar));
        }
    }
}
