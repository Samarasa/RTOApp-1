package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;

final class DV implements C0547c.a, C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    private final _V f6559a;

    /* renamed from: b  reason: collision with root package name */
    private final QV f6560b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6561c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f6562d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6563e = false;

    DV(Context context, Looper looper, QV qv) {
        this.f6560b = qv;
        this.f6559a = new _V(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f6561c) {
            if (this.f6559a.isConnected() || this.f6559a.c()) {
                this.f6559a.e();
            }
            Binder.flushPendingCommands();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.f6561c) {
            if (!this.f6562d) {
                this.f6562d = true;
                this.f6559a.j();
            }
        }
    }

    public final void a(C0254b bVar) {
    }

    public final void d(int i) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f6561c
            monitor-enter(r4)
            boolean r0 = r3.f6563e     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f6563e = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads._V r0 = r3.f6559a     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.cW r0 = r0.z()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.YV r1 = new com.google.android.gms.internal.ads.YV     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.QV r2 = r3.f6560b     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.f()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.a((com.google.android.gms.internal.ads.YV) r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DV.h(android.os.Bundle):void");
    }
}
