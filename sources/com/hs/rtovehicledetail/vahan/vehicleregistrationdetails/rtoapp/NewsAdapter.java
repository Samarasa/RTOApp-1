package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import java.util.List;

public class NewsAdapter extends RecyclerView.a<NewsViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private List<NewsBean> newsList;

    public NewsAdapter(List<NewsBean> list, MainActivity mainActivity) {
        this.context = mainActivity;
        this.newsList = list;
    }

    public int getItemCount() {
        return this.newsList.size();
    }

    public void onBindViewHolder(NewsViewHolder newsViewHolder, int i) {
        final NewsBean newsBean = this.newsList.get(i);
        newsViewHolder.newsTitle.setText(newsBean.getNews_title());
        c.b(this.context).a(newsBean.getNews_image()).a(newsViewHolder.newsImage);
        newsViewHolder.newsCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NewsAdapter.this.context.startActivity(new Intent(NewsAdapter.this.context, News.class).putExtra("nTitle", newsBean.getNews_title()).putExtra("nImage", newsBean.getNews_image()).putExtra("nContent", newsBean.getNews_content()));
            }
        });
    }

    public NewsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NewsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_card, viewGroup, false));
    }
}
