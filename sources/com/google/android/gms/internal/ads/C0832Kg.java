package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Kg  reason: case insensitive filesystem */
final class C0832Kg implements d<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2441qg f7584a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0831Kf f7585b;

    C0832Kg(C0858Lg lg, C2441qg qgVar, C0831Kf kf) {
        this.f7584a = qgVar;
        this.f7585b = kf;
    }

    public final void b(String str) {
        try {
            this.f7584a.e(str);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
