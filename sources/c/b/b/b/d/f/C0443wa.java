package c.b.b.b.d.f;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.b.b.b.d.f.wa  reason: case insensitive filesystem */
public abstract class C0443wa<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4612a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static Context f4613b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f4614c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Ka<Ja<C0415sa>> f4615d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f4616e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private final Ca f4617f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4618g;

    /* renamed from: h  reason: collision with root package name */
    private final T f4619h;
    private volatile int i;
    private volatile T j;

    private C0443wa(Ca ca, String str, T t) {
        this.i = -1;
        if (ca.f4108b != null) {
            this.f4617f = ca;
            this.f4618g = str;
            this.f4619h = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C0443wa(Ca ca, String str, Object obj, C0457ya yaVar) {
        this(ca, str, obj);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f4618g;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f4618g);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static void a() {
        f4616e.incrementAndGet();
    }

    public static void a(Context context) {
        synchronized (f4612a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f4613b != context) {
                C0340ha.c();
                Fa.a();
                C0408ra.a();
                f4616e.incrementAndGet();
                f4613b = context;
                f4615d = Oa.a(C0463za.f4651a);
            }
        }
    }

    /* access modifiers changed from: private */
    public static C0443wa<Double> b(Ca ca, String str, double d2) {
        return new Aa(ca, str, Double.valueOf(d2));
    }

    /* access modifiers changed from: private */
    public static C0443wa<Long> b(Ca ca, String str, long j2) {
        return new C0457ya(ca, str, Long.valueOf(j2));
    }

    /* access modifiers changed from: private */
    public static C0443wa<String> b(Ca ca, String str, String str2) {
        return new Da(ca, str, str2);
    }

    /* access modifiers changed from: private */
    public static C0443wa<Boolean> b(Ca ca, String str, boolean z) {
        return new Ba(ca, str, Boolean.valueOf(z));
    }

    static final /* synthetic */ Ja d() {
        new C0436va();
        return C0436va.a(f4613b);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(Object obj);

    public final String b() {
        return a(this.f4617f.f4110d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T c() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f4616e
            int r0 = r0.get()
            int r1 = r6.i
            if (r1 >= r0) goto L_0x00f6
            monitor-enter(r6)
            int r1 = r6.i     // Catch:{ all -> 0x00f3 }
            if (r1 >= r0) goto L_0x00f1
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x00e9
            c.b.b.b.d.f.Ka<c.b.b.b.d.f.Ja<c.b.b.b.d.f.sa>> r1 = f4615d     // Catch:{ all -> 0x00f3 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ja r1 = (c.b.b.b.d.f.Ja) r1     // Catch:{ all -> 0x00f3 }
            boolean r2 = r1.a()     // Catch:{ all -> 0x00f3 }
            r3 = 0
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.sa r1 = (c.b.b.b.d.f.C0415sa) r1     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ca r2 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            android.net.Uri r2 = r2.f4108b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ca r4 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r4.f4110d     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = r6.f4618g     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x00f3 }
            goto L_0x00e4
        L_0x003e:
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.ra r1 = c.b.b.b.d.f.C0408ra.a((android.content.Context) r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.c(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x005c
            java.util.regex.Pattern r2 = c.b.b.b.d.f.C0333ga.f4440c     // Catch:{ all -> 0x00f3 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00f3 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 != 0) goto L_0x0099
            c.b.b.b.d.f.Ca r1 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            android.net.Uri r1 = r1.f4108b     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x0082
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ca r2 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            android.net.Uri r2 = r2.f4108b     // Catch:{ all -> 0x00f3 }
            boolean r1 = c.b.b.b.d.f.C0429ua.a(r1, r2)     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x0080
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ca r2 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            android.net.Uri r2 = r2.f4108b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.ha r1 = c.b.b.b.d.f.C0340ha.a(r1, r2)     // Catch:{ all -> 0x00f3 }
            goto L_0x0088
        L_0x0080:
            r1 = r3
            goto L_0x0088
        L_0x0082:
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Fa r1 = c.b.b.b.d.f.Fa.a((android.content.Context) r1, (java.lang.String) r3)     // Catch:{ all -> 0x00f3 }
        L_0x0088:
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = r6.b()     // Catch:{ all -> 0x00f3 }
            java.lang.Object r1 = r1.c(r2)     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x00f3 }
            goto L_0x00c3
        L_0x0099:
            java.lang.String r1 = "PhenotypeFlag"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r2 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.b()     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00f3 }
            int r5 = r4.length()     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r2 = r2.concat(r4)     // Catch:{ all -> 0x00f3 }
            goto L_0x00bf
        L_0x00b9:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f3 }
            r4.<init>(r2)     // Catch:{ all -> 0x00f3 }
            r2 = r4
        L_0x00bf:
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x00f3 }
        L_0x00c2:
            r1 = r3
        L_0x00c3:
            if (r1 == 0) goto L_0x00c6
            goto L_0x00e4
        L_0x00c6:
            android.content.Context r1 = f4613b     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.ra r1 = c.b.b.b.d.f.C0408ra.a((android.content.Context) r1)     // Catch:{ all -> 0x00f3 }
            c.b.b.b.d.f.Ca r2 = r6.f4617f     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = r2.f4109c     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = r6.a((java.lang.String) r2)     // Catch:{ all -> 0x00f3 }
            java.lang.Object r1 = r1.c(r2)     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x00de
            java.lang.Object r3 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x00f3 }
        L_0x00de:
            r1 = r3
            if (r1 == 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            T r1 = r6.f4619h     // Catch:{ all -> 0x00f3 }
        L_0x00e4:
            r6.j = r1     // Catch:{ all -> 0x00f3 }
            r6.i = r0     // Catch:{ all -> 0x00f3 }
            goto L_0x00f1
        L_0x00e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00f3 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f1:
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            goto L_0x00f6
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r0
        L_0x00f6:
            T r0 = r6.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0443wa.c():java.lang.Object");
    }
}
