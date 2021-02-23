package c.b.b.b.d.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class q extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4089a;

    public q(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4089a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == q.class) {
            if (this == obj) {
                return true;
            }
            q qVar = (q) obj;
            return this.f4089a == qVar.f4089a && get() == qVar.get();
        }
    }

    public final int hashCode() {
        return this.f4089a;
    }
}
