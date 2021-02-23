package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.b;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fb  reason: case insensitive filesystem */
public final class C1651fb extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final C1580eb f10415a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b.C0072b> f10416b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f10417c;

    public C1651fb(C1580eb ebVar) {
        C2076lb lbVar;
        IBinder iBinder;
        this.f10415a = ebVar;
        try {
            this.f10417c = this.f10415a.getText();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            this.f10417c = BuildConfig.FLAVOR;
        }
        try {
            for (C2076lb next : ebVar.ya()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    lbVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    lbVar = queryLocalInterface instanceof C2076lb ? (C2076lb) queryLocalInterface : new C2218nb(iBinder);
                }
                if (lbVar != null) {
                    this.f10416b.add(new C2147mb(lbVar));
                }
            }
        } catch (RemoteException e3) {
            C1018Rk.b(BuildConfig.FLAVOR, e3);
        }
    }
}
