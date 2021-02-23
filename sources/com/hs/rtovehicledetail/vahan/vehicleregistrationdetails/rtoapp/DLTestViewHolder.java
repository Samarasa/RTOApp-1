package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class DLTestViewHolder extends RecyclerView.x {
    public TextView cAnsText;
    public LinearLayout qRLay;
    public TextView rCans;
    public ImageView rImage;
    public ImageView rQimage;
    public TextView rQuestion;
    public TextView rYans;

    public DLTestViewHolder(View view) {
        super(view);
        this.rQuestion = (TextView) view.findViewById(R.id.r_question);
        this.rCans = (TextView) view.findViewById(R.id.r_cans);
        this.rYans = (TextView) view.findViewById(R.id.r_yans);
        this.cAnsText = (TextView) view.findViewById(R.id.c_ans_text);
        this.rImage = (ImageView) view.findViewById(R.id.r_image);
        this.rQimage = (ImageView) view.findViewById(R.id.r_qimage);
        this.qRLay = (LinearLayout) view.findViewById(R.id.q_r_lay);
    }
}
