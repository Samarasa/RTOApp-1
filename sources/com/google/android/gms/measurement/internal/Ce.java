package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.C;

final class Ce extends Fe {

    /* renamed from: g  reason: collision with root package name */
    private C f13210g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ye f13211h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Ce(ye yeVar, String str, int i, C c2) {
        super(str, i);
        this.f13211h = yeVar;
        this.f13210g = c2;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f13210g.p();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r12.booleanValue() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r12.a(r15, r13);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(c.b.b.b.d.f.T r11, long r12, com.google.android.gms.measurement.internal.C3171k r14, boolean r15) {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.ye r0 = r10.f13211h
            com.google.android.gms.measurement.internal.Ie r0 = r0.m()
            java.lang.String r1 = r10.f13253a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.na
            boolean r0 = r0.d(r1, r2)
            com.google.android.gms.measurement.internal.ye r1 = r10.f13211h
            com.google.android.gms.measurement.internal.Ie r1 = r1.m()
            java.lang.String r2 = r10.f13253a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.oa
            boolean r1 = r1.d(r2, r3)
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x002a
            c.b.b.b.d.f.C r1 = r10.f13210g
            boolean r1 = r1.y()
            if (r1 == 0) goto L_0x002a
            long r12 = r14.f13627e
        L_0x002a:
            com.google.android.gms.measurement.internal.ye r14 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r14 = r14.h()
            r1 = 2
            boolean r14 = r14.a((int) r1)
            r1 = 0
            if (r14 == 0) goto L_0x008c
            com.google.android.gms.measurement.internal.ye r14 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r14 = r14.h()
            com.google.android.gms.measurement.internal.Db r14 = r14.B()
            int r2 = r10.f13254b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            c.b.b.b.d.f.C r3 = r10.f13210g
            boolean r3 = r3.o()
            if (r3 == 0) goto L_0x005b
            c.b.b.b.d.f.C r3 = r10.f13210g
            int r3 = r3.p()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            com.google.android.gms.measurement.internal.ye r4 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r4 = r4.e()
            c.b.b.b.d.f.C r5 = r10.f13210g
            java.lang.String r5 = r5.q()
            java.lang.String r4 = r4.a((java.lang.String) r5)
            java.lang.String r5 = "Evaluating filter. audience, filter, event"
            r14.a(r5, r2, r3, r4)
            com.google.android.gms.measurement.internal.ye r14 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r14 = r14.h()
            com.google.android.gms.measurement.internal.Db r14 = r14.B()
            com.google.android.gms.measurement.internal.ye r2 = r10.f13211h
            com.google.android.gms.measurement.internal.oe r2 = r2.n()
            c.b.b.b.d.f.C r3 = r10.f13210g
            java.lang.String r2 = r2.a((c.b.b.b.d.f.C) r3)
            java.lang.String r3 = "Filter definition"
            r14.a(r3, r2)
        L_0x008c:
            c.b.b.b.d.f.C r14 = r10.f13210g
            boolean r14 = r14.o()
            r2 = 0
            r3 = 1
            if (r14 == 0) goto L_0x03db
            c.b.b.b.d.f.C r14 = r10.f13210g
            int r14 = r14.p()
            r4 = 256(0x100, float:3.59E-43)
            if (r14 <= r4) goto L_0x00a2
            goto L_0x03db
        L_0x00a2:
            c.b.b.b.d.f.C r14 = r10.f13210g
            boolean r14 = r14.v()
            c.b.b.b.d.f.C r4 = r10.f13210g
            boolean r4 = r4.w()
            if (r0 == 0) goto L_0x00ba
            c.b.b.b.d.f.C r0 = r10.f13210g
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r14 != 0) goto L_0x00c4
            if (r4 != 0) goto L_0x00c4
            if (r0 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r14 = 0
            goto L_0x00c5
        L_0x00c4:
            r14 = 1
        L_0x00c5:
            if (r15 == 0) goto L_0x00f1
            if (r14 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.ye r11 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r11 = r11.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.B()
            int r12 = r10.f13254b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            c.b.b.b.d.f.C r13 = r10.f13210g
            boolean r13 = r13.o()
            if (r13 == 0) goto L_0x00eb
            c.b.b.b.d.f.C r13 = r10.f13210g
            int r13 = r13.p()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
        L_0x00eb:
            java.lang.String r13 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.a(r13, r12, r1)
            return r3
        L_0x00f1:
            c.b.b.b.d.f.C r15 = r10.f13210g
            java.lang.String r0 = r11.q()
            boolean r5 = r15.t()
            if (r5 == 0) goto L_0x0115
            c.b.b.b.d.f.E r5 = r15.u()
            java.lang.Boolean r12 = com.google.android.gms.measurement.internal.Fe.a((long) r12, (c.b.b.b.d.f.E) r5)
            if (r12 != 0) goto L_0x0109
            goto L_0x038f
        L_0x0109:
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0115
        L_0x010f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x038f
        L_0x0115:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.List r13 = r15.r()
            java.util.Iterator r13 = r13.iterator()
        L_0x0122:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x015b
            java.lang.Object r5 = r13.next()
            c.b.b.b.d.f.D r5 = (c.b.b.b.d.f.D) r5
            java.lang.String r6 = r5.u()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0153
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            java.lang.String r15 = "null or empty param name in filter. event"
        L_0x014e:
            r12.a(r15, r13)
            goto L_0x038f
        L_0x0153:
            java.lang.String r5 = r5.u()
            r12.add(r5)
            goto L_0x0122
        L_0x015b:
            b.e.b r13 = new b.e.b
            r13.<init>()
            java.util.List r5 = r11.o()
            java.util.Iterator r5 = r5.iterator()
        L_0x0168:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01ed
            java.lang.Object r6 = r5.next()
            c.b.b.b.d.f.V r6 = (c.b.b.b.d.f.V) r6
            java.lang.String r7 = r6.o()
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x0168
            boolean r7 = r6.r()
            if (r7 == 0) goto L_0x0199
            java.lang.String r7 = r6.o()
            boolean r8 = r6.r()
            if (r8 == 0) goto L_0x0197
            long r8 = r6.s()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            goto L_0x01c0
        L_0x0197:
            r6 = r1
            goto L_0x01c0
        L_0x0199:
            boolean r7 = r6.t()
            if (r7 == 0) goto L_0x01b2
            java.lang.String r7 = r6.o()
            boolean r8 = r6.t()
            if (r8 == 0) goto L_0x0197
            double r8 = r6.u()
            java.lang.Double r6 = java.lang.Double.valueOf(r8)
            goto L_0x01c0
        L_0x01b2:
            boolean r7 = r6.p()
            if (r7 == 0) goto L_0x01c4
            java.lang.String r7 = r6.o()
            java.lang.String r6 = r6.q()
        L_0x01c0:
            r13.put(r7, r6)
            goto L_0x0168
        L_0x01c4:
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r0 = r6.o()
            java.lang.String r15 = r15.b(r0)
            java.lang.String r0 = "Unknown value for param. event, param"
        L_0x01e8:
            r12.a(r0, r13, r15)
            goto L_0x038f
        L_0x01ed:
            java.util.List r12 = r15.r()
            java.util.Iterator r12 = r12.iterator()
        L_0x01f5:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x038b
            java.lang.Object r15 = r12.next()
            c.b.b.b.d.f.D r15 = (c.b.b.b.d.f.D) r15
            boolean r5 = r15.s()
            if (r5 == 0) goto L_0x020f
            boolean r5 = r15.t()
            if (r5 == 0) goto L_0x020f
            r5 = 1
            goto L_0x0210
        L_0x020f:
            r5 = 0
        L_0x0210:
            java.lang.String r6 = r15.u()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0232
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            java.lang.String r15 = "Event has empty param name. event"
            goto L_0x014e
        L_0x0232:
            java.lang.Object r7 = r13.get(r6)
            boolean r8 = r7 instanceof java.lang.Long
            if (r8 == 0) goto L_0x027b
            boolean r8 = r15.q()
            if (r8 != 0) goto L_0x0261
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "No number filter for long param. event, param"
            goto L_0x01e8
        L_0x0261:
            java.lang.Long r7 = (java.lang.Long) r7
            long r6 = r7.longValue()
            c.b.b.b.d.f.E r15 = r15.r()
            java.lang.Boolean r15 = com.google.android.gms.measurement.internal.Fe.a((long) r6, (c.b.b.b.d.f.E) r15)
            if (r15 != 0) goto L_0x0273
            goto L_0x038f
        L_0x0273:
            boolean r15 = r15.booleanValue()
            if (r15 != r5) goto L_0x01f5
            goto L_0x010f
        L_0x027b:
            boolean r8 = r7 instanceof java.lang.Double
            if (r8 == 0) goto L_0x02c1
            boolean r8 = r15.q()
            if (r8 != 0) goto L_0x02a7
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "No number filter for double param. event, param"
            goto L_0x01e8
        L_0x02a7:
            java.lang.Double r7 = (java.lang.Double) r7
            double r6 = r7.doubleValue()
            c.b.b.b.d.f.E r15 = r15.r()
            java.lang.Boolean r15 = com.google.android.gms.measurement.internal.Fe.a((double) r6, (c.b.b.b.d.f.E) r15)
            if (r15 != 0) goto L_0x02b9
            goto L_0x038f
        L_0x02b9:
            boolean r15 = r15.booleanValue()
            if (r15 != r5) goto L_0x01f5
            goto L_0x010f
        L_0x02c1:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0342
            boolean r8 = r15.o()
            if (r8 == 0) goto L_0x02dc
            java.lang.String r7 = (java.lang.String) r7
            c.b.b.b.d.f.G r15 = r15.p()
            com.google.android.gms.measurement.internal.ye r6 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r6 = r6.h()
            java.lang.Boolean r15 = com.google.android.gms.measurement.internal.Fe.a((java.lang.String) r7, (c.b.b.b.d.f.G) r15, (com.google.android.gms.measurement.internal.Bb) r6)
            goto L_0x02f2
        L_0x02dc:
            boolean r8 = r15.q()
            if (r8 == 0) goto L_0x0320
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.google.android.gms.measurement.internal.oe.a((java.lang.String) r7)
            if (r8 == 0) goto L_0x02fe
            c.b.b.b.d.f.E r15 = r15.r()
            java.lang.Boolean r15 = com.google.android.gms.measurement.internal.Fe.a((java.lang.String) r7, (c.b.b.b.d.f.E) r15)
        L_0x02f2:
            if (r15 != 0) goto L_0x02f6
            goto L_0x038f
        L_0x02f6:
            boolean r15 = r15.booleanValue()
            if (r15 != r5) goto L_0x01f5
            goto L_0x010f
        L_0x02fe:
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "Invalid param value for number filter. event, param"
            goto L_0x01e8
        L_0x0320:
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "No filter for String param. event, param"
            goto L_0x01e8
        L_0x0342:
            if (r7 != 0) goto L_0x0369
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.B()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "Missing param for filter. event, param"
            r12.a(r0, r13, r15)
            goto L_0x010f
        L_0x0369:
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.w()
            com.google.android.gms.measurement.internal.ye r13 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r13 = r13.e()
            java.lang.String r13 = r13.a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ye r15 = r10.f13211h
            com.google.android.gms.measurement.internal.zb r15 = r15.e()
            java.lang.String r15 = r15.b(r6)
            java.lang.String r0 = "Unknown param type. event, param"
            goto L_0x01e8
        L_0x038b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L_0x038f:
            com.google.android.gms.measurement.internal.ye r12 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r12 = r12.h()
            com.google.android.gms.measurement.internal.Db r12 = r12.B()
            if (r1 != 0) goto L_0x039e
            java.lang.String r13 = "null"
            goto L_0x039f
        L_0x039e:
            r13 = r1
        L_0x039f:
            java.lang.String r15 = "Event filter result"
            r12.a(r15, r13)
            if (r1 != 0) goto L_0x03a7
            return r2
        L_0x03a7:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            r10.f13255c = r12
            boolean r12 = r1.booleanValue()
            if (r12 != 0) goto L_0x03b4
            return r3
        L_0x03b4:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            r10.f13256d = r12
            if (r14 == 0) goto L_0x03da
            boolean r12 = r11.r()
            if (r12 != 0) goto L_0x03c3
            goto L_0x03da
        L_0x03c3:
            if (r4 == 0) goto L_0x03d0
            long r11 = r11.s()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f13258f = r11
            goto L_0x03da
        L_0x03d0:
            long r11 = r11.s()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f13257e = r11
        L_0x03da:
            return r3
        L_0x03db:
            com.google.android.gms.measurement.internal.ye r11 = r10.f13211h
            com.google.android.gms.measurement.internal.Bb r11 = r11.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.w()
            java.lang.String r12 = r10.f13253a
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)
            c.b.b.b.d.f.C r13 = r10.f13210g
            boolean r13 = r13.o()
            if (r13 == 0) goto L_0x03fd
            c.b.b.b.d.f.C r13 = r10.f13210g
            int r13 = r13.p()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
        L_0x03fd:
            java.lang.String r13 = java.lang.String.valueOf(r1)
            java.lang.String r14 = "Invalid event filter ID. appId, id"
            r11.a(r14, r12, r13)
            com.google.android.gms.measurement.internal.ye r11 = r10.f13211h
            com.google.android.gms.measurement.internal.Ie r11 = r11.m()
            java.lang.String r12 = r10.f13253a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C3202q.wa
            boolean r11 = r11.d(r12, r13)
            if (r11 == 0) goto L_0x0417
            return r2
        L_0x0417:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Ce.a(c.b.b.b.d.f.T, long, com.google.android.gms.measurement.internal.k, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return false;
    }
}
