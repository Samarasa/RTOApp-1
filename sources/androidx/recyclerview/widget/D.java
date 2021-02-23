package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;

class D implements M.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView.i f1270a;

    D(RecyclerView.i iVar) {
        this.f1270a = iVar;
    }

    public int a() {
        return this.f1270a.n();
    }

    public int a(View view) {
        return this.f1270a.f(view) - ((RecyclerView.j) view.getLayoutParams()).leftMargin;
    }

    public View a(int i) {
        return this.f1270a.c(i);
    }

    public int b() {
        return this.f1270a.q() - this.f1270a.o();
    }

    public int b(View view) {
        return this.f1270a.i(view) + ((RecyclerView.j) view.getLayoutParams()).rightMargin;
    }
}
