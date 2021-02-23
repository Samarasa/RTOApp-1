package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class v extends w {
    v(RecyclerView.i iVar) {
        super(iVar, (u) null);
    }

    public int a() {
        return this.f1501a.h();
    }

    public int a(View view) {
        return this.f1501a.e(view) + ((RecyclerView.j) view.getLayoutParams()).bottomMargin;
    }

    public void a(int i) {
        this.f1501a.e(i);
    }

    public int b() {
        return this.f1501a.h() - this.f1501a.m();
    }

    public int b(View view) {
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return this.f1501a.g(view) + jVar.topMargin + jVar.bottomMargin;
    }

    public int c() {
        return this.f1501a.m();
    }

    public int c(View view) {
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return this.f1501a.h(view) + jVar.leftMargin + jVar.rightMargin;
    }

    public int d() {
        return this.f1501a.i();
    }

    public int d(View view) {
        return this.f1501a.j(view) - ((RecyclerView.j) view.getLayoutParams()).topMargin;
    }

    public int e() {
        return this.f1501a.r();
    }

    public int e(View view) {
        this.f1501a.a(view, true, this.f1503c);
        return this.f1503c.bottom;
    }

    public int f() {
        return this.f1501a.p();
    }

    public int f(View view) {
        this.f1501a.a(view, true, this.f1503c);
        return this.f1503c.top;
    }

    public int g() {
        return (this.f1501a.h() - this.f1501a.p()) - this.f1501a.m();
    }
}
