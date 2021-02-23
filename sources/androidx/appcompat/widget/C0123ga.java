package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.ga  reason: case insensitive filesystem */
class C0123ga implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f643a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0125ha f644b;

    C0123ga(C0125ha haVar, View view) {
        this.f644b = haVar;
        this.f643a = view;
    }

    public void run() {
        this.f644b.smoothScrollTo(this.f643a.getLeft() - ((this.f644b.getWidth() - this.f643a.getWidth()) / 2), 0);
        this.f644b.f646b = null;
    }
}
