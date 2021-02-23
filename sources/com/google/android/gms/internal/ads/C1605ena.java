package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.ena  reason: case insensitive filesystem */
public final class C1605ena {

    /* renamed from: a  reason: collision with root package name */
    private final C1818hna f10303a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10304b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10305c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10306d;

    /* renamed from: e  reason: collision with root package name */
    private long f10307e;

    /* renamed from: f  reason: collision with root package name */
    private long f10308f;

    /* renamed from: g  reason: collision with root package name */
    private long f10309g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10310h;
    private long i;
    private long j;
    private long k;

    private C1605ena(double d2) {
        long j2;
        this.f10304b = d2 != -1.0d;
        if (this.f10304b) {
            this.f10303a = C1818hna.b();
            this.f10305c = (long) (1.0E9d / d2);
            j2 = (this.f10305c * 80) / 100;
        } else {
            this.f10303a = null;
            j2 = -1;
            this.f10305c = -1;
        }
        this.f10306d = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1605ena(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1605ena.<init>(android.content.Context):void");
    }

    private final boolean b(long j2, long j3) {
        return Math.abs((j3 - this.i) - (j2 - this.j)) > 20000000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (b(r0, r14) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f10310h
            if (r2 == 0) goto L_0x0040
            long r2 = r11.f10307e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.k
            r4 = 1
            long r2 = r2 + r4
            r11.k = r2
            long r2 = r11.f10309g
            r11.f10308f = r2
        L_0x0019:
            long r2 = r11.k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x0038
            long r4 = r11.j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f10308f
            long r2 = r2 + r4
            boolean r4 = r11.b(r2, r14)
            if (r4 == 0) goto L_0x0031
            goto L_0x003e
        L_0x0031:
            long r4 = r11.i
            long r4 = r4 + r2
            long r6 = r11.j
            long r4 = r4 - r6
            goto L_0x0042
        L_0x0038:
            boolean r2 = r11.b(r0, r14)
            if (r2 == 0) goto L_0x0040
        L_0x003e:
            r11.f10310h = r6
        L_0x0040:
            r4 = r14
            r2 = r0
        L_0x0042:
            boolean r6 = r11.f10310h
            r7 = 0
            if (r6 != 0) goto L_0x0051
            r11.j = r0
            r11.i = r14
            r11.k = r7
            r14 = 1
            r11.f10310h = r14
        L_0x0051:
            r11.f10307e = r12
            r11.f10309g = r2
            com.google.android.gms.internal.ads.hna r12 = r11.f10303a
            if (r12 == 0) goto L_0x0084
            long r12 = r12.f10727b
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0060
            goto L_0x0084
        L_0x0060:
            com.google.android.gms.internal.ads.hna r12 = r11.f10303a
            long r12 = r12.f10727b
            long r14 = r11.f10305c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            long r14 = r12 - r14
            goto L_0x0077
        L_0x0073:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0077:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r12 = r14
        L_0x0080:
            long r14 = r11.f10306d
            long r12 = r12 - r14
            return r12
        L_0x0084:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1605ena.a(long, long):long");
    }

    public final void a() {
        if (this.f10304b) {
            this.f10303a.a();
        }
    }

    public final void b() {
        this.f10310h = false;
        if (this.f10304b) {
            this.f10303a.c();
        }
    }
}
