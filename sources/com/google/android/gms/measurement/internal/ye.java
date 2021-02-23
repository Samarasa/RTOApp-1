package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class ye extends C3158he {

    /* renamed from: d  reason: collision with root package name */
    private String f13833d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f13834e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Ae> f13835f;

    ye(C3176ke keVar) {
        super(keVar);
    }

    private final Ae a(int i) {
        if (this.f13835f.containsKey(Integer.valueOf(i))) {
            return this.f13835f.get(Integer.valueOf(i));
        }
        Ae ae = new Ae(this, this.f13833d, (Be) null);
        this.f13835f.put(Integer.valueOf(i), ae);
        return ae;
    }

    private final boolean a(int i, int i2) {
        if (this.f13835f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f13835f.get(Integer.valueOf(i)).f13174d.get(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0609, code lost:
        if (r9.o() == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x060b, code lost:
        r14 = java.lang.Integer.valueOf(r9.p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0614, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0615, code lost:
        r8.a("Invalid property filter ID. appId, id", r11, java.lang.String.valueOf(r14));
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x02bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<c.b.b.b.d.f.Q> a(java.lang.String r49, java.util.List<c.b.b.b.d.f.T> r50, java.util.List<c.b.b.b.d.f.C0298ba> r51, java.lang.Long r52) {
        /*
            r48 = this;
            r10 = r48
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r49)
            com.google.android.gms.common.internal.C0563t.a(r50)
            com.google.android.gms.common.internal.C0563t.a(r51)
            r0 = r49
            r10.f13833d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f13834e = r0
            b.e.b r0 = new b.e.b
            r0.<init>()
            r10.f13835f = r0
            com.google.android.gms.measurement.internal.Ie r0 = r48.m()
            java.lang.String r1 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.na
            boolean r0 = r0.d(r1, r2)
            r11 = 0
            r12 = 1
            if (r0 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.Ie r0 = r48.m()
            java.lang.String r1 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.oa
            boolean r0 = r0.d(r1, r2)
            if (r0 == 0) goto L_0x0059
        L_0x003b:
            java.util.Iterator r0 = r50.iterator()
        L_0x003f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            c.b.b.b.d.f.T r1 = (c.b.b.b.d.f.T) r1
            java.lang.String r1 = r1.q()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            com.google.android.gms.measurement.internal.Ie r0 = r48.m()
            java.lang.String r2 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.na
            boolean r13 = r0.d(r2, r3)
            com.google.android.gms.measurement.internal.Ie r0 = r48.m()
            java.lang.String r2 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.oa
            boolean r0 = r0.d(r2, r3)
            if (r1 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.d r2 = r48.o()
            java.lang.String r3 = r10.f13833d
            r2.r()
            r2.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.v()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.a(r4, r3, r0)
        L_0x00b5:
            com.google.android.gms.measurement.internal.d r0 = r48.o()
            java.lang.String r2 = r10.f13833d
            java.util.Map r0 = r0.f(r2)
            r14 = 0
            if (r0 == 0) goto L_0x02e5
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00ca
            goto L_0x02e5
        L_0x00ca:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r0.keySet()
            r2.<init>(r3)
            if (r13 == 0) goto L_0x01ac
            if (r1 == 0) goto L_0x01ac
            java.lang.String r1 = r10.f13833d
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r1)
            com.google.android.gms.common.internal.C0563t.a(r0)
            b.e.b r3 = new b.e.b
            r3.<init>()
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.d r4 = r48.o()
            java.util.Map r1 = r4.e(r1)
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00fa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01aa
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r6)
            c.b.b.b.d.f.Z r6 = (c.b.b.b.d.f.Z) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01a1
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0128
            goto L_0x01a1
        L_0x0128:
            com.google.android.gms.measurement.internal.oe r8 = r48.n()
            java.util.List r9 = r6.q()
            java.util.List r8 = r8.a((java.util.List<java.lang.Long>) r9, (java.util.List<java.lang.Integer>) r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00fa
            c.b.b.b.d.f.Lb$b r9 = r6.k()
            c.b.b.b.d.f.Z$a r9 = (c.b.b.b.d.f.Z.a) r9
            r9.l()
            r9.b((java.lang.Iterable<? extends java.lang.Long>) r8)
            com.google.android.gms.measurement.internal.oe r8 = r48.n()
            java.util.List r15 = r6.o()
            java.util.List r8 = r8.a((java.util.List<java.lang.Long>) r15, (java.util.List<java.lang.Integer>) r7)
            r9.k()
            r9.a((java.lang.Iterable<? extends java.lang.Long>) r8)
            r8 = 0
        L_0x0159:
            int r15 = r6.t()
            if (r8 >= r15) goto L_0x0177
            c.b.b.b.d.f.S r15 = r6.b((int) r8)
            int r15 = r15.p()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r15 = r7.contains(r15)
            if (r15 == 0) goto L_0x0174
            r9.a((int) r8)
        L_0x0174:
            int r8 = r8 + 1
            goto L_0x0159
        L_0x0177:
            r8 = 0
        L_0x0178:
            int r15 = r6.v()
            if (r8 >= r15) goto L_0x0196
            c.b.b.b.d.f.aa r15 = r6.c((int) r8)
            int r15 = r15.p()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r15 = r7.contains(r15)
            if (r15 == 0) goto L_0x0193
            r9.b((int) r8)
        L_0x0193:
            int r8 = r8 + 1
            goto L_0x0178
        L_0x0196:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            c.b.b.b.d.f.wc r6 = r9.j()
            c.b.b.b.d.f.Z r6 = (c.b.b.b.d.f.Z) r6
            goto L_0x01a5
        L_0x01a1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01a5:
            r3.put(r5, r6)
            goto L_0x00fa
        L_0x01aa:
            r15 = r3
            goto L_0x01ad
        L_0x01ac:
            r15 = r0
        L_0x01ad:
            java.util.Iterator r16 = r2.iterator()
        L_0x01b1:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x02e5
            java.lang.Object r1 = r16.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r17 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r15.get(r1)
            c.b.b.b.d.f.Z r1 = (c.b.b.b.d.f.Z) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            b.e.b r7 = new b.e.b
            r7.<init>()
            if (r1 == 0) goto L_0x0219
            int r2 = r1.t()
            if (r2 != 0) goto L_0x01e3
            goto L_0x0219
        L_0x01e3:
            java.util.List r2 = r1.s()
            java.util.Iterator r2 = r2.iterator()
        L_0x01eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0219
            java.lang.Object r3 = r2.next()
            c.b.b.b.d.f.S r3 = (c.b.b.b.d.f.S) r3
            boolean r4 = r3.o()
            if (r4 == 0) goto L_0x01eb
            int r4 = r3.p()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.q()
            if (r8 == 0) goto L_0x0214
            long r8 = r3.r()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0215
        L_0x0214:
            r3 = r14
        L_0x0215:
            r7.put(r4, r3)
            goto L_0x01eb
        L_0x0219:
            boolean r2 = c.b.b.b.d.f.C0407qf.b()
            if (r2 == 0) goto L_0x0276
            com.google.android.gms.measurement.internal.Ie r2 = r48.m()
            java.lang.String r3 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C3202q.ua
            boolean r2 = r2.d(r3, r4)
            if (r2 == 0) goto L_0x0276
            b.e.b r2 = new b.e.b
            r2.<init>()
            if (r1 == 0) goto L_0x0274
            int r3 = r1.v()
            if (r3 != 0) goto L_0x023b
            goto L_0x0274
        L_0x023b:
            java.util.List r3 = r1.u()
            java.util.Iterator r3 = r3.iterator()
        L_0x0243:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0274
            java.lang.Object r4 = r3.next()
            c.b.b.b.d.f.aa r4 = (c.b.b.b.d.f.C0291aa) r4
            boolean r8 = r4.o()
            if (r8 == 0) goto L_0x0243
            int r8 = r4.r()
            if (r8 <= 0) goto L_0x0243
            int r8 = r4.p()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r4.r()
            int r9 = r9 - r12
            long r18 = r4.b(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            r2.put(r8, r4)
            goto L_0x0243
        L_0x0274:
            r8 = r2
            goto L_0x0277
        L_0x0276:
            r8 = r14
        L_0x0277:
            if (r1 == 0) goto L_0x02c1
            r2 = 0
        L_0x027a:
            int r3 = r1.p()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02c1
            java.util.List r3 = r1.o()
            boolean r3 = com.google.android.gms.measurement.internal.oe.a((java.util.List<java.lang.Long>) r3, (int) r2)
            if (r3 == 0) goto L_0x02b3
            com.google.android.gms.measurement.internal.Bb r3 = r48.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.B()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "Filter already evaluated. audience ID, filter ID"
            r3.a(r11, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.q()
            boolean r3 = com.google.android.gms.measurement.internal.oe.a((java.util.List<java.lang.Long>) r3, (int) r2)
            if (r3 == 0) goto L_0x02b3
            r5.set(r2)
            r3 = 1
            goto L_0x02b4
        L_0x02b3:
            r3 = 0
        L_0x02b4:
            if (r3 != 0) goto L_0x02bd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02bd:
            int r2 = r2 + 1
            r11 = 0
            goto L_0x027a
        L_0x02c1:
            if (r13 == 0) goto L_0x02cd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r1)
            c.b.b.b.d.f.Z r1 = (c.b.b.b.d.f.Z) r1
        L_0x02cd:
            r4 = r1
            com.google.android.gms.measurement.internal.Ae r11 = new com.google.android.gms.measurement.internal.Ae
            java.lang.String r3 = r10.f13833d
            r9 = 0
            r1 = r11
            r2 = r48
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.Ae> r1 = r10.f13835f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1.put(r2, r11)
            r11 = 0
            goto L_0x01b1
        L_0x02e5:
            boolean r0 = r50.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04c9
            com.google.android.gms.measurement.internal.De r0 = new com.google.android.gms.measurement.internal.De
            r0.<init>(r10, r14)
            b.e.b r2 = new b.e.b
            r2.<init>()
            java.util.Iterator r3 = r50.iterator()
        L_0x02fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c9
            java.lang.Object r4 = r3.next()
            c.b.b.b.d.f.T r4 = (c.b.b.b.d.f.T) r4
            java.lang.String r5 = r10.f13833d
            c.b.b.b.d.f.T r5 = r0.a(r5, r4)
            if (r5 == 0) goto L_0x02fb
            com.google.android.gms.measurement.internal.d r6 = r48.o()
            java.lang.String r7 = r10.f13833d
            java.lang.String r8 = r5.q()
            com.google.android.gms.measurement.internal.Ie r9 = r6.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C3202q.oa
            boolean r9 = r9.d(r7, r11)
            java.lang.String r11 = r4.q()
            com.google.android.gms.measurement.internal.k r11 = r6.a((java.lang.String) r7, (java.lang.String) r11)
            if (r11 != 0) goto L_0x038a
            com.google.android.gms.measurement.internal.Bb r11 = r6.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.w()
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)
            com.google.android.gms.measurement.internal.zb r6 = r6.e()
            java.lang.String r6 = r6.a((java.lang.String) r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r11.a(r8, r13, r6)
            if (r9 == 0) goto L_0x0369
            com.google.android.gms.measurement.internal.k r6 = new com.google.android.gms.measurement.internal.k
            r15 = r6
            java.lang.String r17 = r4.q()
            r18 = 1
            r20 = 1
            r22 = 1
            long r24 = r4.s()
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r16 = r7
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r28, r29, r30, r31)
            goto L_0x0387
        L_0x0369:
            com.google.android.gms.measurement.internal.k r6 = new com.google.android.gms.measurement.internal.k
            java.lang.String r17 = r4.q()
            r18 = 1
            r20 = 1
            long r22 = r4.s()
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r15 = r6
            r16 = r7
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
        L_0x0387:
            r4 = r6
            goto L_0x03f4
        L_0x038a:
            r6 = 1
            if (r9 == 0) goto L_0x03c1
            com.google.android.gms.measurement.internal.k r4 = new com.google.android.gms.measurement.internal.k
            r15 = r4
            java.lang.String r8 = r11.f13623a
            r16 = r8
            java.lang.String r8 = r11.f13624b
            r17 = r8
            long r8 = r11.f13625c
            long r18 = r8 + r6
            long r8 = r11.f13626d
            long r20 = r8 + r6
            long r8 = r11.f13627e
            long r22 = r8 + r6
            long r6 = r11.f13628f
            r24 = r6
            long r6 = r11.f13629g
            r26 = r6
            java.lang.Long r6 = r11.f13630h
            r28 = r6
            java.lang.Long r6 = r11.i
            r29 = r6
            java.lang.Long r6 = r11.j
            r30 = r6
            java.lang.Boolean r6 = r11.k
            r31 = r6
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r28, r29, r30, r31)
            goto L_0x03f4
        L_0x03c1:
            com.google.android.gms.measurement.internal.k r4 = new com.google.android.gms.measurement.internal.k
            r31 = r4
            java.lang.String r8 = r11.f13623a
            r32 = r8
            java.lang.String r8 = r11.f13624b
            r33 = r8
            long r8 = r11.f13625c
            long r34 = r8 + r6
            long r8 = r11.f13626d
            long r36 = r8 + r6
            long r6 = r11.f13627e
            r38 = r6
            long r6 = r11.f13628f
            r40 = r6
            long r6 = r11.f13629g
            r42 = r6
            java.lang.Long r6 = r11.f13630h
            r44 = r6
            java.lang.Long r6 = r11.i
            r45 = r6
            java.lang.Long r6 = r11.j
            r46 = r6
            java.lang.Boolean r6 = r11.k
            r47 = r6
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)
        L_0x03f4:
            com.google.android.gms.measurement.internal.d r6 = r48.o()
            r6.a((com.google.android.gms.measurement.internal.C3171k) r4)
            long r6 = r4.f13625c
            java.lang.String r8 = r5.q()
            java.lang.Object r9 = r2.get(r8)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x041d
            com.google.android.gms.measurement.internal.d r9 = r48.o()
            java.lang.String r11 = r10.f13833d
            java.util.Map r9 = r9.f(r11, r8)
            if (r9 != 0) goto L_0x041a
            b.e.b r9 = new b.e.b
            r9.<init>()
        L_0x041a:
            r2.put(r8, r9)
        L_0x041d:
            java.util.Set r8 = r9.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0425:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x02fb
            java.lang.Object r11 = r8.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.util.Set<java.lang.Integer> r13 = r10.f13834e
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L_0x0451
            com.google.android.gms.measurement.internal.Bb r13 = r48.h()
            com.google.android.gms.measurement.internal.Db r13 = r13.B()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.a(r1, r11)
            goto L_0x0425
        L_0x0451:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Object r13 = r9.get(r13)
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
            r15 = 1
        L_0x0460:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x04b2
            java.lang.Object r15 = r13.next()
            c.b.b.b.d.f.C r15 = (c.b.b.b.d.f.C) r15
            com.google.android.gms.measurement.internal.Ce r12 = new com.google.android.gms.measurement.internal.Ce
            java.lang.String r14 = r10.f13833d
            r12.<init>(r10, r14, r11, r15)
            int r14 = r15.p()
            boolean r20 = r10.a(r11, r14)
            r15 = r12
            r16 = r5
            r17 = r6
            r19 = r4
            boolean r15 = r15.a(r16, r17, r19, r20)
            com.google.android.gms.measurement.internal.Ie r14 = r48.m()
            r16 = r0
            java.lang.String r0 = r10.f13833d
            r17 = r2
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.wa
            boolean r0 = r14.d(r0, r2)
            if (r0 == 0) goto L_0x04a4
            if (r15 != 0) goto L_0x04a4
            java.util.Set<java.lang.Integer> r0 = r10.f13834e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.add(r2)
            goto L_0x04b6
        L_0x04a4:
            com.google.android.gms.measurement.internal.Ae r0 = r10.a(r11)
            r0.a((com.google.android.gms.measurement.internal.Fe) r12)
            r0 = r16
            r2 = r17
            r12 = 1
            r14 = 0
            goto L_0x0460
        L_0x04b2:
            r16 = r0
            r17 = r2
        L_0x04b6:
            if (r15 != 0) goto L_0x04c1
            java.util.Set<java.lang.Integer> r0 = r10.f13834e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.add(r2)
        L_0x04c1:
            r0 = r16
            r2 = r17
            r12 = 1
            r14 = 0
            goto L_0x0425
        L_0x04c9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r51.isEmpty()
            if (r2 != 0) goto L_0x0633
            b.e.b r2 = new b.e.b
            r2.<init>()
            java.util.Iterator r3 = r51.iterator()
        L_0x04dd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0633
            java.lang.Object r4 = r3.next()
            c.b.b.b.d.f.ba r4 = (c.b.b.b.d.f.C0298ba) r4
            java.lang.String r5 = r4.q()
            r0.add(r5)
            java.lang.String r5 = r4.q()
            java.lang.Object r6 = r2.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x0510
            com.google.android.gms.measurement.internal.d r6 = r48.o()
            java.lang.String r7 = r10.f13833d
            java.util.Map r6 = r6.g(r7, r5)
            if (r6 != 0) goto L_0x050d
            b.e.b r6 = new b.e.b
            r6.<init>()
        L_0x050d:
            r2.put(r5, r6)
        L_0x0510:
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0518:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x062f
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.Set<java.lang.Integer> r8 = r10.f13834e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x0544
            com.google.android.gms.measurement.internal.Bb r4 = r48.h()
            com.google.android.gms.measurement.internal.Db r4 = r4.B()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.a(r1, r5)
            goto L_0x04dd
        L_0x0544:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r6.get(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r11 = 1
        L_0x0553:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0620
            java.lang.Object r9 = r8.next()
            c.b.b.b.d.f.F r9 = (c.b.b.b.d.f.F) r9
            com.google.android.gms.measurement.internal.Bb r11 = r48.h()
            r12 = 2
            boolean r11 = r11.a((int) r12)
            if (r11 == 0) goto L_0x05ac
            com.google.android.gms.measurement.internal.Bb r11 = r48.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.B()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r13 = r9.o()
            if (r13 == 0) goto L_0x0585
            int r13 = r9.p()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            goto L_0x0586
        L_0x0585:
            r14 = 0
        L_0x0586:
            com.google.android.gms.measurement.internal.zb r13 = r48.e()
            java.lang.String r15 = r9.q()
            java.lang.String r13 = r13.c(r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, property"
            r11.a(r15, r12, r14, r13)
            com.google.android.gms.measurement.internal.Bb r11 = r48.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.B()
            com.google.android.gms.measurement.internal.oe r12 = r48.n()
            java.lang.String r12 = r12.a((c.b.b.b.d.f.F) r9)
            java.lang.String r13 = "Filter definition"
            r11.a(r13, r12)
        L_0x05ac:
            boolean r11 = r9.o()
            if (r11 == 0) goto L_0x05f5
            int r11 = r9.p()
            r12 = 256(0x100, float:3.59E-43)
            if (r11 <= r12) goto L_0x05bb
            goto L_0x05f5
        L_0x05bb:
            com.google.android.gms.measurement.internal.Ee r11 = new com.google.android.gms.measurement.internal.Ee
            java.lang.String r12 = r10.f13833d
            r11.<init>(r10, r12, r7, r9)
            int r9 = r9.p()
            boolean r9 = r10.a(r7, r9)
            r12 = r52
            boolean r9 = r11.a(r12, r4, r9)
            com.google.android.gms.measurement.internal.Ie r13 = r48.m()
            java.lang.String r14 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C3202q.wa
            boolean r13 = r13.d(r14, r15)
            if (r13 == 0) goto L_0x05eb
            if (r9 != 0) goto L_0x05eb
            java.util.Set<java.lang.Integer> r8 = r10.f13834e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r8.add(r11)
            r11 = r9
            goto L_0x0622
        L_0x05eb:
            com.google.android.gms.measurement.internal.Ae r13 = r10.a(r7)
            r13.a((com.google.android.gms.measurement.internal.Fe) r11)
            r11 = r9
            goto L_0x0553
        L_0x05f5:
            r12 = r52
            com.google.android.gms.measurement.internal.Bb r8 = r48.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.w()
            java.lang.String r11 = r10.f13833d
            java.lang.Object r11 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r11)
            boolean r13 = r9.o()
            if (r13 == 0) goto L_0x0614
            int r9 = r9.p()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            goto L_0x0615
        L_0x0614:
            r14 = 0
        L_0x0615:
            java.lang.String r9 = java.lang.String.valueOf(r14)
            java.lang.String r13 = "Invalid property filter ID. appId, id"
            r8.a(r13, r11, r9)
            r11 = 0
            goto L_0x0622
        L_0x0620:
            r12 = r52
        L_0x0622:
            if (r11 != 0) goto L_0x0518
            java.util.Set<java.lang.Integer> r8 = r10.f13834e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.add(r7)
            goto L_0x0518
        L_0x062f:
            r12 = r52
            goto L_0x04dd
        L_0x0633:
            com.google.android.gms.measurement.internal.Ie r1 = r48.m()
            java.lang.String r2 = r10.f13833d
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.ta
            boolean r1 = r1.d(r2, r3)
            b.e.b r2 = new b.e.b
            r2.<init>()
            if (r1 == 0) goto L_0x0650
            com.google.android.gms.measurement.internal.d r1 = r48.o()
            java.lang.String r2 = r10.f13833d
            java.util.Map r2 = r1.a((java.lang.String) r2, (java.util.List<java.lang.String>) r0)
        L_0x0650:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.Ae> r0 = r10.f13835f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r3 = r10.f13834e
            r0.removeAll(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0664:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06ff
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.Ae> r4 = r10.f13835f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.measurement.internal.Ae r4 = (com.google.android.gms.measurement.internal.Ae) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            c.b.b.b.d.f.Q r4 = r4.a(r0, r5)
            r1.add(r4)
            com.google.android.gms.measurement.internal.d r5 = r48.o()
            java.lang.String r6 = r10.f13833d
            c.b.b.b.d.f.Z r4 = r4.q()
            r5.r()
            r5.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r6)
            com.google.android.gms.common.internal.C0563t.a(r4)
            byte[] r4 = r4.g()
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.String r8 = "app_id"
            r7.put(r8, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "audience_id"
            r7.put(r8, r0)
            java.lang.String r0 = "current_results"
            r7.put(r0, r4)
            android.database.sqlite.SQLiteDatabase r0 = r5.v()     // Catch:{ SQLiteException -> 0x06ea }
            java.lang.String r4 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r7 = r0.insertWithOnConflict(r4, r9, r7, r8)     // Catch:{ SQLiteException -> 0x06e8 }
            r11 = -1
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0664
            com.google.android.gms.measurement.internal.Bb r0 = r5.h()     // Catch:{ SQLiteException -> 0x06e8 }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ SQLiteException -> 0x06e8 }
            java.lang.String r4 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x06e8 }
            r0.a(r4, r7)     // Catch:{ SQLiteException -> 0x06e8 }
            goto L_0x0664
        L_0x06e8:
            r0 = move-exception
            goto L_0x06ec
        L_0x06ea:
            r0 = move-exception
            r9 = 0
        L_0x06ec:
            com.google.android.gms.measurement.internal.Bb r4 = r5.h()
            com.google.android.gms.measurement.internal.Db r4 = r4.t()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r6)
            java.lang.String r6 = "Error storing filter results. appId"
            r4.a(r6, r5, r0)
            goto L_0x0664
        L_0x06ff:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ye.a(java.lang.String, java.util.List, java.util.List, java.lang.Long):java.util.List");
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }
}
