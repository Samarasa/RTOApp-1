package androidx.fragment.app;

import android.app.Dialog;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
class C0154d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0155e f1104a;

    C0154d(C0155e eVar) {
        this.f1104a = eVar;
    }

    public void run() {
        C0155e eVar = this.f1104a;
        Dialog dialog = eVar.da;
        if (dialog != null) {
            eVar.onDismiss(dialog);
        }
    }
}
