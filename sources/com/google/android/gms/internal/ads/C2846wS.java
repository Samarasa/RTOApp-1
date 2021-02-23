package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.wS  reason: case insensitive filesystem */
public final class C2846wS {

    /* renamed from: a  reason: collision with root package name */
    private final e f12623a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12624b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f12625c = C3059zS.f13047a;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f12626d = 0;

    public C2846wS(e eVar) {
        this.f12623a = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r5, int r6) {
        /*
            r4 = this;
            r4.d()
            com.google.android.gms.common.util.e r0 = r4.f12623a
            long r0 = r0.a()
            java.lang.Object r2 = r4.f12624b
            monitor-enter(r2)
            int r3 = r4.f12625c     // Catch:{ all -> 0x001e }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x0012:
            r4.f12625c = r6     // Catch:{ all -> 0x001e }
            int r5 = r4.f12625c     // Catch:{ all -> 0x001e }
            int r6 = com.google.android.gms.internal.ads.C3059zS.f13049c     // Catch:{ all -> 0x001e }
            if (r5 != r6) goto L_0x001c
            r4.f12626d = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2846wS.a(int, int):void");
    }

    private final void d() {
        long a2 = this.f12623a.a();
        synchronized (this.f12624b) {
            if (this.f12625c == C3059zS.f13049c) {
                if (this.f12626d + ((Long) Qqa.e().a(F.me)).longValue() <= a2) {
                    this.f12625c = C3059zS.f13047a;
                }
            }
        }
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C3059zS.f13047a;
            i2 = C3059zS.f13048b;
        } else {
            i = C3059zS.f13048b;
            i2 = C3059zS.f13047a;
        }
        a(i, i2);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f12624b) {
            d();
            z = this.f12625c == C3059zS.f13048b;
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f12624b) {
            d();
            z = this.f12625c == C3059zS.f13049c;
        }
        return z;
    }

    public final void c() {
        a(C3059zS.f13048b, C3059zS.f13049c);
    }
}
