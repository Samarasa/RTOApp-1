package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

/* renamed from: com.google.android.gms.ads.mediation.a  reason: case insensitive filesystem */
public abstract class C0520a implements j {
    public abstract z getSDKVersionInfo();

    public abstract z getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<i> list);

    public void loadBannerAd(g gVar, d<Object, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."));
    }

    public void loadInterstitialAd(l lVar, d<k, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."));
    }

    public void loadNativeAd(n nVar, d<y, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."));
    }

    public void loadRewardedAd(q qVar, d<p, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."));
    }

    public void loadRewardedInterstitialAd(q qVar, d<p, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."));
    }
}
