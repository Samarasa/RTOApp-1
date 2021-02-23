package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class CautionViewHolder extends RecyclerView.x {
    public ImageView stateImage;
    public TextView stateName;

    public CautionViewHolder(View view) {
        super(view);
        this.stateName = (TextView) view.findViewById(R.id.name_state);
        this.stateImage = (ImageView) view.findViewById(R.id.img_state);
    }
}
