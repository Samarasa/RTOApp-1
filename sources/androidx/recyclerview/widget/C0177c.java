package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0185k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.c  reason: case insensitive filesystem */
class C0177c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f1424a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0185k f1425b;

    C0177c(C0185k kVar, ArrayList arrayList) {
        this.f1425b = kVar;
        this.f1424a = arrayList;
    }

    public void run() {
        Iterator it = this.f1424a.iterator();
        while (it.hasNext()) {
            C0185k.b bVar = (C0185k.b) it.next();
            this.f1425b.b(bVar.f1459a, bVar.f1460b, bVar.f1461c, bVar.f1462d, bVar.f1463e);
        }
        this.f1424a.clear();
        this.f1425b.n.remove(this.f1424a);
    }
}
