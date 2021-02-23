package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.rn  reason: case insensitive filesystem */
final class C2525rn implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0835Kj f12029a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2242nn f12030b;

    C2525rn(C2242nn nnVar, C0835Kj kj) {
        this.f12030b = nnVar;
        this.f12029a = kj;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f12030b.a(view, this.f12029a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
