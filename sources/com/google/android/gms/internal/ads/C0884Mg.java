package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.y;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Mg  reason: case insensitive filesystem */
final class C0884Mg implements d<y, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2866wg f7873a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0831Kf f7874b;

    C0884Mg(C0858Lg lg, C2866wg wgVar, C0831Kf kf) {
        this.f7873a = wgVar;
        this.f7874b = kf;
    }

    public final void b(String str) {
        try {
            this.f7873a.e(str);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
