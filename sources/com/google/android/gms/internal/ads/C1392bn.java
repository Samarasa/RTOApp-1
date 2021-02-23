package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.bn  reason: case insensitive filesystem */
public final class C1392bn extends C0994Qm implements C0656Dm {

    /* renamed from: d  reason: collision with root package name */
    private C2665tm f9963d;

    /* renamed from: e  reason: collision with root package name */
    private String f9964e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9965f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f9966g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9967h;

    public C1392bn(C1175Xl xl, C1201Yl yl) {
        super(xl);
        this.f9963d = new C2665tm(xl.getContext(), yl, (C1175Xl) this.f8388c.get());
        this.f9963d.a((C0656Dm) this);
    }

    private static String b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void d(String str) {
        synchronized (this) {
            this.f9965f = true;
            notify();
            a();
        }
        String str2 = this.f9964e;
        if (str2 != null) {
            String b2 = b(str2);
            Exception exc = this.f9966g;
            if (exc != null) {
                a(this.f9964e, b2, "badUrl", b(str, exc));
            } else {
                a(this.f9964e, b2, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final void a() {
        C2665tm tmVar = this.f9963d;
        if (tmVar != null) {
            tmVar.a((C0656Dm) null);
            this.f9963d.d();
        }
        super.a();
    }

    public final void a(int i) {
    }

    public final void a(int i, int i2) {
    }

    public final void a(String str, Exception exc) {
        String str2 = (String) Qqa.e().a(F.l);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.f9966g = exc;
        C1018Rk.c("Precache error", exc);
        d(str);
    }

    public final void a(boolean z, long j) {
        C1175Xl xl = (C1175Xl) this.f8388c.get();
        if (xl != null) {
            C1252_k.f9703e.execute(new C1604en(xl, z, j));
        }
    }

    public final boolean a(String str) {
        return a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0098, code lost:
        if (r15.f9966g == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        throw r15.f9966g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r17 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r5 = r47;
        r6 = r48;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r5.a(r6, r7, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r48, java.lang.String[] r49) {
        /*
            r47 = this;
            r15 = r47
            r13 = r48
            r0 = r49
            r15.f9964e = r13
            java.lang.String r14 = r47.b((java.lang.String) r48)
            java.lang.String r17 = "error"
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01d7 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01d7 }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01d7 }
            if (r2 >= r3) goto L_0x0022
            r3 = r0[r2]     // Catch:{ Exception -> 0x01d7 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01d7 }
            r1[r2] = r3     // Catch:{ Exception -> 0x01d7 }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            com.google.android.gms.internal.ads.tm r0 = r15.f9963d     // Catch:{ Exception -> 0x01d7 }
            java.lang.String r2 = r15.f8387b     // Catch:{ Exception -> 0x01d7 }
            r0.a((android.net.Uri[]) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x01d7 }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.Xl> r0 = r15.f8388c     // Catch:{ Exception -> 0x01d7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.Xl r0 = (com.google.android.gms.internal.ads.C1175Xl) r0     // Catch:{ Exception -> 0x01d7 }
            if (r0 == 0) goto L_0x0036
            r0.a((java.lang.String) r14, (com.google.android.gms.internal.ads.C0994Qm) r15)     // Catch:{ Exception -> 0x01d7 }
        L_0x0036:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.p.j()     // Catch:{ Exception -> 0x01d7 }
            long r19 = r0.a()     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.p<java.lang.Long> r1 = com.google.android.gms.internal.ads.F.s     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x01d7 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x01d7 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01d7 }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.p<java.lang.Long> r1 = com.google.android.gms.internal.ads.F.r     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x01d7 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x01d7 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01d7 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01d7 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.p<java.lang.Integer> r1 = com.google.android.gms.internal.ads.F.q     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x01d7 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x01d7 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01d7 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01d7 }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.F.vb     // Catch:{ Exception -> 0x01d7 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x01d7 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x01d7 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01d7 }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01d7 }
            r22 = -1
            r1 = r22
        L_0x0087:
            monitor-enter(r47)     // Catch:{ Exception -> 0x01d7 }
            long r3 = r0.a()     // Catch:{ all -> 0x01cd }
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x01a2
            boolean r3 = r15.f9965f     // Catch:{ all -> 0x01cd }
            if (r3 == 0) goto L_0x00ae
            java.lang.Exception r0 = r15.f9966g     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r15.f9966g     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x009f:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            r17 = r1
            goto L_0x01ce
        L_0x00ae:
            boolean r3 = r15.f9967h     // Catch:{ all -> 0x01cd }
            r24 = 1
            if (r3 == 0) goto L_0x00b8
            monitor-exit(r47)     // Catch:{ all -> 0x01cd }
            r5 = r15
            goto L_0x016f
        L_0x00b8:
            com.google.android.gms.internal.ads.tm r3 = r15.f9963d     // Catch:{ all -> 0x01cd }
            com.google.android.gms.internal.ads.zia r3 = r3.e()     // Catch:{ all -> 0x01cd }
            if (r3 == 0) goto L_0x0195
            long r4 = r3.getDuration()     // Catch:{ all -> 0x01cd }
            r25 = 0
            int r8 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r8 <= 0) goto L_0x0173
            long r27 = r3.fa()     // Catch:{ all -> 0x01cd }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x013e
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d8
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            if (r21 == 0) goto L_0x00e4
            com.google.android.gms.internal.ads.tm r1 = r15.f9963d     // Catch:{ all -> 0x01cd }
            long r1 = r1.j()     // Catch:{ all -> 0x01cd }
            r29 = r1
            goto L_0x00e6
        L_0x00e4:
            r29 = r22
        L_0x00e6:
            if (r21 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.tm r1 = r15.f9963d     // Catch:{ all -> 0x01cd }
            long r1 = r1.i()     // Catch:{ all -> 0x01cd }
            r31 = r1
            goto L_0x00f3
        L_0x00f1:
            r31 = r22
        L_0x00f3:
            if (r21 == 0) goto L_0x00fe
            com.google.android.gms.internal.ads.tm r1 = r15.f9963d     // Catch:{ all -> 0x01cd }
            long r1 = r1.c()     // Catch:{ all -> 0x01cd }
            r33 = r1
            goto L_0x0100
        L_0x00fe:
            r33 = r22
        L_0x0100:
            int r16 = com.google.android.gms.internal.ads.C2665tm.f()     // Catch:{ all -> 0x0136 }
            int r35 = com.google.android.gms.internal.ads.C2665tm.g()     // Catch:{ all -> 0x0136 }
            r1 = r47
            r2 = r48
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.a(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x012d }
            r3 = r27
            r1 = r36
            goto L_0x014b
        L_0x012d:
            r0 = move-exception
            r5 = r47
            r6 = r48
            r7 = r44
            goto L_0x01d1
        L_0x0136:
            r0 = move-exception
            r5 = r47
            r6 = r48
            r7 = r14
            goto L_0x01d1
        L_0x013e:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r45 = r1
            r1 = r4
            r3 = r45
        L_0x014b:
            int r5 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x015a
            r5 = r47
            r6 = r48
            r7 = r44
            r5.a((java.lang.String) r6, (java.lang.String) r7, (long) r1)     // Catch:{ all -> 0x01d5 }
        L_0x0158:
            monitor-exit(r47)     // Catch:{ all -> 0x01d5 }
            goto L_0x016f
        L_0x015a:
            r5 = r47
            r6 = r48
            r7 = r44
            com.google.android.gms.internal.ads.tm r1 = r5.f9963d     // Catch:{ all -> 0x01d5 }
            long r1 = r1.b()     // Catch:{ all -> 0x01d5 }
            int r8 = (r1 > r38 ? 1 : (r1 == r38 ? 0 : -1))
            if (r8 < 0) goto L_0x0170
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x0170
            goto L_0x0158
        L_0x016f:
            return r24
        L_0x0170:
            r1 = r42
            goto L_0x017c
        L_0x0173:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r1
            r1 = r11
        L_0x017c:
            r5.wait(r1)     // Catch:{ InterruptedException -> 0x018b }
            monitor-exit(r47)     // Catch:{ all -> 0x01d5 }
            r11 = r1
            r1 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0087
        L_0x018b:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c9 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x0195:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c9 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01a2:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c9 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c9 }
            r3.<init>(r2)     // Catch:{ all -> 0x01c9 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x01c9 }
            r8 = r40
            r3.append(r8)     // Catch:{ all -> 0x01c9 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x01c9 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01c9 }
            r0.<init>(r2)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            r17 = r1
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
        L_0x01ce:
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01d1:
            monitor-exit(r47)     // Catch:{ all -> 0x01d5 }
            throw r0     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            goto L_0x01db
        L_0x01d5:
            r0 = move-exception
            goto L_0x01d1
        L_0x01d7:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01db:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r48)
            int r3 = r3.length()
            int r3 = r3 + 34
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to preload url "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = " Exception: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.C1018Rk.d(r2)
            r47.a()
            java.lang.String r0 = b(r1, r0)
            r5.a(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1392bn.a(java.lang.String, java.lang.String[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final void b() {
        d((String) null);
    }

    public final void b(int i) {
        this.f9963d.h().c(i);
    }

    public final C2665tm c() {
        synchronized (this) {
            this.f9967h = true;
            notify();
        }
        this.f9963d.a((C0656Dm) null);
        C2665tm tmVar = this.f9963d;
        this.f9963d = null;
        return tmVar;
    }

    public final void c(int i) {
        this.f9963d.h().d(i);
    }

    public final void d(int i) {
        this.f9963d.h().a(i);
    }

    public final void e(int i) {
        this.f9963d.h().b(i);
    }
}
