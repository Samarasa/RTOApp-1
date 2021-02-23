package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

class y implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f381a;

    y(z zVar) {
        this.f381a = zVar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f381a.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f381a.q = view.getViewTreeObserver();
            }
            z zVar = this.f381a;
            zVar.q.removeGlobalOnLayoutListener(zVar.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
