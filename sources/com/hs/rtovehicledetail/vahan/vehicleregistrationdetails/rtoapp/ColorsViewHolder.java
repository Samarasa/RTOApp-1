package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ColorsViewHolder extends RecyclerView.x {
    public ImageView colorCircle;
    public TextView nameColor;

    public ColorsViewHolder(View view) {
        super(view);
        this.colorCircle = (ImageView) view.findViewById(R.id.color_img);
        this.nameColor = (TextView) view.findViewById(R.id.name_color);
    }
}
