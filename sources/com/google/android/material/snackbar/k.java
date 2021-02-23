package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

class k implements SwipeDismissBehavior.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14169a;

    k(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14169a = baseTransientBottomBar;
    }

    public void a(int i) {
        if (i == 0) {
            u.a().e(this.f14169a.p);
        } else if (i == 1 || i == 2) {
            u.a().d(this.f14169a.p);
        }
    }

    public void a(View view) {
        view.setVisibility(8);
        this.f14169a.a(0);
    }
}
