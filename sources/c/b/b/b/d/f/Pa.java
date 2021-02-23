package c.b.b.b.d.f;

import java.io.Serializable;
import java.util.Arrays;

final class Pa<T> implements Ka<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final T f4262a;

    Pa(T t) {
        this.f4262a = t;
    }

    public final T a() {
        return this.f4262a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pa)) {
            return false;
        }
        T t = this.f4262a;
        T t2 = ((Pa) obj).f4262a;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4262a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4262a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
