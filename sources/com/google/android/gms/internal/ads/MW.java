package com.google.android.gms.internal.ads;

public final class MW {
    private static int a(char c2) {
        return (char) ((c2 | ' ') - 'a');
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int a2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((a2 = a(charAt)) >= 26 || a2 != a(charAt2))) {
                return false;
            }
        }
        return true;
    }
}
