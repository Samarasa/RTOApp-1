package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class I extends RecyclerView.f {

    /* renamed from: g  reason: collision with root package name */
    boolean f1277g = true;

    public final void a(RecyclerView.x xVar, boolean z) {
        c(xVar, z);
        c(xVar);
    }

    public abstract boolean a(RecyclerView.x xVar, int i, int i2, int i3, int i4);

    public boolean a(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        if (cVar == null || (cVar.f1326a == cVar2.f1326a && cVar.f1327b == cVar2.f1327b)) {
            return f(xVar);
        }
        return a(xVar, cVar.f1326a, cVar.f1327b, cVar2.f1326a, cVar2.f1327b);
    }

    public abstract boolean a(RecyclerView.x xVar, RecyclerView.x xVar2, int i, int i2, int i3, int i4);

    public boolean a(RecyclerView.x xVar, RecyclerView.x xVar2, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1326a;
        int i4 = cVar.f1327b;
        if (xVar2.shouldIgnore()) {
            int i5 = cVar.f1326a;
            i = cVar.f1327b;
            i2 = i5;
        } else {
            i2 = cVar2.f1326a;
            i = cVar2.f1327b;
        }
        return a(xVar, xVar2, i3, i4, i2, i);
    }

    public final void b(RecyclerView.x xVar, boolean z) {
        d(xVar, z);
    }

    public boolean b(RecyclerView.x xVar) {
        return !this.f1277g || xVar.isInvalid();
    }

    public boolean b(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        int i = cVar.f1326a;
        int i2 = cVar.f1327b;
        View view = xVar.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f1326a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1327b;
        if (xVar.isRemoved() || (i == left && i2 == top)) {
            return g(xVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(xVar, i, i2, left, top);
    }

    public void c(RecyclerView.x xVar, boolean z) {
    }

    public boolean c(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        if (cVar.f1326a == cVar2.f1326a && cVar.f1327b == cVar2.f1327b) {
            j(xVar);
            return false;
        }
        return a(xVar, cVar.f1326a, cVar.f1327b, cVar2.f1326a, cVar2.f1327b);
    }

    public void d(RecyclerView.x xVar, boolean z) {
    }

    public abstract boolean f(RecyclerView.x xVar);

    public abstract boolean g(RecyclerView.x xVar);

    public final void h(RecyclerView.x xVar) {
        n(xVar);
        c(xVar);
    }

    public final void i(RecyclerView.x xVar) {
        o(xVar);
    }

    public final void j(RecyclerView.x xVar) {
        p(xVar);
        c(xVar);
    }

    public final void k(RecyclerView.x xVar) {
        q(xVar);
    }

    public final void l(RecyclerView.x xVar) {
        r(xVar);
        c(xVar);
    }

    public final void m(RecyclerView.x xVar) {
        s(xVar);
    }

    public void n(RecyclerView.x xVar) {
    }

    public void o(RecyclerView.x xVar) {
    }

    public void p(RecyclerView.x xVar) {
    }

    public void q(RecyclerView.x xVar) {
    }

    public void r(RecyclerView.x xVar) {
    }

    public void s(RecyclerView.x xVar) {
    }
}
