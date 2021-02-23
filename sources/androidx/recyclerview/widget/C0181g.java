package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g  reason: case insensitive filesystem */
class C0181g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView.x f1434a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f1435b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1436c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0185k f1437d;

    C0181g(C0185k kVar, RecyclerView.x xVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1437d = kVar;
        this.f1434a = xVar;
        this.f1435b = view;
        this.f1436c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1435b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1436c.setListener((Animator.AnimatorListener) null);
        this.f1437d.h(this.f1434a);
        this.f1437d.p.remove(this.f1434a);
        this.f1437d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f1437d.i(this.f1434a);
    }
}
