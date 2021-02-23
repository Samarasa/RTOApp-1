package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.io.PrintStream;
import java.util.ArrayList;
import org.json.JSONObject;

public class MyAdapter extends ArrayAdapter<SettingsObject> {
    ArrayList<SettingsObject> list = new ArrayList<>();

    static class ViewHolder {
        CardView card_view;
        ImageView deletImg;
        ImageView editImg;
        TextView regNo;
        TextView vType;
        ImageView vTypeImg;

        ViewHolder() {
        }
    }

    public MyAdapter(Context context, int i, ArrayList<SettingsObject> arrayList) {
        super(context, i, arrayList);
        this.list = arrayList;
    }

    public int getCount() {
        return super.getCount();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.recent_view_items, (ViewGroup) null);
        viewHolder.deletImg = (ImageView) inflate.findViewById(R.id.delete);
        viewHolder.card_view = (CardView) inflate.findViewById(R.id.card_view);
        viewHolder.regNo = (TextView) inflate.findViewById(R.id.textView);
        viewHolder.vType = (TextView) inflate.findViewById(R.id.textView1);
        inflate.setTag(viewHolder);
        final SettingsObject settingsObject = (SettingsObject) getItem(i);
        viewHolder.regNo.setText(settingsObject.getOwner_name().toUpperCase());
        viewHolder.vType.setText(settingsObject.getReg_no() + " , " + settingsObject.getVehicle_class() + " , " + settingsObject.getFuel_type());
        viewHolder.deletImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                V_RecentActivity.rSearches.deleteVehicle(settingsObject);
            }
        });
        viewHolder.card_view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reg_no", settingsObject.getReg_no());
                    jSONObject.put("reg_at", settingsObject.getReg_at());
                    jSONObject.put("owner_name", settingsObject.getOwner_name());
                    jSONObject.put("reg_date", settingsObject.getReg_date());
                    jSONObject.put("maker_model", settingsObject.getMaker_model());
                    jSONObject.put("vehicle_class", settingsObject.getVehicle_class());
                    jSONObject.put("fuel_type", settingsObject.getFuel_type());
                    jSONObject.put("chasi_no", settingsObject.getChasi_no());
                    jSONObject.put("engine_no", settingsObject.getEngine_no());
                    jSONObject.put("vage", BuildConfig.FLAVOR);
                    jSONObject.put("vinsurance", BuildConfig.FLAVOR);
                    jSONObject.put("vstate", BuildConfig.FLAVOR);
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("Exception : " + e2);
                }
                Intent intent = new Intent(MyAdapter.this.getContext(), V_DetailsActivity.class);
                intent.putExtra("jObj", jSONObject.toString());
                MyAdapter.this.getContext().startActivity(intent);
            }
        });
        return inflate;
    }
}
