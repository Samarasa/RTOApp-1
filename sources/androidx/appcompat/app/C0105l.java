package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.l  reason: case insensitive filesystem */
class C0105l implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AlertController f225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AlertController.a f226b;

    C0105l(AlertController.a aVar, AlertController alertController) {
        this.f226b = aVar;
        this.f225a = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f226b.x.onClick(this.f225a.f108b, i);
        if (!this.f226b.H) {
            this.f225a.f108b.dismiss();
        }
    }
}
