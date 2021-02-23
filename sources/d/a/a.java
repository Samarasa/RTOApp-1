package d.a;

public final class a<T> implements f.a.a<T>, d.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14811a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile f.a.a<T> f14812b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f14813c = f14811a;

    private a(f.a.a<T> aVar) {
        this.f14812b = aVar;
    }

    public static <P extends f.a.a<T>, T> f.a.a<T> a(P p) {
        d.a(p);
        return p instanceof a ? p : new a(p);
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != f14811a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f14813c;
        if (t == f14811a) {
            synchronized (this) {
                t = this.f14813c;
                if (t == f14811a) {
                    t = this.f14812b.get();
                    a(this.f14813c, t);
                    this.f14813c = t;
                    this.f14812b = null;
                }
            }
        }
        return t;
    }
}
