package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.h.a;

/* renamed from: com.google.android.gms.internal.ads.uS  reason: case insensitive filesystem */
final class C2704uS extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1967jra f12328a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2562sS f12329b;

    C2704uS(C2562sS sSVar, C1967jra jra) {
        this.f12329b = sSVar;
        this.f12328a = jra;
    }

    public final void X() {
        if (this.f12329b.f12086d != null) {
            try {
                this.f12328a.qa();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }
}
