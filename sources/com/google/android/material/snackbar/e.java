package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14162a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14163b;

    e(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f14163b = baseTransientBottomBar;
        this.f14162a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.f14163b.c(this.f14162a);
    }

    public void onAnimationStart(Animator animator) {
        this.f14163b.f14143g.b(0, 180);
    }
}
