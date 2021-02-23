package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomAppBar f13931a;

    d(BottomAppBar bottomAppBar) {
        this.f13931a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f13931a.t();
        Animator unused = this.f13931a.T = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f13931a.u();
    }
}
