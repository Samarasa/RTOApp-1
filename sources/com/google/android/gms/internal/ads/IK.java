package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c.b.b.b.c.b;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1616eu;
import java.util.Collections;
import java.util.List;

public final class IK extends C1684fra implements C0691Ev {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0710Fo f7260a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7261b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f7262c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final MK f7263d = new MK();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final _K f7264e = new _K();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C0587Av f7265f;

    /* renamed from: g  reason: collision with root package name */
    private C2462qqa f7266g;

    /* renamed from: h  reason: collision with root package name */
    private final US f7267h = new US();
    private C1508da i;
    /* access modifiers changed from: private */
    public C0583Ar j;
    /* access modifiers changed from: private */
    public LY<C0583Ar> k;

    public IK(C0710Fo fo, Context context, C2462qqa qqa, String str) {
        this.f7262c = new FrameLayout(context);
        this.f7260a = fo;
        this.f7261b = context;
        US us = this.f7267h;
        us.a(qqa);
        us.a(str);
        this.f7265f = fo.e();
        this.f7265f.a(this, this.f7260a.a());
        this.f7266g = qqa;
    }

    private final synchronized C1181Xr a(SS ss) {
        if (((Boolean) Qqa.e().a(F.tf)).booleanValue()) {
            C1129Vr h2 = this.f7260a.h();
            C1616eu.a aVar = new C1616eu.a();
            aVar.a(this.f7261b);
            aVar.a(ss);
            h2.f(aVar.a());
            h2.d(new C1004Qw.a().a());
            h2.b(new C2058lK(this.i));
            h2.a(new C1136Vy(C1059Sz.f8714a, (Tqa) null));
            h2.a(new C2535rs(this.f7265f));
            h2.a(new C2746ur(this.f7262c));
            return h2.e();
        }
        C1129Vr h3 = this.f7260a.h();
        C1616eu.a aVar2 = new C1616eu.a();
        aVar2.a(this.f7261b);
        aVar2.a(ss);
        h3.f(aVar2.a());
        C1004Qw.a aVar3 = new C1004Qw.a();
        aVar3.a((C1540dqa) this.f7263d, this.f7260a.a());
        aVar3.a((C1540dqa) this.f7264e, this.f7260a.a());
        aVar3.a((C0872Lu) this.f7263d, this.f7260a.a());
        aVar3.a((C2608su) this.f7263d, this.f7260a.a());
        aVar3.a((C1900iv) this.f7263d, this.f7260a.a());
        aVar3.a((C2963xu) this.f7263d, this.f7260a.a());
        aVar3.a((a) this.f7263d, this.f7260a.a());
        aVar3.a((C0613Bv) this.f7263d, this.f7260a.a());
        h3.d(aVar3.a());
        h3.b(new C2058lK(this.i));
        h3.a(new C1136Vy(C1059Sz.f8714a, (Tqa) null));
        h3.a(new C2535rs(this.f7265f));
        h3.a(new C2746ur(this.f7262c));
        return h3.e();
    }

