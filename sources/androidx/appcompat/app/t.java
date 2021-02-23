package androidx.appcompat.app;

import android.view.View;
import b.h.j.I;
import b.h.j.q;
import b.h.j.y;

class t implements q {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f238a;

    t(z zVar) {
        this.f238a = zVar;
    }

    public I a(View view, I i) {
        int e2 = i.e();
        int j = this.f238a.j(e2);
        if (e2 != j) {
            i = i.a(i.c(), j, i.d(), i.b());
        }
        return y.b(view, i);
    }
}
