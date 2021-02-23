package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.la  reason: case insensitive filesystem */
class C0133la implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f675a;

    C0133la(SearchView searchView) {
        this.f675a = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f675a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
