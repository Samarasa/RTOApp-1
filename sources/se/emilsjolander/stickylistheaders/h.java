package se.emilsjolander.stickylistheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

class h extends BaseAdapter implements m {

    /* renamed from: a  reason: collision with root package name */
    private final m f15602a;

    /* renamed from: b  reason: collision with root package name */
    g<View, Long> f15603b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    f<Integer, View> f15604c = new f<>();

    /* renamed from: d  reason: collision with root package name */
    List<Long> f15605d = new ArrayList();

    h(m mVar) {
        this.f15602a = mVar;
    }

    public void a(long j) {
        if (!d(j)) {
            this.f15605d.add(Long.valueOf(j));
        }
    }

    public boolean areAllItemsEnabled() {
        return this.f15602a.areAllItemsEnabled();
    }

    public void b(long j) {
        if (d(j)) {
            this.f15605d.remove(Long.valueOf(j));
        }
    }

    public List<View> c(long j) {
        return this.f15604c.a(Integer.valueOf((int) j));
    }

    public boolean d(long j) {
        return this.f15605d.contains(Long.valueOf(j));
    }

    public int getCount() {
        return this.f15602a.getCount();
    }

    public long getHeaderId(int i) {
        return this.f15602a.getHeaderId(i);
    }

    public View getHeaderView(int i, View view, ViewGroup viewGroup) {
        return this.f15602a.getHeaderView(i, view, viewGroup);
    }

    public Object getItem(int i) {
        return this.f15602a.getItem(i);
    }

    public long getItemId(int i) {
        return this.f15602a.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f15602a.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = this.f15602a.getView(i, view, viewGroup);
        this.f15603b.a(view2, Long.valueOf(getItemId(i)));
        this.f15604c.a(Integer.valueOf((int) getHeaderId(i)), view2);
        view2.setVisibility(this.f15605d.contains(Long.valueOf(getHeaderId(i))) ? 8 : 0);
        return view2;
    }

    public int getViewTypeCount() {
        return this.f15602a.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.f15602a.hasStableIds();
    }

    public boolean isEmpty() {
        return this.f15602a.isEmpty();
    }

    public boolean isEnabled(int i) {
        return this.f15602a.isEnabled(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15602a.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15602a.unregisterDataSetObserver(dataSetObserver);
    }
}
