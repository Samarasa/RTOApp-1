package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14173a;

    o(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14173a = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f14173a.i();
    }
}
