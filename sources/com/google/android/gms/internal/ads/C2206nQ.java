package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1404bu;
import com.google.android.gms.internal.ads.C1616eu;
import com.google.android.gms.internal.ads.C1825hr;
import com.google.android.gms.internal.ads.C3103zs;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nQ  reason: case insensitive filesystem */
public abstract class C2206nQ<AppOpenAd extends C3103zs, AppOpenRequestComponent extends C1825hr<AppOpenAd>, AppOpenRequestComponentBuilder extends C1404bu<AppOpenRequestComponent>> implements C1776hL<AppOpenAd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11456a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f11457b;

    /* renamed from: c  reason: collision with root package name */
    protected final C0710Fo f11458c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C2631tQ f11459d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2278oR<AppOpenRequestComponent, AppOpenAd> f11460e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f11461f;

    /* renamed from: g  reason: collision with root package name */
    private final US f11462g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public LY<AppOpenAd> f11463h;

    protected C2206nQ(Context context, Executor executor, C0710Fo fo, C2278oR<AppOpenRequestComponent, AppOpenAd> oRVar, C2631tQ tQVar, US us) {
        this.f11456a = context;
        this.f11457b = executor;
        this.f11458c = fo;
        this.f11460e = oRVar;
        this.f11459d = tQVar;
        this.f11462g = us;
        this.f11461f = new FrameLayout(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized AppOpenRequestComponentBuilder a(C2207nR nRVar) {
        C2419qQ qQVar = (C2419qQ) nRVar;
        if (((Boolean) Qqa.e().a(F.vf)).booleanValue()) {
            C2746ur urVar = new C2746ur(this.f11461f);
            C1616eu.a aVar = new C1616eu.a();
            aVar.a(this.f11456a);
            aVar.a(qQVar.f11849a);
            return a(urVar, aVar.a(), new C1004Qw.a().a());
        }
        C2631tQ a2 = C2631tQ.a(this.f11459d);
        C1004Qw.a aVar2 = new C1004Qw.a();
        aVar2.a((C2963xu) a2, this.f11457b);
        aVar2.a((C2255nv) a2, this.f11457b);
        aVar2.a((q) a2, this.f11457b);
        aVar2.a((C2065lR) a2);
        C2746ur urVar2 = new C2746ur(this.f11461f);
        C1616eu.a aVar3 = new C1616eu.a();
        aVar3.a(this.f11456a);
        aVar3.a(qQVar.f11849a);
        return a(urVar2, aVar3.a(), aVar2.a());
    }

    /* access modifiers changed from: protected */
    public abstract AppOpenRequestComponentBuilder a(C2746ur urVar, C1616eu euVar, C1004Qw qw);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f11459d.a(C2209nT.a(C2351pT.INVALID_AD_UNIT_ID, (String) null, (C1824hqa) null));
    }

    public final void a(C3100zqa zqa) {
        this.f11462g.a(zqa);
    }

    public final synchronized boolean a(C2249nqa nqa, String str, C1988kL kLVar, C1917jL<? super AppOpenAd> jLVar) {
        C0563t.a("loadAd must be called on the main UI thread.");
        if (str == null) {
            C1018Rk.b("Ad unit ID should not be null for app open ad.");
            this.f11457b.execute(new C2135mQ(this));
            return false;
        } else if (this.f11463h != null) {
            return false;
        } else {
            C1713gT.a(this.f11456a, nqa.f11539f);
            US us = this.f11462g;
            us.a(str);
            us.a(C2462qqa.i());
            us.a(nqa);
            SS d2 = us.d();
            C2419qQ qQVar = new C2419qQ((C2277oQ) null);
            qQVar.f11849a = d2;
            this.f11463h = this.f11460e.a(new C2349pR(qQVar), new C2348pQ(this));
            DY.a(this.f11463h, new C2277oQ(this, jLVar, qQVar), this.f11457b);
            return true;
        }
    }

    public final boolean q() {
        LY<AppOpenAd> ly = this.f11463h;
        return ly != null && !ly.isDone();
    }
}
