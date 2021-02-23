package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class m implements BaseTransientBottomBar.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14171a;

    m(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14171a = baseTransientBottomBar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.f14171a.h()) {
            BaseTransientBottomBar.f14137a.post(new l(this));
        }
    }
}
