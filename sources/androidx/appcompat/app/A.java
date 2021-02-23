package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.z;
import b.h.j.F;
import b.h.j.G;
import b.h.j.y;

class A extends G {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z.c f106a;

    A(z.c cVar) {
        this.f106a = cVar;
    }

    public void b(View view) {
        z.this.t.setVisibility(8);
        z zVar = z.this;
        PopupWindow popupWindow = zVar.u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (zVar.t.getParent() instanceof View) {
            y.F((View) z.this.t.getParent());
        }
        z.this.t.removeAllViews();
        z.this.w.a((F) null);
        z.this.w = null;
    }
}
