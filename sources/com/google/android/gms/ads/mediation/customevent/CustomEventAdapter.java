package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C0490a;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C1018Rk;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a  reason: collision with root package name */
    private static final C0490a f5680a = new C0490a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: b  reason: collision with root package name */
    private View f5681b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventBanner f5682c;

    /* renamed from: d  reason: collision with root package name */
    private CustomEventInterstitial f5683d;

    /* renamed from: e  reason: collision with root package name */
    private CustomEventNative f5684e;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f5685a;

        /* renamed from: b  reason: collision with root package name */
        private final m f5686b;

        public a(CustomEventAdapter customEventAdapter, m mVar) {
            this.f5685a = customEventAdapter;
            this.f5686b = mVar;
        }
    }

    static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f5688a;

        /* renamed from: b  reason: collision with root package name */
        private final h f5689b;

        public b(CustomEventAdapter customEventAdapter, h hVar) {
            this.f5688a = customEventAdapter;
            this.f5689b = hVar;
        }
    }

    static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f5690a;

        /* renamed from: b  reason: collision with root package name */
        private final o f5691b;

        public c(CustomEventAdapter customEventAdapter, o oVar) {
            this.f5690a = customEventAdapter;
            this.f5691b = oVar;
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

    public final View getBannerView() {
        return this.f5681b;
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f5682c;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5683d;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f5684e;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.f5682c;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f5683d;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f5684e;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.f5682c;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f5683d;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f5684e;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final void requestBannerAd(Context context, h hVar, Bundle bundle, f fVar, e eVar, Bundle bundle2) {
        this.f5682c = (CustomEventBanner) a(bundle.getString("class_name"));
        if (this.f5682c == null) {
            hVar.a((MediationBannerAdapter) this, f5680a);
            return;
        }
        this.f5682c.requestBannerAd(context, new b(this, hVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), fVar, eVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestInterstitialAd(Context context, m mVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f5683d = (CustomEventInterstitial) a(bundle.getString("class_name"));
        if (this.f5683d == null) {
            mVar.a((MediationInterstitialAdapter) this, f5680a);
            return;
        }
        this.f5683d.requestInterstitialAd(context, new a(this, mVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), eVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestNativeAd(Context context, o oVar, Bundle bundle, u uVar, Bundle bundle2) {
        this.f5684e = (CustomEventNative) a(bundle.getString("class_name"));
        if (this.f5684e == null) {
            oVar.a((MediationNativeAdapter) this, f5680a);
            return;
        }
        this.f5684e.requestNativeAd(context, new c(this, oVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), uVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void showInterstitial() {
        this.f5683d.showInterstitial();
    }
}
