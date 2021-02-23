package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class NewsViewHolder extends RecyclerView.x {
    public CardView newsCard;
    public ImageView newsImage;
    public TextView newsTitle;

    public NewsViewHolder(View view) {
        super(view);
        this.newsTitle = (TextView) view.findViewById(R.id.news_title);
        this.newsImage = (ImageView) view.findViewById(R.id.news_image);
        this.newsCard = (CardView) view.findViewById(R.id.news_card);
    }
}
