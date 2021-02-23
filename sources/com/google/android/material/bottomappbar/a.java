package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomAppBar f13927a;

    a(BottomAppBar bottomAppBar) {
        this.f13927a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f13927a.t();
    }

    public void onAnimationStart(Animator animator) {
        this.f13927a.u();
    }
}
