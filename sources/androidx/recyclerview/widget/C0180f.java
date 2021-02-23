package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f  reason: case insensitive filesystem */
class C0180f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView.x f1430a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1431b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f1432c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0185k f1433d;

    C0180f(C0185k kVar, RecyclerView.x xVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1433d = kVar;
        this.f1430a = xVar;
        this.f1431b = viewPropertyAnimator;
        this.f1432c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1431b.setListener((Animator.AnimatorListener) null);
        this.f1432c.setAlpha(1.0f);
        this.f1433d.l(this.f1430a);
        this.f1433d.r.remove(this.f1430a);
        this.f1433d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f1433d.m(this.f1430a);
    }
}
