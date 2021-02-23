package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class u extends w {
    u(RecyclerView.i iVar) {
        super(iVar, (u) null);
    }

    public int a() {
        return this.f1501a.q();
    }

    public int a(View view) {
        return this.f1501a.i(view) + ((RecyclerView.j) view.getLayoutParams()).rightMargin;
    }

    public void a(int i) {
        this.f1501a.d(i);
    }

    public int b() {
        return this.f1501a.q() - this.f1501a.o();
    }

    public int b(View view) {
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return this.f1501a.h(view) + jVar.leftMargin + jVar.rightMargin;
    }

    public int c() {
        return this.f1501a.o();
    }

    public int c(View view) {
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return this.f1501a.g(view) + jVar.topMargin + jVar.bottomMargin;
    }

    public int d() {
        return this.f1501a.r();
    }

    public int d(View view) {
        return this.f1501a.f(view) - ((RecyclerView.j) view.getLayoutParams()).leftMargin;
    }

    public int e() {
        return this.f1501a.i();
    }

    public int e(View view) {
        this.f1501a.a(view, true, this.f1503c);
        return this.f1503c.right;
    }

    public int f() {
        return this.f1501a.n();
    }

    public int f(View view) {
        this.f1501a.a(view, true, this.f1503c);
        return this.f1503c.left;
    }

    public int g() {
        return (this.f1501a.q() - this.f1501a.n()) - this.f1501a.o();
    }
}
