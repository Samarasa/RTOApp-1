package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cn  reason: case insensitive filesystem */
public final class C1463cn extends C0994Qm implements Dma<C2170mma> {

    /* renamed from: d  reason: collision with root package name */
    private String f10078d;

    /* renamed from: e  reason: collision with root package name */
    private final C1201Yl f10079e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10080f;

    /* renamed from: g  reason: collision with root package name */
    private final C1254_m f10081g = new C1254_m();

    /* renamed from: h  reason: collision with root package name */
    private final C0786Im f10082h = new C0786Im();
    private ByteBuffer i;
    private boolean j;
    private final Object k = new Object();
    private final String l;
    private final int m;
    private boolean n;

    public C1463cn(C1175Xl xl, C1201Yl yl) {
        super(xl);
        this.f10079e = yl;
        this.l = xl != null ? xl.K() : BuildConfig.FLAVOR;
        this.m = xl != null ? xl.M() : 0;
    }

    private final void f() {
        int a2 = (int) this.f10081g.a();
        int a3 = (int) this.f10082h.a(this.i);
        int position = this.i.position();
        int round = Math.round(((float) a3) * (((float) position) / ((float) a2)));
        boolean z = round > 0;
        int f2 = C2665tm.f();
        int g2 = C2665tm.g();
        String str = this.f10078d;
        a(str, b(str), position, a2, (long) round, (long) a3, z, f2, g2);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
    }

