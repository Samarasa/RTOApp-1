package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.a;
import c.a.a.c;
import java.util.ArrayList;

public class SlidingImage_Adapter extends a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public ArrayList<ImageModel> imageModelArrayList;
    private LayoutInflater inflater;

    public SlidingImage_Adapter(Context context2, ArrayList<ImageModel> arrayList) {
        this.context = context2;
        this.imageModelArrayList = arrayList;
        this.inflater = LayoutInflater.from(context2);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.imageModelArrayList.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, final int i) {
        View inflate = this.inflater.inflate(R.layout.slidingimages_layout, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.mbl);
        c.b(this.context).a(this.imageModelArrayList.get(i).getImgLinkUrl()).a(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SlidingImage_Adapter.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ImageModel) SlidingImage_Adapter.this.imageModelArrayList.get(i)).getImgUrl())));
            }
        });
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }
}
