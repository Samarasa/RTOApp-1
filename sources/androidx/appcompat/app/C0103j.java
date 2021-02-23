package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.j  reason: case insensitive filesystem */
class C0103j extends ArrayAdapter<CharSequence> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AlertController.RecycleListView f218a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AlertController.a f219b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0103j(AlertController.a aVar, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f219b = aVar;
        this.f218a = recycleListView;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f219b.F;
        if (zArr != null && zArr[i]) {
            this.f218a.setItemChecked(i, true);
        }
        return view2;
    }
}
