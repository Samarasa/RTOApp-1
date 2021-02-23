package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads._k  reason: case insensitive filesystem */
public final class C1252_k {

    /* renamed from: a  reason: collision with root package name */
    public static final PY f9699a = a((Executor) d.a() ? C2850wW.a().a(a("Default"), BW.f6298b) : new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));

    /* renamed from: b  reason: collision with root package name */
    public static final PY f9700b;

    /* renamed from: c  reason: collision with root package name */
    public static final PY f9701c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f9702d = new C1226Zk(3, a("Schedule"));

    /* renamed from: e  reason: collision with root package name */
    public static final PY f9703e = a((Executor) new C1317al());

    /* renamed from: f  reason: collision with root package name */
    public static final PY f9704f = a(OY.a());

    /* JADX WARNING: type inference failed for: r0v16, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.android.gms.common.util.d.a()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.tW r0 = com.google.android.gms.internal.ads.C2850wW.a()
            java.util.concurrent.ThreadFactory r1 = a((java.lang.String) r1)
            int r2 = com.google.android.gms.internal.ads.BW.f6298b
            java.util.concurrent.ExecutorService r0 = r0.a(r1, r2)
            goto L_0x002e
        L_0x0017:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r2 = 2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            java.util.concurrent.ThreadFactory r8 = a((java.lang.String) r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x002e:
            com.google.android.gms.internal.ads.PY r0 = a((java.util.concurrent.Executor) r0)
            f9699a = r0
            boolean r0 = com.google.android.gms.common.util.d.a()
            r1 = 1
            java.lang.String r2 = "Loader"
            if (r0 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.tW r0 = com.google.android.gms.internal.ads.C2850wW.a()
            r3 = 5
            java.util.concurrent.ThreadFactory r2 = a((java.lang.String) r2)
            int r4 = com.google.android.gms.internal.ads.BW.f6297a
            java.util.concurrent.ExecutorService r0 = r0.a(r3, r2, r4)
            goto L_0x0065
        L_0x004d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 5
            r4 = 5
            r5 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            java.util.concurrent.ThreadFactory r9 = a((java.lang.String) r2)
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0.allowCoreThreadTimeOut(r1)
        L_0x0065:
            com.google.android.gms.internal.ads.PY r0 = a((java.util.concurrent.Executor) r0)
            f9700b = r0
            boolean r0 = com.google.android.gms.common.util.d.a()
            java.lang.String r2 = "Activeview"
            if (r0 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.tW r0 = com.google.android.gms.internal.ads.C2850wW.a()
            java.util.concurrent.ThreadFactory r1 = a((java.lang.String) r2)
            int r2 = com.google.android.gms.internal.ads.BW.f6297a
            java.util.concurrent.ExecutorService r0 = r0.b(r1, r2)
            goto L_0x009a
        L_0x0082:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 1
            r4 = 1
            r5 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            java.util.concurrent.ThreadFactory r9 = a((java.lang.String) r2)
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0.allowCoreThreadTimeOut(r1)
        L_0x009a:
            com.google.android.gms.internal.ads.PY r0 = a((java.util.concurrent.Executor) r0)
            f9701c = r0
            com.google.android.gms.internal.ads.Zk r0 = new com.google.android.gms.internal.ads.Zk
            r1 = 3
            java.lang.String r2 = "Schedule"
            java.util.concurrent.ThreadFactory r2 = a((java.lang.String) r2)
            r0.<init>(r1, r2)
            f9702d = r0
            com.google.android.gms.internal.ads.al r0 = new com.google.android.gms.internal.ads.al
            r0.<init>()
            com.google.android.gms.internal.ads.PY r0 = a((java.util.concurrent.Executor) r0)
            f9703e = r0
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.OY.a()
            com.google.android.gms.internal.ads.PY r0 = a((java.util.concurrent.Executor) r0)
            f9704f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1252_k.<clinit>():void");
    }

    private static PY a(Executor executor) {
        return new C1530dl(executor, (C1226Zk) null);
    }

    private static ThreadFactory a(String str) {
        return new C1388bl(str);
    }
}
