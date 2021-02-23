package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class Mc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13350a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13351b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f13352c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f13353d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f13354e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f13355f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f13356g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f13357h;
    private final /* synthetic */ Hc i;

    Mc(Hc hc, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.i = hc;
        this.f13350a = str;
        this.f13351b = str2;
        this.f13352c = j;
        this.f13353d = bundle;
        this.f13354e = z;
        this.f13355f = z2;
        this.f13356g = z3;
        this.f13357h = str3;
    }

    public final void run() {
        this.i.a(this.f13350a, this.f13351b, this.f13352c, this.f13353d, this.f13354e, this.f13355f, this.f13356g, this.f13357h);
    }
}
