package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c.b.b.c.e.f;

class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c.b.b.c.e.f f14213a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FabTransformationBehavior f14214b;

    f(FabTransformationBehavior fabTransformationBehavior, c.b.b.c.e.f fVar) {
        this.f14214b = fabTransformationBehavior;
        this.f14213a = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        f.d revealInfo = this.f14213a.getRevealInfo();
        revealInfo.f4786c = Float.MAX_VALUE;
        this.f14213a.setRevealInfo(revealInfo);
    }
}
