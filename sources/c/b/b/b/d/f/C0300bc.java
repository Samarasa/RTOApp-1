package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.bc  reason: case insensitive filesystem */
final class C0300bc<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f4377a;

    public C0300bc(Iterator<Map.Entry<K, Object>> it) {
        this.f4377a = it;
    }

    public final boolean hasNext() {
        return this.f4377a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f4377a.next();
        return next.getValue() instanceof Xb ? new Zb(next) : next;
    }

    public final void remove() {
        this.f4377a.remove();
    }
}
