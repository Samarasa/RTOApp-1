package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3103zs;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.aU  reason: case insensitive filesystem */
public final class C1289aU<AdT extends C3103zs> {

    /* renamed from: a  reason: collision with root package name */
    private final GT f9788a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C1785hU f9789b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public UY<TT<AdT>> f9790c;

    /* renamed from: d  reason: collision with root package name */
    private LY<TT<AdT>> f9791d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f9792e = C1997kU.f11061a;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final JT f9793f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C1856iU<AdT> f9794g;

    /* renamed from: h  reason: collision with root package name */
    private final LinkedList<C1785hU> f9795h;
    private final AY<TT<AdT>> i = new C1714gU(this);

    public C1289aU(JT jt, GT gt, C1856iU<AdT> iUVar) {
        this.f9793f = jt;
        this.f9788a = gt;
        this.f9794g = iUVar;
        this.f9795h = new LinkedList<>();
        this.f9788a.a(new C1431cU(this));
    }

    private final boolean b() {
        LY<TT<AdT>> ly = this.f9791d;
        return ly == null || ly.isDone();
    }

    /* access modifiers changed from: private */
    public final void c(C1785hU hUVar) {
        while (b()) {
            if (hUVar != null || !this.f9795h.isEmpty()) {
                if (hUVar == null) {
                    hUVar = this.f9795h.remove();
                }
                if (hUVar.c() == null || !this.f9793f.b(hUVar.c())) {
                    hUVar = null;
                } else {
                    this.f9789b = hUVar.a();
                    this.f9790c = UY.h();
                    this.f9791d = this.f9794g.a(this.f9789b);
                    DY.a(this.f9791d, this.i, hUVar.b());
                    return;
                }
            } else {
                return;
            }
        }
        if (hUVar != null) {
            this.f9795h.add(hUVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(TT tt) {
        LY a2;
        synchronized (this) {
            a2 = DY.a(new C1572eU(tt, this.f9789b));
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        synchronized (this) {
            c(this.f9789b);
        }
    }

    public final void a(C1785hU hUVar) {
        this.f9795h.add(hUVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.LY<com.google.android.gms.internal.ads.C1572eU<AdT>> b(com.google.android.gms.internal.ads.C1785hU r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.b()     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            int r0 = com.google.android.gms.internal.ads.C1997kU.f11063c     // Catch:{ all -> 0x0044 }
            r3.f9792e = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.hU r0 = r3.f9789b     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.WT r0 = r0.c()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.WT r0 = r4.c()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.hU r0 = r3.f9789b     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.WT r0 = r0.c()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.WT r2 = r4.c()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            int r0 = com.google.android.gms.internal.ads.C1997kU.f11062b     // Catch:{ all -> 0x0044 }
            r3.f9792e = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.UY<com.google.android.gms.internal.ads.TT<AdT>> r0 = r3.f9790c     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.dU r1 = new com.google.android.gms.internal.ads.dU     // Catch:{ all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.Executor r4 = r4.b()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.LY r4 = com.google.android.gms.internal.ads.DY.a(r0, r1, (java.util.concurrent.Executor) r4)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1289aU.b(com.google.android.gms.internal.ads.hU):com.google.android.gms.internal.ads.LY");
    }
}
