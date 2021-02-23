package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14158a;

    c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14158a = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f14158a.i();
    }

    public void onAnimationStart(Animator animator) {
        this.f14158a.f14143g.a(70, 180);
    }
}
