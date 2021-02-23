package b.q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class ba {

    /* renamed from: a  reason: collision with root package name */
    private static final fa f2726a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f2727b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2728c;

    /* renamed from: d  reason: collision with root package name */
    static final Property<View, Float> f2729d = new Z(Float.class, "translationAlpha");

    /* renamed from: e  reason: collision with root package name */
    static final Property<View, Rect> f2730e = new aa(Rect.class, "clipBounds");

    static {
        int i = Build.VERSION.SDK_INT;
        f2726a = i >= 22 ? new ea() : i >= 21 ? new da() : i >= 19 ? new ca() : new fa();
    }

    private static void a() {
        if (!f2728c) {
            try {
                f2727b = View.class.getDeclaredField("mViewFlags");
                f2727b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f2728c = true;
        }
    }

    static void a(View view) {
        f2726a.a(view);
    }

    static void a(View view, float f2) {
        f2726a.a(view, f2);
    }

    static void a(View view, int i) {
        a();
        Field field = f2727b;
        if (field != null) {
            try {
                f2727b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        f2726a.a(view, i, i2, i3, i4);
    }

    static void a(View view, Matrix matrix) {
        f2726a.a(view, matrix);
    }

    static Y b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new X(view) : W.c(view);
    }

    static void b(View view, Matrix matrix) {
        f2726a.b(view, matrix);
    }

    static float c(View view) {
        return f2726a.b(view);
    }

    static ka d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new ja(view) : new ia(view.getWindowToken());
    }

    static void e(View view) {
        f2726a.c(view);
    }
}
