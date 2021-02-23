package se.emilsjolander.stickylistheaders;

import android.view.View;
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;

class i implements ExpandableStickyListHeadersListView.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpandableStickyListHeadersListView f15606a;

    i(ExpandableStickyListHeadersListView expandableStickyListHeadersListView) {
        this.f15606a = expandableStickyListHeadersListView;
    }

    public void a(View view, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 8;
        } else {
            return;
        }
        view.setVisibility(i2);
    }
}
