package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import c.b.b.b.b.j;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Rj  reason: case insensitive filesystem */
public final class C1017Rj {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<ExecutorService> f8508a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f8509b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private String f8510c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f8511d = null;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8512e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f8513f = new AtomicInteger(-1);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<Object> f8514g = new AtomicReference<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<Object> f8515h = new AtomicReference<>((Object) null);
    private final ConcurrentMap<String, Method> i = new ConcurrentHashMap(9);
    private final AtomicReference<C0580Ao> j = new AtomicReference<>((Object) null);
    private final BlockingQueue<FutureTask<?>> k = new ArrayBlockingQueue(20);
    private final Object l = new Object();

    private static Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            C1018Rk.b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object a(String str, Context context) {
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8514g, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(this.f8514g.get(), new Object[0]);
        } catch (Exception unused) {
            a(str, true);
            return null;
        }
    }

    private final <T> T a(String str, T t, C1598ek<T> ekVar) {
        synchronized (this.j) {
            if (this.j.get() != null) {
                try {
                    T a2 = ekVar.a(this.j.get());
                    return a2;
                } catch (Exception unused) {
                    a(str, false);
                    return t;
                }
            }
        }
    }

    private final void a(Context context, String str, String str2) {
        if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8514g, true)) {
            Method h2 = h(context, str2);
            try {
                h2.invoke(this.f8514g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                fa.f(sb.toString());
            } catch (Exception unused) {
                a(str2, false);
            }
        }
    }

    private final void a(Context context, String str, String str2, Bundle bundle) {
        if (g(context)) {
            Bundle a2 = a(str2, str);
            if (bundle != null) {
                a2.putAll(bundle);
            }
            if (h(context)) {
                a("logEventInternal", (C1811hk) new C1043Sj(str, a2));
            } else if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8514g, true)) {
                Method i2 = i(context);
                try {
                    i2.invoke(this.f8514g.get(), new Object[]{"am", str, a2});
                } catch (Exception unused) {
                    a("logEventInternal", true);
                }
            }
        }
    }

    private final void a(String str, C1811hk hkVar) {
        synchronized (this.j) {
            FutureTask futureTask = new FutureTask(new C1147Wj(this, hkVar, str), (Object) null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    private final void a(String str, boolean z) {
        if (!this.f8512e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C1018Rk.d(sb.toString());
            if (z) {
                C1018Rk.d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f8512e.set(true);
            }
        }
    }

    private final boolean a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                a("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService b() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f8508a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0066
            boolean r0 = com.google.android.gms.common.util.d.a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.tW r0 = com.google.android.gms.internal.ads.C2850wW.a()
            com.google.android.gms.internal.ads.p<java.lang.Integer> r1 = com.google.android.gms.internal.ads.F.aa
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.concurrent.ThreadFactory r2 = r9.c()
            int r3 = com.google.android.gms.internal.ads.BW.f6298b
            java.util.concurrent.ExecutorService r0 = r0.a(r1, r2, r3)
            goto L_0x0060
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.p<java.lang.Integer> r1 = com.google.android.gms.internal.ads.F.aa
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            com.google.android.gms.internal.ads.p<java.lang.Integer> r1 = com.google.android.gms.internal.ads.F.aa
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r1 = r3.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            r4 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            java.util.concurrent.ThreadFactory r8 = r9.c()
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x0060:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r1 = r9.f8508a
            r2 = 0
            r1.compareAndSet(r2, r0)
        L_0x0066:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f8508a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1017Rj.b():java.util.concurrent.ExecutorService");
    }

    private final ThreadFactory c() {
        return new C1669fk(this);
    }

    private final Method h(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a(str, false);
            return null;
        }
    }

    private static boolean h(Context context) {
        if (!((Boolean) Qqa.e().a(F.ba)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) Qqa.e().a(F.ca)).intValue()) {
            return false;
        }
        if (((Boolean) Qqa.e().a(F.da)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Method i(Context context) {
        Method method = (Method) this.i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a("logEventInternal", true);
            return null;
        }
    }

    private final Method i(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a(str, false);
            return null;
        }
    }

    private final Method j(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a(str, false);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return (String) a("getAppInstanceId", (Object) null, C1121Vj.f9068a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.g(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = h(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.ek r7 = com.google.android.gms.internal.ads.C1173Xj.f9273a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.a((java.lang.String) r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f8514g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.a((android.content.Context) r7, (java.lang.String) r4, (java.util.concurrent.atomic.AtomicReference<java.lang.Object>) r1, (boolean) r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.i(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f8514g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.i(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f8514g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.a((java.lang.String) r0, (boolean) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1017Rj.a(android.content.Context):java.lang.String");
    }

    public final void a(Context context, C1551e eVar) {
        if (((Boolean) Qqa.e().a(F.ga)).booleanValue() && g(context) && h(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void a(Context context, C2249nqa nqa) {
        if (((Boolean) Qqa.e().a(F.ga)).booleanValue() && g(context) && h(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void a(Context context, String str) {
        if (g(context)) {
            if (h(context)) {
                a("beginAdUnitExposure", (C1811hk) new C0991Qj(str));
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void a(Context context, String str, String str2, String str3, int i2) {
        if (g(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i2);
            a(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            fa.f(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1811hk hkVar, String str) {
        if (this.j.get() != null) {
            try {
                hkVar.a(this.j.get());
            } catch (Exception unused) {
                a(str, false);
            }
        }
    }

    public final String b(Context context) {
        if (!g(context)) {
            return null;
        }
        synchronized (this.f8509b) {
            if (this.f8510c != null) {
                String str = this.f8510c;
                return str;
            }
            this.f8510c = h(context) ? (String) a("getGmpAppId", this.f8510c, C1225Zj.f9582a) : (String) a("getGmpAppId", context);
            String str2 = this.f8510c;
            return str2;
        }
    }

    public final void b(Context context, String str) {
        if (g(context)) {
            if (h(context)) {
                a("endAdUnitExposure", (C1811hk) new C1199Yj(str));
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String c(Context context) {
        if (!g(context)) {
            return null;
        }
        long longValue = ((Long) Qqa.e().a(F.Z)).longValue();
        if (h(context)) {
            if (longValue >= 0) {
                return (String) b().submit(new C1315ak(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) a("getAppInstanceId", (Object) null, C1386bk.f9952a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        } else {
            try {
                return (String) b().submit(new C1528dk(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    @Deprecated
    public final void c(Context context, String str) {
        if (!g(context) || !(context instanceof Activity)) {
            return;
        }
        if (h(context)) {
            a("setScreenName", (C1811hk) new C1251_j(context, str));
        } else if (a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f8515h, false)) {
            Method j2 = j(context, "setCurrentScreen");
            try {
                j2.invoke(this.f8515h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused) {
                a("setCurrentScreen", false);
            }
        }
    }

    public final String d(Context context) {
        if (!g(context)) {
            return null;
        }
        if (h(context)) {
            Long l2 = (Long) a("getAdEventId", (Object) null, C1457ck.f10074a);
            if (l2 != null) {
                return Long.toString(l2.longValue());
            }
            return null;
        }
        Object a2 = a("generateEventId", context);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    public final void d(Context context, String str) {
        a(context, "_ac", str, (Bundle) null);
    }

    public final String e(Context context) {
        if (!g(context)) {
            return null;
        }
        synchronized (this.f8509b) {
            if (this.f8511d != null) {
                String str = this.f8511d;
                return str;
            }
            this.f8511d = h(context) ? (String) a("getAppIdOrigin", this.f8511d, C1069Tj.f8818a) : "fa";
            String str2 = this.f8511d;
            return str2;
        }
    }

    public final void e(Context context, String str) {
        a(context, "_ai", str, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String f(Context context) {
        return (String) a("getAppInstanceId", context);
    }

    public final void f(Context context, String str) {
        a(context, "_aq", str, (Bundle) null);
    }

    public final void g(Context context, String str) {
        a(context, "_aa", str, (Bundle) null);
    }

    public final boolean g(Context context) {
        if (((Boolean) Qqa.e().a(F.U)).booleanValue() && !this.f8512e.get()) {
            if (((Boolean) Qqa.e().a(F.ea)).booleanValue()) {
                return true;
            }
            if (this.f8513f.get() == -1) {
                Qqa.a();
                if (!C0758Hk.c(context, j.f3888a)) {
                    Qqa.a();
                    if (C0758Hk.c(context)) {
                        C1018Rk.d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f8513f.set(0);
                    }
                }
                this.f8513f.set(1);
            }
            if (this.f8513f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
