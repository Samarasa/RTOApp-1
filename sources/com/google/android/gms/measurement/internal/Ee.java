package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.F;

final class Ee extends Fe {

    /* renamed from: g  reason: collision with root package name */
    private F f13241g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ye f13242h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Ee(ye yeVar, String str, int i, F f2) {
        super(str, i);
        this.f13242h = yeVar;
        this.f13241g = f2;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f13241g.p();
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0196 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Long r13, c.b.b.b.d.f.C0298ba r14, boolean r15) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.ye r0 = r12.f13242h
            com.google.android.gms.measurement.internal.Ie r0 = r0.m()
            java.lang.String r1 = r12.f13253a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.na
            boolean r0 = r0.d(r1, r2)
            com.google.android.gms.measurement.internal.ye r1 = r12.f13242h
            com.google.android.gms.measurement.internal.Ie r1 = r1.m()
            java.lang.String r2 = r12.f13253a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.ta
            boolean r1 = r1.d(r2, r3)
            c.b.b.b.d.f.F r2 = r12.f13241g
            boolean r2 = r2.s()
            c.b.b.b.d.f.F r3 = r12.f13241g
            boolean r3 = r3.t()
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0036
            c.b.b.b.d.f.F r6 = r12.f13241g
            boolean r6 = r6.v()
            if (r6 == 0) goto L_0x0036
            r6 = 1
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            if (r2 != 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            if (r6 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = 0
            goto L_0x0041
        L_0x0040:
            r2 = 1
        L_0x0041:
            r7 = 0
            if (r15 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.ye r13 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r13 = r13.h()
            com.google.android.gms.measurement.internal.Db r13 = r13.B()
            int r14 = r12.f13254b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            c.b.b.b.d.f.F r15 = r12.f13241g
            boolean r15 = r15.o()
            if (r15 == 0) goto L_0x0068
            c.b.b.b.d.f.F r15 = r12.f13241g
            int r15 = r15.p()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        L_0x0068:
            java.lang.String r15 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r13.a(r15, r14, r7)
            return r5
        L_0x006e:
            c.b.b.b.d.f.F r8 = r12.f13241g
            c.b.b.b.d.f.D r8 = r8.r()
            boolean r9 = r8.t()
            boolean r10 = r14.t()
            if (r10 == 0) goto L_0x00b5
            boolean r10 = r8.q()
            if (r10 != 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            com.google.android.gms.measurement.internal.ye r9 = r12.f13242h
            com.google.android.gms.measurement.internal.zb r9 = r9.e()
            java.lang.String r10 = r14.q()
            java.lang.String r9 = r9.c(r10)
            java.lang.String r10 = "No number filter for long property. property"
        L_0x009e:
            r8.a(r10, r9)
            goto L_0x017f
        L_0x00a3:
            long r10 = r14.u()
            c.b.b.b.d.f.E r7 = r8.r()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.Fe.a((long) r10, (c.b.b.b.d.f.E) r7)
        L_0x00af:
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.Fe.a((java.lang.Boolean) r7, (boolean) r9)
            goto L_0x017f
        L_0x00b5:
            boolean r10 = r14.v()
            if (r10 == 0) goto L_0x00e9
            boolean r10 = r8.q()
            if (r10 != 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            com.google.android.gms.measurement.internal.ye r9 = r12.f13242h
            com.google.android.gms.measurement.internal.zb r9 = r9.e()
            java.lang.String r10 = r14.q()
            java.lang.String r9 = r9.c(r10)
            java.lang.String r10 = "No number filter for double property. property"
            goto L_0x009e
        L_0x00dc:
            double r10 = r14.w()
            c.b.b.b.d.f.E r7 = r8.r()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.Fe.a((double) r10, (c.b.b.b.d.f.E) r7)
            goto L_0x00af
        L_0x00e9:
            boolean r10 = r14.r()
            if (r10 == 0) goto L_0x0163
            boolean r10 = r8.o()
            if (r10 != 0) goto L_0x014f
            boolean r10 = r8.q()
            if (r10 != 0) goto L_0x0116
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            com.google.android.gms.measurement.internal.ye r9 = r12.f13242h
            com.google.android.gms.measurement.internal.zb r9 = r9.e()
            java.lang.String r10 = r14.q()
            java.lang.String r9 = r9.c(r10)
            java.lang.String r10 = "No string or number filter defined. property"
            goto L_0x009e
        L_0x0116:
            java.lang.String r10 = r14.s()
            boolean r10 = com.google.android.gms.measurement.internal.oe.a((java.lang.String) r10)
            if (r10 == 0) goto L_0x012d
            java.lang.String r7 = r14.s()
            c.b.b.b.d.f.E r8 = r8.r()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.Fe.a((java.lang.String) r7, (c.b.b.b.d.f.E) r8)
            goto L_0x00af
        L_0x012d:
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            com.google.android.gms.measurement.internal.ye r9 = r12.f13242h
            com.google.android.gms.measurement.internal.zb r9 = r9.e()
            java.lang.String r10 = r14.q()
            java.lang.String r9 = r9.c(r10)
            java.lang.String r10 = r14.s()
            java.lang.String r11 = "Invalid user property value for Numeric number filter. property, value"
            r8.a(r11, r9, r10)
            goto L_0x017f
        L_0x014f:
            java.lang.String r7 = r14.s()
            c.b.b.b.d.f.G r8 = r8.p()
            com.google.android.gms.measurement.internal.ye r10 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r10 = r10.h()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.Fe.a((java.lang.String) r7, (c.b.b.b.d.f.G) r8, (com.google.android.gms.measurement.internal.Bb) r10)
            goto L_0x00af
        L_0x0163:
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            com.google.android.gms.measurement.internal.ye r9 = r12.f13242h
            com.google.android.gms.measurement.internal.zb r9 = r9.e()
            java.lang.String r10 = r14.q()
            java.lang.String r9 = r9.c(r10)
            java.lang.String r10 = "User property has no value, property"
            goto L_0x009e
        L_0x017f:
            com.google.android.gms.measurement.internal.ye r8 = r12.f13242h
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.B()
            if (r7 != 0) goto L_0x018e
            java.lang.String r9 = "null"
            goto L_0x018f
        L_0x018e:
            r9 = r7
        L_0x018f:
            java.lang.String r10 = "Property filter result"
            r8.a(r10, r9)
            if (r7 != 0) goto L_0x0197
            return r4
        L_0x0197:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r12.f13255c = r4
            if (r0 == 0) goto L_0x01a8
            if (r6 == 0) goto L_0x01a8
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L_0x01a8
            return r5
        L_0x01a8:
            if (r15 == 0) goto L_0x01b2
            c.b.b.b.d.f.F r15 = r12.f13241g
            boolean r15 = r15.s()
            if (r15 == 0) goto L_0x01b4
        L_0x01b2:
            r12.f13256d = r7
        L_0x01b4:
            boolean r15 = r7.booleanValue()
            if (r15 == 0) goto L_0x01de
            if (r2 == 0) goto L_0x01de
            boolean r15 = r14.o()
            if (r15 != 0) goto L_0x01c3
            goto L_0x01de
        L_0x01c3:
            long r14 = r14.p()
            if (r1 == 0) goto L_0x01cf
            if (r13 == 0) goto L_0x01cf
            long r14 = r13.longValue()
        L_0x01cf:
            if (r3 == 0) goto L_0x01d8
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r12.f13258f = r13
            goto L_0x01de
        L_0x01d8:
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r12.f13257e = r13
        L_0x01de:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Ee.a(java.lang.Long, c.b.b.b.d.f.ba, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }
}
