package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
class C0169t extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f1143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f1144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0158h f1145c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v f1146d;

    C0169t(v vVar, ViewGroup viewGroup, View view, C0158h hVar) {
        this.f1146d = vVar;
        this.f1143a = viewGroup;
        this.f1144b = view;
        this.f1145c = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1143a.endViewTransition(this.f1144b);
        animator.removeListener(this);
        View view = this.f1145c.G;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
