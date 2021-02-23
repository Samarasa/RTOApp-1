package c.b.b.b.d.e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class n {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<q, List<Throwable>> f4085a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4086b = new ReferenceQueue<>();

    n() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f4086b.poll();
            if (poll == null) {
                break;
            }
            this.f4085a.remove(poll);
        }
        List<Throwable> list = this.f4085a.get(new q(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4085a.putIfAbsent(new q(th, this.f4086b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
