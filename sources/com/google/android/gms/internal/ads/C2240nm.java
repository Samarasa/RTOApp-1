package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nm  reason: case insensitive filesystem */
final /* synthetic */ class C2240nm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1532dm f11504a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11505b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11506c;

    C2240nm(C1532dm dmVar, boolean z, long j) {
        this.f11504a = dmVar;
        this.f11505b = z;
        this.f11506c = j;
    }

    public final void run() {
        this.f11504a.b(this.f11505b, this.f11506c);
    }
}
