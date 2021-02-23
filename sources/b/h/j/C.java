package b.h.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class C extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F f2518a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f2519b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ E f2520c;

    C(E e2, F f2, View view) {
        this.f2520c = e2;
        this.f2518a = f2;
        this.f2519b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2518a.a(this.f2519b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f2518a.b(this.f2519b);
    }

    public void onAnimationStart(Animator animator) {
        this.f2518a.c(this.f2519b);
    }
}
