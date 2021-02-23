package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.en  reason: case insensitive filesystem */
final /* synthetic */ class C1604en implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1175Xl f10300a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10301b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10302c;

    C1604en(C1175Xl xl, boolean z, long j) {
        this.f10300a = xl;
        this.f10301b = z;
        this.f10302c = j;
    }

    public final void run() {
        this.f10300a.a(this.f10301b, this.f10302c);
    }
}
