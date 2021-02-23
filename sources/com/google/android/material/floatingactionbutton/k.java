package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.n;

class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f14038a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n.e f14039b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n f14040c;

    k(n nVar, boolean z, n.e eVar) {
        this.f14040c = nVar;
        this.f14038a = z;
        this.f14039b = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        int unused = this.f14040c.B = 0;
        Animator unused2 = this.f14040c.v = null;
        n.e eVar = this.f14039b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f14040c.F.a(0, this.f14038a);
        int unused = this.f14040c.B = 2;
        Animator unused2 = this.f14040c.v = animator;
    }
}
