package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

class ra implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f704a;

    ra(SearchView searchView) {
        this.f704a = searchView;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f704a.d(i);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
