package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

class r implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f1136a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0158h f1137b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f1138c;

    r(v vVar, ViewGroup viewGroup, C0158h hVar) {
        this.f1138c = vVar;
        this.f1136a = viewGroup;
        this.f1137b = hVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1136a.post(new C0167q(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
