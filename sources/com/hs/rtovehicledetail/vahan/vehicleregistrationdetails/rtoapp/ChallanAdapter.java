package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ChallanAdapter extends RecyclerView.a<ChallanViewHolder> {
    private Context context;
    private List<ChallanBean> rcList;

    public ChallanAdapter(List<ChallanBean> list, ChallanResults challanResults) {
        this.context = challanResults;
        this.rcList = list;
    }

    public int getItemCount() {
        return this.rcList.size();
    }

    public void onBindViewHolder(ChallanViewHolder challanViewHolder, int i) {
        ChallanBean challanBean = this.rcList.get(i);
        TextView textView = challanViewHolder.challan_no;
        textView.setText("Challan: #" + challanBean.getChallanNo());
        challanViewHolder.challan_amount.setText(challanBean.getChallanAmount());
        challanViewHolder.challan_status.setText(challanBean.getChallanStatus());
        String challanDate = challanBean.getChallanDate();
        String challanDate2 = challanBean.getChallanDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        try {
            Date parse = simpleDateFormat.parse(challanDate);
            Date parse2 = simpleDateFormat.parse(challanDate2);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
            String format = simpleDateFormat2.format(parse);
            String format2 = simpleDateFormat2.format(parse2);
            challanViewHolder.challan_date.setText(format);
            challanViewHolder.challan_payment_date.setText(format2);
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
    }

    public ChallanViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ChallanViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.challan_card, viewGroup, false));
    }
}
