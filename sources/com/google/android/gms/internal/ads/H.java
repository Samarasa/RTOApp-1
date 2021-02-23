package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.regex.Pattern;

public final class H {
    public static boolean a(String str) {
        return a((String) Qqa.e().a(F.Fd), str);
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                p.g().a((Throwable) e2, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
