package b.q;

import android.view.ViewGroup;
import b.q.E;

/* renamed from: b.q.l  reason: case insensitive filesystem */
class C0215l extends F {

    /* renamed from: a  reason: collision with root package name */
    boolean f2772a = false;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewGroup f2773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0216m f2774c;

    C0215l(C0216m mVar, ViewGroup viewGroup) {
        this.f2774c = mVar;
        this.f2773b = viewGroup;
    }

    public void b(E e2) {
        S.a(this.f2773b, false);
    }

    public void c(E e2) {
        if (!this.f2772a) {
            S.a(this.f2773b, false);
        }
        e2.b((E.c) this);
    }

    public void d(E e2) {
        S.a(this.f2773b, true);
    }
}
