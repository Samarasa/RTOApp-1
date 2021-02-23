package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ln  reason: case insensitive filesystem */
final /* synthetic */ class C0865Ln implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0813Jn f7737a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7738b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7739c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7740d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7741e;

    C0865Ln(C0813Jn jn, int i, int i2, boolean z, boolean z2) {
        this.f7737a = jn;
        this.f7738b = i;
        this.f7739c = i2;
        this.f7740d = z;
        this.f7741e = z2;
    }

    public final void run() {
        this.f7737a.a(this.f7738b, this.f7739c, this.f7740d, this.f7741e);
    }
}
