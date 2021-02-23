package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C1018Rk;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<c, e>, MediationInterstitialAdapter<c, e> {

    /* renamed from: a  reason: collision with root package name */
    private View f5140a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f5141b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f5142c;

    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f5143a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.ads.mediation.c f5144b;

        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.c cVar) {
            this.f5143a = customEventAdapter;
            this.f5144b = cVar;
        }
    }

    class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f5145a;

        /* renamed from: b  reason: collision with root package name */
        private final d f5146b;

        public b(CustomEventAdapter customEventAdapter, d dVar) {
            this.f5145a = customEventAdapter;
            this.f5146b = dVar;
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C1018Rk.d(sb.toString());
            return null;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.f5141b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5142c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<c> getAdditionalParametersType() {
        return c.class;
    }

    public final View getBannerView() {
        return this.f5140a;
    }

    public final Class<e> getServerParametersType() {
        return e.class;
    }

    public final void requestBannerAd(com.google.ads.mediation.c cVar, Activity activity, e eVar, c.b.a.c cVar2, com.google.ads.mediation.a aVar, c cVar3) {
        this.f5141b = (CustomEventBanner) a(eVar.f5149b);
        if (this.f5141b == null) {
            cVar.a(this, c.b.a.a.INTERNAL_ERROR);
            return;
        }
        this.f5141b.requestBannerAd(new a(this, cVar), activity, eVar.f5148a, eVar.f5150c, cVar2, aVar, cVar3 == null ? null : cVar3.a(eVar.f5148a));
    }

    public final void requestInterstitialAd(d dVar, Activity activity, e eVar, com.google.ads.mediation.a aVar, c cVar) {
        this.f5142c = (CustomEventInterstitial) a(eVar.f5149b);
        if (this.f5142c == null) {
            dVar.a(this, c.b.a.a.INTERNAL_ERROR);
            return;
        }
        this.f5142c.requestInterstitialAd(new b(this, dVar), activity, eVar.f5148a, eVar.f5150c, aVar, cVar == null ? null : cVar.a(eVar.f5148a));
    }

    public final void showInterstitial() {
        this.f5142c.showInterstitial();
    }
}
