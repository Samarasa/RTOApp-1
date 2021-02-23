package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.wd  reason: case insensitive filesystem */
final class C3235wd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3175kd f13808a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3196od f13809b;

    C3235wd(C3196od odVar, C3175kd kdVar) {
        this.f13809b = odVar;
        this.f13808a = kdVar;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C3218tb d2 = this.f13809b.f13705d;
        if (d2 == null) {
            this.f13809b.h().t().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f13808a == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f13809b.f().getPackageName();
            } else {
                j = this.f13808a.f13639c;
                str = this.f13808a.f13637a;
                str2 = this.f13808a.f13638b;
                packageName = this.f13809b.f().getPackageName();
            }
            d2.a(j, str, str2, packageName);
            this.f13809b.J();
        } catch (RemoteException e2) {
            this.f13809b.h().t().a("Failed to send current screen to the service", e2);
        }
    }
}
