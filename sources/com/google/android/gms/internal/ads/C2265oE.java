package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oE  reason: case insensitive filesystem */
public final class C2265oE {

    /* renamed from: a  reason: collision with root package name */
    private List<Map<String, String>> f11564a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f11565b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11566c = false;

    /* renamed from: d  reason: collision with root package name */
    private String f11567d;

    /* renamed from: e  reason: collision with root package name */
    private C1981kE f11568e;

    public C2265oE(String str, C1981kE kEVar) {
        this.f11567d = str;
        this.f11568e = kEVar;
    }

    private final Map<String, String> c() {
        Map<String, String> a2 = this.f11568e.a();
        a2.put("tms", Long.toString(p.j().b(), 10));
        a2.put("tid", this.f11567d);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.xb     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.f11565b     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            java.util.Map r0 = r3.c()     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x002e }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f11564a     // Catch:{ all -> 0x002e }
            r1.add(r0)     // Catch:{ all -> 0x002e }
            r0 = 1
            r3.f11565b = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2265oE.a():void");
    }

    public final synchronized void a(String str) {
        if (((Boolean) Qqa.e().a(F.xb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_started");
            c2.put("ancn", str);
            this.f11564a.add(c2);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) Qqa.e().a(F.xb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            c2.put("rqe", str2);
            this.f11564a.add(c2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.xb     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.f11566c     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            java.util.Map r0 = r3.c()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f11564a     // Catch:{ all -> 0x0046 }
            r1.add(r0)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.f11564a     // Catch:{ all -> 0x0046 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0046 }
        L_0x002f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0046 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.kE r2 = r3.f11568e     // Catch:{ all -> 0x0046 }
            r2.a(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x002f
        L_0x0041:
            r0 = 1
            r3.f11566c = r0     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x004a
        L_0x0049:
            throw r0
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2265oE.b():void");
    }

    public final synchronized void b(String str) {
        if (((Boolean) Qqa.e().a(F.xb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            this.f11564a.add(c2);
        }
    }
}
