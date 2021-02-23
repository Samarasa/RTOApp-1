package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.h;

class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f304a;

    d(h hVar) {
        this.f304a = hVar;
    }

    public void onGlobalLayout() {
        if (this.f304a.v() && this.f304a.j.size() > 0 && !this.f304a.j.get(0).f318a.i()) {
            View view = this.f304a.q;
            if (view == null || !view.isShown()) {
                this.f304a.dismiss();
                return;
            }
            for (h.a aVar : this.f304a.j) {
                aVar.f318a.u();
            }
        }
    }
}
