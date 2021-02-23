package c.b.b.b.d.f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class Ua {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Ta, List<Throwable>> f4300a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4301b = new ReferenceQueue<>();

    Ua() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f4301b.poll();
            if (poll == null) {
                break;
            }
            this.f4300a.remove(poll);
        }
        List<Throwable> list = this.f4300a.get(new Ta(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4300a.putIfAbsent(new Ta(th, this.f4301b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
