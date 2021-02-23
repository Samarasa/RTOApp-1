package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

class m implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f14042a;

    m(n nVar) {
        this.f14042a = nVar;
    }

    public boolean onPreDraw() {
        this.f14042a.p();
        return true;
    }
}
