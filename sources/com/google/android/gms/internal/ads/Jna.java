package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class Jna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Kna f7498a;

    Jna(Kna kna) {
        this.f7498a = kna;
    }

    public final void run() {
        synchronized (this.f7498a.f7615c) {
            if (!this.f7498a.f7616d || !this.f7498a.f7617e) {
                C1018Rk.a("App is still foreground");
            } else {
                boolean unused = this.f7498a.f7616d = false;
                C1018Rk.a("App went background");
                for (Mna a2 : this.f7498a.f7618f) {
                    try {
                        a2.a(false);
                    } catch (Exception e2) {
                        C1018Rk.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
        }
    }
}
