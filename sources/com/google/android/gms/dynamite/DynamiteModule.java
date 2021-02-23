package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.g;
import java.lang.reflect.Field;

public final class DynamiteModule {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f6066a = null;

    /* renamed from: b  reason: collision with root package name */
    private static k f6067b = null;

    /* renamed from: c  reason: collision with root package name */
    private static m f6068c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f6069d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f6070e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<c> f6071f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    private static final b.C0079b f6072g = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final b f6073h = new a();
    public static final b i = new d();
    public static final b j = new c();
    public static final b k = new f();
    public static final b l = new e();
    public static final b m = new h();
    private static final b n = new g();
    private final Context o;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, b bVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, b bVar) {
            this(str, th);
        }
    }

    public interface b {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f6074a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f6075b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f6076c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface C0079b {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        a a(Context context, String str, C0079b bVar);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f6077a;

        private c() {
        }

        /* synthetic */ c(b bVar) {
            this();
        }
    }

    private static class d implements b.C0079b {

        /* renamed from: a  reason: collision with root package name */
        private final int f6078a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6079b = 0;

        public d(int i, int i2) {
            this.f6078a = i;
        }

        public final int a(Context context, String str) {
            return this.f6078a;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        C0563t.a(context);
        this.o = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0054=Splitter:B:23:0x0054, B:18:0x0039=Splitter:B:18:0x0039, B:39:0x008f=Splitter:B:39:0x008f} */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x0102 }
            java.lang.Boolean r1 = f6066a     // Catch:{ all -> 0x00ff }
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x003c
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r4 != r1) goto L_0x0036
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x0036:
            a((java.lang.ClassLoader) r4)     // Catch:{ a -> 0x0039 }
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0054
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r3, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0033
        L_0x0054:
            int r4 = c(r8, r9, r10)     // Catch:{ a -> 0x0092 }
            java.lang.String r5 = f6069d     // Catch:{ a -> 0x0092 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r5 = f6069d     // Catch:{ a -> 0x0092 }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0092 }
            if (r5 == 0) goto L_0x0065
            goto L_0x008f
        L_0x0065:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0092 }
            r6 = 29
            if (r5 < r6) goto L_0x0077
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0092 }
            java.lang.String r6 = f6069d     // Catch:{ a -> 0x0092 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0092 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0092 }
            goto L_0x0082
        L_0x0077:
            com.google.android.gms.dynamite.i r5 = new com.google.android.gms.dynamite.i     // Catch:{ a -> 0x0092 }
            java.lang.String r6 = f6069d     // Catch:{ a -> 0x0092 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0092 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0092 }
        L_0x0082:
            a((java.lang.ClassLoader) r5)     // Catch:{ a -> 0x0092 }
            r1.set(r3, r5)     // Catch:{ a -> 0x0092 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0092 }
            f6066a = r5     // Catch:{ a -> 0x0092 }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r4
        L_0x008f:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r4
        L_0x0092:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r3, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0033
        L_0x009a:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            goto L_0x00ca
        L_0x009c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ff }
            int r3 = r3.length()     // Catch:{ all -> 0x00ff }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r4.<init>(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ff }
            r4.append(r1)     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ff }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ff }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ff }
        L_0x00ca:
            f6066a = r1     // Catch:{ all -> 0x00ff }
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            boolean r0 = r1.booleanValue()     // Catch:{ Throwable -> 0x0102 }
            if (r0 == 0) goto L_0x00fa
            int r8 = c(r8, r9, r10)     // Catch:{ a -> 0x00d8 }
            return r8
        L_0x00d8:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ Throwable -> 0x0102 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0102 }
            int r1 = r9.length()     // Catch:{ Throwable -> 0x0102 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r9 = r0.concat(r9)     // Catch:{ Throwable -> 0x0102 }
            goto L_0x00f5
        L_0x00f0:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x0102 }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x0102 }
        L_0x00f5:
            android.util.Log.w(r10, r9)     // Catch:{ Throwable -> 0x0102 }
            r8 = 0
            return r8
        L_0x00fa:
            int r8 = b((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ Throwable -> 0x0102 }
            return r8
        L_0x00ff:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            throw r9     // Catch:{ Throwable -> 0x0102 }
        L_0x0102:
            r9 = move-exception
            com.google.android.gms.common.util.g.a(r8, r9)
            goto L_0x0108
        L_0x0107:
            throw r9
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.b r11, java.lang.String r12) {
        /*
            java.lang.String r0 = ":"
            java.lang.String r1 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = f6071f
            java.lang.Object r2 = r2.get()
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.c) r2
            com.google.android.gms.dynamite.DynamiteModule$c r3 = new com.google.android.gms.dynamite.DynamiteModule$c
            r4 = 0
            r3.<init>(r4)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = f6071f
            r5.set(r3)
            com.google.android.gms.dynamite.DynamiteModule$b$b r5 = f6072g     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$a r5 = r11.a(r10, r12, r5)     // Catch:{ all -> 0x011f }
            int r6 = r5.f6074a     // Catch:{ all -> 0x011f }
            int r7 = r5.f6075b     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r8 = r8.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + 68
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r9 = r9.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>(r8)     // Catch:{ all -> 0x011f }
            java.lang.String r8 = "Considering local module "
            r9.append(r8)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r6)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = " and remote module "
            r9.append(r6)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r7)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x011f }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011f }
            int r0 = r5.f6076c     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
            int r0 = r5.f6076c     // Catch:{ all -> 0x011f }
            r6 = -1
            if (r0 != r6) goto L_0x0069
            int r0 = r5.f6074a     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0069:
            int r0 = r5.f6076c     // Catch:{ all -> 0x011f }
            r7 = 1
            if (r0 != r7) goto L_0x0072
            int r0 = r5.f6075b     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0072:
            int r0 = r5.f6076c     // Catch:{ all -> 0x011f }
            if (r0 != r6) goto L_0x0087
            com.google.android.gms.dynamite.DynamiteModule r10 = c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6077a
            if (r11 == 0) goto L_0x0081
        L_0x007e:
            r11.close()
        L_0x0081:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6071f
            r11.set(r2)
            return r10
        L_0x0087:
            int r0 = r5.f6076c     // Catch:{ all -> 0x011f }
            if (r0 != r7) goto L_0x00da
            int r0 = r5.f6075b     // Catch:{ a -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule r10 = a((android.content.Context) r10, (java.lang.String) r12, (int) r0)     // Catch:{ a -> 0x0096 }
            android.database.Cursor r11 = r3.f6077a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x0096:
            r0 = move-exception
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011f }
            int r9 = r8.length()     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x011f }
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x011f }
            r8.<init>(r7)     // Catch:{ all -> 0x011f }
            r7 = r8
        L_0x00b2:
            android.util.Log.w(r1, r7)     // Catch:{ all -> 0x011f }
            int r1 = r5.f6074a     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule$d r1 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x011f }
            int r5 = r5.f6074a     // Catch:{ all -> 0x011f }
            r7 = 0
            r1.<init>(r5, r7)     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$a r11 = r11.a(r10, r12, r1)     // Catch:{ all -> 0x011f }
            int r11 = r11.f6076c     // Catch:{ all -> 0x011f }
            if (r11 != r6) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule r10 = c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6077a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x00d2:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r0, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00da:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6076c     // Catch:{ all -> 0x011f }
            r12 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r0.<init>(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r0.append(r12)     // Catch:{ all -> 0x011f }
            r0.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.b) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00f5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6074a     // Catch:{ all -> 0x011f }
            int r12 = r5.f6075b     // Catch:{ all -> 0x011f }
            r0 = 91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r1.<init>(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x011f }
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = " and remote version is "
            r1.append(r11)     // Catch:{ all -> 0x011f }
            r1.append(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "."
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.b) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x011f:
            r10 = move-exception
            android.database.Cursor r11 = r3.f6077a
            if (r11 == 0) goto L_0x0127
            r11.close()
        L_0x0127:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6071f
            r11.set(r2)
            goto L_0x012e
        L_0x012d:
            throw r10
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        c.b.b.b.c.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f6066a;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (b) null);
            } else if (bool.booleanValue()) {
                return b(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                k a2 = a(context);
                if (a2 != null) {
                    if (a2.b() >= 2) {
                        aVar = a2.b(c.b.b.b.c.b.a(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a2.a(c.b.b.b.c.b.a(context), str, i2);
                    }
                    if (c.b.b.b.c.b.Q(aVar) != null) {
                        return new DynamiteModule((Context) c.b.b.b.c.b.Q(aVar));
                    }
                    throw new a("Failed to load remote module.", (b) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (b) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, (b) null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            g.a(context, th);
            throw new a("Failed to load remote module.", th, (b) null);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.k a(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.k r1 = f6067b     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.k r5 = f6067b     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x000b:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch:{ Exception -> 0x0041 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0041 }
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0027
            r5 = r1
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch:{ Exception -> 0x0041 }
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.k     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x0035
            r5 = r2
            com.google.android.gms.dynamite.k r5 = (com.google.android.gms.dynamite.k) r5     // Catch:{ Exception -> 0x0041 }
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.dynamite.j r2 = new com.google.android.gms.dynamite.j     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0041 }
            r5 = r2
        L_0x003b:
            if (r5 == 0) goto L_0x0061
            f6067b = r5     // Catch:{ Exception -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0063 }
            int r4 = r5.length()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0059
            java.lang.String r5 = r3.concat(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005e
        L_0x0059:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r5.<init>(r3)     // Catch:{ all -> 0x0063 }
        L_0x005e:
            android.util.Log.e(r2, r5)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r1
        L_0x0063:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context):com.google.android.gms.dynamite.k");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.ClassLoader r3) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            if (r3 != 0) goto L_0x001a
            r3 = r0
            goto L_0x002e
        L_0x001a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.m     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
            com.google.android.gms.dynamite.m r3 = (com.google.android.gms.dynamite.m) r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            goto L_0x002e
        L_0x0028:
            com.google.android.gms.dynamite.l r1 = new com.google.android.gms.dynamite.l     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r1.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            r3 = r1
        L_0x002e:
            f6068c = r3     // Catch:{ ClassNotFoundException -> 0x0039, IllegalAccessException -> 0x0037, InstantiationException -> 0x0035, InvocationTargetException -> 0x0033, NoSuchMethodException -> 0x0031 }
            return
        L_0x0031:
            r3 = move-exception
            goto L_0x003a
        L_0x0033:
            r3 = move-exception
            goto L_0x003a
        L_0x0035:
            r3 = move-exception
            goto L_0x003a
        L_0x0037:
            r3 = move-exception
            goto L_0x003a
        L_0x0039:
            r3 = move-exception
        L_0x003a:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(java.lang.ClassLoader):void");
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static int b(Context context, String str, boolean z) {
        k a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.b() >= 2) {
                return a2.a(c.b.b.b.c.b.a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b(c.b.b.b.c.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        m mVar;
        c.b.b.b.c.a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            mVar = f6068c;
        }
        if (mVar != null) {
            c cVar = f6071f.get();
            if (cVar == null || cVar.f6077a == null) {
                throw new a("No result cursor", (b) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f6077a;
            c.b.b.b.c.b.a(null);
            if (b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = mVar.b(c.b.b.b.c.b.a(applicationContext), str, i2, c.b.b.b.c.b.a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = mVar.a(c.b.b.b.c.b.a(applicationContext), str, i2, c.b.b.b.c.b.a(cursor));
            }
            Context context2 = (Context) c.b.b.b.c.b.Q(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (b) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (b) null);
    }

    private static Boolean b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f6070e >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007a }
            f6069d = r1     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007a }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007a }
            f6070e = r1     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f6071f     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r1 = r10.f6077a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007d
            r10.f6077a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.b) r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public final Context a() {
        return this.o;
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.o.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, (b) null);
        }
    }
}
