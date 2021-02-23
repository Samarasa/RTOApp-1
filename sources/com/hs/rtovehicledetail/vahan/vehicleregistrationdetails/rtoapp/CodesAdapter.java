package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CodesAdapter extends RecyclerView.a<CodesViewHolder> {
    private List<CodesBean> codesList;
    /* access modifiers changed from: private */
    public Context context;

    public CodesAdapter(List<CodesBean> list, RTOCodes rTOCodes) {
        this.context = rTOCodes;
        this.codesList = list;
    }

    public int getItemCount() {
        return this.codesList.size();
    }

    public void onBindViewHolder(CodesViewHolder codesViewHolder, int i) {
        final CodesBean codesBean = this.codesList.get(i);
        codesViewHolder.rtoCode.setText(codesBean.getRtoCode());
        codesViewHolder.rtoName.setText(codesBean.getRtoName());
        codesViewHolder.rtoAdd.setText(codesBean.getRtoAdd());
        codesViewHolder.rtoPin.setText(codesBean.getRtoPin());
        codesViewHolder.rtoPhone.setText(codesBean.getRtoPhone());
        codesViewHolder.codeCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Dialog dialog = new Dialog(CodesAdapter.this.context);
                dialog.requestWindowFeature(1);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.codes_dialog);
                ((TextView) dialog.findViewById(R.id.card_code_name)).setText(codesBean.getRtoName());
                ((TextView) dialog.findViewById(R.id.card_code_address)).setText(codesBean.getRtoAdd());
                ((TextView) dialog.findViewById(R.id.card_code_pin)).setText(codesBean.getRtoPin());
                ((TextView) dialog.findViewById(R.id.card_code_phone)).setText(codesBean.getRtoPhone());
                ((TextView) dialog.findViewById(R.id.card_code_val)).setText(codesBean.getRtoCode());
                ((Button) dialog.findViewById(R.id.btn_dialog)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

    public CodesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CodesViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.code_card, viewGroup, false));
    }
}
