package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.na  reason: case insensitive filesystem */
class C0137na implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f682a;

    C0137na(SearchView searchView) {
        this.f682a = searchView;
    }

    public void onClick(View view) {
        SearchView searchView = this.f682a;
        if (view == searchView.u) {
            searchView.f();
        } else if (view == searchView.w) {
            searchView.e();
        } else if (view == searchView.v) {
            searchView.g();
        } else if (view == searchView.x) {
            searchView.i();
        } else if (view == searchView.q) {
            searchView.c();
        }
    }
}
