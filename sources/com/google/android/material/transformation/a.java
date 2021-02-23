package com.google.android.material.transformation;

import android.view.View;
import android.view.ViewTreeObserver;
import c.b.b.c.i.b;

class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f14199a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f14200b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f14201c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExpandableBehavior f14202d;

    a(ExpandableBehavior expandableBehavior, View view, int i, b bVar) {
        this.f14202d = expandableBehavior;
        this.f14199a = view;
        this.f14200b = i;
        this.f14201c = bVar;
    }

    public boolean onPreDraw() {
        this.f14199a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f14202d.f14187a == this.f14200b) {
            ExpandableBehavior expandableBehavior = this.f14202d;
            b bVar = this.f14201c;
            expandableBehavior.a((View) bVar, this.f14199a, bVar.a(), false);
        }
        return false;
    }
}
