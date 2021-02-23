package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class VehicleVariantViewHolder extends RecyclerView.x {
    public TextView bspaceVariant;
    public TextView featuresVariant;
    public TextView fuelVariant;
    public TextView hpVariant;
    public TextView milageVariant;
    public TextView nameVariant;
    public TextView priceVariant;
    public LinearLayout variantCardLay;

    public VehicleVariantViewHolder(View view) {
        super(view);
        this.nameVariant = (TextView) view.findViewById(R.id.name_variant);
        this.priceVariant = (TextView) view.findViewById(R.id.price_variant);
        this.hpVariant = (TextView) view.findViewById(R.id.hp_variant);
        this.milageVariant = (TextView) view.findViewById(R.id.milage_variant);
        this.fuelVariant = (TextView) view.findViewById(R.id.fuel_variant);
        this.bspaceVariant = (TextView) view.findViewById(R.id.bspace_variant);
        this.featuresVariant = (TextView) view.findViewById(R.id.features_variant);
        this.variantCardLay = (LinearLayout) view.findViewById(R.id.variant_card_lay);
    }
}
