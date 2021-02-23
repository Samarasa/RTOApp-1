package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1035a;

    D(ArrayList arrayList) {
        this.f1035a = arrayList;
    }

    public void run() {
        H.a((ArrayList<View>) this.f1035a, 4);
    }
}
