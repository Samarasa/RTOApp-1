package c.b.b.b.d.d;

import java.util.Iterator;
import java.util.Set;

public abstract class D<E> extends C0287x<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient C0286w<E> f3956b;

    D() {
    }

    /* access modifiers changed from: package-private */
    public C0286w<E> a() {
        return C0286w.a(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return I.a(this, obj);
    }

    public C0286w<E> f() {
        C0286w<E> wVar = this.f3956b;
        if (wVar != null) {
            return wVar;
        }
        C0286w<E> a2 = a();
        this.f3956b = a2;
        return a2;
    }

    public int hashCode() {
        return I.a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
