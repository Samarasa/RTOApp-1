package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Av  reason: case insensitive filesystem */
public final class C0587Av extends C0874Lw<C0691Ev> {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f6219b;

    /* renamed from: c  reason: collision with root package name */
    private final e f6220c;

    /* renamed from: d  reason: collision with root package name */
    private long f6221d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f6222e = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6223f = false;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f6224g;

    public C0587Av(ScheduledExecutorService scheduledExecutorService, e eVar) {
        super(Collections.emptySet());
        this.f6219b = scheduledExecutorService;
        this.f6220c = eVar;
    }

    /* access modifiers changed from: private */
    public final void Y() {
        a(C0665Dv.f6657a);
    }

    private final synchronized void a(long j) {
        if (this.f6224g != null && !this.f6224g.isDone()) {
            this.f6224g.cancel(true);
        }
        this.f6221d = this.f6220c.b() + j;
        this.f6224g = this.f6219b.schedule(new C0717Fv(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void X() {
        this.f6223f = false;
        a(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0043 }
            long r1 = (long) r7     // Catch:{ all -> 0x0043 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0043 }
            boolean r7 = r6.f6223f     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0025
            long r2 = r6.f6222e     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            long r2 = r6.f6222e     // Catch:{ all -> 0x0043 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            long r0 = r6.f6222e     // Catch:{ all -> 0x0043 }
        L_0x0021:
            r6.f6222e = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return
        L_0x0025:
            com.google.android.gms.common.util.e r7 = r6.f6220c     // Catch:{ all -> 0x0043 }
            long r2 = r7.b()     // Catch:{ all -> 0x0043 }
            long r4 = r6.f6221d     // Catch:{ all -> 0x0043 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003e
            long r2 = r6.f6221d     // Catch:{ all -> 0x0043 }
            com.google.android.gms.common.util.e r7 = r6.f6220c     // Catch:{ all -> 0x0043 }
            long r4 = r7.b()     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0041
        L_0x003e:
            r6.a((long) r0)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r6)
            return
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0587Av.b(int):void");
    }

    public final synchronized void onPause() {
        if (!this.f6223f) {
            if (this.f6224g == null || this.f6224g.isCancelled()) {
                this.f6222e = -1;
            } else {
                this.f6224g.cancel(true);
                this.f6222e = this.f6221d - this.f6220c.b();
            }
            this.f6223f = true;
        }
    }

    public final synchronized void onResume() {
        if (this.f6223f) {
            if (this.f6222e > 0 && this.f6224g.isCancelled()) {
                a(this.f6222e);
            }
            this.f6223f = false;
        }
    }
}
