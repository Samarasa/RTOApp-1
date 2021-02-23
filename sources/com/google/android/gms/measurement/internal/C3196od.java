package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.b.j;
import c.b.b.b.d.f.Hf;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.od  reason: case insensitive filesystem */
public final class C3196od extends C3137eb {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Hd f13704c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C3218tb f13705d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f13706e;

    /* renamed from: f  reason: collision with root package name */
    private final C3147g f13707f;

    /* renamed from: g  reason: collision with root package name */
    private final C3128ce f13708g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f13709h = new ArrayList();
    private final C3147g i;

    protected C3196od(C3144fc fcVar) {
        super(fcVar);
        this.f13708g = new C3128ce(fcVar.j());
        this.f13704c = new Hd(this);
        this.f13707f = new C3210rd(this, fcVar);
        this.i = new C3245yd(this, fcVar);
    }

    private final boolean I() {
        i();
        return true;
    }

    /* access modifiers changed from: private */
    public final void J() {
        c();
        this.f13708g.a();
        this.f13707f.a(C3202q.I.a(null).longValue());
    }

    /* access modifiers changed from: private */
    public final void K() {
        c();
        if (B()) {
            h().B().a("Inactivity, disconnecting from the service");
            H();
        }
    }

    /* access modifiers changed from: private */
    public final void L() {
        c();
        h().B().a("Processing queued up service tasks", Integer.valueOf(this.f13709h.size()));
        for (Runnable run : this.f13709h) {
            try {
                run.run();
            } catch (Exception e2) {
                h().t().a("Task exception while flushing queue", e2);
            }
        }
        this.f13709h.clear();
        this.i.c();
    }

    private final xe a(boolean z) {
        i();
        return q().a(z ? h().C() : null);
    }

