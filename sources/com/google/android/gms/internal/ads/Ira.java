package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.q;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Ira implements q {

    /* renamed from: a  reason: collision with root package name */
    private final String f7360a;

    /* renamed from: b  reason: collision with root package name */
    private Era f7361b;

    public Ira(Era era) {
        String str;
        this.f7361b = era;
        try {
            str = era.Q();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            str = null;
        }
        this.f7360a = str;
    }

    public final String toString() {
        return this.f7360a;
    }
}
