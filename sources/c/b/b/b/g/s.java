package c.b.b.b.g;

import java.util.concurrent.Executor;

final class s<TResult> implements B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4729a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f4730b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0471d<TResult> f4731c;

    public s(Executor executor, C0471d<TResult> dVar) {
        this.f4729a = executor;
        this.f4731c = dVar;
    }

    public final void a() {
        synchronized (this.f4730b) {
            this.f4731c = null;
        }
    }

    public final void a(i<TResult> iVar) {
        synchronized (this.f4730b) {
            if (this.f4731c != null) {
                this.f4729a.execute(new t(this, iVar));
            }
        }
    }
}
