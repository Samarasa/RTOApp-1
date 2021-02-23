package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.q  reason: case insensitive filesystem */
class C0167q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f1135a;

    C0167q(r rVar) {
        this.f1135a = rVar;
    }

    public void run() {
        if (this.f1135a.f1137b.e() != null) {
            this.f1135a.f1137b.a((View) null);
            r rVar = this.f1135a;
            v vVar = rVar.f1138c;
            C0158h hVar = rVar.f1137b;
            vVar.a(hVar, hVar.x(), 0, 0, false);
        }
    }
}
