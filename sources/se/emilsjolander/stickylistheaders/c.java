package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import java.util.LinkedList;
import java.util.List;

class c extends BaseAdapter implements m {

    /* renamed from: a  reason: collision with root package name */
    m f15590a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f15591b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Context f15592c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f15593d;

    /* renamed from: e  reason: collision with root package name */
    private int f15594e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f15595f;

    /* renamed from: g  reason: collision with root package name */
    private DataSetObserver f15596g = new a(this);

    interface a {
        void a(View view, int i, long j);
    }

    c(Context context, m mVar) {
        this.f15592c = context;
        this.f15590a = mVar;
        mVar.registerDataSetObserver(this.f15596g);
    }

    private View a() {
        if (this.f15591b.size() > 0) {
            return this.f15591b.remove(0);
        }
        return null;
    }

    private View a(r rVar, int i) {
        View view = rVar.f15627d;
        if (view == null) {
            view = a();
        }
        View headerView = this.f15590a.getHeaderView(i, view, rVar);
        if (headerView != null) {
            headerView.setClickable(true);
            headerView.setOnClickListener(new b(this, i));
            return headerView;
        }
        throw new NullPointerException("Header view must not be null.");
    }

    private void a(r rVar) {
        View view = rVar.f15627d;
        if (view != null) {
            view.setVisibility(0);
            this.f15591b.add(view);
        }
    }

    private boolean a(int i) {
        return i != 0 && this.f15590a.getHeaderId(i) == this.f15590a.getHeaderId(i - 1);
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable, int i) {
        this.f15593d = drawable;
        this.f15594e = i;
        notifyDataSetChanged();
    }

    public void a(a aVar) {
        this.f15595f = aVar;
    }

    public boolean areAllItemsEnabled() {
        return this.f15590a.areAllItemsEnabled();
    }

    public boolean equals(Object obj) {
        return this.f15590a.equals(obj);
    }

    public int getCount() {
        return this.f15590a.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return ((BaseAdapter) this.f15590a).getDropDownView(i, view, viewGroup);
    }

    public long getHeaderId(int i) {
        return this.f15590a.getHeaderId(i);
    }

    public View getHeaderView(int i, View view, ViewGroup viewGroup) {
        return this.f15590a.getHeaderView(i, view, viewGroup);
    }

    public Object getItem(int i) {
        return this.f15590a.getItem(i);
    }

    public long getItemId(int i) {
        return this.f15590a.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f15590a.getItemViewType(i);
    }

    public r getView(int i, View view, ViewGroup viewGroup) {
        r rVar = view == null ? new r(this.f15592c) : (r) view;
        View view2 = this.f15590a.getView(i, rVar.f15624a, viewGroup);
        View view3 = null;
        if (a(i)) {
            a(rVar);
        } else {
            view3 = a(rVar, i);
        }
        boolean z = view2 instanceof Checkable;
        if (z && !(rVar instanceof d)) {
            rVar = new d(this.f15592c);
        } else if (!z && (rVar instanceof d)) {
            rVar = new r(this.f15592c);
        }
        rVar.a(view2, view3, this.f15593d, this.f15594e);
        return rVar;
    }

    public int getViewTypeCount() {
        return this.f15590a.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.f15590a.hasStableIds();
    }

    public int hashCode() {
        return this.f15590a.hashCode();
    }

    public boolean isEmpty() {
        return this.f15590a.isEmpty();
    }

    public boolean isEnabled(int i) {
        return this.f15590a.isEnabled(i);
    }

    public void notifyDataSetChanged() {
        ((BaseAdapter) this.f15590a).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        ((BaseAdapter) this.f15590a).notifyDataSetInvalidated();
    }

    public String toString() {
        return this.f15590a.toString();
    }
}
