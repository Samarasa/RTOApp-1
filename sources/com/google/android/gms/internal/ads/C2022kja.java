package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kja  reason: case insensitive filesystem */
final class C2022kja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f11089a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f11090b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f11091c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1739gja f11092d;

    C2022kja(C1739gja gja, int i, long j, long j2) {
        this.f11092d = gja;
        this.f11089a = i;
        this.f11090b = j;
        this.f11091c = j2;
    }

    public final void run() {
        this.f11092d.f10570b.a(this.f11089a, this.f11090b, this.f11091c);
    }
}
