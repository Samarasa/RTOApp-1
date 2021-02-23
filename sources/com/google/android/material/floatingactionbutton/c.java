package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f14022b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton.a f14023c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton f14024d;

    c(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z, ExtendedFloatingActionButton.a aVar) {
        this.f14024d = extendedFloatingActionButton;
        this.f14022b = z;
        this.f14023c = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f14021a = true;
    }

    public void onAnimationEnd(Animator animator) {
        int unused = this.f14024d.w = 0;
        Animator unused2 = this.f14024d.x = null;
        if (!this.f14021a) {
            this.f14024d.a(this.f14022b ? 8 : 4, this.f14022b);
            ExtendedFloatingActionButton.a aVar = this.f14023c;
            if (aVar != null) {
                aVar.b(this.f14024d);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f14024d.a(0, this.f14022b);
        int unused = this.f14024d.w = 1;
        Animator unused2 = this.f14024d.x = animator;
        this.f14021a = false;
    }
}
