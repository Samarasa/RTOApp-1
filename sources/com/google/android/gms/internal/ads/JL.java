package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;

final class JL implements AY<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0885Mh f7400a;

    JL(C2626tL tLVar, C0885Mh mh) {
        this.f7400a = mh;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            this.f7400a.b(Collections.singletonList((Uri) obj));
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final void a(Throwable th) {
        try {
            C0885Mh mh = this.f7400a;
            String valueOf = String.valueOf(th.getMessage());
            mh.i(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
