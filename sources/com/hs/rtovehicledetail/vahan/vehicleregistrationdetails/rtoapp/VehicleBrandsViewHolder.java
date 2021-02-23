package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class VehicleBrandsViewHolder extends RecyclerView.x {
    public LinearLayout brandCardLay;
    public ImageView brandImage;
    public TextView nameBrand;

    public VehicleBrandsViewHolder(View view) {
        super(view);
        this.nameBrand = (TextView) view.findViewById(R.id.name_brand);
        this.brandCardLay = (LinearLayout) view.findViewById(R.id.brand_card_lay);
        this.brandImage = (ImageView) view.findViewById(R.id.brand_image);
    }
}
