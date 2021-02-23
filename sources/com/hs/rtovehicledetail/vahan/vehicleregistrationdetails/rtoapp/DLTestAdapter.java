package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import java.util.List;

public class DLTestAdapter extends RecyclerView.a<DLTestViewHolder> {
    private List<DLTestBean> codesList;
    private Context context;

    public DLTestAdapter(List<DLTestBean> list, DLTestResults dLTestResults) {
        this.context = dLTestResults;
        this.codesList = list;
    }

    public int getItemCount() {
        return this.codesList.size();
    }

    public void onBindViewHolder(DLTestViewHolder dLTestViewHolder, int i) {
        String str;
        LinearLayout linearLayout;
        DLTestBean dLTestBean = this.codesList.get(i);
        dLTestViewHolder.rQuestion.setText(dLTestBean.getqQuestion());
        dLTestViewHolder.rCans.setText(dLTestBean.getqAnswer());
        dLTestViewHolder.rYans.setText(dLTestBean.getuAnswer());
        if (dLTestBean.getqAnswer().equals(dLTestBean.getuAnswer())) {
            dLTestViewHolder.rImage.setImageResource(R.drawable.correct);
            dLTestViewHolder.cAnsText.setVisibility(8);
            dLTestViewHolder.rCans.setVisibility(8);
            linearLayout = dLTestViewHolder.qRLay;
            str = "#1cb178";
        } else {
            dLTestViewHolder.rImage.setImageResource(R.drawable.wrong);
            dLTestViewHolder.cAnsText.setVisibility(0);
            dLTestViewHolder.rCans.setVisibility(0);
            linearLayout = dLTestViewHolder.qRLay;
            str = "#e16742";
        }
        linearLayout.setBackgroundColor(Color.parseColor(str));
        if (!dLTestBean.getqImg().equals(BuildConfig.FLAVOR)) {
            dLTestViewHolder.rQimage.setVisibility(0);
            c.b(this.context).a(dLTestBean.getqImg()).a(dLTestViewHolder.rQimage);
            return;
        }
        dLTestViewHolder.rQimage.setVisibility(8);
    }

    public DLTestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DLTestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.q_card, viewGroup, false));
    }
}
