package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.lo  reason: case insensitive filesystem */
final class C2102lo implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0835Kj f11241a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1748go f11242b;

    C2102lo(C1748go goVar, C0835Kj kj) {
        this.f11242b = goVar;
        this.f11241a = kj;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f11242b.a(view, this.f11241a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
