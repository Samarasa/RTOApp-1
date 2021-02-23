package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Zla implements C1366ba {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<C1339b<?>>> f9585a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Yka f9586b;

    Zla(Yka yka) {
        this.f9586b = yka;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(com.google.android.gms.internal.ads.C1339b<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.n()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.b<?>>> r1 = r5.f9585a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.b<?>>> r1 = r5.f9585a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.a((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.b<?>>> r6 = r5.f9585a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C0936Og.f8124b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C0936Og.a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.b<?>>> r1 = r5.f9585a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.a((com.google.android.gms.internal.ads.C1366ba) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C0936Og.f8124b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C0936Og.a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Zla.b(com.google.android.gms.internal.ads.b):boolean");
    }

    public final synchronized void a(C1339b<?> bVar) {
        String n = bVar.n();
        List remove = this.f9585a.remove(n);
        if (remove != null && !remove.isEmpty()) {
            if (C0936Og.f8124b) {
                C0936Og.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), n);
            }
            C1339b bVar2 = (C1339b) remove.remove(0);
            this.f9585a.put(n, remove);
            bVar2.a((C1366ba) this);
            try {
                this.f9586b.f9463c.put(bVar2);
            } catch (InterruptedException e2) {
                C0936Og.b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f9586b.a();
            }
        }
    }

    public final void a(C1339b<?> bVar, C3073zd<?> zdVar) {
        List<C1339b> remove;
        C3019yla yla = zdVar.f13079b;
        if (yla == null || yla.a()) {
            a(bVar);
            return;
        }
        String n = bVar.n();
        synchronized (this) {
            remove = this.f9585a.remove(n);
        }
        if (remove != null) {
            if (C0936Og.f8124b) {
                C0936Og.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), n);
            }
            for (C1339b a2 : remove) {
                this.f9586b.f9465e.a((C1339b<?>) a2, zdVar);
            }
        }
    }
}
