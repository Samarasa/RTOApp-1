package c.a.a.c.d.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b.a.d.d;
import b.h.a.a.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f3432a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return a(context, context, i, theme);
    }

    public static Drawable a(Context context, Context context2, int i) {
        return a(context, context2, i, (Resources.Theme) null);
    }

    private static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f3432a) {
                return c(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f3432a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return b.h.a.a.c(context2, i);
            }
            throw e2;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return b(context2, i, theme);
    }

    private static Drawable b(Context context, int i, Resources.Theme theme) {
        return h.a(context.getResources(), i, theme);
    }

    private static Drawable c(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new d(context, theme);
        }
        return b.a.a.a.a.b(context, i);
    }
}
