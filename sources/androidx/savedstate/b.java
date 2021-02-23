package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f1631a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1632b = new a();

    private b(c cVar) {
        this.f1631a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public a a() {
        return this.f1632b;
    }

    public void a(Bundle bundle) {
        g lifecycle = this.f1631a.getLifecycle();
        if (lifecycle.a() == g.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f1631a));
            this.f1632b.a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        this.f1632b.a(bundle);
    }
}
