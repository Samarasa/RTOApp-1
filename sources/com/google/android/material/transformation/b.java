package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpandableTransformationBehavior f14203a;

    b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f14203a = expandableTransformationBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        AnimatorSet unused = this.f14203a.f14188b = null;
    }
}
