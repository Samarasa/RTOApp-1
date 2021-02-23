package c.b.d.c;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f4923a;

    /* renamed from: b  reason: collision with root package name */
    private final T f4924b;

    public T a() {
        return this.f4924b;
    }

    public Class<T> b() {
        return this.f4923a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f4923a, this.f4924b});
    }
}
