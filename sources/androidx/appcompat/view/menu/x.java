package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

class x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f380a;

    x(z zVar) {
        this.f380a = zVar;
    }

    public void onGlobalLayout() {
        if (this.f380a.v() && !this.f380a.j.i()) {
            View view = this.f380a.o;
            if (view == null || !view.isShown()) {
                this.f380a.dismiss();
            } else {
                this.f380a.j.u();
            }
        }
    }
}
