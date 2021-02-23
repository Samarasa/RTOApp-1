package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.bB  reason: case insensitive filesystem */
final /* synthetic */ class C1341bB implements UW {

    /* renamed from: a  reason: collision with root package name */
    private final String f9878a;

    /* renamed from: b  reason: collision with root package name */
    private final double f9879b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9880c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9881d;

    C1341bB(String str, double d2, int i, int i2) {
        this.f9878a = str;
        this.f9879b = d2;
        this.f9880c = i;
        this.f9881d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f9878a;
        return new C1190Ya(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f9879b, this.f9880c, this.f9881d);
    }
}
