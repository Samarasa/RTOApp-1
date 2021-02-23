package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import c.b.b.c.e.f;

class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f14210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Drawable f14211b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FabTransformationBehavior f14212c;

    e(FabTransformationBehavior fabTransformationBehavior, f fVar, Drawable drawable) {
        this.f14212c = fabTransformationBehavior;
        this.f14210a = fVar;
        this.f14211b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f14210a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f14210a.setCircularRevealOverlayDrawable(this.f14211b);
    }
}
