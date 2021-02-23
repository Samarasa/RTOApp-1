package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0185k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d  reason: case insensitive filesystem */
class C0178d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1426a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0185k f1427b;

    C0178d(C0185k kVar, ArrayList arrayList) {
        this.f1427b = kVar;
        this.f1426a = arrayList;
    }

    public void run() {
        Iterator it = this.f1426a.iterator();
        while (it.hasNext()) {
            this.f1427b.a((C0185k.a) it.next());
        }
        this.f1426a.clear();
        this.f1427b.o.remove(this.f1426a);
    }
}
