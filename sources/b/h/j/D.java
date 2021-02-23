package b.h.j;

import android.animation.ValueAnimator;
import android.view.View;

class D implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ H f2521a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f2522b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ E f2523c;

    D(E e2, H h2, View view) {
        this.f2523c = e2;
        this.f2521a = h2;
        this.f2522b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2521a.a(this.f2522b);
    }
}
