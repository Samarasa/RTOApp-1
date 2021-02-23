package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;

final class GL implements AY<ArrayList<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0885Mh f7010a;

    GL(C2626tL tLVar, C0885Mh mh) {
        this.f7010a = mh;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            this.f7010a.b((ArrayList) obj);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final void a(Throwable th) {
        try {
            C0885Mh mh = this.f7010a;
            String valueOf = String.valueOf(th.getMessage());
            mh.i(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
