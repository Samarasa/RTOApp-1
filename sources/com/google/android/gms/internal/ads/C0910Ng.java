package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.k;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Ng  reason: case insensitive filesystem */
final class C0910Ng implements d<k, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2795vg f7994a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0831Kf f7995b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0858Lg f7996c;

    C0910Ng(C0858Lg lg, C2795vg vgVar, C0831Kf kf) {
        this.f7996c = lg;
        this.f7994a = vgVar;
        this.f7995b = kf;
    }

    public final void b(String str) {
        try {
            this.f7994a.e(str);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
