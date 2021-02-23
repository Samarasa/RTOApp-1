package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class D extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ E f2677a;

    D(E e2) {
        this.f2677a = e2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2677a.a();
        animator.removeListener(this);
    }
}
