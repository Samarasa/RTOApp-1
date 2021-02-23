package b.q;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class V {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2717a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2718b;

    private static void a() {
        if (!f2718b) {
            try {
                f2717a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f2717a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f2718b = true;
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        String str;
        a();
        Method method = f2717a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
                return;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e3) {
                e = e3;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e);
    }
}
