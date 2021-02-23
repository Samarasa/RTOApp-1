package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;

class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f13963a;

    b(BottomSheetBehavior bottomSheetBehavior) {
        this.f13963a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f13963a.i != null) {
            this.f13963a.i.b(floatValue);
        }
    }
}
