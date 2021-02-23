package c.b.b.b.g;

import java.util.concurrent.Executor;

final class z<TResult, TContinuationResult> implements C0470c, C0472e, C0473f<TContinuationResult>, B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4746a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0475h<TResult, TContinuationResult> f4747b;

    /* renamed from: c  reason: collision with root package name */
    private final D<TContinuationResult> f4748c;

    public z(Executor executor, C0475h<TResult, TContinuationResult> hVar, D<TContinuationResult> d2) {
        this.f4746a = executor;
        this.f4747b = hVar;
        this.f4748c = d2;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void a(i<TResult> iVar) {
        this.f4746a.execute(new y(this, iVar));
    }

    public final void a(Exception exc) {
        this.f4748c.a(exc);
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f4748c.a(tcontinuationresult);
    }

    public final void b() {
        this.f4748c.f();
    }
}
