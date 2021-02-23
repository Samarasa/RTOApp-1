package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;

final class GC implements k {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ DC f6985a;

    GC(DC dc) {
        this.f6985a = dc;
    }

    public final void P() {
        this.f6985a.f6505h.onPause();
    }

    public final void Q() {
        this.f6985a.f6505h.onResume();
    }
}
