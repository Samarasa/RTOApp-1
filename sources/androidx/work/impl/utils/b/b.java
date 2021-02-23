package androidx.work.impl.utils.b;

import java.util.concurrent.Executor;

class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f1997a;

    b(c cVar) {
        this.f1997a = cVar;
    }

    public void execute(Runnable runnable) {
        this.f1997a.b(runnable);
    }
}
