package c.b.b.b.d.f;

final class Ma<T> extends Ja<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f4234a;

    Ma(T t) {
        this.f4234a = t;
    }

    public final boolean a() {
        return true;
    }

    public final T b() {
        return this.f4234a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Ma) {
            return this.f4234a.equals(((Ma) obj).f4234a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4234a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4234a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
