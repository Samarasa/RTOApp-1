package c.b.b.b.d.d;

final class G<K> extends D<K> {

    /* renamed from: c  reason: collision with root package name */
    private final transient B<K, ?> f3965c;

    /* renamed from: d  reason: collision with root package name */
    private final transient C0286w<K> f3966d;

    G(B<K, ?> b2, C0286w<K> wVar) {
        this.f3965c = b2;
        this.f3966d = wVar;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    /* renamed from: b */
    public final L<K> iterator() {
        return (L) f().iterator();
    }

    public final boolean contains(Object obj) {
        return this.f3965c.get(obj) != null;
    }

    public final C0286w<K> f() {
        return this.f3966d;
    }

    public final int size() {
        return this.f3965c.size();
    }
}
