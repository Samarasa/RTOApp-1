package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mna  reason: case insensitive filesystem */
final class C2172mna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f11376a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f11377b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f11378c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ float f11379d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C1959jna f11380e;

    C2172mna(C1959jna jna, int i, int i2, int i3, float f2) {
        this.f11380e = jna;
        this.f11376a = i;
        this.f11377b = i2;
        this.f11378c = i3;
        this.f11379d = f2;
    }

    public final void run() {
        this.f11380e.f11000b.a(this.f11376a, this.f11377b, this.f11378c, this.f11379d);
    }
}
