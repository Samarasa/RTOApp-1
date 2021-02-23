package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

class e implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f305a;

    e(h hVar) {
        this.f305a = hVar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f305a.z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f305a.z = view.getViewTreeObserver();
            }
            h hVar = this.f305a;
            hVar.z.removeGlobalOnLayoutListener(hVar.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
