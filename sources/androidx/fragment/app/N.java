package androidx.fragment.app;

import android.view.View;
import b.h.j.y;
import java.util.ArrayList;

class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1083a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f1084b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ArrayList f1085c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ArrayList f1086d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ArrayList f1087e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Q f1088f;

    N(Q q, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1088f = q;
        this.f1083a = i;
        this.f1084b = arrayList;
        this.f1085c = arrayList2;
        this.f1086d = arrayList3;
        this.f1087e = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f1083a; i++) {
            y.a((View) this.f1084b.get(i), (String) this.f1085c.get(i));
            y.a((View) this.f1086d.get(i), (String) this.f1087e.get(i));
        }
    }
}
