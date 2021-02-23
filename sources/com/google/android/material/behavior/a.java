package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HideBottomViewOnScrollBehavior f13918a;

    a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f13918a = hideBottomViewOnScrollBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator unused = this.f13918a.f13906d = null;
    }
}
