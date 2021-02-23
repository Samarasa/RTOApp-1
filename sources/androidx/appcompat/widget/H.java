package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.F;

class H implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F.c f462a;

    H(F.c cVar) {
        this.f462a = cVar;
    }

    public void onGlobalLayout() {
        F.c cVar = this.f462a;
        if (!cVar.b(F.this)) {
            this.f462a.dismiss();
            return;
        }
        this.f462a.j();
        H.super.u();
    }
}
