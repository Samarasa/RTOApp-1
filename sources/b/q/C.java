package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.e.b;

class C extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f2675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ E f2676b;

    C(E e2, b bVar) {
        this.f2676b = e2;
        this.f2675a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2675a.remove(animator);
        this.f2676b.A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f2676b.A.add(animator);
    }
}
