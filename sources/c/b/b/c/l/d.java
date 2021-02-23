package c.b.b.c.l;

import android.graphics.Typeface;
import b.h.a.a.h;

class d extends h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f4800a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f4801b;

    d(f fVar, h hVar) {
        this.f4801b = fVar;
        this.f4800a = hVar;
    }

    public void a(int i) {
        boolean unused = this.f4801b.n = true;
        this.f4800a.a(i);
    }

    public void a(Typeface typeface) {
        f fVar = this.f4801b;
        Typeface unused = fVar.o = Typeface.create(typeface, fVar.f4809e);
        boolean unused2 = this.f4801b.n = true;
        this.f4800a.a(this.f4801b.o, false);
    }
}
