package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class Zb extends C3249zc {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLong f13476c = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C3120bc f13477d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C3120bc f13478e;

    /* renamed from: f  reason: collision with root package name */
    private final PriorityBlockingQueue<C3126cc<?>> f13479f = new PriorityBlockingQueue<>();

    /* renamed from: g  reason: collision with root package name */
    private final BlockingQueue<C3126cc<?>> f13480g = new LinkedBlockingQueue();

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f13481h = new C3114ac(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler i = new C3114ac(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object j = new Object();
    /* access modifiers changed from: private */
    public final Semaphore k = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean l;

    Zb(C3144fc fcVar) {
        super(fcVar);
    }

    private final void a(C3126cc<?> ccVar) {
        synchronized (this.j) {
            this.f13479f.add(ccVar);
            if (this.f13477d == null) {
                this.f13477d = new C3120bc(this, "Measurement Worker", this.f13479f);
                this.f13477d.setUncaughtExceptionHandler(this.f13481h);
                this.f13477d.start();
            } else {
                this.f13477d.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = h().w();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = h().w();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T a(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.Zb r0 = r1.g()     // Catch:{ all -> 0x005a }
            r0.a((java.lang.Runnable) r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.Bb r3 = r1.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.Bb r3 = r1.h()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.Db r3 = r3.w()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.a(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Zb.a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> a(Callable<V> callable) {
        o();
        C0563t.a(callable);
        C3126cc ccVar = new C3126cc(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f13477d) {
            if (!this.f13479f.isEmpty()) {
                h().w().a("Callable skipped the worker queue.");
            }
            ccVar.run();
        } else {
            a((C3126cc<?>) ccVar);
        }
        return ccVar;
    }

    public final void a(Runnable runnable) {
        o();
        C0563t.a(runnable);
        a((C3126cc<?>) new C3126cc(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        o();
        C0563t.a(callable);
        C3126cc ccVar = new C3126cc(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f13477d) {
            ccVar.run();
        } else {
            a((C3126cc<?>) ccVar);
        }
        return ccVar;
    }

    public final void b() {
        if (Thread.currentThread() != this.f13478e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void b(Runnable runnable) {
        o();
        C0563t.a(runnable);
        C3126cc ccVar = new C3126cc(this, runnable, false, "Task exception on network thread");
        synchronized (this.j) {
            this.f13480g.add(ccVar);
            if (this.f13478e == null) {
                this.f13478e = new C3120bc(this, "Measurement Network", this.f13480g);
                this.f13478e.setUncaughtExceptionHandler(this.i);
                this.f13478e.start();
            } else {
                this.f13478e.a();
            }
        }
    }

    public final void c() {
        if (Thread.currentThread() != this.f13477d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    public final boolean t() {
        return Thread.currentThread() == this.f13477d;
    }
}
