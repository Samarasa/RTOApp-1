package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bk  reason: case insensitive filesystem */
final class C0602Bk {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6350a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f6351b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f6352c;

    private C0602Bk() {
        this.f6350a = new Object();
        this.f6351b = C0576Ak.f6173a;
        this.f6352c = 0;
    }

    /* synthetic */ C0602Bk(C3016yk ykVar) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.p.j()
            long r0 = r0.a()
            java.lang.Object r2 = r7.f6350a
            monitor-enter(r2)
            int r3 = r7.f6351b     // Catch:{ all -> 0x004f }
            int r4 = com.google.android.gms.internal.ads.C0576Ak.f6174b     // Catch:{ all -> 0x004f }
            if (r3 != r4) goto L_0x002c
            long r3 = r7.f6352c     // Catch:{ all -> 0x004f }
            com.google.android.gms.internal.ads.p<java.lang.Long> r5 = com.google.android.gms.internal.ads.F.me     // Catch:{ all -> 0x004f }
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x004f }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x004f }
            long r5 = r5.longValue()     // Catch:{ all -> 0x004f }
            long r3 = r3 + r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.ads.C0576Ak.f6173a     // Catch:{ all -> 0x004f }
            r7.f6351b = r0     // Catch:{ all -> 0x004f }
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.p.j()
            long r0 = r0.a()
            java.lang.Object r3 = r7.f6350a
            monitor-enter(r3)
            int r2 = r7.f6351b     // Catch:{ all -> 0x004c }
            r4 = 2
            if (r2 == r4) goto L_0x003f
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            return
        L_0x003f:
            r2 = 3
            r7.f6351b = r2     // Catch:{ all -> 0x004c }
            int r2 = r7.f6351b     // Catch:{ all -> 0x004c }
            int r4 = com.google.android.gms.internal.ads.C0576Ak.f6174b     // Catch:{ all -> 0x004c }
            if (r2 != r4) goto L_0x004a
            r7.f6352c = r0     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r0
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0602Bk.a():void");
    }
}
