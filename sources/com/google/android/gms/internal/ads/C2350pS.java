package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.h.a;

/* renamed from: com.google.android.gms.internal.ads.pS  reason: case insensitive filesystem */
final class C2350pS extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hra f11708a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2137mS f11709b;

    C2350pS(C2137mS mSVar, Hra hra) {
        this.f11709b = mSVar;
        this.f11708a = hra;
    }

    public final void X() {
        if (this.f11709b.f11309f != null) {
            try {
                this.f11708a.qa();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }
}
