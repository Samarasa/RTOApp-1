package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.w;
import androidx.appcompat.widget.C0122g;

/* renamed from: androidx.appcompat.widget.h  reason: case insensitive filesystem */
class C0124h extends W {
    final /* synthetic */ C0122g j;
    final /* synthetic */ C0122g.d k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0124h(C0122g.d dVar, View view, C0122g gVar) {
        super(view);
        this.k = dVar;
        this.j = gVar;
    }

    public w a() {
        C0122g.e eVar = C0122g.this.y;
        if (eVar == null) {
            return null;
        }
        return eVar.b();
    }

    public boolean b() {
        C0122g.this.j();
        return true;
    }

    public boolean l() {
        C0122g gVar = C0122g.this;
        if (gVar.A != null) {
            return false;
        }
        gVar.f();
        return true;
    }
}
