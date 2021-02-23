package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.T;

final class De {

    /* renamed from: a  reason: collision with root package name */
    private T f13226a;

    /* renamed from: b  reason: collision with root package name */
    private Long f13227b;

    /* renamed from: c  reason: collision with root package name */
    private long f13228c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ye f13229d;

    private De(ye yeVar) {
        this.f13229d = yeVar;
    }

    /* synthetic */ De(ye yeVar, Be be) {
        this(yeVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c.b.b.b.d.f.T a(java.lang.String r18, c.b.b.b.d.f.T r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.q()
            java.util.List r10 = r19.o()
            com.google.android.gms.measurement.internal.ye r2 = r1.f13229d
            r2.n()
            java.lang.String r2 = "_eid"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.oe.b(r8, r2)
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            r3 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0022
            r6 = 1
            goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            r11 = 0
            if (r7 == 0) goto L_0x0146
            com.google.android.gms.measurement.internal.ye r6 = r1.f13229d
            r6.n()
            java.lang.String r6 = "_en"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.oe.b(r8, r6)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x0059
            com.google.android.gms.measurement.internal.ye r0 = r1.f13229d
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.a(r2, r4)
            return r7
        L_0x0059:
            c.b.b.b.d.f.T r6 = r1.f13226a
            if (r6 == 0) goto L_0x006f
            java.lang.Long r6 = r1.f13227b
            if (r6 == 0) goto L_0x006f
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.f13227b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x009e
        L_0x006f:
            com.google.android.gms.measurement.internal.ye r6 = r1.f13229d
            com.google.android.gms.measurement.internal.d r6 = r6.o()
            android.util.Pair r6 = r6.a((java.lang.String) r0, (java.lang.Long) r4)
            if (r6 == 0) goto L_0x0136
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0081
            goto L_0x0136
        L_0x0081:
            c.b.b.b.d.f.T r13 = (c.b.b.b.d.f.T) r13
            r1.f13226a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.f13228c = r6
            com.google.android.gms.measurement.internal.ye r6 = r1.f13229d
            r6.n()
            c.b.b.b.d.f.T r6 = r1.f13226a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.oe.b(r6, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r1.f13227b = r2
        L_0x009e:
            long r6 = r1.f13228c
            r13 = 1
            long r6 = r6 - r13
            r1.f13228c = r6
            long r6 = r1.f13228c
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00de
            com.google.android.gms.measurement.internal.ye r2 = r1.f13229d
            com.google.android.gms.measurement.internal.d r2 = r2.o()
            r2.c()
            com.google.android.gms.measurement.internal.Bb r4 = r2.h()
            com.google.android.gms.measurement.internal.Db r4 = r4.B()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.a(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r2.v()     // Catch:{ SQLiteException -> 0x00cf }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00cf }
            r3[r5] = r0     // Catch:{ SQLiteException -> 0x00cf }
            r4.execSQL(r6, r3)     // Catch:{ SQLiteException -> 0x00cf }
            goto L_0x00ed
        L_0x00cf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.String r3 = "Error clearing complex main event"
            r2.a(r3, r0)
            goto L_0x00ed
        L_0x00de:
            com.google.android.gms.measurement.internal.ye r2 = r1.f13229d
            com.google.android.gms.measurement.internal.d r2 = r2.o()
            long r5 = r1.f13228c
            c.b.b.b.d.f.T r7 = r1.f13226a
            r3 = r18
            r2.a(r3, r4, r5, r7)
        L_0x00ed:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c.b.b.b.d.f.T r2 = r1.f13226a
            java.util.List r2 = r2.o()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011b
            java.lang.Object r3 = r2.next()
            c.b.b.b.d.f.V r3 = (c.b.b.b.d.f.V) r3
            com.google.android.gms.measurement.internal.ye r4 = r1.f13229d
            r4.n()
            java.lang.String r4 = r3.o()
            c.b.b.b.d.f.V r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r8, (java.lang.String) r4)
            if (r4 != 0) goto L_0x00fc
            r0.add(r3)
            goto L_0x00fc
        L_0x011b:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0126
            r0.addAll(r10)
            r10 = r0
            goto L_0x0189
        L_0x0126:
            com.google.android.gms.measurement.internal.ye r0 = r1.f13229d
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r2 = "No unique parameters in main event. eventName"
        L_0x0132:
            r0.a(r2, r9)
            goto L_0x0189
        L_0x0136:
            com.google.android.gms.measurement.internal.ye r0 = r1.f13229d
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.a(r2, r9, r4)
            return r7
        L_0x0146:
            if (r6 == 0) goto L_0x0189
            r1.f13227b = r4
            r1.f13226a = r8
            com.google.android.gms.measurement.internal.ye r2 = r1.f13229d
            r2.n()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "_epc"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.oe.b(r8, r3)
            if (r3 != 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r2 = r3
        L_0x015f:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.f13228c = r2
            long r2 = r1.f13228c
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x017a
            com.google.android.gms.measurement.internal.ye r0 = r1.f13229d
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            goto L_0x0132
        L_0x017a:
            com.google.android.gms.measurement.internal.ye r2 = r1.f13229d
            com.google.android.gms.measurement.internal.d r2 = r2.o()
            long r5 = r1.f13228c
            r3 = r18
            r7 = r19
            r2.a(r3, r4, r5, r7)
        L_0x0189:
            c.b.b.b.d.f.Lb$b r0 = r19.k()
            c.b.b.b.d.f.T$a r0 = (c.b.b.b.d.f.T.a) r0
            r0.a((java.lang.String) r9)
            r0.m()
            r0.a((java.lang.Iterable<? extends c.b.b.b.d.f.V>) r10)
            c.b.b.b.d.f.wc r0 = r0.j()
            c.b.b.b.d.f.T r0 = (c.b.b.b.d.f.T) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.De.a(java.lang.String, c.b.b.b.d.f.T):c.b.b.b.d.f.T");
    }
}
