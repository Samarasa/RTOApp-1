package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ChallanViewHolder extends RecyclerView.x {
    public TextView challan_amount;
    public TextView challan_date;
    public TextView challan_no;
    public TextView challan_payment_date;
    public TextView challan_status;

    public ChallanViewHolder(View view) {
        super(view);
        this.challan_no = (TextView) view.findViewById(R.id.challan_no);
        this.challan_amount = (TextView) view.findViewById(R.id.challan_amount);
        this.challan_status = (TextView) view.findViewById(R.id.challan_status);
        this.challan_date = (TextView) view.findViewById(R.id.challan_date);
        this.challan_payment_date = (TextView) view.findViewById(R.id.challan_payment_date);
    }
}
