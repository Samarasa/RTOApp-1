package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0185k;

/* renamed from: androidx.recyclerview.widget.j  reason: case insensitive filesystem */
class C0184j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0185k.a f1448a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1449b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f1450c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0185k f1451d;

    C0184j(C0185k kVar, C0185k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1451d = kVar;
        this.f1448a = aVar;
        this.f1449b = viewPropertyAnimator;
        this.f1450c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1449b.setListener((Animator.AnimatorListener) null);
        this.f1450c.setAlpha(1.0f);
        this.f1450c.setTranslationX(0.0f);
        this.f1450c.setTranslationY(0.0f);
        this.f1451d.a(this.f1448a.f1454b, false);
        this.f1451d.s.remove(this.f1448a.f1454b);
        this.f1451d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f1451d.b(this.f1448a.f1454b, false);
    }
}
