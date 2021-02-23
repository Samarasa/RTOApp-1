package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class ga extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Q f2745a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f2746b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ha f2747c;

    ga(ha haVar, Q q, View view) {
        this.f2747c = haVar;
        this.f2745a = q;
        this.f2746b = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2745a.b(this.f2746b);
    }
}
