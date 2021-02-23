package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.view.View;
import b.h.j.y;

class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private int f14159a = this.f14160b;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f14160b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14161c;

    d(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f14161c = baseTransientBottomBar;
        this.f14160b = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.f14138b) {
            y.c((View) this.f14161c.f14142f, intValue - this.f14159a);
        } else {
            this.f14161c.f14142f.setTranslationY((float) intValue);
        }
        this.f14159a = intValue;
    }
}
