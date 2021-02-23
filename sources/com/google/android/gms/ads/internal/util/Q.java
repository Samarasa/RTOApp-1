package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.DW;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f5548a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f5549b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f5550c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5551d = new Object();

    public final Handler a() {
        return this.f5549b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f5551d) {
            if (this.f5550c != 0) {
                C0563t.a(this.f5548a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f5548a == null) {
                fa.f("Starting the looper thread.");
                this.f5548a = new HandlerThread("LooperProvider");
                this.f5548a.start();
                this.f5549b = new DW(this.f5548a.getLooper());
                fa.f("Looper thread started.");
            } else {
                fa.f("Resuming the looper thread");
                this.f5551d.notifyAll();
            }
            this.f5550c++;
            looper = this.f5548a.getLooper();
        }
        return looper;
    }
}
