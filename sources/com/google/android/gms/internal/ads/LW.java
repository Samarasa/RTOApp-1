package com.google.android.gms.internal.ads;

public abstract class LW {
    protected LW() {
    }

    public static LW a(char c2) {
        return new NW(';');
    }

    /* access modifiers changed from: private */
    public static String d(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C1434cX.a(i, length, "index");
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean b(char c2);
}
