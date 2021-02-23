package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lna  reason: case insensitive filesystem */
final class C2101lna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f11237a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f11238b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f11239c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1959jna f11240d;

    C2101lna(C1959jna jna, String str, long j, long j2) {
        this.f11240d = jna;
        this.f11237a = str;
        this.f11238b = j;
        this.f11239c = j2;
    }

    public final void run() {
        this.f11240d.f11000b.a(this.f11237a, this.f11238b, this.f11239c);
    }
}
