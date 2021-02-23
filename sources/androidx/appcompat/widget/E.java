package androidx.appcompat.widget;

import android.os.Build;
import android.view.ViewTreeObserver;

class E implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F f437a;

    E(F f2) {
        this.f437a = f2;
    }

    public void onGlobalLayout() {
        if (!this.f437a.getInternalPopup().v()) {
            this.f437a.a();
        }
        ViewTreeObserver viewTreeObserver = this.f437a.getViewTreeObserver();
        if (viewTreeObserver == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }
}
