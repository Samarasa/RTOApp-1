package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class VehicleModelsViewHolder extends RecyclerView.x {
    public LinearLayout brandCardLay;
    public TextView fuelModel;
    public TextView hpModel;
    public ImageView imageModel;
    public TextView milageModel;
    public TextView nameModel;
    public TextView priceModel;

    public VehicleModelsViewHolder(View view) {
        super(view);
        this.nameModel = (TextView) view.findViewById(R.id.name_model);
        this.priceModel = (TextView) view.findViewById(R.id.price_model);
        this.hpModel = (TextView) view.findViewById(R.id.hp_model);
        this.milageModel = (TextView) view.findViewById(R.id.milage_model);
        this.fuelModel = (TextView) view.findViewById(R.id.fuel_model);
        this.imageModel = (ImageView) view.findViewById(R.id.image_model);
        this.brandCardLay = (LinearLayout) view.findViewById(R.id.brand_card_lay1);
    }
}
