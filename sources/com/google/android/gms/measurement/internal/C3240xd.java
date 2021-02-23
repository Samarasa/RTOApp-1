package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.a.a;

/* renamed from: com.google.android.gms.measurement.internal.xd  reason: case insensitive filesystem */
final class C3240xd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13819a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f13820b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3196od f13821c;

    C3240xd(C3196od odVar, xe xeVar, boolean z) {
        this.f13821c = odVar;
        this.f13819a = xeVar;
        this.f13820b = z;
    }

    public final void run() {
        C3218tb d2 = this.f13821c.f13705d;
        if (d2 == null) {
            this.f13821c.h().t().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d2.d(this.f13819a);
            if (this.f13820b) {
                this.f13821c.t().D();
            }
            this.f13821c.a(d2, (a) null, this.f13819a);
            this.f13821c.J();
        } catch (RemoteException e2) {
            this.f13821c.h().t().a("Failed to send app launch to the service", e2);
        }
    }
}
