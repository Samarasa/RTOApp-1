package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14156a;

    a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14156a = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f14156a.f14142f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
