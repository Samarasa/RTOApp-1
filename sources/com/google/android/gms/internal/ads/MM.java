package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class MM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final int f7825a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7826b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7827c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7828d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7829e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7830f;

    /* renamed from: g  reason: collision with root package name */
    private final float f7831g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7832h;

    public MM(int i, boolean z, boolean z2, int i2, int i3, int i4, float f2, boolean z3) {
        this.f7825a = i;
        this.f7826b = z;
        this.f7827c = z2;
        this.f7828d = i2;
        this.f7829e = i3;
        this.f7830f = i4;
        this.f7831g = f2;
        this.f7832h = z3;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f7825a);
        bundle.putBoolean("ma", this.f7826b);
        bundle.putBoolean("sp", this.f7827c);
        bundle.putInt("muv", this.f7828d);
        bundle.putInt("rm", this.f7829e);
        bundle.putInt("riv", this.f7830f);
        bundle.putFloat("android_app_volume", this.f7831g);
        bundle.putBoolean("android_app_muted", this.f7832h);
    }
}
