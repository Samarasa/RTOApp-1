package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import b.h.j.I;
import b.h.j.q;
import b.h.j.y;

class p implements q {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f14097a;

    p(q qVar) {
        this.f14097a = qVar;
    }

    public I a(View view, I i) {
        q qVar = this.f14097a;
        if (qVar.f14099b == null) {
            qVar.f14099b = new Rect();
        }
        this.f14097a.f14099b.set(i.c(), i.e(), i.d(), i.b());
        this.f14097a.a(i);
        this.f14097a.setWillNotDraw(!i.f() || this.f14097a.f14098a == null);
        y.E(this.f14097a);
        return i.a();
    }
}
