package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Qc implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f4269a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4270b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Oc f4271c;

    private Qc(Oc oc) {
        this.f4271c = oc;
        this.f4269a = this.f4271c.f4252b.size();
    }

    /* synthetic */ Qc(Oc oc, Nc nc) {
        this(oc);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f4270b == null) {
            this.f4270b = this.f4271c.f4256f.entrySet().iterator();
        }
        return this.f4270b;
    }

    public final boolean hasNext() {
        int i = this.f4269a;
        return (i > 0 && i <= this.f4271c.f4252b.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List b2 = this.f4271c.f4252b;
            int i = this.f4269a - 1;
            this.f4269a = i;
            obj = b2.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
