package androidx.appcompat.app;

import b.h.j.E;
import b.h.j.F;
import b.h.j.y;

class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f242a;

    x(z zVar) {
        this.f242a = zVar;
    }

    public void run() {
        z zVar = this.f242a;
        zVar.u.showAtLocation(zVar.t, 55, 0, 0);
        this.f242a.n();
        if (this.f242a.v()) {
            this.f242a.t.setAlpha(0.0f);
            z zVar2 = this.f242a;
            E a2 = y.a(zVar2.t);
            a2.a(1.0f);
            zVar2.w = a2;
            this.f242a.w.a((F) new w(this));
            return;
        }
        this.f242a.t.setAlpha(1.0f);
        this.f242a.t.setVisibility(0);
    }
}
