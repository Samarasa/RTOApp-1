package com.google.android.gms.internal.ads;

import android.content.Context;
import b.e.b;
import c.b.b.b.c.a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ns  reason: case insensitive filesystem */
public final class C2252ns implements C0872Lu, C1900iv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11542a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f11543b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f11544c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f11545d;

    /* renamed from: e  reason: collision with root package name */
    private a f11546e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11547f;

    public C2252ns(Context context, C2313on onVar, C2988yS ySVar, C1200Yk yk) {
        this.f11542a = context;
        this.f11543b = onVar;
        this.f11544c = ySVar;
        this.f11545d = yk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.android.gms.internal.ads.yS r0 = r13.f11544c     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.N     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r13)
            return
        L_0x0009:
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r13)
            return
        L_0x000f:
            com.google.android.gms.internal.ads.qh r0 = com.google.android.gms.ads.internal.p.r()     // Catch:{ all -> 0x00ea }
            android.content.Context r1 = r13.f11542a     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.b((android.content.Context) r1)     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r13)
            return
        L_0x001d:
            com.google.android.gms.internal.ads.Yk r0 = r13.f11545d     // Catch:{ all -> 0x00ea }
            int r0 = r0.f9457b     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.Yk r1 = r13.f11545d     // Catch:{ all -> 0x00ea }
            int r1 = r1.f9458c     // Catch:{ all -> 0x00ea }
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r3.<init>(r2)     // Catch:{ all -> 0x00ea }
            r3.append(r0)     // Catch:{ all -> 0x00ea }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ all -> 0x00ea }
            r3.append(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.yS r0 = r13.f11544c     // Catch:{ all -> 0x00ea }
            com.google.android.gms.ads.f.a.a.b r0 = r0.P     // Catch:{ all -> 0x00ea }
            java.lang.String r9 = r0.b()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.rd     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00ea }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ea }
            r1 = 1
            if (r0 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.yS r0 = r13.f11544c     // Catch:{ all -> 0x00ea }
            com.google.android.gms.ads.f.a.a.b r0 = r0.P     // Catch:{ all -> 0x00ea }
            com.google.android.gms.ads.f.a.a.a r0 = r0.a()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.ads.f.a.a.a r2 = com.google.android.gms.ads.f.a.a.a.VIDEO     // Catch:{ all -> 0x00ea }
            if (r0 != r2) goto L_0x0069
            com.google.android.gms.internal.ads.rh r0 = com.google.android.gms.internal.ads.C2513rh.VIDEO     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.th r2 = com.google.android.gms.internal.ads.C2655th.DEFINED_BY_JAVASCRIPT     // Catch:{ all -> 0x00ea }
        L_0x0066:
            r11 = r0
            r10 = r2
            goto L_0x0077
        L_0x0069:
            com.google.android.gms.internal.ads.rh r0 = com.google.android.gms.internal.ads.C2513rh.HTML_DISPLAY     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.yS r2 = r13.f11544c     // Catch:{ all -> 0x00ea }
            int r2 = r2.f12918e     // Catch:{ all -> 0x00ea }
            if (r2 != r1) goto L_0x0074
            com.google.android.gms.internal.ads.th r2 = com.google.android.gms.internal.ads.C2655th.ONE_PIXEL     // Catch:{ all -> 0x00ea }
            goto L_0x0066
        L_0x0074:
            com.google.android.gms.internal.ads.th r2 = com.google.android.gms.internal.ads.C2655th.BEGIN_TO_RENDER     // Catch:{ all -> 0x00ea }
            goto L_0x0066
        L_0x0077:
            com.google.android.gms.internal.ads.qh r4 = com.google.android.gms.ads.internal.p.r()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            com.google.android.gms.internal.ads.yS r0 = r13.f11544c     // Catch:{ all -> 0x00ea }
            java.lang.String r12 = r0.ga     // Catch:{ all -> 0x00ea }
            c.b.b.b.c.a r0 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00ea }
        L_0x008d:
            r13.f11546e = r0     // Catch:{ all -> 0x00ea }
            goto L_0x00a3
        L_0x0090:
            com.google.android.gms.internal.ads.qh r4 = com.google.android.gms.ads.internal.p.r()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            c.b.b.b.c.a r0 = r4.a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ea }
            goto L_0x008d
        L_0x00a3:
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x00ea }
            c.b.b.b.c.a r2 = r13.f11546e     // Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e8
            com.google.android.gms.internal.ads.qh r2 = com.google.android.gms.ads.internal.p.r()     // Catch:{ all -> 0x00ea }
            c.b.b.b.c.a r3 = r13.f11546e     // Catch:{ all -> 0x00ea }
            r2.a(r3, r0)     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            c.b.b.b.c.a r2 = r13.f11546e     // Catch:{ all -> 0x00ea }
            r0.a((c.b.b.b.c.a) r2)     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.qh r0 = com.google.android.gms.ads.internal.p.r()     // Catch:{ all -> 0x00ea }
            c.b.b.b.c.a r2 = r13.f11546e     // Catch:{ all -> 0x00ea }
            r0.a((c.b.b.b.c.a) r2)     // Catch:{ all -> 0x00ea }
            r13.f11547f = r1     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ud     // Catch:{ all -> 0x00ea }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00ea }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00e8
            com.google.android.gms.internal.ads.on r0 = r13.f11543b     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "onSdkLoaded"
            b.e.b r2 = new b.e.b     // Catch:{ all -> 0x00ea }
            r2.<init>()     // Catch:{ all -> 0x00ea }
            r0.a((java.lang.String) r1, (java.util.Map<java.lang.String, ?>) r2)     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r13)
            return
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r13)
            goto L_0x00ee
        L_0x00ed:
            throw r0
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2252ns.a():void");
    }

    public final synchronized void H() {
        if (!this.f11547f) {
            a();
        }
    }

    public final synchronized void I() {
        if (!this.f11547f) {
            a();
        }
        if (!(!this.f11544c.N || this.f11546e == null || this.f11543b == null)) {
            this.f11543b.a("onSdkImpression", (Map<String, ?>) new b());
        }
    }
}
