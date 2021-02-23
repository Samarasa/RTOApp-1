package com.google.android.gms.common.api.internal;

final class V implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f5828a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5829b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ W f5830c;

    V(W w, LifecycleCallback lifecycleCallback, String str) {
        this.f5830c = w;
        this.f5828a = lifecycleCallback;
        this.f5829b = str;
    }

    public final void run() {
        if (this.f5830c.f5833c > 0) {
            this.f5828a.a(this.f5830c.f5834d != null ? this.f5830c.f5834d.getBundle(this.f5829b) : null);
        }
        if (this.f5830c.f5833c >= 2) {
            this.f5828a.c();
        }
        if (this.f5830c.f5833c >= 3) {
            this.f5828a.b();
        }
        if (this.f5830c.f5833c >= 4) {
            this.f5828a.d();
        }
        if (this.f5830c.f5833c >= 5) {
            this.f5828a.a();
        }
    }
}
