package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f14204a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f14205b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f14206c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FabTransformationBehavior f14207d;

    c(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        this.f14207d = fabTransformationBehavior;
        this.f14204a = z;
        this.f14205b = view;
        this.f14206c = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f14204a) {
            this.f14205b.setVisibility(4);
            this.f14206c.setAlpha(1.0f);
            this.f14206c.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.f14204a) {
            this.f14205b.setVisibility(0);
            this.f14206c.setAlpha(0.0f);
            this.f14206c.setVisibility(4);
        }
    }
}
