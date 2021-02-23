package com.google.android.gms.internal.ads;

public final class Ema {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6752a;

    public final synchronized void a() {
        while (!this.f6752a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f6752a) {
            return false;
        }
        this.f6752a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f6752a;
        this.f6752a = false;
        return z;
    }
}
