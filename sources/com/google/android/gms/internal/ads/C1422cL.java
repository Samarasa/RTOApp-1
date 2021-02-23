package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c.b.b.b.c.a;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.cL  reason: case insensitive filesystem */
public final class C1422cL extends C1684fra {

    /* renamed from: a  reason: collision with root package name */
    private final C2462qqa f10012a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10013b;

    /* renamed from: c  reason: collision with root package name */
    private final C2987yR f10014c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10015d;

    /* renamed from: e  reason: collision with root package name */
    private final MK f10016e;

    /* renamed from: f  reason: collision with root package name */
    private final JR f10017f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C1337ay f10018g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10019h = false;

    public C1422cL(Context context, C2462qqa qqa, String str, C2987yR yRVar, MK mk, JR jr) {
        this.f10012a = qqa;
        this.f10015d = str;
        this.f10013b = context;
        this.f10014c = yRVar;
        this.f10016e = mk;
        this.f10017f = jr;
    }

    private final synchronized boolean Zb() {
        return this.f10018g != null && !this.f10018g.g();
    }

    public final synchronized Nra A() {
        if (!((Boolean) Qqa.e().a(F._e)).booleanValue()) {
            return null;
        }
        if (this.f10018g == null) {
            return null;
        }
        return this.f10018g.d();
    }

    public final a Ca() {
        return null;
    }

    public final void Pa() {
    }

    public final synchronized String Pb() {
        return this.f10015d;
    }

    public final C2462qqa Qb() {
        return null;
    }

    public final Bundle V() {
        C0563t.a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized void X() {
        C0563t.a("resume must be called on the main UI thread.");
        if (this.f10018g != null) {
            this.f10018g.c().c((Context) null);
        }
    }

    public final void a(C0729Gh gh) {
    }

    public final void a(C0833Kh kh, String str) {
    }

    public final void a(Mra mra) {
        C0563t.a("setPaidEventListener must be called on the main UI thread.");
        this.f10016e.a(mra);
    }

    public final void a(Sqa sqa) {
    }

    public final void a(C1146Wi wi) {
        this.f10017f.a(wi);
    }

    public final void a(Yra yra) {
    }

    public final synchronized void a(C1508da daVar) {
        C0563t.a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f10014c.a(daVar);
    }

    public final void a(C1905j jVar) {
    }

    public final void a(C1967jra jra) {
        C0563t.a("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void a(C2103loa loa) {
    }

    public final void a(C2322ora ora) {
        C0563t.a("setAppEventListener must be called on the main UI thread.");
        this.f10016e.a(ora);
    }

    public final void a(C2462qqa qqa) {
    }

    public final void a(C3100zqa zqa) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.google.android.gms.internal.ads.C2249nqa r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C0563t.a((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x0054 }
            android.content.Context r0 = r4.f10013b     // Catch:{ all -> 0x0054 }
            boolean r0 = com.google.android.gms.ads.internal.util.oa.o(r0)     // Catch:{ all -> 0x0054 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.fqa r0 = r5.s     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x002d
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.C1018Rk.b(r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.MK r5 = r4.f10016e     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.MK r5 = r4.f10016e     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.pT r0 = com.google.android.gms.internal.ads.C2351pT.APP_ID_MISSING     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.hqa r0 = com.google.android.gms.internal.ads.C2209nT.a(r0, r2, r2)     // Catch:{ all -> 0x0054 }
            r5.a((com.google.android.gms.internal.ads.C1824hqa) r0)     // Catch:{ all -> 0x0054 }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            boolean r0 = r4.Zb()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0035
            monitor-exit(r4)
            return r1
        L_0x0035:
            android.content.Context r0 = r4.f10013b     // Catch:{ all -> 0x0054 }
            boolean r1 = r5.f11539f     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.C1713gT.a(r0, r1)     // Catch:{ all -> 0x0054 }
            r4.f10018g = r2     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.yR r0 = r4.f10014c     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = r4.f10015d     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.vR r2 = new com.google.android.gms.internal.ads.vR     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.qqa r3 = r4.f10012a     // Catch:{ all -> 0x0054 }
            r2.<init>(r3)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.bL r3 = new com.google.android.gms.internal.ads.bL     // Catch:{ all -> 0x0054 }
            r3.<init>(r4)     // Catch:{ all -> 0x0054 }
            boolean r5 = r0.a(r5, r1, r2, r3)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)
            return r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1422cL.a(com.google.android.gms.internal.ads.nqa):boolean");
    }

    public final void b(Tqa tqa) {
        C0563t.a("setAdListener must be called on the main UI thread.");
        this.f10016e.a(tqa);
    }

    public final void b(C2747ura ura) {
    }

    public final synchronized void b(boolean z) {
        C0563t.a("setImmersiveMode must be called on the main UI thread.");
        this.f10019h = z;
    }

    public final synchronized void destroy() {
        C0563t.a("destroy must be called on the main UI thread.");
        if (this.f10018g != null) {
            this.f10018g.c().d((Context) null);
        }
    }

    public final void f(boolean z) {
    }

    public final Sra getVideoController() {
        return null;
    }

    public final void h(String str) {
    }

    public final C2322ora lb() {
        return this.f10016e.X();
    }

    public final synchronized String o() {
        if (this.f10018g == null || this.f10018g.d() == null) {
            return null;
        }
        return this.f10018g.d().o();
    }

    public final synchronized void pause() {
        C0563t.a("pause must be called on the main UI thread.");
        if (this.f10018g != null) {
            this.f10018g.c().b((Context) null);
        }
    }

    public final void q(String str) {
    }

    public final synchronized boolean q() {
        return this.f10014c.q();
    }

    public final void rb() {
    }

    public final synchronized void showInterstitial() {
        C0563t.a("showInterstitial must be called on the main UI thread.");
        if (this.f10018g != null) {
            this.f10018g.a(this.f10019h);
        }
    }

    public final synchronized boolean t() {
        C0563t.a("isLoaded must be called on the main UI thread.");
        return Zb();
    }

    public final synchronized String va() {
        if (this.f10018g == null || this.f10018g.d() == null) {
            return null;
        }
        return this.f10018g.d().o();
    }

    public final Tqa yb() {
        return this.f10016e.J();
    }
}