    public final /* synthetic */ void a(Object obj, C2241nma nma) {
        C2170mma mma = (C2170mma) obj;
        if (mma instanceof C2383pma) {
            this.f10081g.a((C2383pma) mma);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.gms.internal.ads.pma} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.internal.ads.pma} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.google.android.gms.internal.ads.om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.internal.ads.pma} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r9.i.remaining() > 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r9.f10080f != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r12 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if ((r12 - r16) < r4) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        f();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.i.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.f10078d = r10
            java.lang.String r11 = r21.b(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.pma r0 = new com.google.android.gms.internal.ads.pma     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r9.f8387b     // Catch:{ Exception -> 0x0143 }
            r3 = 0
            com.google.android.gms.internal.ads.Yl r1 = r9.f10079e     // Catch:{ Exception -> 0x0143 }
            int r5 = r1.f9471d     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.Yl r1 = r9.f10079e     // Catch:{ Exception -> 0x0143 }
            int r6 = r1.f9473f     // Catch:{ Exception -> 0x0143 }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.Yl r1 = r9.f10079e     // Catch:{ Exception -> 0x0143 }
            boolean r1 = r1.j     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.om r8 = new com.google.android.gms.internal.ads.om     // Catch:{ Exception -> 0x0039 }
            android.content.Context r2 = r9.f8386a     // Catch:{ Exception -> 0x0039 }
            java.lang.String r4 = r9.l     // Catch:{ Exception -> 0x0039 }
            int r5 = r9.m     // Catch:{ Exception -> 0x0039 }
            r6 = 0
            r7 = 0
            r1 = r8
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0039 }
            r0 = r8
            goto L_0x003c
        L_0x0039:
            r0 = move-exception
            goto L_0x0146
        L_0x003c:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.nma r2 = new com.google.android.gms.internal.ads.nma     // Catch:{ Exception -> 0x0143 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0143 }
            r0.a(r2)     // Catch:{ Exception -> 0x0143 }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.Xl> r1 = r9.f8388c     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.Xl r1 = (com.google.android.gms.internal.ads.C1175Xl) r1     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x0055
            r1.a((java.lang.String) r11, (com.google.android.gms.internal.ads.C0994Qm) r9)     // Catch:{ Exception -> 0x0039 }
        L_0x0055:
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.p.j()     // Catch:{ Exception -> 0x0143 }
            long r2 = r1.a()     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.p<java.lang.Long> r4 = com.google.android.gms.internal.ads.F.s     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.B r5 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ Exception -> 0x0143 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0143 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.p<java.lang.Long> r6 = com.google.android.gms.internal.ads.F.r     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.B r7 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r6 = r7.a(r6)     // Catch:{ Exception -> 0x0143 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0143 }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.internal.ads.Yl r8 = r9.f10079e     // Catch:{ Exception -> 0x0143 }
            int r8 = r8.f9470c     // Catch:{ Exception -> 0x0143 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x0143 }
            r9.i = r8     // Catch:{ Exception -> 0x0143 }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x0143 }
            r16 = r2
        L_0x008d:
            java.nio.ByteBuffer r14 = r9.i     // Catch:{ Exception -> 0x0143 }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x0143 }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x0143 }
            int r14 = r0.read(r15, r13, r14)     // Catch:{ Exception -> 0x0143 }
            r8 = -1
            if (r14 != r8) goto L_0x00b0
            r8 = 1
            r9.n = r8     // Catch:{ Exception -> 0x0039 }
            com.google.android.gms.internal.ads.Im r0 = r9.f10082h     // Catch:{ Exception -> 0x0039 }
            java.nio.ByteBuffer r1 = r9.i     // Catch:{ Exception -> 0x0039 }
            long r0 = r0.a(r1)     // Catch:{ Exception -> 0x0039 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0039 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0039 }
            r9.a((java.lang.String) r10, (java.lang.String) r11, (long) r0)     // Catch:{ Exception -> 0x0039 }
        L_0x00ae:
            r1 = 1
            goto L_0x00cf
        L_0x00b0:
            java.lang.Object r8 = r9.k     // Catch:{ Exception -> 0x0143 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0143 }
            boolean r13 = r9.f10080f     // Catch:{ all -> 0x0138 }
            if (r13 != 0) goto L_0x00c0
            java.nio.ByteBuffer r13 = r9.i     // Catch:{ all -> 0x0138 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x0141 }
            goto L_0x00c2
        L_0x00c0:
            r18 = r12
        L_0x00c2:
            monitor-exit(r8)     // Catch:{ all -> 0x0141 }
            java.nio.ByteBuffer r8 = r9.i     // Catch:{ Exception -> 0x013d }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x013d }
            if (r8 > 0) goto L_0x00d0
            r21.f()     // Catch:{ Exception -> 0x013d }
            goto L_0x00ae
        L_0x00cf:
            return r1
        L_0x00d0:
            boolean r8 = r9.f10080f     // Catch:{ Exception -> 0x013d }
            if (r8 != 0) goto L_0x0112
            long r12 = r1.a()     // Catch:{ Exception -> 0x013d }
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00e3
            r21.f()     // Catch:{ Exception -> 0x013d }
            r16 = r12
        L_0x00e3:
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00f2
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x008d
        L_0x00f2:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0039 }
            r1.append(r6)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0039 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0039 }
            throw r1     // Catch:{ Exception -> 0x0039 }
        L_0x0112:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0039 }
            java.nio.ByteBuffer r1 = r9.i     // Catch:{ Exception -> 0x0039 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0039 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0039 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0039 }
            r3.append(r1)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0138:
            r0 = move-exception
            r18 = r12
        L_0x013b:
            monitor-exit(r8)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            r0 = move-exception
            r12 = r18
            goto L_0x0146
        L_0x0141:
            r0 = move-exception
            goto L_0x013b
        L_0x0143:
            r0 = move-exception
            r18 = r12
        L_0x0146:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.C1018Rk.d(r1)
            r9.a(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1463cn.a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final void b() {
        this.f10080f = true;
    }

    public final ByteBuffer c() {
        synchronized (this.k) {
            if (this.i != null && !this.j) {
                this.i.flip();
                this.j = true;
            }
            this.f10080f = true;
        }
        return this.i;
    }

    public final String d() {
        return this.f10078d;
    }

    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }

    public final boolean e() {
        return this.n;
    }
}
