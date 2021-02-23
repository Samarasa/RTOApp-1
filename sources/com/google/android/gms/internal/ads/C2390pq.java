package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.pq  reason: case insensitive filesystem */
public final class C2390pq implements C2608su, C0768Hu, C0872Lu, C1900iv, C1540dqa {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f11787a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11788b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f11789c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final OS f11790d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2988yS f11791e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C1503dV f11792f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final _S f11793g;

    /* renamed from: h  reason: collision with root package name */
    private final Qba f11794h;
    private final C1862ia i;
    private final C2216na j;
    private final View k;
    private boolean l;
    private boolean m;

    public C2390pq(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, OS os, C2988yS ySVar, C1503dV dVVar, _S _s, View view, Qba qba, C1862ia iaVar, C2216na naVar) {
        this.f11787a = context;
        this.f11788b = executor;
        this.f11789c = scheduledExecutorService;
        this.f11790d = os;
        this.f11791e = ySVar;
        this.f11792f = dVVar;
        this.f11793g = _s;
        this.f11794h = qba;
        this.k = view;
        this.i = iaVar;
        this.j = naVar;
    }

    public final synchronized void H() {
        _S _s;
        List<String> a2;
        if (this.l) {
            ArrayList arrayList = new ArrayList(this.f11791e.f12917d);
            arrayList.addAll(this.f11791e.f12919f);
            _s = this.f11793g;
            a2 = this.f11792f.a(this.f11790d, this.f11791e, true, (String) null, (String) null, arrayList);
        } else {
            this.f11793g.a(this.f11792f.a(this.f11790d, this.f11791e, this.f11791e.m));
            _s = this.f11793g;
            a2 = this.f11792f.a(this.f11790d, this.f11791e, this.f11791e.f12919f);
        }
        _s.a(a2);
        this.l = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void I() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.m     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x00a2
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Xb     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a4 }
            r1 = 0
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.Qba r0 = r9.f11794h     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.HW r0 = r0.a()     // Catch:{ all -> 0x00a4 }
            android.content.Context r2 = r9.f11787a     // Catch:{ all -> 0x00a4 }
            android.view.View r3 = r9.k     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r0.a((android.content.Context) r2, (android.view.View) r3, (android.app.Activity) r1)     // Catch:{ all -> 0x00a4 }
        L_0x0026:
            r5 = r1
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ha     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a4 }
            r8 = 1
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.OS r0 = r9.f11790d     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.MS r0 = r0.f8088b     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.DS r0 = r0.f7844b     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.f6552g     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 != 0) goto L_0x0089
            com.google.android.gms.internal.ads.pa<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C0566Aa.f6128b     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0058
            goto L_0x0089
        L_0x0058:
            com.google.android.gms.internal.ads.na r0 = r9.j     // Catch:{ all -> 0x00a4 }
            android.content.Context r1 = r9.f11787a     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.LY r0 = r0.a(r1)     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.uY r0 = com.google.android.gms.internal.ads.C2710uY.c(r0)     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.p<java.lang.Long> r1 = com.google.android.gms.internal.ads.F.Aa     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x00a4 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x00a4 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x00a4 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00a4 }
            java.util.concurrent.ScheduledExecutorService r4 = r9.f11789c     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.uY r0 = r0.a((long) r1, (java.util.concurrent.TimeUnit) r3, (java.util.concurrent.ScheduledExecutorService) r4)     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.rq r1 = new com.google.android.gms.internal.ads.rq     // Catch:{ all -> 0x00a4 }
            r1.<init>(r9, r5)     // Catch:{ all -> 0x00a4 }
            java.util.concurrent.Executor r2 = r9.f11788b     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.DY.a(r0, r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x00a4 }
            r9.m = r8     // Catch:{ all -> 0x00a4 }
            goto L_0x00a2
        L_0x0089:
            com.google.android.gms.internal.ads._S r0 = r9.f11793g     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.dV r1 = r9.f11792f     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.OS r2 = r9.f11790d     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.yS r3 = r9.f11791e     // Catch:{ all -> 0x00a4 }
            r4 = 0
            r6 = 0
            com.google.android.gms.internal.ads.yS r7 = r9.f11791e     // Catch:{ all -> 0x00a4 }
            java.util.List<java.lang.String> r7 = r7.f12917d     // Catch:{ all -> 0x00a4 }
            java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a4 }
            r0.a(r1)     // Catch:{ all -> 0x00a4 }
            r9.m = r8     // Catch:{ all -> 0x00a4 }
            monitor-exit(r9)
            return
        L_0x00a2:
            monitor-exit(r9)
            return
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2390pq.I():void");
    }

    public final void K() {
        _S _s = this.f11793g;
        C1503dV dVVar = this.f11792f;
        OS os = this.f11790d;
        C2988yS ySVar = this.f11791e;
        _s.a(dVVar.a(os, ySVar, ySVar.f12920g));
    }

    public final void L() {
        _S _s = this.f11793g;
        C1503dV dVVar = this.f11792f;
        OS os = this.f11790d;
        C2988yS ySVar = this.f11791e;
        _s.a(dVVar.a(os, ySVar, ySVar.i));
    }

    public final void M() {
    }

    public final void N() {
    }

    public final void O() {
    }

    public final void a(C0886Mi mi, String str, String str2) {
        _S _s = this.f11793g;
        C1503dV dVVar = this.f11792f;
        C2988yS ySVar = this.f11791e;
        _s.a(dVVar.a(ySVar, ySVar.f12921h, mi));
    }

    public final void b(C1824hqa hqa) {
        if (((Boolean) Qqa.e().a(F.ob)).booleanValue()) {
            this.f11793g.a(this.f11792f.a(this.f11790d, this.f11791e, C1503dV.a(2, hqa.f10744a, this.f11791e.n)));
        }
    }

    public final void onAdClicked() {
        if ((((Boolean) Qqa.e().a(F.ha)).booleanValue() && this.f11790d.f8088b.f7844b.f6552g) || !C0566Aa.f6127a.a().booleanValue()) {
            _S _s = this.f11793g;
            C1503dV dVVar = this.f11792f;
            OS os = this.f11790d;
            C2988yS ySVar = this.f11791e;
            List<String> a2 = dVVar.a(os, ySVar, ySVar.f12916c);
            p.c();
            _s.a(a2, (Integer) oa.p(this.f11787a) ? C1489dH.f10122b : C1489dH.f10121a);
            return;
        }
        DY.a(C2710uY.c(this.j.a(this.f11787a, this.i.a(), this.i.b())).a(((Long) Qqa.e().a(F.Aa)).longValue(), TimeUnit.MILLISECONDS, this.f11789c), new C2602sq(this), this.f11788b);
    }
}
