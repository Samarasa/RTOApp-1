package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class StateViewHolder extends RecyclerView.x {
    public CardView stateCard;
    public TextView stateName;

    public StateViewHolder(View view) {
        super(view);
        this.stateName = (TextView) view.findViewById(R.id.name_state);
        this.stateCard = (CardView) view.findViewById(R.id.card_view);
    }
}
