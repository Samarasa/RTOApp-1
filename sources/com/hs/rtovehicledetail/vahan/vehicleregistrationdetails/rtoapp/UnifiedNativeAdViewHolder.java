package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

public class UnifiedNativeAdViewHolder extends RecyclerView.x {
    private UnifiedNativeAdView adView;

    UnifiedNativeAdViewHolder(View view) {
        super(view);
        this.adView = (UnifiedNativeAdView) view.findViewById(R.id.ad_view);
        UnifiedNativeAdView unifiedNativeAdView = this.adView;
        unifiedNativeAdView.setMediaView((MediaView) unifiedNativeAdView.findViewById(R.id.ad_media));
        UnifiedNativeAdView unifiedNativeAdView2 = this.adView;
        unifiedNativeAdView2.setHeadlineView(unifiedNativeAdView2.findViewById(R.id.ad_headline));
        UnifiedNativeAdView unifiedNativeAdView3 = this.adView;
        unifiedNativeAdView3.setBodyView(unifiedNativeAdView3.findViewById(R.id.ad_body));
        UnifiedNativeAdView unifiedNativeAdView4 = this.adView;
        unifiedNativeAdView4.setCallToActionView(unifiedNativeAdView4.findViewById(R.id.ad_call_to_action));
        UnifiedNativeAdView unifiedNativeAdView5 = this.adView;
        unifiedNativeAdView5.setIconView(unifiedNativeAdView5.findViewById(R.id.ad_icon));
        UnifiedNativeAdView unifiedNativeAdView6 = this.adView;
        unifiedNativeAdView6.setPriceView(unifiedNativeAdView6.findViewById(R.id.ad_price));
        UnifiedNativeAdView unifiedNativeAdView7 = this.adView;
        unifiedNativeAdView7.setStarRatingView(unifiedNativeAdView7.findViewById(R.id.ad_stars));
        UnifiedNativeAdView unifiedNativeAdView8 = this.adView;
        unifiedNativeAdView8.setStoreView(unifiedNativeAdView8.findViewById(R.id.ad_store));
        UnifiedNativeAdView unifiedNativeAdView9 = this.adView;
        unifiedNativeAdView9.setAdvertiserView(unifiedNativeAdView9.findViewById(R.id.ad_advertiser));
    }

    public UnifiedNativeAdView getAdView() {
        return this.adView;
    }
}
