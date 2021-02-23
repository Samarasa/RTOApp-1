package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.e  reason: case insensitive filesystem */
class C0179e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1428a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0185k f1429b;

    C0179e(C0185k kVar, ArrayList arrayList) {
        this.f1429b = kVar;
        this.f1428a = arrayList;
    }

    public void run() {
        Iterator it = this.f1428a.iterator();
        while (it.hasNext()) {
            this.f1429b.t((RecyclerView.x) it.next());
        }
        this.f1428a.clear();
        this.f1429b.m.remove(this.f1428a);
    }
}
