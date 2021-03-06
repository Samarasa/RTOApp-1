package b.h.h;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2484a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2485b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2484a = cls.getMethod("getScript", new Class[]{String.class});
                    f2485b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception e2) {
                f2484a = null;
                f2485b = null;
                Log.w("ICUCompat", e2);
            }
        } else if (i < 24) {
            try {
                f2485b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    private static String a(String str) {
        try {
            if (f2484a != null) {
                return (String) f2484a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    public static String a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f2485b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f2485b != null) {
                return (String) f2485b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }
}
