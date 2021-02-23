package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Oj  reason: case insensitive filesystem */
public final class C0939Oj implements C2739una {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8129a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8130b;

    /* renamed from: c  reason: collision with root package name */
    private String f8131c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8132d;

    public C0939Oj(Context context, String str) {
        this.f8129a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8131c = str;
        this.f8132d = false;
        this.f8130b = new Object();
    }

    public final String H() {
        return this.f8131c;
    }

    public final void a(C2810vna vna) {
        f(vna.m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.Rj r0 = com.google.android.gms.ads.internal.p.A()
            android.content.Context r1 = r3.f8129a
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f8130b
            monitor-enter(r0)
            boolean r1 = r3.f8132d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f8132d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f8131c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f8132d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.Rj r4 = com.google.android.gms.ads.internal.p.A()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f8129a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f8131c     // Catch:{ all -> 0x003f }
            r4.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.Rj r4 = com.google.android.gms.ads.internal.p.A()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f8129a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f8131c     // Catch:{ all -> 0x003f }
            r4.b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0939Oj.f(boolean):void");
    }
}
