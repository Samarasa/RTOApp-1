package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.a.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

/* renamed from: com.google.android.gms.internal.ads.kg  reason: case insensitive filesystem */
public final class C2015kg<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> implements c, d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0831Kf f11086a;

    public C2015kg(C0831Kf kf) {
        this.f11086a = kf;
    }

    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        C1018Rk.a(sb.toString());
        Qqa.a();
        if (!C0758Hk.b()) {
            C1018Rk.d("#008 Must be called on the main UI thread.", (Throwable) null);
            C0758Hk.f7186a.post(new C2086lg(this, aVar));
            return;
        }
        try {
            this.f11086a.a(C2370pg.a(aVar));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        C1018Rk.a(sb.toString());
        Qqa.a();
        if (!C0758Hk.b()) {
            C1018Rk.d("#008 Must be called on the main UI thread.", (Throwable) null);
            C0758Hk.f7186a.post(new C2157mg(this, aVar));
            return;
        }
        try {
            this.f11086a.a(C2370pg.a(aVar));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
