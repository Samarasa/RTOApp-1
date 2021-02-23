package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import se.emilsjolander.stickylistheaders.m;

public class FeaturesAdapter extends BaseAdapter implements m {
    private Context context;
    private LayoutInflater inflater;
    private List<FeaturesBean> listStr = new ArrayList();

    class HeaderViewHolder {
        TextView headText;
        ImageView viewIc;

        HeaderViewHolder() {
        }
    }

    class ViewHolder {
        TextView featureName;
        TextView featureVal;
        LinearLayout item;

        ViewHolder() {
        }
    }

    public FeaturesAdapter(Context context2, List<FeaturesBean> list) {
        this.inflater = LayoutInflater.from(context2);
        this.listStr = list;
        this.listStr = new ArrayList(list);
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public void addItem() {
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public void deleteItem(int i) {
        this.listStr.remove(i);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.listStr.size();
    }

    public long getHeaderId(int i) {
        char charAt;
        int i2;
        if (this.listStr.get(i).getFeature_head().length() >= 5) {
            char charAt2 = this.listStr.get(i).getFeature_head().toLowerCase().subSequence(0, 5).charAt(0);
            char charAt3 = this.listStr.get(i).getFeature_head().toLowerCase().subSequence(0, 5).charAt(1);
            char charAt4 = this.listStr.get(i).getFeature_head().subSequence(0, 5).charAt(2);
            char charAt5 = this.listStr.get(i).getFeature_head().subSequence(0, 5).charAt(3);
            charAt = this.listStr.get(i).getFeature_head().subSequence(0, 5).charAt(4);
            i2 = charAt2 + charAt3 + charAt4 + charAt5;
        } else {
            char charAt6 = this.listStr.get(i).getFeature_head().toLowerCase().subSequence(0, 5).charAt(0);
            char charAt7 = this.listStr.get(i).getFeature_head().toLowerCase().subSequence(0, 5).charAt(1);
            charAt = this.listStr.get(i).getFeature_head().toLowerCase().subSequence(0, 5).charAt(2);
            i2 = charAt6 + charAt7;
        }
        return (long) (i2 + charAt);
    }

    public View getHeaderView(int i, View view, ViewGroup viewGroup) {
        View view2;
        HeaderViewHolder headerViewHolder;
        if (view == null) {
            headerViewHolder = new HeaderViewHolder();
            view2 = this.inflater.inflate(R.layout.list_header, viewGroup, false);
            headerViewHolder.headText = (TextView) view2.findViewById(R.id.feature_head);
            headerViewHolder.viewIc = (ImageView) view2.findViewById(R.id.view_ic);
            view2.setTag(headerViewHolder);
        } else {
            view2 = view;
            headerViewHolder = (HeaderViewHolder) view.getTag();
        }
        headerViewHolder.headText.setText(this.listStr.get(i).getFeature_head());
        return view2;
    }

    public Object getItem(int i) {
        return this.listStr.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view2 = this.inflater.inflate(R.layout.features_card, viewGroup, false);
            viewHolder.featureName = (TextView) view2.findViewById(R.id.feature_name);
            viewHolder.featureVal = (TextView) view2.findViewById(R.id.feature_val);
            view2.setTag(viewHolder);
        } else {
            view2 = view;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.featureName.setText(this.listStr.get(i).getFeature_name());
        viewHolder.featureVal.setText(this.listStr.get(i).getFeature_val());
        return view2;
    }
}
