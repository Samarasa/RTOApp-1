package c.b.b.c.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f4777a;

    a(f fVar) {
        this.f4777a = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4777a.b();
    }

    public void onAnimationStart(Animator animator) {
        this.f4777a.a();
    }
}
