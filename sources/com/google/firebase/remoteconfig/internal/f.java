package com.google.firebase.remoteconfig.internal;

import c.b.b.b.g.C0470c;
import c.b.b.b.g.C0472e;
import c.b.b.b.g.C0473f;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, f> f14730a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f14731b = d.a();

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f14732c;

    /* renamed from: d  reason: collision with root package name */
    private final o f14733d;

    /* renamed from: e  reason: collision with root package name */
    private i<h> f14734e = null;

    private static class a<TResult> implements C0473f<TResult>, C0472e, C0470c {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f14735a;

        private a() {
            this.f14735a = new CountDownLatch(1);
        }

        public void a(Exception exc) {
            this.f14735a.countDown();
        }

        public void a(TResult tresult) {
            this.f14735a.countDown();
        }

        public boolean a(long j, TimeUnit timeUnit) {
            return this.f14735a.await(j, timeUnit);
        }

        public void b() {
            this.f14735a.countDown();
        }
    }

    private f(ExecutorService executorService, o oVar) {
        this.f14732c = executorService;
        this.f14733d = oVar;
    }

    static /* synthetic */ i a(f fVar, boolean z, h hVar, Void voidR) {
        if (z) {
            fVar.c(hVar);
        }
        return l.a(hVar);
    }

    public static synchronized f a(ExecutorService executorService, o oVar) {
        f fVar;
        synchronized (f.class) {
            String b2 = oVar.b();
            if (!f14730a.containsKey(b2)) {
                f14730a.put(b2, new f(executorService, oVar));
            }
            fVar = f14730a.get(b2);
        }
        return fVar;
    }

    private static <TResult> TResult a(i<TResult> iVar, long j, TimeUnit timeUnit) {
        a aVar = new a();
        iVar.a(f14731b, (C0473f<? super TResult>) aVar);
        iVar.a(f14731b, (C0472e) aVar);
        iVar.a(f14731b, (C0470c) aVar);
        if (!aVar.a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (iVar.e()) {
            return iVar.b();
        } else {
            throw new ExecutionException(iVar.a());
        }
    }

    private synchronized void c(h hVar) {
        this.f14734e = l.a(hVar);
    }

    public i<h> a(h hVar) {
        return a(hVar, true);
    }

    public i<h> a(h hVar, boolean z) {
        return l.a((Executor) this.f14732c, a.a(this, hVar)).a((Executor) this.f14732c, b.a(this, z, hVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.h) a(b(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.h a(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            c.b.b.b.g.i<com.google.firebase.remoteconfig.internal.h> r0 = r2.f14734e     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            c.b.b.b.g.i<com.google.firebase.remoteconfig.internal.h> r0 = r2.f14734e     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            c.b.b.b.g.i<com.google.firebase.remoteconfig.internal.h> r3 = r2.f14734e     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x0033 }
            com.google.firebase.remoteconfig.internal.h r3 = (com.google.firebase.remoteconfig.internal.h) r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            return r3
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            c.b.b.b.g.i r0 = r2.b()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = a(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.h r3 = (com.google.firebase.remoteconfig.internal.h) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.f.a(long):com.google.firebase.remoteconfig.internal.h");
    }

    public void a() {
        synchronized (this) {
            this.f14734e = l.a(null);
        }
        this.f14733d.a();
    }

    public synchronized i<h> b() {
        if (this.f14734e == null || (this.f14734e.d() && !this.f14734e.e())) {
            ExecutorService executorService = this.f14732c;
            o oVar = this.f14733d;
            oVar.getClass();
            this.f14734e = l.a((Executor) executorService, c.a(oVar));
        }
        return this.f14734e;
    }

    public i<h> b(h hVar) {
        c(hVar);
        return a(hVar, false);
    }

    public h c() {
        return a(5);
    }
}
