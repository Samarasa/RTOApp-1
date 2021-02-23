package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class RE implements AY<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FE f8451a;

    RE(FE fe) {
        this.f8451a = fe;
    }

    public final /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            boolean unused = this.f8451a.f6807b = true;
            this.f8451a.a("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, (int) (p.j().b() - this.f8451a.f6808c));
            this.f8451a.f6813h.execute(new PE(this, str));
        }
    }

    public final void a(Throwable th) {
        synchronized (this) {
            boolean unused = this.f8451a.f6807b = true;
            this.f8451a.a("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (p.j().b() - this.f8451a.f6808c));
            this.f8451a.f6809d.a((Throwable) new Exception());
        }
    }
}
