package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

public class CelebrityCarsAdapter extends RecyclerView.a<CelebrityViewHolder> {
    private String[] colors = {"#39add1", "#3079ab", "#c25975", "#e15258", "#f9845b", "#838cc7", "#7d669e", "#53bbb4", "#51b46d", "#e0ab18", "#637a91", "#f092b0", "#b7c0c7"};
    /* access modifiers changed from: private */
    public Context context;
    private List<CelebrityCarsBean> rcList;

    public CelebrityCarsAdapter(List<CelebrityCarsBean> list, CelebrityCars celebrityCars) {
        this.context = celebrityCars;
        this.rcList = list;
    }

    public int getColor() {
        return Color.parseColor(this.colors[new Random().nextInt(this.colors.length)]);
    }

    public int getItemCount() {
        return this.rcList.size();
    }

    public void onBindViewHolder(CelebrityViewHolder celebrityViewHolder, int i) {
        final CelebrityCarsBean celebrityCarsBean = this.rcList.get(i);
        celebrityViewHolder.garrageNameRc.setText(celebrityCarsBean.getGarrage_rc_name());
        celebrityViewHolder.garrageNumRc.setText(celebrityCarsBean.getGarrage_rc_number());
        celebrityViewHolder.garageCardLay.setBackgroundColor(getColor());
        celebrityViewHolder.garageCardLay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reg_no", celebrityCarsBean.getGarrage_rc_number());
                    jSONObject.put("reg_at", celebrityCarsBean.getGarrage_rc_authority());
                    jSONObject.put("owner_name", celebrityCarsBean.getGarrage_rc_name());
                    jSONObject.put("reg_date", celebrityCarsBean.getGarrage_rc_reg());
                    jSONObject.put("maker_model", celebrityCarsBean.getGarrage_rc_model());
                    jSONObject.put("vehicle_class", celebrityCarsBean.getGarrage_rc_class());
                    jSONObject.put("fuel_type", celebrityCarsBean.getGarrage_rc_type());
                    jSONObject.put("chasi_no", celebrityCarsBean.getGarrage_rc_chasis());
                    jSONObject.put("engine_no", celebrityCarsBean.getGarrage_rc_engine());
                    jSONObject.put("vinsurance", celebrityCarsBean.getGarrage_rc_ins());
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("Exception : " + e2);
                }
                CelebrityCarsAdapter.this.context.startActivity(new Intent(CelebrityCarsAdapter.this.context, V_DetailsActivity.class).putExtra("jObj", jSONObject.toString()).putExtra("type", "celebRC"));
            }
        });
    }

    public CelebrityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CelebrityViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celeb_card, viewGroup, false));
    }
}
