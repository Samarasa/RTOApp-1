package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.d  reason: case insensitive filesystem */
final class C1481d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1410c f10106a;

    C1481d(C1410c cVar) {
        this.f10106a = cVar;
    }

    public final void run() {
        if (this.f10106a.f9993a != null) {
            try {
                this.f10106a.f9993a.b(1);
            } catch (RemoteException e2) {
                C1018Rk.c("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
