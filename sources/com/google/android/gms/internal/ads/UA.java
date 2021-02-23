package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

final class UA implements UW<Ara, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ double f8852a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f8853b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ RA f8854c;

    UA(RA ra, double d2, boolean z) {
        this.f8854c = ra;
        this.f8852a = d2;
        this.f8853b = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f8854c.a(((Ara) obj).f6212b, this.f8852a, this.f8853b);
    }
}
