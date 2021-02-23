package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f14215a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f14216b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FabTransformationScrimBehavior f14217c;

    g(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        this.f14217c = fabTransformationScrimBehavior;
        this.f14215a = z;
        this.f14216b = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f14215a) {
            this.f14216b.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.f14215a) {
            this.f14216b.setVisibility(0);
        }
    }
}
