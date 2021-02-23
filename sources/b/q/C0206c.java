package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.q.c  reason: case insensitive filesystem */
class C0206c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f2731a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BitmapDrawable f2732b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f2733c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f2734d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ C0216m f2735e;

    C0206c(C0216m mVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
        this.f2735e = mVar;
        this.f2731a = viewGroup;
        this.f2732b = bitmapDrawable;
        this.f2733c = view;
        this.f2734d = f2;
    }

    public void onAnimationEnd(Animator animator) {
        ba.b(this.f2731a).b(this.f2732b);
        ba.a(this.f2733c, this.f2734d);
    }
}
