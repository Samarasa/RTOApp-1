package c.b.b.b.d.d;

/* renamed from: c.b.b.b.d.d.f  reason: case insensitive filesystem */
final class C0266f extends C0268g {

    /* renamed from: a  reason: collision with root package name */
    private final char f3998a = '.';

    C0266f(char c2) {
    }

    public final boolean a(char c2) {
        return c2 == this.f3998a;
    }

    public final String toString() {
        String b2 = C0262d.c(this.f3998a);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(b2);
        sb.append("')");
        return sb.toString();
    }
}
