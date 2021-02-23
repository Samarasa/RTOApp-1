package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* renamed from: com.google.android.gms.internal.ads.Aj  reason: case insensitive filesystem */
final /* synthetic */ class C0575Aj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0601Bj f6165a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f6166b;

    C0575Aj(C0601Bj bj, Bitmap bitmap) {
        this.f6165a = bj;
        this.f6166b = bitmap;
    }

    public final void run() {
        this.f6165a.a(this.f6166b);
    }
}
