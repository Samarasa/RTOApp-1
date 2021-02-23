package c.b.b.b.d.d;

/* renamed from: c.b.b.b.d.d.d  reason: case insensitive filesystem */
public abstract class C0262d {
    protected C0262d() {
    }

    /* access modifiers changed from: private */
    public static String c(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C0277m.a(i, length, "index");
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean a(char c2);
}
