package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: androidx.appcompat.app.h  reason: case insensitive filesystem */
class C0101h implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f213b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController f214c;

    C0101h(AlertController alertController, View view, View view2) {
        this.f214c = alertController;
        this.f212a = view;
        this.f213b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.f212a, this.f213b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
