package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.overlay.A;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.fQ  reason: case insensitive filesystem */
public final class C1639fQ extends C1684fra implements A, C2255nv, C1536doa {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f10394a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10395b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f10396c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f10397d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final String f10398e;

    /* renamed from: f  reason: collision with root package name */
    private final C1498dQ f10399f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C2631tQ f10400g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C1200Yk f10401h;
    private long i = -1;
    private C0998Qq j;
    protected C1754gr k;

    public C1639fQ(C0710Fo fo, Context context, String str, C1498dQ dQVar, C2631tQ tQVar, C1200Yk yk) {
        this.f10396c = new FrameLayout(context);
        this.f10394a = fo;
        this.f10395b = context;
        this.f10398e = str;
        this.f10399f = dQVar;
        this.f10400g = tQVar;
        tQVar.a((C2255nv) this);
        this.f10401h = yk;
    }

    /* access modifiers changed from: private */
    public final C2462qqa ac() {
        return XS.a(this.f10395b, (List<BS>) Collections.singletonList(this.k.k()));
    }

    /* access modifiers changed from: private */
    public final s b(C1754gr grVar) {
        boolean g2 = grVar.g();
        int intValue = ((Integer) Qqa.e().a(F.hd)).intValue();
        r rVar = new r();
        rVar.f5522e = 50;
        rVar.f5518a = g2 ? intValue : 0;
        rVar.f5519b = g2 ? 0 : intValue;
        rVar.f5520c = 0;
        rVar.f5521d = intValue;
        return new s(this.f10395b, rVar, this);
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams c(C1754gr grVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(grVar.g() ? 11 : 9);
        return layoutParams;
    }

    private final synchronized void d(int i2) {
        if (this.f10397d.compareAndSet(false, true)) {
            if (!(this.k == null || this.k.n() == null)) {
                this.f10400g.a(this.k.n());
            }
            this.f10400g.a();
            this.f10396c.removeAllViews();
            if (this.j != null) {
                p.f().b(this.j);
            }
            if (this.k != null) {
                long j2 = -1;
                if (this.i != -1) {
                    j2 = p.j().b() - this.i;
                }
                this.k.a(j2, i2);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final void d(C1754gr grVar) {
        grVar.a((C1536doa) this);
    }

    public final synchronized Nra A() {
        return null;
    }

    public final a Ca() {
        C0563t.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.f10396c);
    }

    public final synchronized void Pa() {
    }

    public final synchronized String Pb() {
        return this.f10398e;
    }

    public final synchronized C2462qqa Qb() {
        C0563t.a("getAdSize must be called on the main UI thread.");
        if (this.k == null) {
            return null;
        }
        return XS.a(this.f10395b, (List<BS>) Collections.singletonList(this.k.k()));
    }

    public final void Ub() {
        if (this.k != null) {
            this.i = p.j().b();
            int h2 = this.k.h();
            if (h2 > 0) {
                this.j = new C0998Qq(this.f10394a.b(), p.j());
                this.j.a(h2, new C1781hQ(this));
            }
        }
    }

    public final Bundle V() {
        return new Bundle();
    }

    public final void Vb() {
        d(C1180Xq.f9293c);
    }

    public final void Wb() {
        d(C1180Xq.f9294d);
    }

    public final synchronized void X() {
        C0563t.a("resume must be called on the main UI thread.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        Qqa.a();
        if (C0758Hk.b()) {
            d(C1180Xq.f9295e);
        } else {
            this.f10394a.a().execute(new C1568eQ(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void _b() {
        d(C1180Xq.f9295e);
    }

    public final void a(C0729Gh gh) {
    }

    public final void a(C0833Kh kh, String str) {
    }

    public final void a(Mra mra) {
    }

    public final void a(Sqa sqa) {
    }

    public final void a(C1146Wi wi) {
    }

    public final void a(Yra yra) {
    }

    public final synchronized void a(C1508da daVar) {
    }

    public final synchronized void a(C1905j jVar) {
    }

    public final void a(C1967jra jra) {
    }

    public final void a(C2103loa loa) {
        this.f10400g.a(loa);
    }

    public final void a(C2322ora ora) {
    }

    public final synchronized void a(C2462qqa qqa) {
        C0563t.a("setAdSize must be called on the main UI thread.");
    }

    public final void a(C3100zqa zqa) {
        this.f10399f.a(zqa);
    }

    public final synchronized boolean a(C2249nqa nqa) {
        C0563t.a("loadAd must be called on the main UI thread.");
        p.c();
        if (oa.o(this.f10395b) && nqa.s == null) {
            C1018Rk.b("Failed to load the ad because app ID is missing.");
            this.f10400g.a(C2209nT.a(C2351pT.APP_ID_MISSING, (String) null, (C1824hqa) null));
            return false;
        } else if (q()) {
            return false;
        } else {
            this.f10397d = new AtomicBoolean();
            return this.f10399f.a(nqa, this.f10398e, new C1710gQ(this), new C1922jQ(this));
        }
    }

    public final void b(Tqa tqa) {
    }

    public final synchronized void b(C2747ura ura) {
    }

    public final void b(boolean z) {
    }

    public final synchronized void destroy() {
        C0563t.a("destroy must be called on the main UI thread.");
        if (this.k != null) {
            this.k.a();
        }
    }

    public final synchronized void f(boolean z) {
    }

    public final synchronized Sra getVideoController() {
        return null;
    }

    public final void h(String str) {
    }

    public final C2322ora lb() {
        return null;
    }

    public final synchronized String o() {
        return null;
    }

    public final synchronized void pause() {
        C0563t.a("pause must be called on the main UI thread.");
    }

    public final void q(String str) {
    }

    public final synchronized boolean q() {
        return this.f10399f.q();
    }

    public final void rb() {
    }

    public final void showInterstitial() {
    }

    public final boolean t() {
        return false;
    }

    public final synchronized String va() {
        return null;
    }

    public final Tqa yb() {
        return null;
    }
}
