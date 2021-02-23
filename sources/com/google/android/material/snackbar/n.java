package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class n implements BaseTransientBottomBar.d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14172a;

    n(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14172a = baseTransientBottomBar;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.f14172a.f14142f.setOnLayoutChangeListener((BaseTransientBottomBar.d) null);
        if (this.f14172a.j()) {
            this.f14172a.b();
        } else {
            this.f14172a.i();
        }
    }
}
