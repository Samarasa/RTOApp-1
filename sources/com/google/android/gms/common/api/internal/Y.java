package com.google.android.gms.common.api.internal;

final class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f5835a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5836b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ X f5837c;

    Y(X x, LifecycleCallback lifecycleCallback, String str) {
        this.f5837c = x;
        this.f5835a = lifecycleCallback;
        this.f5836b = str;
    }

    public final void run() {
        if (this.f5837c.Y > 0) {
            this.f5835a.a(this.f5837c.Z != null ? this.f5837c.Z.getBundle(this.f5836b) : null);
        }
        if (this.f5837c.Y >= 2) {
            this.f5835a.c();
        }
        if (this.f5837c.Y >= 3) {
            this.f5835a.b();
        }
        if (this.f5837c.Y >= 4) {
            this.f5835a.d();
        }
        if (this.f5837c.Y >= 5) {
            this.f5835a.a();
        }
    }
}
