package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f14025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton.a f14026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton f14027c;

    d(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z, ExtendedFloatingActionButton.a aVar) {
        this.f14027c = extendedFloatingActionButton;
        this.f14025a = z;
        this.f14026b = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        int unused = this.f14027c.w = 0;
        Animator unused2 = this.f14027c.x = null;
        ExtendedFloatingActionButton.a aVar = this.f14026b;
        if (aVar != null) {
            aVar.c(this.f14027c);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f14027c.a(0, this.f14025a);
        int unused = this.f14027c.w = 2;
        Animator unused2 = this.f14027c.x = animator;
    }
}
