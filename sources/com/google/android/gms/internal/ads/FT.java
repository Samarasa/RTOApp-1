package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class FT implements HW {

    /* renamed from: a  reason: collision with root package name */
    private static FT f6850a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6851b;

    /* renamed from: c  reason: collision with root package name */
    private final C1716gW f6852c;

    /* renamed from: d  reason: collision with root package name */
    private final C2425qW f6853d;

    /* renamed from: e  reason: collision with root package name */
    private final C2495rW f6854e;

    /* renamed from: f  reason: collision with root package name */
    private final C2444qha f6855f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C2353pV f6856g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f6857h;
    private final C1949jia i;
    private final C2212nW j;
    private volatile long k = 0;
    /* access modifiers changed from: private */
    public final Object l = new Object();
    /* access modifiers changed from: private */
    public volatile boolean m;

    private FT(Context context, C2353pV pVVar, C1716gW gWVar, C2425qW qWVar, C2495rW rWVar, C2444qha qha, Executor executor, C2211nV nVVar, C1949jia jia) {
        this.f6851b = context;
        this.f6856g = pVVar;
        this.f6852c = gWVar;
        this.f6853d = qWVar;
        this.f6854e = rWVar;
        this.f6855f = qha;
        this.f6857h = executor;
        this.i = jia;
        this.j = new GU(this, nVVar);
    }

    static FT a(Context context, C2353pV pVVar, C2424qV qVVar) {
        return a(context, pVVar, qVVar, (Executor) Executors.newCachedThreadPool());
    }

    private static FT a(Context context, C2353pV pVVar, C2424qV qVVar, Executor executor) {
        CV a2 = CV.a(context, executor, pVVar, qVVar);
        C2656tha tha = new C2656tha(context);
        C2444qha qha = new C2444qha(qVVar, a2, new Dha(context, tha), tha);
        C1949jia a3 = new TV(context, pVVar).a();
        C2211nV nVVar = new C2211nV();
        return new FT(context, pVVar, new C1716gW(context, a3), new C2425qW(context, a3, new C1715gV(pVVar)), new C2495rW(context, qha, pVVar, nVVar), qha, executor, nVVar, a3);
    }

    public static synchronized FT a(String str, Context context, boolean z) {
        FT ft;
        synchronized (FT.class) {
            if (f6850a == null) {
                C2636tV c2 = C2424qV.c();
                c2.a(str);
                c2.a(z);
                C2424qV a2 = c2.a();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                FT a3 = a(context, C2353pV.a(context, (Executor) newCachedThreadPool), a2, (Executor) newCachedThreadPool);
                f6850a = a3;
                a3.a();
                f6850a.d();
            }
            ft = f6850a;
        }
        return ft;
    }

    private final C1858iW a(int i2) {
        if (!TV.a(this.i)) {
            return null;
        }
        return ((Boolean) Qqa.e().a(F.Ab)).booleanValue() ? this.f6853d.a(i2) : this.f6852c.a(i2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[Catch:{ Iea -> 0x011a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7 A[Catch:{ Iea -> 0x011a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = com.google.android.gms.internal.ads.C2354pW.f11723a
            com.google.android.gms.internal.ads.iW r2 = r11.a((int) r2)
            r3 = 0
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.pia r3 = r2.b()
            java.lang.String r3 = r3.o()
            com.google.android.gms.internal.ads.pia r2 = r2.b()
            java.lang.String r2 = r2.p()
            r8 = r2
            r7 = r3
            goto L_0x0022
        L_0x0020:
            r7 = r3
            r8 = r7
        L_0x0022:
            android.content.Context r4 = r11.f6851b     // Catch:{ Iea -> 0x011a }
            r5 = 1
            com.google.android.gms.internal.ads.jia r6 = r11.i     // Catch:{ Iea -> 0x011a }
            java.lang.String r9 = "1"
            com.google.android.gms.internal.ads.pV r10 = r11.f6856g     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.lW r2 = com.google.android.gms.internal.ads.C2991yV.a(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Iea -> 0x011a }
            byte[] r3 = r2.f11178b     // Catch:{ Iea -> 0x011a }
            if (r3 == 0) goto L_0x010d
            byte[] r3 = r2.f11178b     // Catch:{ Iea -> 0x011a }
            int r3 = r3.length     // Catch:{ Iea -> 0x011a }
            if (r3 != 0) goto L_0x003a
            goto L_0x010d
        L_0x003a:
            byte[] r3 = r2.f11178b     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.Lda r3 = com.google.android.gms.internal.ads.Lda.a((byte[]) r3)     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.kea r4 = com.google.android.gms.internal.ads.C2012kea.b()     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.lia r3 = com.google.android.gms.internal.ads.C2091lia.a(r3, r4)     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.pia r4 = r3.o()     // Catch:{ Iea -> 0x011a }
            java.lang.String r4 = r4.o()     // Catch:{ Iea -> 0x011a }
            boolean r4 = r4.isEmpty()     // Catch:{ Iea -> 0x011a }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x00a7
            com.google.android.gms.internal.ads.pia r4 = r3.o()     // Catch:{ Iea -> 0x011a }
            java.lang.String r4 = r4.p()     // Catch:{ Iea -> 0x011a }
            boolean r4 = r4.isEmpty()     // Catch:{ Iea -> 0x011a }
            if (r4 != 0) goto L_0x00a7
            com.google.android.gms.internal.ads.Lda r4 = r3.q()     // Catch:{ Iea -> 0x011a }
            byte[] r4 = r4.c()     // Catch:{ Iea -> 0x011a }
            int r4 = r4.length     // Catch:{ Iea -> 0x011a }
            if (r4 != 0) goto L_0x0072
            goto L_0x00a7
        L_0x0072:
            int r4 = com.google.android.gms.internal.ads.C2354pW.f11723a     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.iW r4 = r11.a((int) r4)     // Catch:{ Iea -> 0x011a }
            if (r4 != 0) goto L_0x007b
            goto L_0x00a8
        L_0x007b:
            com.google.android.gms.internal.ads.pia r4 = r4.b()     // Catch:{ Iea -> 0x011a }
            if (r4 != 0) goto L_0x0082
            goto L_0x00a8
        L_0x0082:
            com.google.android.gms.internal.ads.pia r7 = r3.o()     // Catch:{ Iea -> 0x011a }
            java.lang.String r7 = r7.o()     // Catch:{ Iea -> 0x011a }
            java.lang.String r8 = r4.o()     // Catch:{ Iea -> 0x011a }
            boolean r7 = r7.equals(r8)     // Catch:{ Iea -> 0x011a }
            if (r7 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.pia r7 = r3.o()     // Catch:{ Iea -> 0x011a }
            java.lang.String r7 = r7.p()     // Catch:{ Iea -> 0x011a }
            java.lang.String r4 = r4.p()     // Catch:{ Iea -> 0x011a }
            boolean r4 = r7.equals(r4)     // Catch:{ Iea -> 0x011a }
            if (r4 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 != 0) goto L_0x00b7
            com.google.android.gms.internal.ads.pV r2 = r11.f6856g     // Catch:{ Iea -> 0x011a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Iea -> 0x011a }
            long r4 = r4 - r0
            r2.a((int) r3, (long) r4)     // Catch:{ Iea -> 0x011a }
            return
        L_0x00b7:
            com.google.android.gms.internal.ads.nW r4 = r11.j     // Catch:{ Iea -> 0x011a }
            int r2 = r2.f11179c     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.F.Ab     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.B r7 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Iea -> 0x011a }
            java.lang.Object r5 = r7.a(r5)     // Catch:{ Iea -> 0x011a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Iea -> 0x011a }
            boolean r5 = r5.booleanValue()     // Catch:{ Iea -> 0x011a }
            if (r5 == 0) goto L_0x00e1
            r5 = 3
            if (r2 != r5) goto L_0x00d7
            com.google.android.gms.internal.ads.qW r2 = r11.f6853d     // Catch:{ Iea -> 0x011a }
            boolean r6 = r2.a((com.google.android.gms.internal.ads.C2091lia) r3)     // Catch:{ Iea -> 0x011a }
            goto L_0x00e7
        L_0x00d7:
            r5 = 4
            if (r2 != r5) goto L_0x00e7
            com.google.android.gms.internal.ads.qW r2 = r11.f6853d     // Catch:{ Iea -> 0x011a }
            boolean r6 = r2.a((com.google.android.gms.internal.ads.C2091lia) r3, (com.google.android.gms.internal.ads.C2212nW) r4)     // Catch:{ Iea -> 0x011a }
            goto L_0x00e7
        L_0x00e1:
            com.google.android.gms.internal.ads.gW r2 = r11.f6852c     // Catch:{ Iea -> 0x011a }
            boolean r6 = r2.a(r3, r4)     // Catch:{ Iea -> 0x011a }
        L_0x00e7:
            if (r6 != 0) goto L_0x00f6
            com.google.android.gms.internal.ads.pV r2 = r11.f6856g     // Catch:{ Iea -> 0x011a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Iea -> 0x011a }
            long r4 = r4 - r0
            r2.a((int) r3, (long) r4)     // Catch:{ Iea -> 0x011a }
            return
        L_0x00f6:
            int r2 = com.google.android.gms.internal.ads.C2354pW.f11723a     // Catch:{ Iea -> 0x011a }
            com.google.android.gms.internal.ads.iW r2 = r11.a((int) r2)     // Catch:{ Iea -> 0x011a }
            if (r2 == 0) goto L_0x010c
            com.google.android.gms.internal.ads.rW r3 = r11.f6854e     // Catch:{ Iea -> 0x011a }
            r3.a(r2)     // Catch:{ Iea -> 0x011a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Iea -> 0x011a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r11.k = r2     // Catch:{ Iea -> 0x011a }
        L_0x010c:
            return
        L_0x010d:
            com.google.android.gms.internal.ads.pV r2 = r11.f6856g     // Catch:{ Iea -> 0x011a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Iea -> 0x011a }
            long r4 = r4 - r0
            r2.a((int) r3, (long) r4)     // Catch:{ Iea -> 0x011a }
            return
        L_0x011a:
            r2 = move-exception
            com.google.android.gms.internal.ads.pV r3 = r11.f6856g
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r3.a((int) r4, (long) r5, (java.lang.Exception) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FT.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r6 = this;
            boolean r0 = r6.m
            if (r0 != 0) goto L_0x0033
            java.lang.Object r0 = r6.l
            monitor-enter(r0)
            boolean r1 = r6.m     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.k     // Catch:{ all -> 0x0030 }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.rW r1 = r6.f6854e     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.iW r1 = r1.b()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.a(r3)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r6.b()     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FT.d():void");
    }

    public final String a(Context context) {
        d();
        C2565sV a2 = this.f6854e.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, (String) null);
        this.f6856g.a(5001, System.currentTimeMillis() - currentTimeMillis, a3, (Map<String, String>) null);
        return a3;
    }

    public final String a(Context context, View view, Activity activity) {
        d();
        C2565sV a2 = this.f6854e.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, (String) null, view, activity);
        this.f6856g.a(5002, System.currentTimeMillis() - currentTimeMillis, a3, (Map<String, String>) null);
        return a3;
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        d();
        C2565sV a2 = this.f6854e.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, (String) null, str, view, activity);
        this.f6856g.a(5000, System.currentTimeMillis() - currentTimeMillis, a3, (Map<String, String>) null);
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        C1858iW a2 = a(C2354pW.f11723a);
        if (a2 == null || a2.a()) {
            this.f6856g.a(4013, System.currentTimeMillis() - currentTimeMillis);
        } else {
            this.f6854e.a(a2);
        }
    }

    public final void a(int i2, int i3, int i4) {
    }

    public final void a(MotionEvent motionEvent) {
        C2565sV a2 = this.f6854e.a();
        if (a2 != null) {
            try {
                a2.a((String) null, motionEvent);
            } catch (C2566sW e2) {
                this.f6856g.a(e2.a(), -1, (Exception) e2);
            }
        }
    }

    public final void a(View view) {
        this.f6855f.a(view);
    }

    public final void b() {
        if (TV.a(this.i)) {
            this.f6857h.execute(new C1787hW(this));
        }
    }
}
