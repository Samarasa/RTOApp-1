package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iL  reason: case insensitive filesystem */
final /* synthetic */ class C1847iL implements C2963xu {

    /* renamed from: a  reason: collision with root package name */
    private final MK f10792a;

    /* renamed from: b  reason: collision with root package name */
    private final C1037Sd f10793b;

    C1847iL(MK mk, C1037Sd sd) {
        this.f10792a = mk;
        this.f10793b = sd;
    }

    public final void a(C1824hqa hqa) {
        MK mk = this.f10792a;
        C1037Sd sd = this.f10793b;
        mk.a(hqa);
        if (sd != null) {
            try {
                sd.d(hqa);
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
        if (sd != null) {
            try {
                sd.l(hqa.f10744a);
            } catch (RemoteException e3) {
                C1018Rk.d("#007 Could not call remote method.", e3);
            }
        }
    }
}
