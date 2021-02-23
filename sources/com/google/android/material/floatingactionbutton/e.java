package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14028a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton.a f14029b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f14030c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExtendedFloatingActionButton f14031d;

    e(ExtendedFloatingActionButton extendedFloatingActionButton, ExtendedFloatingActionButton.a aVar, boolean z) {
        this.f14031d = extendedFloatingActionButton;
        this.f14029b = aVar;
        this.f14030c = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f14028a = true;
    }

    public void onAnimationEnd(Animator animator) {
        ExtendedFloatingActionButton.a aVar;
        this.f14031d.setHorizontallyScrolling(false);
        Animator unused = this.f14031d.y = null;
        if (!this.f14028a && (aVar = this.f14029b) != null) {
            if (this.f14030c) {
                aVar.a(this.f14031d);
            } else {
                aVar.d(this.f14031d);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f14031d.setHorizontallyScrolling(true);
        Animator unused = this.f14031d.y = animator;
        this.f14028a = false;
    }
}
