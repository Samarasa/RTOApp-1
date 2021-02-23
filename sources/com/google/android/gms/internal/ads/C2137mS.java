package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.mS  reason: case insensitive filesystem */
public final class C2137mS extends C2234nj {

    /* renamed from: a  reason: collision with root package name */
    private final C1570eS f11304a;

    /* renamed from: b  reason: collision with root package name */
    private final JR f11305b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11306c;

    /* renamed from: d  reason: collision with root package name */
    private final NS f11307d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f11308e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C2405qC f11309f;

    public C2137mS(String str, C1570eS eSVar, Context context, JR jr, NS ns) {
        this.f11306c = str;
        this.f11304a = eSVar;
        this.f11305b = jr;
        this.f11307d = ns;
        this.f11308e = context;
    }

    private final synchronized void a(C2249nqa nqa, C2517rj rjVar, int i) {
        C0563t.a("#008 Must be called on the main UI thread.");
        this.f11305b.a(rjVar);
        p.c();
        if (oa.o(this.f11308e) && nqa.s == null) {
            C1018Rk.b("Failed to load the ad because app ID is missing.");
            this.f11305b.a(C2209nT.a(C2351pT.APP_ID_MISSING, (String) null, (C1824hqa) null));
        } else if (this.f11309f == null) {
            C1641fS fSVar = new C1641fS((String) null);
            this.f11304a.a(i);
            this.f11304a.a(nqa, this.f11306c, fSVar, new C2279oS(this));
        }
    }

    public final Nra A() {
        C2405qC qCVar;
        if (((Boolean) Qqa.e().a(F._e)).booleanValue() && (qCVar = this.f11309f) != null) {
            return qCVar.d();
        }
        return null;
    }

    public final C1950jj Ib() {
        C0563t.a("#008 Must be called on the main UI thread.");
        C2405qC qCVar = this.f11309f;
        if (qCVar != null) {
            return qCVar.j();
        }
        return null;
    }

    public final Bundle V() {
        C0563t.a("#008 Must be called on the main UI thread.");
        C2405qC qCVar = this.f11309f;
        return qCVar != null ? qCVar.g() : new Bundle();
    }

    public final synchronized void a(a aVar, boolean z) {
        C0563t.a("#008 Must be called on the main UI thread.");
        if (this.f11309f == null) {
            C1018Rk.d("Rewarded can not be shown before loaded");
            this.f11305b.b(C2209nT.a(C2351pT.NOT_READY, (String) null, (C1824hqa) null));
            return;
        }
        this.f11309f.a(z, (Activity) b.Q(aVar));
    }

    public final void a(Hra hra) {
        if (hra == null) {
            this.f11305b.a((com.google.android.gms.ads.h.a) null);
        } else {
            this.f11305b.a((com.google.android.gms.ads.h.a) new C2350pS(this, hra));
        }
    }

    public final void a(Mra mra) {
        C0563t.a("setOnPaidEventListener must be called on the main UI thread.");
        this.f11305b.a(mra);
    }

    public final synchronized void a(C2249nqa nqa, C2517rj rjVar) {
        a(nqa, rjVar, KS.f7551b);
    }

    public final void a(C2376pj pjVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        this.f11305b.a(pjVar);
    }

    public final void a(C2588sj sjVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        this.f11305b.a(sjVar);
    }

    public final synchronized void a(C2872wj wjVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        NS ns = this.f11307d;
        ns.f7965a = wjVar.f12666a;
        if (((Boolean) Qqa.e().a(F.wa)).booleanValue()) {
            ns.f7966b = wjVar.f12667b;
        }
    }

    public final synchronized void b(C2249nqa nqa, C2517rj rjVar) {
        a(nqa, rjVar, KS.f7552c);
    }

    public final synchronized void l(a aVar) {
        a(aVar, false);
    }

    public final synchronized String o() {
        if (this.f11309f == null || this.f11309f.d() == null) {
            return null;
        }
        return this.f11309f.d().o();
    }

    public final boolean oa() {
        C0563t.a("#008 Must be called on the main UI thread.");
        C2405qC qCVar = this.f11309f;
        return qCVar != null && !qCVar.i();
    }
}
