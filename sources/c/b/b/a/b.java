package c.b.b.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3850a;

    private b(String str) {
        if (str != null) {
            this.f3850a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b a(String str) {
        return new b(str);
    }

    public String a() {
        return this.f3850a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f3850a.equals(((b) obj).f3850a);
    }

    public int hashCode() {
        return this.f3850a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f3850a + "\"}";
    }
}
