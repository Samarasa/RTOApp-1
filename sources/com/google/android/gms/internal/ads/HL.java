package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class HL implements AY<UL> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1881ik f7134a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2626tL f7135b;

    HL(C2626tL tLVar, C1881ik ikVar) {
        this.f7135b = tLVar;
        this.f7134a = ikVar;
    }

    public final /* synthetic */ void a(Object obj) {
        UL ul = (UL) obj;
        try {
            if (((Boolean) Qqa.e().a(F.df)).booleanValue()) {
                if (this.f7135b.f12183h.f9458c >= ((Integer) Qqa.e().a(F.ff)).intValue()) {
                    if (ul == null) {
                        this.f7134a.a((String) null, (String) null, (Bundle) null);
                        return;
                    } else {
                        this.f7134a.a(ul.f8884a, ul.f8885b, ul.f8886c);
                        return;
                    }
                }
            }
            if (ul == null) {
                this.f7134a.c((String) null, (String) null);
            } else {
                this.f7134a.c(ul.f8884a, ul.f8885b);
            }
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final void a(Throwable th) {
        try {
            C1881ik ikVar = this.f7134a;
            String valueOf = String.valueOf(th.getMessage());
            ikVar.i(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
