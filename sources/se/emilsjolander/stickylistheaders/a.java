package se.emilsjolander.stickylistheaders;

import android.database.DataSetObserver;

class a extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f15587a;

    a(c cVar) {
        this.f15587a = cVar;
    }

    public void onChanged() {
        a.super.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.f15587a.f15591b.clear();
        a.super.notifyDataSetInvalidated();
    }
}
