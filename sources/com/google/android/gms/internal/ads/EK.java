package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.C0563t;
import java.util.Collections;
import java.util.List;

public final class EK extends C1684fra {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6682a;

    /* renamed from: b  reason: collision with root package name */
    private final Tqa f6683b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f6684c;

    /* renamed from: d  reason: collision with root package name */
    private final C0583Ar f6685d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f6686e;

    public EK(Context context, Tqa tqa, SS ss, C0583Ar ar) {
        this.f6682a = context;
        this.f6683b = tqa;
        this.f6684c = ss;
        this.f6685d = ar;
        FrameLayout frameLayout = new FrameLayout(this.f6682a);
        frameLayout.removeAllViews();
        frameLayout.addView(this.f6685d.i(), p.e().b());
        frameLayout.setMinimumHeight(Qb().f11916c);
        frameLayout.setMinimumWidth(Qb().f11919f);
        this.f6686e = frameLayout;
    }

    public final Nra A() {
        return this.f6685d.d();
    }

    public final a Ca() {
        return b.a(this.f6686e);
    }

    public final void Pa() {
        this.f6685d.l();
    }

    public final String Pb() {
        return this.f6684c.f8620f;
    }

    public final C2462qqa Qb() {
        C0563t.a("getAdSize must be called on the main UI thread.");
        return XS.a(this.f6682a, (List<BS>) Collections.singletonList(this.f6685d.h()));
    }

    public final Bundle V() {
        C1018Rk.c("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void X() {
        C0563t.a("destroy must be called on the main UI thread.");
        this.f6685d.c().c((Context) null);
    }

    public final void a(C0729Gh gh) {
    }

    public final void a(C0833Kh kh, String str) {
    }

    public final void a(Mra mra) {
        C1018Rk.c("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(Sqa sqa) {
        C1018Rk.c("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(C1146Wi wi) {
    }

    public final void a(Yra yra) {
    }

    public final void a(C1508da daVar) {
        C1018Rk.c("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(C1905j jVar) {
        C1018Rk.c("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(C1967jra jra) {
        C1018Rk.c("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(C2103loa loa) {
    }

    public final void a(C2322ora ora) {
        C1018Rk.c("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void a(C2462qqa qqa) {
        C0563t.a("setAdSize must be called on the main UI thread.");
        C0583Ar ar = this.f6685d;
        if (ar != null) {
            ar.a(this.f6686e, qqa);
        }
    }

    public final void a(C3100zqa zqa) {
    }

    public final boolean a(C2249nqa nqa) {
        C1018Rk.c("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void b(Tqa tqa) {
        C1018Rk.c("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void b(C2747ura ura) {
        C1018Rk.c("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void b(boolean z) {
    }

    public final void destroy() {
        C0563t.a("destroy must be called on the main UI thread.");
        this.f6685d.a();
    }

    public final void f(boolean z) {
        C1018Rk.c("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final Sra getVideoController() {
        return this.f6685d.g();
    }

    public final void h(String str) {
    }

    public final C2322ora lb() {
        return this.f6684c.m;
    }

    public final String o() {
        if (this.f6685d.d() != null) {
            return this.f6685d.d().o();
        }
        return null;
    }

    public final void pause() {
        C0563t.a("destroy must be called on the main UI thread.");
        this.f6685d.c().b((Context) null);
    }

    public final void q(String str) {
    }

    public final boolean q() {
        return false;
    }

    public final void rb() {
    }

    public final void showInterstitial() {
    }

    public final boolean t() {
        return false;
    }

    public final String va() {
        if (this.f6685d.d() != null) {
            return this.f6685d.d().o();
        }
        return null;
    }

    public final Tqa yb() {
        return this.f6683b;
    }
}
