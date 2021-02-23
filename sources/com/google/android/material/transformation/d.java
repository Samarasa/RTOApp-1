package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f14208a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FabTransformationBehavior f14209b;

    d(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f14209b = fabTransformationBehavior;
        this.f14208a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f14208a.invalidate();
    }
}
