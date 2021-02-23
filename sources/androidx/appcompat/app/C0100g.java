package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.g  reason: case insensitive filesystem */
class C0100g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f209a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f210b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController f211c;

    C0100g(AlertController alertController, View view, View view2) {
        this.f211c = alertController;
        this.f209a = view;
        this.f210b = view2;
    }

    public void run() {
        AlertController.a(this.f211c.A, this.f209a, this.f210b);
    }
}
