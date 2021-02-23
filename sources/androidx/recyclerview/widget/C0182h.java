package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h  reason: case insensitive filesystem */
class C0182h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView.x f1438a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1439b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f1440c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f1441d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1442e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C0185k f1443f;

    C0182h(C0185k kVar, RecyclerView.x xVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1443f = kVar;
        this.f1438a = xVar;
        this.f1439b = i;
        this.f1440c = view;
        this.f1441d = i2;
        this.f1442e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f1439b != 0) {
            this.f1440c.setTranslationX(0.0f);
        }
        if (this.f1441d != 0) {
            this.f1440c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f1442e.setListener((Animator.AnimatorListener) null);
        this.f1443f.j(this.f1438a);
        this.f1443f.q.remove(this.f1438a);
        this.f1443f.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f1443f.k(this.f1438a);
    }
}
