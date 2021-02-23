package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.bc  reason: case insensitive filesystem */
final class C3120bc extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13508a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<C3126cc<?>> f13509b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13510c = false;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Zb f13511d;

    public C3120bc(Zb zb, String str, BlockingQueue<C3126cc<?>> blockingQueue) {
        this.f13511d = zb;
        C0563t.a(str);
        C0563t.a(blockingQueue);
        this.f13508a = new Object();
        this.f13509b = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.f13511d.h().w().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void b() {
        synchronized (this.f13511d.j) {
            if (!this.f13510c) {
                this.f13511d.k.release();
                this.f13511d.j.notifyAll();
                if (this == this.f13511d.f13477d) {
                    C3120bc unused = this.f13511d.f13477d = null;
                } else if (this == this.f13511d.f13478e) {
                    C3120bc unused2 = this.f13511d.f13478e = null;
                } else {
                    this.f13511d.h().t().a("Current scheduler thread is neither worker nor network");
                }
                this.f13510c = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f13508a) {
            this.f13508a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.Zb r1 = r5.f13511d     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.k     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.a(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.cc<?>> r1 = r5.f13509b     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.cc r1 = (com.google.android.gms.measurement.internal.C3126cc) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f13529b     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f13508a     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.cc<?>> r2 = r5.f13509b     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.Zb r2 = r5.f13511d     // Catch:{ all -> 0x007e }
            boolean r2 = r2.l     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f13508a     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.a(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.Zb r1 = r5.f13511d     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.j     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.cc<?>> r2 = r5.f13509b     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.Zb r0 = r5.f13511d     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.Ie r0 = r0.m()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.Sa     // Catch:{ all -> 0x007b }
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.b()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.b()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.b()
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3120bc.run():void");
    }
}
