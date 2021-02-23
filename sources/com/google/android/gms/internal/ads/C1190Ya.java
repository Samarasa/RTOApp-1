package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.b.b.b.c.a;
import c.b.b.b.c.b;

/* renamed from: com.google.android.gms.internal.ads.Ya  reason: case insensitive filesystem */
public final class C1190Ya extends C2005kb {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f9398a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f9399b;

    /* renamed from: c  reason: collision with root package name */
    private final double f9400c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9401d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9402e;

    public C1190Ya(Drawable drawable, Uri uri, double d2, int i, int i2) {
        this.f9398a = drawable;
        this.f9399b = uri;
        this.f9400c = d2;
        this.f9401d = i;
        this.f9402e = i2;
    }

    public final a cb() {
        return b.a(this.f9398a);
    }

    public final int getHeight() {
        return this.f9402e;
    }

    public final Uri getUri() {
        return this.f9399b;
    }

    public final int getWidth() {
        return this.f9401d;
    }

    public final double mb() {
        return this.f9400c;
    }
}
