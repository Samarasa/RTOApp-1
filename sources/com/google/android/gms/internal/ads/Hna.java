package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

public final class Hna {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7209a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Kna f7210b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7211c = false;

    public final Activity a() {
        synchronized (this.f7209a) {
            if (this.f7210b == null) {
                return null;
            }
            Activity a2 = this.f7210b.a();
            return a2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7209a
            monitor-enter(r0)
            boolean r1 = r4.f7211c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x000f
            r2 = r5
        L_0x000f:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0016
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.C1018Rk.d(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.Kna r2 = r4.f7210b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.Kna r2 = new com.google.android.gms.internal.ads.Kna     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r4.f7210b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.Kna r2 = r4.f7210b     // Catch:{ all -> 0x0034 }
            r2.a((android.app.Application) r1, (android.content.Context) r5)     // Catch:{ all -> 0x0034 }
            r5 = 1
            r4.f7211c = r5     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Hna.a(android.content.Context):void");
    }

    public final void a(Mna mna) {
        synchronized (this.f7209a) {
            if (this.f7210b == null) {
                this.f7210b = new Kna();
            }
            this.f7210b.a(mna);
        }
    }

    public final Context b() {
        synchronized (this.f7209a) {
            if (this.f7210b == null) {
                return null;
            }
            Context b2 = this.f7210b.b();
            return b2;
        }
    }

    public final void b(Mna mna) {
        synchronized (this.f7209a) {
            if (this.f7210b != null) {
                this.f7210b.b(mna);
            }
        }
    }
}
