package b.q;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class da extends ca {

    /* renamed from: e  reason: collision with root package name */
    private static Method f2741e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2742f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f2743g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f2744h;

    da() {
    }

    private void c() {
        if (!f2742f) {
            try {
                f2741e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f2741e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f2742f = true;
        }
    }

    private void d() {
        if (!f2744h) {
            try {
                f2743g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f2743g.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            f2744h = true;
        }
    }

    public void a(View view, Matrix matrix) {
        c();
        Method method = f2741e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void b(View view, Matrix matrix) {
        d();
        Method method = f2743g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
