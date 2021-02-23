package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.im  reason: case insensitive filesystem */
final /* synthetic */ class C1885im implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1532dm f10836a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10837b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10838c;

    C1885im(C1532dm dmVar, int i, int i2) {
        this.f10836a = dmVar;
        this.f10837b = i;
        this.f10838c = i2;
    }

    public final void run() {
        this.f10836a.b(this.f10837b, this.f10838c);
    }
}
