package b.h.j;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.h.j.d  reason: case insensitive filesystem */
public class C0198d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2558a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2559b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2560c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2561d;

    /* renamed from: b.h.j.d$a */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    private static DialogInterface.OnKeyListener a(Dialog dialog) {
        if (!f2560c) {
            try {
                f2561d = Dialog.class.getDeclaredField("mOnKeyListener");
                f2561d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2560c = true;
        }
        Field field = f2561d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2558a) {
            try {
                f2559b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f2558a = true;
        }
        Method method = f2559b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (y.a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a2 = a(dialog);
        if (a2 != null && a2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (y.a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return y.b(view, keyEvent);
    }

    public static boolean a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? a((Activity) callback, keyEvent) : callback instanceof Dialog ? a((Dialog) callback, keyEvent) : (view != null && y.a(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }
}
