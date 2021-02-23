package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ca  reason: case insensitive filesystem */
final class C0618Ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f6430a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f6431b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1339b f6432c;

    C0618Ca(C1339b bVar, String str, long j) {
        this.f6432c = bVar;
        this.f6430a = str;
        this.f6431b = j;
    }

    public final void run() {
        this.f6432c.f9864a.a(this.f6430a, this.f6431b);
        this.f6432c.f9864a.a(this.f6432c.toString());
    }
}
