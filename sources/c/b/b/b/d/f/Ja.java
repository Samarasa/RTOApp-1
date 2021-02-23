package c.b.b.b.d.f;

import java.io.Serializable;

public abstract class Ja<T> implements Serializable {
    Ja() {
    }

    public static <T> Ja<T> a(T t) {
        Ia.a(t);
        return new Ma(t);
    }

    public static <T> Ja<T> c() {
        return Ha.f4178a;
    }

    public abstract boolean a();

    public abstract T b();
}
