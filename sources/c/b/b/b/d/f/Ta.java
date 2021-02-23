package c.b.b.b.d.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class Ta extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4284a;

    public Ta(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4284a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Ta.class) {
            if (this == obj) {
                return true;
            }
            Ta ta = (Ta) obj;
            return this.f4284a == ta.f4284a && get() == ta.get();
        }
    }

    public final int hashCode() {
        return this.f4284a;
    }
}
