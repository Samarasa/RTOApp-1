package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14157a;

    b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14157a = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f14157a.f14142f.setScaleX(floatValue);
        this.f14157a.f14142f.setScaleY(floatValue);
    }
}
