package g;

import java.util.Comparator;

/* renamed from: g.i  reason: case insensitive filesystem */
class C3348i implements Comparator<String> {
    C3348i() {
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 4; i < min; i++) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
