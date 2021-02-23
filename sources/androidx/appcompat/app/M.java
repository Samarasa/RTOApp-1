package androidx.appcompat.app;

import android.view.View;
import b.h.j.H;

class M implements H {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ N f172a;

    M(N n) {
        this.f172a = n;
    }

    public void a(View view) {
        ((View) this.f172a.f180h.getParent()).invalidate();
    }
}
