package c.b.b.b.g;

import java.util.concurrent.Executor;

final class n<TResult, TContinuationResult> implements C0470c, C0472e, C0473f<TContinuationResult>, B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4718a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0468a<TResult, i<TContinuationResult>> f4719b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final D<TContinuationResult> f4720c;

    public n(Executor executor, C0468a<TResult, i<TContinuationResult>> aVar, D<TContinuationResult> d2) {
        this.f4718a = executor;
        this.f4719b = aVar;
        this.f4720c = d2;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void a(i<TResult> iVar) {
        this.f4718a.execute(new p(this, iVar));
    }

    public final void a(Exception exc) {
        this.f4720c.a(exc);
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f4720c.a(tcontinuationresult);
    }

    public final void b() {
        this.f4720c.f();
    }
}