    /* access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        c();
        if (this.f13705d != null) {
            this.f13705d = null;
            h().B().a("Disconnected from device MeasurementService", componentName);
            c();
            F();
        }
    }

    private final void a(Runnable runnable) {
        c();
        if (B()) {
            runnable.run();
        } else if (((long) this.f13709h.size()) >= 1000) {
            h().t().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f13709h.add(runnable);
            this.i.a(60000);
            F();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return false;
    }

    public final boolean B() {
        c();
        x();
        return this.f13705d != null;
    }

    /* access modifiers changed from: protected */
    public final void C() {
        c();
        x();
        a((Runnable) new Bd(this, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void D() {
        c();
        a();
        x();
        xe a2 = a(false);
        if (I()) {
            t().B();
        }
        a((Runnable) new C3215sd(this, a2));
    }

    /* access modifiers changed from: protected */
    public final void E() {
        c();
        x();
        xe a2 = a(true);
        boolean a3 = m().a(C3202q.ya);
        if (a3) {
            t().C();
        }
        a((Runnable) new C3240xd(this, a2, a3));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r6 = this;
            r6.c()
            r6.x()
            boolean r0 = r6.B()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f13706e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0114
            r6.c()
            r6.x()
            com.google.android.gms.measurement.internal.Lb r0 = r6.l()
            java.lang.Boolean r0 = r0.w()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x010e
        L_0x002c:
            r6.i()
            com.google.android.gms.measurement.internal.ub r0 = r6.q()
            int r0 = r0.G()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00eb
        L_0x003d:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.B()
            java.lang.String r3 = "Checking service availability"
            r0.a(r3)
            com.google.android.gms.measurement.internal.se r0 = r6.k()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.a((int) r3)
            if (r0 == 0) goto L_0x00dc
            if (r0 == r2) goto L_0x00cc
            r3 = 2
            if (r0 == r3) goto L_0x00a0
            r3 = 3
            if (r0 == r3) goto L_0x0092
            r3 = 9
            if (r0 == r3) goto L_0x0087
            r3 = 18
            if (r0 == r3) goto L_0x007c
            com.google.android.gms.measurement.internal.Bb r3 = r6.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.w()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.a(r4, r0)
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3 = 0
            goto L_0x00eb
        L_0x007c:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r3 = "Service updating"
            goto L_0x00e6
        L_0x0087:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r3 = "Service invalid"
            goto L_0x009c
        L_0x0092:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r3 = "Service disabled"
        L_0x009c:
            r0.a(r3)
            goto L_0x0078
        L_0x00a0:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.A()
            java.lang.String r3 = "Service container out of date"
            r0.a(r3)
            com.google.android.gms.measurement.internal.se r0 = r6.k()
            int r0 = r0.w()
            r3 = 17443(0x4423, float:2.4443E-41)
            if (r0 >= r3) goto L_0x00ba
            goto L_0x00d9
        L_0x00ba:
            com.google.android.gms.measurement.internal.Lb r0 = r6.l()
            java.lang.Boolean r0 = r0.w()
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0078
        L_0x00ca:
            r0 = 1
            goto L_0x0079
        L_0x00cc:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.B()
            java.lang.String r3 = "Service missing"
            r0.a(r3)
        L_0x00d9:
            r0 = 0
            goto L_0x003a
        L_0x00dc:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.B()
            java.lang.String r3 = "Service available"
        L_0x00e6:
            r0.a(r3)
            goto L_0x0039
        L_0x00eb:
            if (r0 != 0) goto L_0x0105
            com.google.android.gms.measurement.internal.Ie r4 = r6.m()
            boolean r4 = r4.w()
            if (r4 == 0) goto L_0x0105
            com.google.android.gms.measurement.internal.Bb r3 = r6.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.t()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.a(r4)
            r3 = 0
        L_0x0105:
            if (r3 == 0) goto L_0x010e
            com.google.android.gms.measurement.internal.Lb r3 = r6.l()
            r3.a((boolean) r0)
        L_0x010e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f13706e = r0
        L_0x0114:
            java.lang.Boolean r0 = r6.f13706e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0122
            com.google.android.gms.measurement.internal.Hd r0 = r6.f13704c
            r0.b()
            return
        L_0x0122:
            com.google.android.gms.measurement.internal.Ie r0 = r6.m()
            boolean r0 = r0.w()
            if (r0 != 0) goto L_0x0180
            r6.i()
            android.content.Context r0 = r6.f()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.f()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x0155
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0155
            r1 = 1
        L_0x0155:
            if (r1 == 0) goto L_0x0173
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.f()
            r6.i()
            r1.<init>(r2, r5)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.Hd r1 = r6.f13704c
            r1.a((android.content.Intent) r0)
            return
        L_0x0173:
            com.google.android.gms.measurement.internal.Bb r0 = r6.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.t()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.a(r1)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3196od.F():void");
    }

    /* access modifiers changed from: package-private */
    public final Boolean G() {
        return this.f13706e;
    }

    public final void H() {
        c();
        x();
        this.f13704c.a();
        try {
            a.a().a(f(), this.f13704c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f13705d = null;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Hf hf) {
        c();
        x();
        a((Runnable) new C3225ud(this, a(false), hf));
    }

    public final void a(Hf hf, C3192o oVar, String str) {
        c();
        x();
        if (k().a((int) j.f3888a) != 0) {
            h().w().a("Not bundling data. Service unavailable or out of date");
            k().a(hf, new byte[0]);
            return;
        }
        a((Runnable) new C3250zd(this, oVar, str, hf));
    }

    /* access modifiers changed from: protected */
    public final void a(Hf hf, String str, String str2) {
        c();
        x();
        a((Runnable) new Gd(this, str, str2, a(false), hf));
    }

    /* access modifiers changed from: protected */
    public final void a(Hf hf, String str, String str2, boolean z) {
        c();
        x();
        a((Runnable) new Id(this, str, str2, z, a(false), hf));
    }

    /* access modifiers changed from: protected */
    public final void a(Ge ge) {
        C0563t.a(ge);
        c();
        x();
        i();
        a((Runnable) new Dd(this, true, t().a(ge), new Ge(ge), a(true), ge));
    }

    /* access modifiers changed from: protected */
    public final void a(C3175kd kdVar) {
        c();
        x();
        a((Runnable) new C3235wd(this, kdVar));
    }

    /* access modifiers changed from: protected */
    public final void a(C3192o oVar, String str) {
        C0563t.a(oVar);
        c();
        x();
        boolean I = I();
        a((Runnable) new Ad(this, I, I && t().a(oVar), oVar, a(true), str));
    }

    /* access modifiers changed from: protected */
    public final void a(re reVar) {
        c();
        x();
        a((Runnable) new C3206qd(this, I() && t().a(reVar), reVar, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void a(C3218tb tbVar) {
        c();
        C0563t.a(tbVar);
        this.f13705d = tbVar;
        J();
        L();
    }

    /* access modifiers changed from: package-private */
    public final void a(C3218tb tbVar, com.google.android.gms.common.internal.a.a aVar, xe xeVar) {
        int i2;
        Db t;
        String str;
        List<com.google.android.gms.common.internal.a.a> a2;
        c();
        a();
        x();
        boolean I = I();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!I || (a2 = t().a(100)) == null) {
                i2 = 0;
            } else {
                arrayList.addAll(a2);
                i2 = a2.size();
            }
            if (aVar != null && i2 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                com.google.android.gms.common.internal.a.a aVar2 = (com.google.android.gms.common.internal.a.a) obj;
                if (aVar2 instanceof C3192o) {
                    try {
                        tbVar.a((C3192o) aVar2, xeVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        t = h().t();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof re) {
                    try {
                        tbVar.a((re) aVar2, xeVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        t = h().t();
                        str = "Failed to send attribute to the service";
                    }
                } else if (aVar2 instanceof Ge) {
                    try {
                        tbVar.a((Ge) aVar2, xeVar);
                    } catch (RemoteException e4) {
                        e = e4;
                        t = h().t();
                        str = "Failed to send conditional property to the service";
                    }
                } else {
                    h().t().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
        return;
        t.a(str, e);
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        x();
        a((Runnable) new C3230vd(this, atomicReference, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<Ge>> atomicReference, String str, String str2, String str3) {
        c();
        x();
        a((Runnable) new Cd(this, atomicReference, str, str2, str3, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<re>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        x();
        a((Runnable) new Ed(this, atomicReference, str, str2, str3, z, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<re>> atomicReference, boolean z) {
        c();
        x();
        a((Runnable) new C3220td(this, atomicReference, a(false), z));
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Hc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ C3223ub q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C3238xb t() {
        return super.t();
    }
}
