package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class Bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13195a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3196od f13196b;

    Bd(C3196od odVar, xe xeVar) {
        this.f13196b = odVar;
        this.f13195a = xeVar;
    }

    public final void run() {
        C3218tb d2 = this.f13196b.f13705d;
        if (d2 == null) {
            this.f13196b.h().t().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d2.b(this.f13195a);
            this.f13196b.J();
        } catch (RemoteException e2) {
            this.f13196b.h().t().a("Failed to send measurementEnabled to the service", e2);
        }
    }
}
