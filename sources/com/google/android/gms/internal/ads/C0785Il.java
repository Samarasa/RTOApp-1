package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Il  reason: case insensitive filesystem */
final /* synthetic */ class C0785Il implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0759Hl f7334a;

    private C0785Il(C0759Hl hl) {
        this.f7334a = hl;
    }

    static Runnable a(C0759Hl hl) {
        return new C0785Il(hl);
    }

    public final void run() {
        this.f7334a.d();
    }
}
