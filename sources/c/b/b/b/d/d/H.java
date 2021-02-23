package c.b.b.b.d.d;

import java.util.AbstractMap;
import java.util.Map;

final class H extends C0286w<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ E f3967c;

    H(E e2) {
        this.f3967c = e2;
    }

    public final /* synthetic */ Object get(int i) {
        C0277m.a(i, this.f3967c.f3960f);
        Object[] b2 = this.f3967c.f3958d;
        int i2 = i * 2;
        E e2 = this.f3967c;
        Object obj = b2[i2];
        Object[] b3 = e2.f3958d;
        E e3 = this.f3967c;
        return new AbstractMap.SimpleImmutableEntry(obj, b3[i2 + 1]);
    }

    public final int size() {
        return this.f3967c.f3960f;
    }
}
