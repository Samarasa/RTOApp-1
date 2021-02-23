package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f14101a;

    r(s sVar) {
        this.f14101a = sVar;
    }

    public void onAnimationEnd(Animator animator) {
        s sVar = this.f14101a;
        if (sVar.f14104c == animator) {
            sVar.f14104c = null;
        }
    }
}
