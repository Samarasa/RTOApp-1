package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.atomic.AtomicBoolean;

public final class IQ extends C1684fra implements q, C1536doa {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f7285a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7286b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f7287c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final String f7288d;

    /* renamed from: e  reason: collision with root package name */
    private final GQ f7289e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C2631tQ f7290f;

    /* renamed from: g  reason: collision with root package name */
    private long f7291g = -1;

    /* renamed from: h  reason: collision with root package name */
    private C0998Qq f7292h;
    protected C2463qr i;

    public IQ(C0710Fo fo, Context context, String str, GQ gq, C2631tQ tQVar) {
        this.f7285a = fo;
        this.f7286b = context;
        this.f7288d = str;
        this.f7289e = gq;
        this.f7290f = tQVar;
        tQVar.a((q) this);
    }

    /* access modifiers changed from: private */
    public final void a(C2463qr qrVar) {
        qrVar.a(this);
    }

    private final synchronized void d(int i2) {
        if (this.f7287c.compareAndSet(false, true)) {
            this.f7290f.a();
            if (this.f7292h != null) {
                p.f().b(this.f7292h);
            }
            if (this.i != null) {
                long j = -1;
                if (this.f7291g != -1) {
                    j = p.j().b() - this.f7291g;
                }
                this.i.a(j, i2);
            }
            destroy();
        }
    }

    public final synchronized Nra A() {
        return null;
    }

    public final a Ca() {
        return null;
    }

    public final synchronized void J() {
        if (this.i != null) {
            this.i.a(p.j().b() - this.f7291g, C1180Xq.f9291a);
        }
    }

    public final synchronized void Pa() {
    }

    public final synchronized String Pb() {
        return this.f7288d;
    }

    public final synchronized C2462qqa Qb() {
        return null;
    }

    public final synchronized void Tb() {
        if (this.i != null) {
            this.f7291g = p.j().b();
            int g2 = this.i.g();
            if (g2 > 0) {
                this.f7292h = new C0998Qq(this.f7285a.b(), p.j());
                this.f7292h.a(g2, new KQ(this));
            }
        }
    }

    public final Bundle V() {
        return new Bundle();
    }

    public final void Vb() {
        d(C1180Xq.f9293c);
    }

    public final synchronized void X() {
        C0563t.a("resume must be called on the main UI thread.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        this.f7285a.a().execute(new HQ(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void _b() {
        d(C1180Xq.f9295e);
    }

    public final void a(m mVar) {
        int i2;
        int i3 = LQ.f7672a[mVar.ordinal()];
        if (i3 == 1) {
            i2 = C1180Xq.f9293c;
        } else if (i3 == 2) {
            i2 = C1180Xq.f9292b;
        } else if (i3 == 3) {
            i2 = C1180Xq.f9294d;
        } else if (i3 == 4) {
            d(C1180Xq.f9296f);
            return;
        } else {
            return;
        }
        d(i2);
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
        this.f7290f.a(loa);
    }

    public final void a(C2322ora ora) {
    }

    public final synchronized void a(C2462qqa qqa) {
        C0563t.a("setAdSize must be called on the main UI thread.");
    }

    public final void a(C3100zqa zqa) {
        this.f7289e.a(zqa);
    }

    public final synchronized boolean a(C2249nqa nqa) {
        C0563t.a("loadAd must be called on the main UI thread.");
        p.c();
        if (oa.o(this.f7286b) && nqa.s == null) {
            C1018Rk.b("Failed to load the ad because app ID is missing.");
            this.f7290f.a(C2209nT.a(C2351pT.APP_ID_MISSING, (String) null, (C1824hqa) null));
            return false;
        } else if (q()) {
            return false;
        } else {
            this.f7287c = new AtomicBoolean();
            return this.f7289e.a(nqa, this.f7288d, new JQ(this), new MQ(this));
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
        if (this.i != null) {
            this.i.a();
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

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final synchronized void pause() {
        C0563t.a("pause must be called on the main UI thread.");
    }

    public final void q(String str) {
    }

    public final synchronized boolean q() {
        return this.f7289e.q();
    }

    public final void rb() {
    }

    public final synchronized void showInterstitial() {
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
