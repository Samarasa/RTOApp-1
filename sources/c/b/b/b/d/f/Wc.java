package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

final class Wc implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f4326a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4327b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4328c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Oc f4329d;

    private Wc(Oc oc) {
        this.f4329d = oc;
        this.f4326a = -1;
    }

    /* synthetic */ Wc(Oc oc, Nc nc) {
        this(oc);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f4328c == null) {
            this.f4328c = this.f4329d.f4253c.entrySet().iterator();
        }
        return this.f4328c;
    }

    public final boolean hasNext() {
        return this.f4326a + 1 < this.f4329d.f4252b.size() || (!this.f4329d.f4253c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f4327b = true;
        int i = this.f4326a + 1;
        this.f4326a = i;
        return (Map.Entry) (i < this.f4329d.f4252b.size() ? this.f4329d.f4252b.get(this.f4326a) : a().next());
    }

    public final void remove() {
        if (this.f4327b) {
            this.f4327b = false;
            this.f4329d.f();
            if (this.f4326a < this.f4329d.f4252b.size()) {
                Oc oc = this.f4329d;
                int i = this.f4326a;
                this.f4326a = i - 1;
                Object unused = oc.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
