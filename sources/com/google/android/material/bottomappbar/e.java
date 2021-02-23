package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13932a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionMenuView f13933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f13934c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f13935d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BottomAppBar f13936e;

    e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f13936e = bottomAppBar;
        this.f13933b = actionMenuView;
        this.f13934c = i;
        this.f13935d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f13932a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f13932a) {
            this.f13936e.b(this.f13933b, this.f13934c, this.f13935d);
        }
    }
}
