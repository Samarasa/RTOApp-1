package androidx.appcompat.app;

import android.view.View;
import b.h.j.F;
import b.h.j.G;

class y extends G {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f243a;

    y(z zVar) {
        this.f243a = zVar;
    }

    public void b(View view) {
        this.f243a.t.setAlpha(1.0f);
        this.f243a.w.a((F) null);
        this.f243a.w = null;
    }

    public void c(View view) {
        this.f243a.t.setVisibility(0);
        this.f243a.t.sendAccessibilityEvent(32);
        if (this.f243a.t.getParent() instanceof View) {
            b.h.j.y.F((View) this.f243a.t.getParent());
        }
    }
}
