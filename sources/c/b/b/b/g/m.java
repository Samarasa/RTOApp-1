package c.b.b.b.g;

import java.util.concurrent.Executor;

final class m<TResult, TContinuationResult> implements B<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4715a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0468a<TResult, TContinuationResult> f4716b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final D<TContinuationResult> f4717c;

    public m(Executor executor, C0468a<TResult, TContinuationResult> aVar, D<TContinuationResult> d2) {
        this.f4715a = executor;
        this.f4716b = aVar;
        this.f4717c = d2;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void a(i<TResult> iVar) {
        this.f4715a.execute(new o(this, iVar));
    }
}
