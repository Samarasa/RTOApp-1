package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.internal.ads.woa  reason: case insensitive filesystem */
public final class C2883woa {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f12693a = new C2812voa(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f12694b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Coa f12695c;

    /* renamed from: d  reason: collision with root package name */
    private Context f12696d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Goa f12697e;

    private final synchronized Coa a(C0547c.a aVar, C0547c.b bVar) {
        return new Coa(this.f12696d, p.q().b(), aVar, bVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12694b
            monitor-enter(r0)
            android.content.Context r1 = r3.f12696d     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.Coa r1 = r3.f12695c     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.google.android.gms.internal.ads.xoa r1 = new com.google.android.gms.internal.ads.xoa     // Catch:{ all -> 0x0025 }
            r1.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.Boa r2 = new com.google.android.gms.internal.ads.Boa     // Catch:{ all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.Coa r1 = r3.a((com.google.android.gms.common.internal.C0547c.a) r1, (com.google.android.gms.common.internal.C0547c.b) r2)     // Catch:{ all -> 0x0025 }
            r3.f12695c = r1     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.Coa r1 = r3.f12695c     // Catch:{ all -> 0x0025 }
            r1.j()     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2883woa.b():void");
    }

    /* access modifiers changed from: private */
    public final void c() {
        synchronized (this.f12694b) {
            if (this.f12695c != null) {
                if (this.f12695c.isConnected() || this.f12695c.c()) {
                    this.f12695c.e();
                }
                this.f12695c = null;
                this.f12697e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final Aoa a(Foa foa) {
        synchronized (this.f12694b) {
            if (this.f12697e == null) {
                Aoa aoa = new Aoa();
                return aoa;
            }
            try {
                if (this.f12695c.A()) {
                    Aoa c2 = this.f12697e.c(foa);
                    return c2;
                }
                Aoa b2 = this.f12697e.b(foa);
                return b2;
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call into cache service.", e2);
                return new Aoa();
            }
        }
    }

    public final void a() {
        if (((Boolean) Qqa.e().a(F.Jc)).booleanValue()) {
            synchronized (this.f12694b) {
                b();
                oa.f5628a.removeCallbacks(this.f12693a);
                oa.f5628a.postDelayed(this.f12693a, ((Long) Qqa.e().a(F.Kc)).longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f12694b
            monitor-enter(r0)
            android.content.Context r1 = r2.f12696d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f12696d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.F.Ic     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.F.Hc     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.yoa r3 = new com.google.android.gms.internal.ads.yoa     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.Hna r1 = com.google.android.gms.ads.internal.p.f()     // Catch:{ all -> 0x0048 }
            r1.a((com.google.android.gms.internal.ads.Mna) r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2883woa.a(android.content.Context):void");
    }

    public final long b(Foa foa) {
        synchronized (this.f12694b) {
            if (this.f12697e == null) {
                return -2;
            }
            if (this.f12695c.A()) {
                try {
                    long a2 = this.f12697e.a(foa);
                    return a2;
                } catch (RemoteException e2) {
                    C1018Rk.b("Unable to call into cache service.", e2);
                    return -2;
                }
            }
        }
    }
}
