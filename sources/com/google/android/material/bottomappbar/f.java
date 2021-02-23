package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomAppBar f13937a;

    f(BottomAppBar bottomAppBar) {
        this.f13937a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        this.f13937a.ea.onAnimationStart(animator);
        FloatingActionButton a2 = this.f13937a.v();
        if (a2 != null) {
            a2.setTranslationX(this.f13937a.getFabTranslationX());
        }
    }
}
