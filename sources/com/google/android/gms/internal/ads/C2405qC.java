package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.qC  reason: case insensitive filesystem */
public final class C2405qC extends C3103zs {

    /* renamed from: h  reason: collision with root package name */
    private final Context f11813h;
    private final WeakReference<C2313on> i;
    private final C0876Ly j;
    private final C2257nx k;
    private final C0586Au l;
    private final C1830hv m;
    private final C1052Ss n;
    private final C1950jj o;
    private final AV p;
    private boolean q = false;

    C2405qC(C3032ys ysVar, Context context, C2313on onVar, C0876Ly ly, C2257nx nxVar, C0586Au au, C1830hv hvVar, C1052Ss ss, C2988yS ySVar, AV av) {
        super(ysVar);
        this.f11813h = context;
        this.j = ly;
        this.i = new WeakReference<>(onVar);
        this.k = nxVar;
        this.l = au;
        this.m = hvVar;
        this.n = ss;
        this.p = av;
        this.o = new C3085zj(ySVar.l);
    }

    public final boolean a(boolean z, Activity activity) {
        if (((Boolean) Qqa.e().a(F.ia)).booleanValue()) {
            p.c();
            if (oa.g(this.f11813h)) {
                C1018Rk.d("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.l.L();
                if (((Boolean) Qqa.e().a(F.ja)).booleanValue()) {
                    this.p.a(this.f13128a.f8088b.f7844b.f6547b);
                }
                return false;
            }
        }
        if (this.q) {
            C1018Rk.d("The rewarded ad have been showed.");
            this.l.b(C2209nT.a(C2351pT.AD_REUSED, (String) null, (C1824hqa) null));
            return false;
        }
        this.q = true;
        this.k.Y();
        Context context = activity;
        if (activity == null) {
            context = this.f11813h;
        }
        try {
            this.j.a(z, context);
            this.k.X();
            return true;
        } catch (C0954Oy e2) {
            this.l.a(e2);
            return false;
        }
    }

    public final void finalize() {
        try {
            C2313on onVar = (C2313on) this.i.get();
            if (((Boolean) Qqa.e().a(F.Ye)).booleanValue()) {
                if (!this.q && onVar != null) {
                    PY py = C1252_k.f9703e;
                    onVar.getClass();
                    py.execute(C2334pC.a(onVar));
                }
            } else if (onVar != null) {
                onVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle g() {
        return this.m.X();
    }

    public final boolean h() {
        return this.n.a();
    }

    public final boolean i() {
        return this.q;
    }

    public final C1950jj j() {
        return this.o;
    }

    public final boolean k() {
        C2313on onVar = (C2313on) this.i.get();
        return onVar != null && !onVar.F();
    }
}
