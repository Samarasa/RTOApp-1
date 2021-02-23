package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.F;

class G implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F f457a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ F.c f458b;

    G(F.c cVar, F f2) {
        this.f458b = cVar;
        this.f457a = f2;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        F.this.setSelection(i);
        if (F.this.getOnItemClickListener() != null) {
            F.c cVar = this.f458b;
            F.this.performItemClick(view, i, cVar.L.getItemId(i));
        }
        this.f458b.dismiss();
    }
}
