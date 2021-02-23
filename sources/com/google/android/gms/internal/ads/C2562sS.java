package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.sS  reason: case insensitive filesystem */
public final class C2562sS extends C1042Si {

    /* renamed from: a  reason: collision with root package name */
    private final C1570eS f12083a;

    /* renamed from: b  reason: collision with root package name */
    private final JR f12084b;

    /* renamed from: c  reason: collision with root package name */
    private final NS f12085c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C2405qC f12086d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12087e = false;

    public C2562sS(C1570eS eSVar, JR jr, NS ns) {
        this.f12083a = eSVar;
        this.f12084b = jr;
        this.f12085c = ns;
    }

    private final synchronized boolean Zb() {
        return this.f12086d != null && !this.f12086d.h();
    }

    public final synchronized Nra A() {
        if (!((Boolean) Qqa.e().a(F._e)).booleanValue()) {
            return null;
        }
        if (this.f12086d == null) {
            return null;
        }
        return this.f12086d.d();
    }

    public final synchronized void A(a aVar) {
        C0563t.a("resume must be called on the main UI thread.");
        if (this.f12086d != null) {
            this.f12086d.c().c(aVar == null ? null : (Context) b.Q(aVar));
        }
    }

    public final synchronized void A(String str) {
        if (((Boolean) Qqa.e().a(F.wa)).booleanValue()) {
            C0563t.a("#008 Must be called on the main UI thread.: setCustomData");
            this.f12085c.f7966b = str;
        }
    }

    public final synchronized void D(a aVar) {
        Activity activity;
        C0563t.a("showAd must be called on the main UI thread.");
        if (this.f12086d != null) {
            if (aVar != null) {
                Object Q = b.Q(aVar);
                if (Q instanceof Activity) {
                    activity = (Activity) Q;
                    this.f12086d.a(this.f12087e, activity);
                }
            }
            activity = null;
            this.f12086d.a(this.f12087e, activity);
        }
    }

    public final synchronized void F(a aVar) {
        C0563t.a("pause must be called on the main UI thread.");
        if (this.f12086d != null) {
            this.f12086d.c().b(aVar == null ? null : (Context) b.Q(aVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void O(c.b.b.b.c.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.C0563t.a((java.lang.String) r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.JR r0 = r2.f12084b     // Catch:{ all -> 0x0025 }
            r1 = 0
            r0.a((com.google.android.gms.ads.h.a) r1)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.qC r0 = r2.f12086d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = c.b.b.b.c.b.Q(r3)     // Catch:{ all -> 0x0025 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0025 }
        L_0x001a:
            com.google.android.gms.internal.ads.qC r3 = r2.f12086d     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.Nu r3 = r3.c()     // Catch:{ all -> 0x0025 }
            r3.d(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2562sS.O(c.b.b.b.c.a):void");
    }

    public final Bundle V() {
        C0563t.a("getAdMetadata can only be called from the UI thread.");
        C2405qC qCVar = this.f12086d;
        return qCVar != null ? qCVar.g() : new Bundle();
    }

    public final void X() {
        A((a) null);
    }

    public final void a(C0912Ni ni) {
        C0563t.a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f12084b.a(ni);
    }

    public final void a(C1146Wi wi) {
        C0563t.a("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f12084b.a(wi);
    }

    public final synchronized void a(C1384bj bjVar) {
        C0563t.a("loadAd must be called on the main UI thread.");
        if (!H.a(bjVar.f9950b)) {
            if (Zb()) {
                if (!((Boolean) Qqa.e().a(F.Jd)).booleanValue()) {
                    return;
                }
            }
            C1641fS fSVar = new C1641fS((String) null);
            this.f12086d = null;
            this.f12083a.a(KS.f7550a);
            this.f12083a.a(bjVar.f9949a, bjVar.f9950b, fSVar, new C2775vS(this));
        }
    }

    public final void a(C1967jra jra) {
        C0563t.a("setAdMetadataListener can only be called from the UI thread.");
        if (jra == null) {
            this.f12084b.a((com.google.android.gms.ads.h.a) null);
        } else {
            this.f12084b.a((com.google.android.gms.ads.h.a) new C2704uS(this, jra));
        }
    }

    public final synchronized void b(boolean z) {
        C0563t.a("setImmersiveMode must be called on the main UI thread.");
        this.f12087e = z;
    }

    public final void destroy() {
        O((a) null);
    }

    public final synchronized void h(String str) {
        C0563t.a("setUserId must be called on the main UI thread.");
        this.f12085c.f7965a = str;
    }

    public final synchronized String o() {
        if (this.f12086d == null || this.f12086d.d() == null) {
            return null;
        }
        return this.f12086d.d().o();
    }

    public final boolean oa() {
        C0563t.a("isLoaded must be called on the main UI thread.");
        return Zb();
    }

    public final void pause() {
        F((a) null);
    }

    public final void t(String str) {
    }

    public final synchronized void u() {
        D((a) null);
    }

    public final boolean ub() {
        C2405qC qCVar = this.f12086d;
        return qCVar != null && qCVar.k();
    }
}
