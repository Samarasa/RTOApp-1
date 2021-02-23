package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CodesViewHolder extends RecyclerView.x {
    public CardView codeCard;
    public TextView rtoAdd;
    public TextView rtoCode;
    public TextView rtoName;
    public TextView rtoPhone;
    public TextView rtoPin;

    public CodesViewHolder(View view) {
        super(view);
        this.rtoCode = (TextView) view.findViewById(R.id.code_rto);
        this.rtoName = (TextView) view.findViewById(R.id.code_name);
        this.rtoAdd = (TextView) view.findViewById(R.id.code_address);
        this.rtoPin = (TextView) view.findViewById(R.id.code_pin);
        this.rtoPhone = (TextView) view.findViewById(R.id.code_phone);
        this.codeCard = (CardView) view.findViewById(R.id.code_card);
    }
}
