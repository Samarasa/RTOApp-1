package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.mX  reason: case insensitive filesystem */
public final class C2142mX {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f11313a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f11314b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f11315c;

    static {
        Method method;
        Object a2 = a();
        f11313a = a2;
        Method method2 = null;
        if (a2 == null) {
            method = null;
        } else {
            method = a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f11314b = method;
        if (f11313a != null) {
            method2 = b();
        }
        f11315c = method2;
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C2790vda.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b() {
        try {
            Method a2 = a("getStackTraceDepth", Throwable.class);
            if (a2 == null) {
                return null;
            }
            a2.invoke(a(), new Object[]{new Throwable()});
            return a2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void b(Throwable th) {
        C1434cX.a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException c(Throwable th) {
        b(th);
        throw new RuntimeException(th);
    }
}
