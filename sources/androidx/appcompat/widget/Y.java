package androidx.appcompat.widget;

import android.view.View;

class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0111aa f587a;

    Y(C0111aa aaVar) {
        this.f587a = aaVar;
    }

    public void run() {
        View f2 = this.f587a.f();
        if (f2 != null && f2.getWindowToken() != null) {
            this.f587a.u();
        }
    }
}
