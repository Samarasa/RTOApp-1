package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class CelebrityViewHolder extends RecyclerView.x {
    public LinearLayout garageCardLay;
    public TextView garrageNameRc;
    public TextView garrageNumRc;

    public CelebrityViewHolder(View view) {
        super(view);
        this.garrageNumRc = (TextView) view.findViewById(R.id.garrage_num_rc);
        this.garrageNameRc = (TextView) view.findViewById(R.id.garrage_name_rc);
        this.garageCardLay = (LinearLayout) view.findViewById(R.id.garage_card_lay);
    }
}
