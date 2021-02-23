package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import c.a.a.k;
import c.a.a.n;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.j;
import java.util.List;
import java.util.Random;

public class VehicleBrandsAdapter extends RecyclerView.a<RecyclerView.x> {
    private static final int BRAND_VIEW_TYPE = 1;
    static final int NATIVE_UnifiedNativeAd = 101;
    private static final int STRING = 404;
    private static final int TYPE_NATIVE_FB = 10518;
    private String[] colorsUseful = {"#fb8a7f", "#fca247", "#fec758", "#c1c9ce", "#fca247", "#fafe58", "#d89bdc", "#53bbb4", "#e15258", "#f9845b", "#637a91", "#f092b0", "#3079ab"};
    /* access modifiers changed from: private */
    public final Context mContext;
    private final List<Object> mRecyclerViewItems;

    public VehicleBrandsAdapter(Context context, List<Object> list) {
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

    public int getColor() {
        return Color.parseColor(this.colorsUseful[new Random().nextInt(this.colorsUseful.length)]);
    }

    public int getItemCount() {
        return this.mRecyclerViewItems.size();
    }

    public int getItemViewType(int i) {
        Object obj = this.mRecyclerViewItems.get(i);
        return (!(obj instanceof VehicleBrandsBean) && (obj instanceof j)) ? 101 : 1;
    }

    public void onBindViewHolder(RecyclerView.x xVar, int i) {
        k<Drawable> kVar;
        n b2;
        int i2;
        if (getItemViewType(i) != 101) {
            VehicleBrandsViewHolder vehicleBrandsViewHolder = (VehicleBrandsViewHolder) xVar;
            final VehicleBrandsBean vehicleBrandsBean = (VehicleBrandsBean) this.mRecyclerViewItems.get(i);
            vehicleBrandsViewHolder.nameBrand.setText(vehicleBrandsBean.getBrand_name());
            getColor();
            new Random();
            if (vehicleBrandsBean.getBrand_image().equals(BuildConfig.FLAVOR)) {
                if (vehicleBrandsBean.getVehicle_type().equals("1")) {
                    b2 = c.b(this.mContext);
                    i2 = R.drawable.car;
                } else if (vehicleBrandsBean.getVehicle_type().equals("2")) {
                    b2 = c.b(this.mContext);
                    i2 = R.drawable.motorcycle;
                } else {
                    if (vehicleBrandsBean.getVehicle_type().equals("3")) {
                        b2 = c.b(this.mContext);
                        i2 = R.drawable.scooter;
                    }
                    vehicleBrandsViewHolder.brandCardLay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            VehicleBrandsAdapter.this.mContext.startActivity(new Intent(VehicleBrandsAdapter.this.mContext, VehicleModels.class).putExtra("type", vehicleBrandsBean.getBrand_id()).putExtra("bname", vehicleBrandsBean.getBrand_name()).putExtra("vehicleType", vehicleBrandsBean.getVehicle_type()));
                        }
                    });
                    return;
                }
                kVar = b2.a(Integer.valueOf(i2));
            } else {
                kVar = c.b(this.mContext).a(vehicleBrandsBean.getBrand_image());
            }
            kVar.a(vehicleBrandsViewHolder.brandImage);
            vehicleBrandsViewHolder.brandCardLay.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    VehicleBrandsAdapter.this.mContext.startActivity(new Intent(VehicleBrandsAdapter.this.mContext, VehicleModels.class).putExtra("type", vehicleBrandsBean.getBrand_id()).putExtra("bname", vehicleBrandsBean.getBrand_name()).putExtra("vehicleType", vehicleBrandsBean.getVehicle_type()));
                }
            });
            return;
        }
        populateNativeAdView((j) this.mRecyclerViewItems.get(i), ((UnifiedNativeAdViewHolder) xVar).getAdView());
    }

    public RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 101 ? new VehicleBrandsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.brand_card, viewGroup, false)) : new UnifiedNativeAdViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_recycle, viewGroup, false));
    }
}
