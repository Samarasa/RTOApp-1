package c.b.e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

final class F {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f4974a = e();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4975b = g();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f4976c = f();

    /* renamed from: d  reason: collision with root package name */
    private static final long f4977d = ((long) d());

    /* renamed from: e  reason: collision with root package name */
    private static final long f4978e = a(a((Class<?>) Buffer.class, "address"));

    static byte a(byte[] bArr, long j) {
        return f4974a.getByte(bArr, j);
    }

    static long a() {
        return f4977d;
    }

    private static long a(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f4974a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static long b(byte[] bArr, long j) {
        return f4974a.getLong(bArr, j);
    }

    static boolean b() {
        return f4976c;
    }

    static boolean c() {
        return f4975b;
    }

    private static int d() {
        if (f4976c) {
            return f4974a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    private static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new E());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean f() {
        Unsafe unsafe = f4974a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean g() {
        Unsafe unsafe = f4974a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
