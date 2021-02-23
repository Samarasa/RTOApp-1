package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0185k;

/* renamed from: androidx.recyclerview.widget.i  reason: case insensitive filesystem */
class C0183i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0185k.a f1444a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1445b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f1446c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0185k f1447d;

    C0183i(C0185k kVar, C0185k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1447d = kVar;
        this.f1444a = aVar;
        this.f1445b = viewPropertyAnimator;
        this.f1446c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1445b.setListener((Animator.AnimatorListener) null);
        this.f1446c.setAlpha(1.0f);
        this.f1446c.setTranslationX(0.0f);
        this.f1446c.setTranslationY(0.0f);
        this.f1447d.a(this.f1444a.f1453a, true);
        this.f1447d.s.remove(this.f1444a.f1453a);
        this.f1447d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f1447d.b(this.f1444a.f1453a, true);
    }
}
