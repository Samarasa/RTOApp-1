package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: androidx.appcompat.widget.oa  reason: case insensitive filesystem */
class C0139oa implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f689a;

    C0139oa(SearchView searchView) {
        this.f689a = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f689a;
        if (searchView.ga == null) {
            return false;
        }
        if (searchView.q.isPopupShowing() && this.f689a.q.getListSelection() != -1) {
            return this.f689a.a(view, i, keyEvent);
        }
        if (this.f689a.q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView2 = this.f689a;
        searchView2.a(0, (String) null, searchView2.q.getText().toString());
        return true;
    }
}
