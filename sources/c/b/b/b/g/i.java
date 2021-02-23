package c.b.b.b.g;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class i<TResult> {
    public i<TResult> a(Activity activity, C0471d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> a(C0468a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public i<TResult> a(C0471d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i<TResult> a(C0472e eVar);

    public <TContinuationResult> i<TContinuationResult> a(C0475h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> a(Executor executor, C0468a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public i<TResult> a(Executor executor, C0470c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public i<TResult> a(Executor executor, C0471d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i<TResult> a(Executor executor, C0472e eVar);

    public abstract i<TResult> a(Executor executor, C0473f<? super TResult> fVar);

    public <TContinuationResult> i<TContinuationResult> a(Executor executor, C0475h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public <TContinuationResult> i<TContinuationResult> b(Executor executor, C0468a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract TResult b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();
}
