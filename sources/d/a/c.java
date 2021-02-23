package d.a;

import d.a;

public final class c<T> implements b<T>, a<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final c<Object> f14814a = new c<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final T f14815b;

    private c(T t) {
        this.f14815b = t;
    }

    public static <T> b<T> a(T t) {
        d.a(t, "instance cannot be null");
        return new c(t);
    }

    public T get() {
        return this.f14815b;
    }
}
