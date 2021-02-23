package c.b.b.b.g;

import java.util.concurrent.Executor;

final class v<TResult> implements B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4736a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f4737b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0472e f4738c;

    public v(Executor executor, C0472e eVar) {
        this.f4736a = executor;
        this.f4738c = eVar;
    }

    public final void a() {
        synchronized (this.f4737b) {
            this.f4738c = null;
        }
    }

    public final void a(i<TResult> iVar) {
        if (!iVar.e() && !iVar.c()) {
            synchronized (this.f4737b) {
                if (this.f4738c != null) {
                    this.f4736a.execute(new u(this, iVar));
                }
            }
        }
    }
}
