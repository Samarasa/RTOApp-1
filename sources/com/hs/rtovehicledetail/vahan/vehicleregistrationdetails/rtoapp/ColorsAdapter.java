package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ColorsAdapter extends RecyclerView.a<ColorsViewHolder> {
    private List<ColorsBean> brandList;
    private Context context;

    public ColorsAdapter(List<ColorsBean> list, VehicleVariant vehicleVariant) {
        this.context = vehicleVariant;
        this.brandList = list;
    }

    public int getItemCount() {
        return this.brandList.size();
    }

    public void onBindViewHolder(ColorsViewHolder colorsViewHolder, int i) {
        ColorsBean colorsBean = this.brandList.get(i);
        colorsViewHolder.nameColor.setText(colorsBean.getName_color());
        String replace = colorsBean.getCode_color().replace("background-color:", BuildConfig.FLAVOR).replace(";", BuildConfig.FLAVOR);
        if (replace.length() == 7) {
            colorsViewHolder.colorCircle.setColorFilter(Color.parseColor(replace));
        }
    }

    public ColorsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ColorsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_img, viewGroup, false));
    }
}
