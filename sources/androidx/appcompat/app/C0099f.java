package androidx.appcompat.app;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* renamed from: androidx.appcompat.app.f  reason: case insensitive filesystem */
class C0099f implements NestedScrollView.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f206a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f207b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController f208c;

    C0099f(AlertController alertController, View view, View view2) {
        this.f208c = alertController;
        this.f206a = view;
        this.f207b = view2;
    }

    public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AlertController.a(nestedScrollView, this.f206a, this.f207b);
    }
}
