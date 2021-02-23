package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f13875a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppBarLayout f13876b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AppBarLayout.BaseBehavior f13877c;

    c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f13877c = baseBehavior;
        this.f13875a = coordinatorLayout;
        this.f13876b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13877c.c(this.f13875a, this.f13876b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
