package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14174a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14175b;

    p(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f14175b = baseTransientBottomBar;
        this.f14174a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.f14175b.c(this.f14174a);
    }
}
