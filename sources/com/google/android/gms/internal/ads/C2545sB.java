package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sB  reason: case insensitive filesystem */
public final class C2545sB {

    /* renamed from: a  reason: collision with root package name */
    private final SS f12059a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12060b;

    /* renamed from: c  reason: collision with root package name */
    private final DC f12061c;

    public C2545sB(SS ss, Executor executor, DC dc) {
        this.f12059a = ss;
        this.f12060b = executor;
        this.f12061c = dc;
    }

    private final void a(C2313on onVar) {
        onVar.b("/video", C0594Bc.m);
        onVar.b("/videoMeta", C0594Bc.n);
        onVar.b("/precache", new C1150Wm());
        onVar.b("/delayPageLoaded", C0594Bc.q);
        onVar.b("/instrument", C0594Bc.o);
        onVar.b("/log", C0594Bc.f6325h);
        onVar.b("/videoClicked", C0594Bc.i);
        onVar.t().g(true);
        onVar.b("/click", C0594Bc.f6321d);
        if (((Boolean) Qqa.e().a(F.fc)).booleanValue()) {
            onVar.b("/getNativeAdViewSignals", C0594Bc.t);
        }
        if (this.f12059a.f8617c != null) {
            onVar.t().f(true);
            onVar.b("/open", new C1192Yc((a) null, (C1170Xg) null, (C1701gH) null, (C1627fE) null));
        } else {
            onVar.t().f(false);
        }
        if (p.A().g(onVar.getContext())) {
            onVar.b("/logScionEvent", new C1140Wc(onVar.getContext()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Object obj) {
        C2313on a2 = this.f12061c.a(C2462qqa.g());
        C1813hl c2 = C1813hl.c(a2);
        a(a2);
        a2.t().a((C1465co) new C2829wB(c2));
        a2.loadUrl((String) Qqa.e().a(F.ec));
        return c2;
    }

    public final LY<C2313on> a(String str, String str2) {
        return DY.a(DY.a(null), new C2687uB(this, str, str2), this.f12060b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(String str, String str2, Object obj) {
        C2313on a2 = this.f12061c.a(C2462qqa.g());
        C1813hl c2 = C1813hl.c(a2);
        a(a2);
        a2.a(this.f12059a.f8617c != null ? C1819ho.d() : C1819ho.c());
        a2.t().a((Cdo) new C3042zB(this, a2, c2));
        a2.a(str, str2, (String) null);
        return c2;
    }

    public final LY<C2313on> a(JSONObject jSONObject) {
        return DY.a(DY.a(DY.a(null), new C2900xB(this), this.f12060b), new C2758vB(this, jSONObject), this.f12060b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(JSONObject jSONObject, C2313on onVar) {
        C1813hl c2 = C1813hl.c(onVar);
        onVar.a(this.f12059a.f8617c != null ? C1819ho.d() : C1819ho.c());
        onVar.t().a((Cdo) new C2971yB(this, onVar, c2));
        onVar.b("google.afma.nativeAds.renderVideo", jSONObject);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar, C1813hl hlVar, boolean z) {
        if (z) {
            if (!(this.f12059a.f8616b == null || onVar.e() == null)) {
                onVar.e().b(this.f12059a.f8616b);
            }
            hlVar.a();
            return;
        }
        hlVar.a((Throwable) new C1986kJ(C2351pT.INTERNAL_ERROR, "Instream video Web View failed to load."));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(C2313on onVar, C1813hl hlVar, boolean z) {
        if (!(this.f12059a.f8616b == null || onVar.e() == null)) {
            onVar.e().b(this.f12059a.f8616b);
        }
        hlVar.a();
    }
}
