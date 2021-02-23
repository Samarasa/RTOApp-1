package b.e;

import java.util.Map;

class c extends h<E, E> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f2196d;

    c(d dVar) {
        this.f2196d = dVar;
    }

    /* access modifiers changed from: protected */
    public int a(Object obj) {
        return this.f2196d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    public Object a(int i, int i2) {
        return this.f2196d.f2204h[i];
    }

    /* access modifiers changed from: protected */
    public E a(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f2196d.clear();
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.f2196d.k(i);
    }

    /* access modifiers changed from: protected */
    public void a(E e2, E e3) {
        this.f2196d.add(e2);
    }

    /* access modifiers changed from: protected */
    public int b(Object obj) {
        return this.f2196d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.f2196d.i;
    }
}
