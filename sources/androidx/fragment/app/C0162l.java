package androidx.fragment.app;

import androidx.fragment.app.C0158h;
import b.e.i;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.l  reason: case insensitive filesystem */
public class C0162l {

    /* renamed from: a  reason: collision with root package name */
    private static final i<String, Class<?>> f1125a = new i<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return C0158h.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends C0158h> c(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        } catch (ClassCastException e3) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        }
    }

    private static Class<?> d(ClassLoader classLoader, String str) {
        Class<?> cls = f1125a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f1125a.put(str, cls2);
        return cls2;
    }

    public C0158h a(ClassLoader classLoader, String str) {
        try {
            return (C0158h) c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e2) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0158h.b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
