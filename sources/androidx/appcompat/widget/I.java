package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.widget.F;

class I implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f471a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ F.c f472b;

    I(F.c cVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f472b = cVar;
        this.f471a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = F.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f471a);
        }
    }
}
