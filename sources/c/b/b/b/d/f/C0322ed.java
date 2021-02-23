package c.b.b.b.d.f;

import java.util.ListIterator;

/* renamed from: c.b.b.b.d.f.ed  reason: case insensitive filesystem */
final class C0322ed implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f4420a = this.f4422c.f4428a.listIterator(this.f4421b);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f4421b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0329fd f4422c;

    C0322ed(C0329fd fdVar, int i) {
        this.f4422c = fdVar;
        this.f4421b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f4420a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f4420a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f4420a.next();
    }

    public final int nextIndex() {
        return this.f4420a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f4420a.previous();
    }

    public final int previousIndex() {
        return this.f4420a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
