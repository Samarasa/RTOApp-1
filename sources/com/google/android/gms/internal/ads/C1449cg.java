package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.cg  reason: case insensitive filesystem */
final class C1449cg implements d<p, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0831Kf f10064a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1307ag f10065b;

    C1449cg(C1307ag agVar, C0831Kf kf) {
        this.f10065b = agVar;
        this.f10064a = kf;
    }

    public final void b(String str) {
        try {
            String canonicalName = this.f10065b.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            C1018Rk.a(sb.toString());
            this.f10064a.a(0, str);
            this.f10064a.a(0);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
