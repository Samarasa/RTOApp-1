package c.a.a.i;

import b.e.i;

public final class b<K, V> extends b.e.b<K, V> {
    private int i;

    public V a(int i2, V v) {
        this.i = 0;
        return super.a(i2, v);
    }

    public void a(i<? extends K, ? extends V> iVar) {
        this.i = 0;
        super.a(iVar);
    }

    public V c(int i2) {
        this.i = 0;
        return super.c(i2);
    }

    public void clear() {
        this.i = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.i == 0) {
            this.i = super.hashCode();
        }
        return this.i;
    }

    public V put(K k, V v) {
        this.i = 0;
        return super.put(k, v);
    }
}
