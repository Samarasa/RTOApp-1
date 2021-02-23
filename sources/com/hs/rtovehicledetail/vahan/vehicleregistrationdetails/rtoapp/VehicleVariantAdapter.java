package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Random;

public class VehicleVariantAdapter extends RecyclerView.a<VehicleVariantViewHolder> {
    private String[] colorsUseful = {"#fb8a7f", "#fca247", "#fec758", "#f35481"};
    /* access modifiers changed from: private */
    public Context context;
    private List<VehicleVariantBean> modelList;

    public VehicleVariantAdapter(List<VehicleVariantBean> list, VehicleVariant vehicleVariant) {
        this.context = vehicleVariant;
        this.modelList = list;
    }

    public int getColor() {
        return Color.parseColor(this.colorsUseful[new Random().nextInt(this.colorsUseful.length)]);
    }

    public int getItemCount() {
        return this.modelList.size();
    }

    public void onBindViewHolder(VehicleVariantViewHolder vehicleVariantViewHolder, int i) {
        final VehicleVariantBean vehicleVariantBean = this.modelList.get(i);
        vehicleVariantViewHolder.nameVariant.setText(vehicleVariantBean.getVariant_name());
        vehicleVariantViewHolder.priceVariant.setText(vehicleVariantBean.getVariant_price());
        vehicleVariantViewHolder.hpVariant.setText(vehicleVariantBean.getVariant_hp());
        vehicleVariantViewHolder.milageVariant.setText(vehicleVariantBean.getVariant_milage());
        vehicleVariantViewHolder.fuelVariant.setText(vehicleVariantBean.getVariant_fuel());
        TextView textView = vehicleVariantViewHolder.bspaceVariant;
        textView.setText("Fuel System: " + vehicleVariantBean.getVariant_bspace());
        vehicleVariantViewHolder.featuresVariant.setText(vehicleVariantBean.getVariant_features());
        vehicleVariantViewHolder.variantCardLay.setBackgroundColor(getColor());
        vehicleVariantViewHolder.variantCardLay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VehicleVariantAdapter.this.context.startActivity(new Intent(VehicleVariantAdapter.this.context, VehicleFeatures.class).putExtra("bID", vehicleVariantBean.getBrand_id()).putExtra("mID", vehicleVariantBean.getModel_id()).putExtra("vID", vehicleVariantBean.getVariant_id()).putExtra("vName", vehicleVariantBean.getVariant_name()).putExtra("vehType", vehicleVariantBean.getVh_type()));
            }
        });
    }

    public VehicleVariantViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VehicleVariantViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.variant_card, viewGroup, false));
    }
}
