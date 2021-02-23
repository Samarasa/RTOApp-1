package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.stats.a;

public final class Hd implements ServiceConnection, C0547c.a, C0547c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f13289a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C3243yb f13290b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C3196od f13291c;

    protected Hd(C3196od odVar) {
        this.f13291c = odVar;
    }

    public final void a() {
        if (this.f13290b != null && (this.f13290b.isConnected() || this.f13290b.c())) {
            this.f13290b.e();
        }
        this.f13290b = null;
    }

    public final void a(Intent intent) {
        this.f13291c.c();
        Context f2 = this.f13291c.f();
        a a2 = a.a();
        synchronized (this) {
            if (this.f13289a) {
                this.f13291c.h().B().a("Connection attempt already in progress");
                return;
            }
            this.f13291c.h().B().a("Using local app measurement service");
            this.f13289a = true;
            a2.a(f2, intent, this.f13291c.f13704c, 129);
        }
    }

    public final void a(C0254b bVar) {
        C0563t.a("MeasurementServiceConnection.onConnectionFailed");
        Bb q = this.f13291c.f13807a.q();
        if (q != null) {
            q.w().a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f13289a = false;
            this.f13290b = null;
        }
        this.f13291c.g().a((Runnable) new Od(this));
    }

    public final void b() {
        this.f13291c.c();
        Context f2 = this.f13291c.f();
        synchronized (this) {
            if (this.f13289a) {
                this.f13291c.h().B().a("Connection attempt already in progress");
            } else if (this.f13290b == null || (!this.f13290b.c() && !this.f13290b.isConnected())) {
                this.f13290b = new C3243yb(f2, Looper.getMainLooper(), this, this);
                this.f13291c.h().B().a("Connecting to remote service");
                this.f13289a = true;
                this.f13290b.j();
            } else {
                this.f13291c.h().B().a("Already awaiting connection attempt");
            }
        }
    }

    public final void d(int i) {
        C0563t.a("MeasurementServiceConnection.onConnectionSuspended");
        this.f13291c.h().A().a("Service connection suspended");
        this.f13291c.g().a((Runnable) new Ld(this));
    }

    public final void h(Bundle bundle) {
        C0563t.a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f13291c.g().a((Runnable) new Md(this, (C3218tb) this.f13290b.t()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f13290b = null;
                this.f13289a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f13291c.h().t().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C0563t.a((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f13289a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.od r4 = r3.f13291c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C3218tb     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.tb r1 = (com.google.android.gms.measurement.internal.C3218tb) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.vb r1 = new com.google.android.gms.measurement.internal.vb     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.od r5 = r3.f13291c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.Db r5 = r5.B()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.od r5 = r3.f13291c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.a(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.od r5 = r3.f13291c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f13289a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.a.a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.od r5 = r3.f13291c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.f()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.od r0 = r3.f13291c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.Hd r0 = r0.f13704c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.od r4 = r3.f13291c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Zb r4 = r4.g()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.Kd r5 = new com.google.android.gms.measurement.internal.Kd     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.a((java.lang.Runnable) r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Hd.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0563t.a("MeasurementServiceConnection.onServiceDisconnected");
        this.f13291c.h().A().a("Service disconnected");
        this.f13291c.g().a((Runnable) new Jd(this, componentName));
    }
}
