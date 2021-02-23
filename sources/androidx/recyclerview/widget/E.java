package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;

class E implements M.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView.i f1271a;

    E(RecyclerView.i iVar) {
        this.f1271a = iVar;
    }

    public int a() {
        return this.f1271a.p();
    }

    public int a(View view) {
        return this.f1271a.j(view) - ((RecyclerView.j) view.getLayoutParams()).topMargin;
    }

    public View a(int i) {
        return this.f1271a.c(i);
    }

    public int b() {
        return this.f1271a.h() - this.f1271a.m();
    }

    public int b(View view) {
        return this.f1271a.e(view) + ((RecyclerView.j) view.getLayoutParams()).bottomMargin;
    }
}
