package com.google.android.material.appbar;

import android.animation.ValueAnimator;

class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CollapsingToolbarLayout f13879a;

    f(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f13879a = collapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13879a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
