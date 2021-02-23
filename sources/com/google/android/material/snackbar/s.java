package com.google.android.material.snackbar;

import android.view.View;

class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f14176a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Snackbar f14177b;

    s(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f14177b = snackbar;
        this.f14176a = onClickListener;
    }

    public void onClick(View view) {
        this.f14176a.onClick(view);
        this.f14177b.a(1);
    }
}
