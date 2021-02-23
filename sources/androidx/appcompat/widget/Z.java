package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

class Z implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0111aa f588a;

    Z(C0111aa aaVar) {
        this.f588a = aaVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        U u;
        if (i != -1 && (u = this.f588a.f605f) != null) {
            u.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
