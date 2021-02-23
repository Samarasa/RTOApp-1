package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a  reason: case insensitive filesystem */
final class C3111a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13495a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f13496b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ B f13497c;

    C3111a(B b2, String str, long j) {
        this.f13497c = b2;
        this.f13495a = str;
        this.f13496b = j;
    }

    public final void run() {
        this.f13497c.c(this.f13495a, this.f13496b);
    }
}
