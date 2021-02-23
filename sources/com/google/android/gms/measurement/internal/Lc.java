package com.google.android.gms.measurement.internal;

final class Lc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13340a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13341b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f13342c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f13343d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Hc f13344e;

    Lc(Hc hc, String str, String str2, Object obj, long j) {
        this.f13344e = hc;
        this.f13340a = str;
        this.f13341b = str2;
        this.f13342c = obj;
        this.f13343d = j;
    }

    public final void run() {
        this.f13344e.a(this.f13340a, this.f13341b, this.f13342c, this.f13343d);
    }
}
