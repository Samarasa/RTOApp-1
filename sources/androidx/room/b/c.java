package androidx.room.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f1520a = new String[0];

    public static StringBuilder a() {
        return new StringBuilder();
    }

    public static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}