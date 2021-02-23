package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.f;

public interface MediationBannerAdapter extends f {
    View getBannerView();

    void requestBannerAd(Context context, h hVar, Bundle bundle, f fVar, e eVar, Bundle bundle2);
}
