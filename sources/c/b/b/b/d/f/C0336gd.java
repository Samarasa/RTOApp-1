package c.b.b.b.d.f;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: c.b.b.b.d.f.gd  reason: case insensitive filesystem */
final class C0336gd {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4446a = Logger.getLogger(C0336gd.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4447b = c();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4448c = C0299bb.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f4449d = d(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f4450e = d(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final d f4451f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f4452g = e();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f4453h = d();
    private static final long i = ((long) b(byte[].class));
    private static final long j = ((long) b(boolean[].class));
    private static final long k = ((long) c(boolean[].class));
    private static final long l = ((long) b(int[].class));
    private static final long m = ((long) c(int[].class));
    private static final long n = ((long) b(long[].class));
    private static final long o = ((long) c(long[].class));
    private static final long p = ((long) b(float[].class));
    private static final long q = ((long) c(float[].class));
    private static final long r = ((long) b(double[].class));
    private static final long s = ((long) c(double[].class));
    private static final long t = ((long) b(Object[].class));
    private static final long u = ((long) c(Object[].class));
    private static final long v;
    private static final int w = ((int) (i & 7));
    static final boolean x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: c.b.b.b.d.f.gd$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return C0336gd.x ? C0336gd.k(obj, j) : C0336gd.l(obj, j);
        }

        public final void a(Object obj, long j, byte b2) {
            if (C0336gd.x) {
                C0336gd.c(obj, j, b2);
            } else {
                C0336gd.d(obj, j, b2);
            }
        }

        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j, boolean z) {
            if (C0336gd.x) {
                C0336gd.d(obj, j, z);
            } else {
                C0336gd.e(obj, j, z);
            }
        }

        public final boolean b(Object obj, long j) {
            return C0336gd.x ? C0336gd.m(obj, j) : C0336gd.n(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: c.b.b.b.d.f.gd$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.f4454a.getByte(obj, j);
        }

        public final void a(Object obj, long j, byte b2) {
            this.f4454a.putByte(obj, j, b2);
        }

        public final void a(Object obj, long j, double d2) {
            this.f4454a.putDouble(obj, j, d2);
        }

        public final void a(Object obj, long j, float f2) {
            this.f4454a.putFloat(obj, j, f2);
        }

        public final void a(Object obj, long j, boolean z) {
            this.f4454a.putBoolean(obj, j, z);
        }

        public final boolean b(Object obj, long j) {
            return this.f4454a.getBoolean(obj, j);
        }

        public final float c(Object obj, long j) {
            return this.f4454a.getFloat(obj, j);
        }

        public final double d(Object obj, long j) {
            return this.f4454a.getDouble(obj, j);
        }
    }

    /* renamed from: c.b.b.b.d.f.gd$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return C0336gd.x ? C0336gd.k(obj, j) : C0336gd.l(obj, j);
        }

        public final void a(Object obj, long j, byte b2) {
            if (C0336gd.x) {
                C0336gd.c(obj, j, b2);
            } else {
                C0336gd.d(obj, j, b2);
            }
        }

        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j, boolean z) {
            if (C0336gd.x) {
                C0336gd.d(obj, j, z);
            } else {
                C0336gd.e(obj, j, z);
            }
        }

        public final boolean b(Object obj, long j) {
            return C0336gd.x ? C0336gd.m(obj, j) : C0336gd.n(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: c.b.b.b.d.f.gd$d */
    static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f4454a;

        d(Unsafe unsafe) {
            this.f4454a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void a(Object obj, long j, byte b2);

        public abstract void a(Object obj, long j, double d2);

        public abstract void a(Object obj, long j, float f2);

        public final void a(Object obj, long j, int i) {
            this.f4454a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.f4454a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public abstract boolean b(Object obj, long j);

        public abstract float c(Object obj, long j);

        public abstract double d(Object obj, long j);

        public final int e(Object obj, long j) {
            return this.f4454a.getInt(obj, j);
        }

        public final long f(Object obj, long j) {
            return this.f4454a.getLong(obj, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00dc, code lost:
        r1 = f4451f;
     */
    static {
        /*
            java.lang.Class<c.b.b.b.d.f.gd> r0 = c.b.b.b.d.f.C0336gd.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f4446a = r0
            sun.misc.Unsafe r0 = c()
            f4447b = r0
            java.lang.Class r0 = c.b.b.b.d.f.C0299bb.b()
            f4448c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = d(r0)
            f4449d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = d(r0)
            f4450e = r0
            sun.misc.Unsafe r0 = f4447b
            r1 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            boolean r0 = c.b.b.b.d.f.C0299bb.a()
            if (r0 == 0) goto L_0x004c
            boolean r0 = f4449d
            if (r0 == 0) goto L_0x0040
            c.b.b.b.d.f.gd$c r1 = new c.b.b.b.d.f.gd$c
            sun.misc.Unsafe r0 = f4447b
            r1.<init>(r0)
            goto L_0x0053
        L_0x0040:
            boolean r0 = f4450e
            if (r0 == 0) goto L_0x0053
            c.b.b.b.d.f.gd$a r1 = new c.b.b.b.d.f.gd$a
            sun.misc.Unsafe r0 = f4447b
            r1.<init>(r0)
            goto L_0x0053
        L_0x004c:
            c.b.b.b.d.f.gd$b r1 = new c.b.b.b.d.f.gd$b
            sun.misc.Unsafe r0 = f4447b
            r1.<init>(r0)
        L_0x0053:
            f4451f = r1
            boolean r0 = e()
            f4452g = r0
            boolean r0 = d()
            f4453h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r0 = (long) r0
            i = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = b(r0)
            long r0 = (long) r0
            j = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = c(r0)
            long r0 = (long) r0
            k = r0
            java.lang.Class<int[]> r0 = int[].class
            int r0 = b(r0)
            long r0 = (long) r0
            l = r0
            java.lang.Class<int[]> r0 = int[].class
            int r0 = c(r0)
            long r0 = (long) r0
            m = r0
            java.lang.Class<long[]> r0 = long[].class
            int r0 = b(r0)
            long r0 = (long) r0
            n = r0
            java.lang.Class<long[]> r0 = long[].class
            int r0 = c(r0)
            long r0 = (long) r0
            o = r0
            java.lang.Class<float[]> r0 = float[].class
            int r0 = b(r0)
            long r0 = (long) r0
            p = r0
            java.lang.Class<float[]> r0 = float[].class
            int r0 = c(r0)
            long r0 = (long) r0
            q = r0
            java.lang.Class<double[]> r0 = double[].class
            int r0 = b(r0)
            long r0 = (long) r0
            r = r0
            java.lang.Class<double[]> r0 = double[].class
            int r0 = c(r0)
            long r0 = (long) r0
            s = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = b(r0)
            long r0 = (long) r0
            t = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = c(r0)
            long r0 = (long) r0
            u = r0
            java.lang.reflect.Field r0 = f()
            if (r0 == 0) goto L_0x00e8
            c.b.b.b.d.f.gd$d r1 = f4451f
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            sun.misc.Unsafe r1 = r1.f4454a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00ea
        L_0x00e8:
            r0 = -1
        L_0x00ea:
            v = r0
            long r0 = i
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            w = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0336gd.<clinit>():void");
    }

    private C0336gd() {
    }

    static byte a(byte[] bArr, long j2) {
        return f4451f.a(bArr, i + j2);
    }

    static int a(Object obj, long j2) {
        return f4451f.e(obj, j2);
    }

    static <T> T a(Class<T> cls) {
        try {
            return f4447b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void a(Object obj, long j2, double d2) {
        f4451f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f4451f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f4451f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f4451f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f4451f.f4454a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f4451f.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f4451f.a((Object) bArr, i + j2, b2);
    }

    static boolean a() {
        return f4453h;
    }

    private static int b(Class<?> cls) {
        if (f4453h) {
            return f4451f.f4454a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f4451f.f(obj, j2);
    }

    static boolean b() {
        return f4452g;
    }

    private static int c(Class<?> cls) {
        if (f4453h) {
            return f4451f.f4454a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0350id());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static boolean c(Object obj, long j2) {
        return f4451f.b(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f4451f.c(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : 0);
    }

    private static boolean d() {
        Unsafe unsafe = f4447b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C0299bb.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f4446a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean d(Class<?> cls) {
        if (!C0299bb.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f4448c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double e(Object obj, long j2) {
        return f4451f.d(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void e(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : 0);
    }

    private static boolean e() {
        Unsafe unsafe = f4447b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (f() == null) {
                return false;
            }
            if (C0299bb.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f4446a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object f(Object obj, long j2) {
        return f4451f.f4454a.getObject(obj, j2);
    }

    private static Field f() {
        Field a2;
        if (C0299bb.a() && (a2 = a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a((Class<?>) Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    /* access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean m(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean n(Object obj, long j2) {
        return l(obj, j2) != 0;
    }
}
