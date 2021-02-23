package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0175a;
import androidx.recyclerview.widget.RecyclerView;

class C implements C0175a.C0016a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f1269a;

    C(RecyclerView recyclerView) {
        this.f1269a = recyclerView;
    }

    public RecyclerView.x a(int i) {
        RecyclerView.x a2 = this.f1269a.a(i, true);
        if (a2 != null && !this.f1269a.o.c(a2.itemView)) {
            return a2;
        }
        return null;
    }

    public void a(int i, int i2) {
        this.f1269a.g(i, i2);
        this.f1269a.ua = true;
    }

    public void a(int i, int i2, Object obj) {
        this.f1269a.a(i, i2, obj);
        this.f1269a.va = true;
    }

    public void a(C0175a.b bVar) {
        c(bVar);
    }

    public void b(int i, int i2) {
        this.f1269a.a(i, i2, false);
        this.f1269a.ua = true;
    }

    public void b(C0175a.b bVar) {
        c(bVar);
    }

    public void c(int i, int i2) {
        this.f1269a.f(i, i2);
        this.f1269a.ua = true;
    }

    /* access modifiers changed from: package-private */
    public void c(C0175a.b bVar) {
        int i = bVar.f1415a;
        if (i == 1) {
            RecyclerView recyclerView = this.f1269a;
            recyclerView.w.a(recyclerView, bVar.f1416b, bVar.f1418d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f1269a;
            recyclerView2.w.b(recyclerView2, bVar.f1416b, bVar.f1418d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f1269a;
            recyclerView3.w.a(recyclerView3, bVar.f1416b, bVar.f1418d, bVar.f1417c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f1269a;
            recyclerView4.w.a(recyclerView4, bVar.f1416b, bVar.f1418d, 1);
        }
    }

    public void d(int i, int i2) {
        this.f1269a.a(i, i2, true);
        RecyclerView recyclerView = this.f1269a;
        recyclerView.ua = true;
        recyclerView.ra.f1366d += i2;
    }
}
