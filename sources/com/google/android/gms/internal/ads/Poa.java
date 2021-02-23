package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class Poa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1742gl f8266a;

    /* renamed from: b  reason: collision with root package name */
    private final Future f8267b;

    Poa(C1742gl glVar, Future future) {
        this.f8266a = glVar;
        this.f8267b = future;
    }

    public final void run() {
        C1742gl glVar = this.f8266a;
        Future future = this.f8267b;
        if (glVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
