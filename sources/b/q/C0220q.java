package b.q;

import android.view.View;
import b.q.E;
import java.util.ArrayList;

/* renamed from: b.q.q  reason: case insensitive filesystem */
class C0220q implements E.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f2788a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f2789b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0222t f2790c;

    C0220q(C0222t tVar, View view, ArrayList arrayList) {
        this.f2790c = tVar;
        this.f2788a = view;
        this.f2789b = arrayList;
    }

    public void a(E e2) {
    }

    public void b(E e2) {
    }

    public void c(E e2) {
        e2.b((E.c) this);
        this.f2788a.setVisibility(8);
        int size = this.f2789b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f2789b.get(i)).setVisibility(0);
        }
    }

    public void d(E e2) {
    }
}
