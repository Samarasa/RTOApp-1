package c.b.b.b.g;

import java.util.concurrent.Executor;

final class w<TResult> implements B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4739a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f4740b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0473f<? super TResult> f4741c;

    public w(Executor executor, C0473f<? super TResult> fVar) {
        this.f4739a = executor;
        this.f4741c = fVar;
    }

    public final void a() {
        synchronized (this.f4740b) {
            this.f4741c = null;
        }
    }

    public final void a(i<TResult> iVar) {
        if (iVar.e()) {
            synchronized (this.f4740b) {
                if (this.f4741c != null) {
                    this.f4739a.execute(new x(this, iVar));
                }
            }
        }
    }
}
