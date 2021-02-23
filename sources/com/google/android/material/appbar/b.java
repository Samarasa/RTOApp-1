package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import c.b.b.c.o.e;

class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f13873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppBarLayout f13874b;

    b(AppBarLayout appBarLayout, e eVar) {
        this.f13874b = appBarLayout;
        this.f13873a = eVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13873a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
