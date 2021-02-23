package b.q;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ca extends fa {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2736a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2737b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2738c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2739d;

    ca() {
    }

    private void a() {
        if (!f2739d) {
            try {
                f2738c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f2738c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f2739d = true;
        }
    }

    private void b() {
        if (!f2737b) {
            try {
                f2736a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f2736a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f2737b = true;
        }
    }

    public void a(View view) {
    }

    public void a(View view, float f2) {
        b();
        Method method = f2736a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f2)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(f2);
        }
    }

    public float b(View view) {
        a();
        Method method = f2738c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.b(view);
    }

    public void c(View view) {
    }
}
