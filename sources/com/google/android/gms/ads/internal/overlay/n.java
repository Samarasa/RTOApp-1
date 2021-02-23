package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f5516a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5517b;

    n(k kVar, Drawable drawable) {
        this.f5516a = kVar;
        this.f5517b = drawable;
    }

    public final void run() {
        k kVar = this.f5516a;
        kVar.f5505d.f5495b.getWindow().setBackgroundDrawable(this.f5517b);
    }
}
