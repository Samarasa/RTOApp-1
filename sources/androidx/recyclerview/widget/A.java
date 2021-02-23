package androidx.recyclerview.widget;

import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;

class A implements N.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f1267a;

    A(RecyclerView recyclerView) {
        this.f1267a = recyclerView;
    }

    public void a(RecyclerView.x xVar) {
        RecyclerView recyclerView = this.f1267a;
        recyclerView.w.a(xVar.itemView, recyclerView.l);
    }

    public void a(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        this.f1267a.a(xVar, cVar, cVar2);
    }

    public void b(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        this.f1267a.l.c(xVar);
        this.f1267a.b(xVar, cVar, cVar2);
    }

    public void c(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        xVar.setIsRecyclable(false);
        RecyclerView recyclerView = this.f1267a;
        if (recyclerView.N) {
            if (!recyclerView.W.a(xVar, xVar, cVar, cVar2)) {
                return;
            }
        } else if (!recyclerView.W.c(xVar, cVar, cVar2)) {
            return;
        }
        this.f1267a.s();
    }
}
