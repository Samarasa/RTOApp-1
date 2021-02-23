package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

class r implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f370a;

    r(s sVar) {
        this.f370a = sVar;
    }

    public void onDismiss() {
        this.f370a.d();
    }
}
