package androidx.fragment.app;

import android.view.View;
import b.h.j.y;
import java.util.ArrayList;
import java.util.Map;

class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f1090b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Q f1091c;

    O(Q q, ArrayList arrayList, Map map) {
        this.f1091c = q;
        this.f1089a = arrayList;
        this.f1090b = map;
    }

    public void run() {
        int size = this.f1089a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1089a.get(i);
            String s = y.s(view);
            if (s != null) {
                y.a(view, Q.a((Map<String, String>) this.f1090b, s));
            }
        }
    }
}
