package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.s  reason: case insensitive filesystem */
class C0168s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f1139a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f1140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0158h f1141c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v f1142d;

    C0168s(v vVar, ViewGroup viewGroup, View view, C0158h hVar) {
        this.f1142d = vVar;
        this.f1139a = viewGroup;
        this.f1140b = view;
        this.f1141c = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1139a.endViewTransition(this.f1140b);
        Animator f2 = this.f1141c.f();
        this.f1141c.a((Animator) null);
        if (f2 != null && this.f1139a.indexOfChild(this.f1140b) < 0) {
            v vVar = this.f1142d;
            C0158h hVar = this.f1141c;
            vVar.a(hVar, hVar.x(), 0, 0, false);
        }
    }
}
