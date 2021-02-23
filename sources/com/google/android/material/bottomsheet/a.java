package com.google.android.material.bottomsheet;

import android.view.View;

class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f13960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f13961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f13962c;

    a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f13962c = bottomSheetBehavior;
        this.f13960a = view;
        this.f13961b = i;
    }

    public void run() {
        this.f13962c.a(this.f13960a, this.f13961b);
    }
}
