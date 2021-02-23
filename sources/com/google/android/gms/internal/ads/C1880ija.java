package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ija  reason: case insensitive filesystem */
final class C1880ija implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f10829a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10830b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10831c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1739gja f10832d;

    C1880ija(C1739gja gja, String str, long j, long j2) {
        this.f10832d = gja;
        this.f10829a = str;
        this.f10830b = j;
        this.f10831c = j2;
    }

    public final void run() {
        this.f10832d.f10570b.b(this.f10829a, this.f10830b, this.f10831c);
    }
}
