package c.b.b.b.d.f;

import java.io.Serializable;

public final class Oa {
    public static <T> Ka<T> a(Ka<T> ka) {
        return ((ka instanceof Qa) || (ka instanceof Na)) ? ka : ka instanceof Serializable ? new Na(ka) : new Qa(ka);
    }

    public static <T> Ka<T> a(T t) {
        return new Pa(t);
    }
}
