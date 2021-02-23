package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.be  reason: case insensitive filesystem */
final class C3122be {

    /* renamed from: a  reason: collision with root package name */
    private long f13517a;

    /* renamed from: b  reason: collision with root package name */
    private long f13518b;

    /* renamed from: c  reason: collision with root package name */
    private final C3147g f13519c = new C3116ae(this, this.f13520d.f13807a);

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Ud f13520d;

    public C3122be(Ud ud) {
        this.f13520d = ud;
        this.f13517a = ud.j().b();
        this.f13518b = this.f13517a;
    }

    /* access modifiers changed from: private */
    public final void c() {
        this.f13520d.c();
        a(false, false);
        this.f13520d.o().a(this.f13520d.j().b());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f13519c.c();
        this.f13517a = 0;
        this.f13518b = this.f13517a;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.f13520d.c();
        this.f13519c.c();
        this.f13517a = j;
        this.f13518b = this.f13517a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c4, code lost:
        if (r10 == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.Ud r0 = r8.f13520d
            r0.c()
            com.google.android.gms.measurement.internal.Ud r0 = r8.f13520d
            r0.x()
            com.google.android.gms.measurement.internal.Ud r0 = r8.f13520d
            com.google.android.gms.common.util.e r0 = r0.j()
            long r0 = r0.b()
            boolean r2 = c.b.b.b.d.f.C0467ze.b()
            if (r2 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.Ie r2 = r2.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.Qa
            boolean r2 = r2.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.fc r2 = r2.f13807a
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0047
        L_0x0032:
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.Lb r2 = r2.l()
            com.google.android.gms.measurement.internal.Qb r2 = r2.w
            com.google.android.gms.measurement.internal.Ud r3 = r8.f13520d
            com.google.android.gms.common.util.e r3 = r3.j()
            long r3 = r3.a()
            r2.a(r3)
        L_0x0047:
            long r2 = r8.f13517a
            long r2 = r0 - r2
            if (r9 != 0) goto L_0x0068
            r4 = 1000(0x3e8, double:4.94E-321)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0068
            com.google.android.gms.measurement.internal.Ud r9 = r8.f13520d
            com.google.android.gms.measurement.internal.Bb r9 = r9.h()
            com.google.android.gms.measurement.internal.Db r9 = r9.B()
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r9.a(r0, r10)
            r9 = 0
            return r9
        L_0x0068:
            com.google.android.gms.measurement.internal.Ud r9 = r8.f13520d
            com.google.android.gms.measurement.internal.Lb r9 = r9.l()
            com.google.android.gms.measurement.internal.Qb r9 = r9.x
            r9.a(r2)
            com.google.android.gms.measurement.internal.Ud r9 = r8.f13520d
            com.google.android.gms.measurement.internal.Bb r9 = r9.h()
            com.google.android.gms.measurement.internal.Db r9 = r9.B()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Recording user engagement, ms"
            r9.a(r5, r4)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r4 = "_et"
            r9.putLong(r4, r2)
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.nd r2 = r2.s()
            com.google.android.gms.measurement.internal.kd r2 = r2.B()
            r3 = 1
            com.google.android.gms.measurement.internal.C3191nd.a((com.google.android.gms.measurement.internal.C3175kd) r2, (android.os.Bundle) r9, (boolean) r3)
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.Ie r2 = r2.m()
            com.google.android.gms.measurement.internal.Ud r4 = r8.f13520d
            com.google.android.gms.measurement.internal.ub r4 = r4.q()
            java.lang.String r4 = r4.B()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C3202q.aa
            boolean r2 = r2.e(r4, r5)
            if (r2 == 0) goto L_0x00d4
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.Ie r2 = r2.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C3202q.ba
            boolean r2 = r2.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r4)
            if (r2 == 0) goto L_0x00c7
            if (r10 != 0) goto L_0x00d4
            goto L_0x00d1
        L_0x00c7:
            if (r10 == 0) goto L_0x00d1
            r4 = 1
            java.lang.String r2 = "_fr"
            r9.putLong(r2, r4)
            goto L_0x00d4
        L_0x00d1:
            r8.b()
        L_0x00d4:
            com.google.android.gms.measurement.internal.Ud r2 = r8.f13520d
            com.google.android.gms.measurement.internal.Ie r2 = r2.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C3202q.ba
            boolean r2 = r2.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r4)
            if (r2 == 0) goto L_0x00e4
            if (r10 != 0) goto L_0x00f1
        L_0x00e4:
            com.google.android.gms.measurement.internal.Ud r10 = r8.f13520d
            com.google.android.gms.measurement.internal.Hc r10 = r10.p()
            java.lang.String r2 = "auto"
            java.lang.String r4 = "_e"
            r10.a((java.lang.String) r2, (java.lang.String) r4, (android.os.Bundle) r9)
        L_0x00f1:
            r8.f13517a = r0
            com.google.android.gms.measurement.internal.g r9 = r8.f13519c
            r9.c()
            com.google.android.gms.measurement.internal.g r9 = r8.f13519c
            r0 = 0
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.measurement.internal.Ud r10 = r8.f13520d
            com.google.android.gms.measurement.internal.Lb r10 = r10.l()
            com.google.android.gms.measurement.internal.Qb r10 = r10.x
            long r6 = r10.a()
            long r4 = r4 - r6
            long r0 = java.lang.Math.max(r0, r4)
            r9.a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3122be.a(boolean, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        long b2 = this.f13520d.j().b();
        long j = b2 - this.f13518b;
        this.f13518b = b2;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        this.f13519c.c();
        if (this.f13517a != 0) {
            this.f13520d.l().x.a(this.f13520d.l().x.a() + (j - this.f13517a));
        }
    }
}
