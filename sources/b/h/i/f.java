package b.h.i;

public class f<T> extends e<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f2517c = new Object();

    public f(int i) {
        super(i);
    }

    public T a() {
        T a2;
        synchronized (this.f2517c) {
            a2 = super.a();
        }
        return a2;
    }

    public boolean a(T t) {
        boolean a2;
        synchronized (this.f2517c) {
            a2 = super.a(t);
        }
        return a2;
    }
}
