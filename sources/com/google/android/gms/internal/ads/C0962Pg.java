package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Pg  reason: case insensitive filesystem */
final class C0962Pg implements d<p, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0598Bg f8232a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0831Kf f8233b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0858Lg f8234c;

    C0962Pg(C0858Lg lg, C0598Bg bg, C0831Kf kf) {
        this.f8234c = lg;
        this.f8232a = bg;
        this.f8233b = kf;
    }

    public final void b(String str) {
        try {
            this.f8232a.e(str);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
