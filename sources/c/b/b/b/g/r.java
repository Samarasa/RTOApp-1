package c.b.b.b.g;

import java.util.concurrent.Executor;

final class r<TResult> implements B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4726a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f4727b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0470c f4728c;

    public r(Executor executor, C0470c cVar) {
        this.f4726a = executor;
        this.f4728c = cVar;
    }

    public final void a() {
        synchronized (this.f4727b) {
            this.f4728c = null;
        }
    }

    public final void a(i<TResult> iVar) {
        if (iVar.c()) {
            synchronized (this.f4727b) {
                if (this.f4728c != null) {
                    this.f4726a.execute(new q(this));
                }
            }
        }
    }
}
