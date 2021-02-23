package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import b.h.j.C0197c;
import b.h.j.y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Method f976a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f977b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f978c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f979d;

    public static void a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f977b) {
            try {
                f976a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f976a.setAccessible(true);
            } catch (Exception unused) {
            }
            f977b = true;
        }
        Method method = f976a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0197c.a(i3, y.m(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f979d) {
                try {
                    f978c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f978c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f979d = true;
            }
            Field field = f978c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }
}
