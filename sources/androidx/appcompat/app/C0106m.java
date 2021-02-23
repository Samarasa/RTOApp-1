package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.m  reason: case insensitive filesystem */
class C0106m implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AlertController.RecycleListView f227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AlertController f228b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController.a f229c;

    C0106m(AlertController.a aVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f229c = aVar;
        this.f227a = recycleListView;
        this.f228b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f229c.F;
        if (zArr != null) {
            zArr[i] = this.f227a.isItemChecked(i);
        }
        this.f229c.J.onClick(this.f228b.f108b, i, this.f227a.isItemChecked(i));
    }
}
