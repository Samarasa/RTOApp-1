package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.n;

class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f14035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n.e f14036c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f14037d;

    j(n nVar, boolean z, n.e eVar) {
        this.f14037d = nVar;
        this.f14035b = z;
        this.f14036c = eVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f14034a = true;
    }

    public void onAnimationEnd(Animator animator) {
        int unused = this.f14037d.B = 0;
        Animator unused2 = this.f14037d.v = null;
        if (!this.f14034a) {
            this.f14037d.F.a(this.f14035b ? 8 : 4, this.f14035b);
            n.e eVar = this.f14036c;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f14037d.F.a(0, this.f14035b);
        int unused = this.f14037d.B = 1;
        Animator unused2 = this.f14037d.v = animator;
        this.f14034a = false;
    }
}
