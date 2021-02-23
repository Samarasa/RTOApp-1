package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.aga  reason: case insensitive filesystem */
final class C1308aga {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9816a = Logger.getLogger(C1308aga.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f9817b = c();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f9818c = Ida.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f9819d = d(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f9820e = d(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final d f9821f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f9822g = e();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f9823h = d();
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

    /* renamed from: com.google.android.gms.internal.ads.aga$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, byte b2) {
            if (C1308aga.x) {
                C1308aga.c(obj, j, b2);
            } else {
                C1308aga.d(obj, j, b2);
            }
        }

        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j, boolean z) {
            if (C1308aga.x) {
                C1308aga.d(obj, j, z);
            } else {
                C1308aga.e(obj, j, z);
            }
        }

        public final boolean c(Object obj, long j) {
            return C1308aga.x ? C1308aga.m(obj, j) : C1308aga.n(obj, j);
        }

        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        public final byte f(Object obj, long j) {
            return C1308aga.x ? C1308aga.k(obj, j) : C1308aga.l(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aga$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, byte b2) {
            this.f9824a.putByte(obj, j, b2);
        }

        public final void a(Object obj, long j, double d2) {
            this.f9824a.putDouble(obj, j, d2);
        }

        public final void a(Object obj, long j, float f2) {
            this.f9824a.putFloat(obj, j, f2);
        }

        public final void a(Object obj, long j, boolean z) {
            this.f9824a.putBoolean(obj, j, z);
        }

        public final boolean c(Object obj, long j) {
            return this.f9824a.getBoolean(obj, j);
        }

        public final float d(Object obj, long j) {
            return this.f9824a.getFloat(obj, j);
        }

        public final double e(Object obj, long j) {
            return this.f9824a.getDouble(obj, j);
        }

        public final byte f(Object obj, long j) {
            return this.f9824a.getByte(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aga$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, byte b2) {
            if (C1308aga.x) {
                C1308aga.c(obj, j, b2);
            } else {
                C1308aga.d(obj, j, b2);
            }
        }

        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j, boolean z) {
            if (C1308aga.x) {
                C1308aga.d(obj, j, z);
            } else {
                C1308aga.e(obj, j, z);
            }
        }

        public final boolean c(Object obj, long j) {
            return C1308aga.x ? C1308aga.m(obj, j) : C1308aga.n(obj, j);
        }

        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        public final byte f(Object obj, long j) {
            return C1308aga.x ? C1308aga.k(obj, j) : C1308aga.l(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aga$d */
    static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f9824a;

        d(Unsafe unsafe) {
            this.f9824a = unsafe;
        }

        public final int a(Object obj, long j) {
            return this.f9824a.getInt(obj, j);
        }

        public abstract void a(Object obj, long j, byte b2);

        public abstract void a(Object obj, long j, double d2);

        public abstract void a(Object obj, long j, float f2);

        public final void a(Object obj, long j, int i) {
            this.f9824a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.f9824a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public final long b(Object obj, long j) {
            return this.f9824a.getLong(obj, j);
        }

        public abstract boolean c(Object obj, long j);

        public abstract float d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract byte f(Object obj, long j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00dc, code lost:
        r1 = f9821f;
     */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.aga> r0 = com.google.android.gms.internal.ads.C1308aga.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f9816a = r0
            sun.misc.Unsafe r0 = c()
            f9817b = r0
            java.lang.Class r0 = com.google.android.gms.internal.ads.Ida.b()
            f9818c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = d(r0)
            f9819d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = d(r0)
            f9820e = r0
            sun.misc.Unsafe r0 = f9817b
            r1 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            boolean r0 = com.google.android.gms.internal.ads.Ida.a()
            if (r0 == 0) goto L_0x004c
            boolean r0 = f9819d
            if (r0 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.aga$c r1 = new com.google.android.gms.internal.ads.aga$c
            sun.misc.Unsafe r0 = f9817b
            r1.<init>(r0)
            goto L_0x0053
        L_0x0040:
            boolean r0 = f9820e
            if (r0 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.aga$a r1 = new com.google.android.gms.internal.ads.aga$a
            sun.misc.Unsafe r0 = f9817b
            r1.<init>(r0)
            goto L_0x0053
        L_0x004c:
            com.google.android.gms.internal.ads.aga$b r1 = new com.google.android.gms.internal.ads.aga$b
            sun.misc.Unsafe r0 = f9817b
            r1.<init>(r0)
        L_0x0053:
            f9821f = r1
            boolean r0 = e()
            f9822g = r0
            boolean r0 = d()
            f9823h = r0
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
            com.google.android.gms.internal.ads.aga$d r1 = f9821f
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            sun.misc.Unsafe r1 = r1.f9824a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1308aga.<clinit>():void");
    }

    private C1308aga() {
    }

    static byte a(byte[] bArr, long j2) {
        return f9821f.f(bArr, i + j2);
    }

    static int a(Object obj, long j2) {
        return f9821f.a(obj, j2);
    }

    static <T> T a(Class<T> cls) {
        try {
            return f9817b.allocateInstance(cls);
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
        f9821f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f9821f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f9821f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f9821f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f9821f.f9824a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f9821f.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f9821f.a((Object) bArr, i + j2, b2);
    }

    static boolean a() {
        return f9823h;
    }

    private static int b(Class<?> cls) {
        if (f9823h) {
            return f9821f.f9824a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f9821f.b(obj, j2);
    }

    static boolean b() {
        return f9822g;
    }

    private static int c(Class<?> cls) {
        if (f9823h) {
            return f9821f.f9824a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1450cga());
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
        return f9821f.c(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f9821f.d(obj, j2);
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
        Unsafe unsafe = f9817b;
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
            if (Ida.a()) {
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
            Logger logger = f9816a;
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
        if (!Ida.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f9818c;
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
        return f9821f.e(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void e(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : 0);
    }

    private static boolean e() {
        Unsafe unsafe = f9817b;
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
            if (Ida.a()) {
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
            Logger logger = f9816a;
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
        return f9821f.f9824a.getObject(obj, j2);
    }

    private static Field f() {
        Field a2;
        if (Ida.a() && (a2 = a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
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
