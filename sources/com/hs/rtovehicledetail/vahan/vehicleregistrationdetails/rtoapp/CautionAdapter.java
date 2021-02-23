package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.j;
import java.util.List;

public class CautionAdapter extends RecyclerView.a<RecyclerView.x> {
    private static final int CAUTION_VIEW_TYPE = 1;
    private static final int HOLIDAY_VIEW_TYPE = 2;
    static final int NATIVE_UnifiedNativeAd = 101;
    private static final int STRING = 404;
    private static final int TYPE_NATIVE_FB = 10518;
    private final Context mContext;
    private final List<Object> mRecyclerViewItems;

    public CautionAdapter(Context context, List<Object> list) {
        this.mContext = context;
        this.mRecyclerViewItems = list;
    }

    public static void populateNativeAdView(j jVar, UnifiedNativeAdView unifiedNativeAdView) {
        ((TextView) unifiedNativeAdView.getHeadlineView()).setText(jVar.e());
        ((TextView) unifiedNativeAdView.getBodyView()).setText(jVar.c());
        ((Button) unifiedNativeAdView.getCallToActionView()).setText(jVar.d());
        b.C0072b f2 = jVar.f();
        if (f2 == null) {
            unifiedNativeAdView.getIconView().setVisibility(4);
        } else {
            ((ImageView) unifiedNativeAdView.getIconView()).setImageDrawable(f2.a());
            unifiedNativeAdView.getIconView().setVisibility(0);
        }
        if (jVar.h() == null) {
            unifiedNativeAdView.getPriceView().setVisibility(4);
        } else {
            unifiedNativeAdView.getPriceView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getPriceView()).setText(jVar.h());
        }
        if (jVar.j() == null) {
            unifiedNativeAdView.getStoreView().setVisibility(4);
        } else {
            unifiedNativeAdView.getStoreView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getStoreView()).setText(jVar.j());
        }
        if (jVar.i() == null) {
            unifiedNativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) unifiedNativeAdView.getStarRatingView()).setRating(jVar.i().floatValue());
            unifiedNativeAdView.getStarRatingView().setVisibility(0);
        }
        if (jVar.b() == null) {
            unifiedNativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) unifiedNativeAdView.getAdvertiserView()).setText(jVar.b());
            unifiedNativeAdView.getAdvertiserView().setVisibility(0);
        }
        unifiedNativeAdView.setNativeAd(jVar);
    }

    public int getItemCount() {
        return this.mRecyclerViewItems.size();
    }

    public int getItemViewType(int i) {
        Object obj = this.mRecyclerViewItems.get(i);
        return (!(obj instanceof CautionBean) && (obj instanceof j)) ? 101 : 1;
    }

    public void onBindViewHolder(RecyclerView.x xVar, int i) {
        if (getItemViewType(i) != 101) {
            CautionViewHolder cautionViewHolder = (CautionViewHolder) xVar;
            CautionBean cautionBean = (CautionBean) this.mRecyclerViewItems.get(i);
            cautionViewHolder.stateName.setText(cautionBean.getState());
            c.b(this.mContext).a(Uri.parse(cautionBean.getImage())).a(cautionViewHolder.stateImage);
            return;
        }
        populateNativeAdView((j) this.mRecyclerViewItems.get(i), ((UnifiedNativeAdViewHolder) xVar).getAdView());
    }

    public RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 101 ? new CautionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.state_card1, viewGroup, false)) : new UnifiedNativeAdViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_recycle, viewGroup, false));
    }
}
