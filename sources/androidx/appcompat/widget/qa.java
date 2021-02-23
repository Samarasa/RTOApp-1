package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

class qa implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f700a;

    qa(SearchView searchView) {
        this.f700a = searchView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f700a.a(i, 0, (String) null);
    }
}
