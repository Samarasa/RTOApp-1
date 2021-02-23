package androidx.fragment.app;

import android.view.View;
import b.h.j.y;
import java.util.ArrayList;
import java.util.Map;

class P implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f1093b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Q f1094c;

    P(Q q, ArrayList arrayList, Map map) {
        this.f1094c = q;
        this.f1092a = arrayList;
        this.f1093b = map;
    }

    public void run() {
        int size = this.f1092a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1092a.get(i);
            y.a(view, (String) this.f1093b.get(y.s(view)));
        }
    }
}
