package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nna  reason: case insensitive filesystem */
final class C2243nna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f11522a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f11523b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1959jna f11524c;

    C2243nna(C1959jna jna, int i, long j) {
        this.f11524c = jna;
        this.f11522a = i;
        this.f11523b = j;
    }

    public final void run() {
        this.f11524c.f11000b.a(this.f11522a, this.f11523b);
    }
}
