package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.view.View;
import b.h.j.y;

class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private int f14164a = 0;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14165b;

    f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14165b = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.f14138b) {
            y.c((View) this.f14165b.f14142f, intValue - this.f14164a);
        } else {
            this.f14165b.f14142f.setTranslationY((float) intValue);
        }
        this.f14164a = intValue;
    }
}