    private final synchronized void b(C2462qqa qqa) {
        this.f7267h.a(qqa);
        this.f7267h.a(this.f7266g.n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean c(com.google.android.gms.internal.ads.C2249nqa r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C0563t.a((java.lang.String) r0)     // Catch:{ all -> 0x008d }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x008d }
            android.content.Context r0 = r4.f7261b     // Catch:{ all -> 0x008d }
            boolean r0 = com.google.android.gms.ads.internal.util.oa.o(r0)     // Catch:{ all -> 0x008d }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.fqa r0 = r5.s     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x002d
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.C1018Rk.b(r5)     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.MK r5 = r4.f7263d     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.MK r5 = r4.f7263d     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.pT r0 = com.google.android.gms.internal.ads.C2351pT.APP_ID_MISSING     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.hqa r0 = com.google.android.gms.internal.ads.C2209nT.a(r0, r2, r2)     // Catch:{ all -> 0x008d }
            r5.a((com.google.android.gms.internal.ads.C1824hqa) r0)     // Catch:{ all -> 0x008d }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            com.google.android.gms.internal.ads.LY<com.google.android.gms.internal.ads.Ar> r0 = r4.k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0033
            monitor-exit(r4)
            return r1
        L_0x0033:
            android.content.Context r0 = r4.f7261b     // Catch:{ all -> 0x008d }
            boolean r3 = r5.f11539f     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.C1713gT.a(r0, r3)     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.US r0 = r4.f7267h     // Catch:{ all -> 0x008d }
            r0.a((com.google.android.gms.internal.ads.C2249nqa) r5)     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.SS r5 = r0.d()     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.pa<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C0696Fa.f6865c     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x008d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.US r0 = r4.f7267h     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.qqa r0 = r0.f()     // Catch:{ all -> 0x008d }
            boolean r0 = r0.k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.MK r0 = r4.f7263d     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.MK r5 = r4.f7263d     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.pT r0 = com.google.android.gms.internal.ads.C2351pT.INVALID_AD_SIZE     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.hqa r0 = com.google.android.gms.internal.ads.C2209nT.a(r0, r2, r2)     // Catch:{ all -> 0x008d }
            r5.a((com.google.android.gms.internal.ads.C1824hqa) r0)     // Catch:{ all -> 0x008d }
            monitor-exit(r4)
            return r1
        L_0x006c:
            com.google.android.gms.internal.ads.Xr r5 = r4.a((com.google.android.gms.internal.ads.SS) r5)     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.Ws r0 = r5.a()     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.LY r0 = r0.b()     // Catch:{ all -> 0x008d }
            r4.k = r0     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.LY<com.google.android.gms.internal.ads.Ar> r0 = r4.k     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.HK r1 = new com.google.android.gms.internal.ads.HK     // Catch:{ all -> 0x008d }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.Fo r5 = r4.f7260a     // Catch:{ all -> 0x008d }
            java.util.concurrent.Executor r5 = r5.a()     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.DY.a(r0, r1, (java.util.concurrent.Executor) r5)     // Catch:{ all -> 0x008d }
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x008d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.IK.c(com.google.android.gms.internal.ads.nqa):boolean");
    }

    public final synchronized Nra A() {
        if (!((Boolean) Qqa.e().a(F._e)).booleanValue()) {
            return null;
        }
        if (this.j == null) {
            return null;
        }
        return this.j.d();
    }

    public final c.b.b.b.c.a Ca() {
        C0563t.a("destroy must be called on the main UI thread.");
        return b.a(this.f7262c);
    }

    public final synchronized void Pa() {
        C0563t.a("recordManualImpression must be called on the main UI thread.");
        if (this.j != null) {
            this.j.l();
        }
    }

    public final synchronized String Pb() {
        return this.f7267h.b();
    }

    public final synchronized C2462qqa Qb() {
        C0563t.a("getAdSize must be called on the main UI thread.");
        if (this.j != null) {
            return XS.a(this.f7261b, (List<BS>) Collections.singletonList(this.j.h()));
        }
        return this.f7267h.f();
    }

    public final Bundle V() {
        C0563t.a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized void X() {
        C0563t.a("resume must be called on the main UI thread.");
        if (this.j != null) {
            this.j.c().c((Context) null);
        }
    }

    public final synchronized void Yb() {
        boolean z;
        ViewParent parent = this.f7262c.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = p.c().a(view, view.getContext());
        }
        if (z) {
            C2462qqa f2 = this.f7267h.f();
            if (!(this.j == null || this.j.j() == null || !this.f7267h.e())) {
                f2 = XS.a(this.f7261b, (List<BS>) Collections.singletonList(this.j.j()));
            }
            b(f2);
            c(this.f7267h.a());
            return;
        }
        this.f7265f.b(60);
    }

    public final void a(C0729Gh gh) {
    }

    public final void a(C0833Kh kh, String str) {
    }

    public final void a(Mra mra) {
        C0563t.a("setPaidEventListener must be called on the main UI thread.");
        this.f7263d.a(mra);
    }

    public final void a(Sqa sqa) {
        C0563t.a("setAdListener must be called on the main UI thread.");
        this.f7264e.a(sqa);
    }

    public final void a(C1146Wi wi) {
    }

    public final void a(Yra yra) {
    }

    public final synchronized void a(C1508da daVar) {
        C0563t.a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.i = daVar;
    }

    public final synchronized void a(C1905j jVar) {
        C0563t.a("setVideoOptions must be called on the main UI thread.");
        this.f7267h.a(jVar);
    }

    public final void a(C1967jra jra) {
        C0563t.a("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void a(C2103loa loa) {
    }

    public final void a(C2322ora ora) {
        C0563t.a("setAppEventListener must be called on the main UI thread.");
        this.f7263d.a(ora);
    }

    public final synchronized void a(C2462qqa qqa) {
        C0563t.a("setAdSize must be called on the main UI thread.");
        this.f7267h.a(qqa);
        this.f7266g = qqa;
        if (this.j != null) {
            this.j.a(this.f7262c, qqa);
        }
    }

    public final void a(C3100zqa zqa) {
    }

    public final synchronized boolean a(C2249nqa nqa) {
        b(this.f7266g);
        return c(nqa);
    }

    public final void b(Tqa tqa) {
        C0563t.a("setAdListener must be called on the main UI thread.");
        this.f7263d.a(tqa);
    }

    public final synchronized void b(C2747ura ura) {
        C0563t.a("setCorrelationIdProvider must be called on the main UI thread");
        this.f7267h.a(ura);
    }

    public final void b(boolean z) {
    }

    public final synchronized void destroy() {
        C0563t.a("destroy must be called on the main UI thread.");
        if (this.j != null) {
            this.j.a();
        }
    }

    public final synchronized void f(boolean z) {
        C0563t.a("setManualImpressionsEnabled must be called from the main thread.");
        this.f7267h.b(z);
    }

    public final synchronized Sra getVideoController() {
        C0563t.a("getVideoController must be called from the main thread.");
        if (this.j == null) {
            return null;
        }
        return this.j.g();
    }

    public final void h(String str) {
    }

    public final C2322ora lb() {
        return this.f7263d.X();
    }

    public final synchronized String o() {
        if (this.j == null || this.j.d() == null) {
            return null;
        }
        return this.j.d().o();
    }

    public final synchronized void pause() {
        C0563t.a("pause must be called on the main UI thread.");
        if (this.j != null) {
            this.j.c().b((Context) null);
        }
    }

    public final void q(String str) {
    }

    public final synchronized boolean q() {
        return this.k != null && !this.k.isDone();
    }

    public final void rb() {
    }

    public final void showInterstitial() {
    }

    public final boolean t() {
        return false;
    }

    public final synchronized String va() {
        if (this.j == null || this.j.d() == null) {
            return null;
        }
        return this.j.d().o();
    }

    public final Tqa yb() {
        return this.f7263d.J();
    }
}
