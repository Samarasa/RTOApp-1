package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.i  reason: case insensitive filesystem */
class C0102i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f215a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f216b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController f217c;

    C0102i(AlertController alertController, View view, View view2) {
        this.f217c = alertController;
        this.f215a = view;
        this.f216b = view2;
    }

    public void run() {
        AlertController.a(this.f217c.f113g, this.f215a, this.f216b);
    }
}
