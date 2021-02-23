package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.sd  reason: case insensitive filesystem */
final class C3215sd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13758a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3196od f13759b;

    C3215sd(C3196od odVar, xe xeVar) {
        this.f13759b = odVar;
        this.f13758a = xeVar;
    }

    public final void run() {
        C3218tb d2 = this.f13759b.f13705d;
        if (d2 == null) {
            this.f13759b.h().t().a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d2.a(this.f13758a);
        } catch (RemoteException e2) {
            this.f13759b.h().t().a("Failed to reset data on the service", e2);
        }
        this.f13759b.J();
    }
}
