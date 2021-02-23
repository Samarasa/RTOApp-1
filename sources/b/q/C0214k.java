package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import b.h.j.y;

/* renamed from: b.q.k  reason: case insensitive filesystem */
class C0214k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2764a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f2765b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Rect f2766c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f2767d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f2768e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f2769f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2770g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C0216m f2771h;

    C0214k(C0216m mVar, View view, Rect rect, int i, int i2, int i3, int i4) {
        this.f2771h = mVar;
        this.f2765b = view;
        this.f2766c = rect;
        this.f2767d = i;
        this.f2768e = i2;
        this.f2769f = i3;
        this.f2770g = i4;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2764a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f2764a) {
            y.a(this.f2765b, this.f2766c);
            ba.a(this.f2765b, this.f2767d, this.f2768e, this.f2769f, this.f2770g);
        }
    }
}
