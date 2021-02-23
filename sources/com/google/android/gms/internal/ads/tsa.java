package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class tsa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ qsa f12278a;

    tsa(qsa qsa) {
        this.f12278a = qsa;
    }

    public final void run() {
        if (this.f12278a.f11927a != null) {
            try {
                this.f12278a.f11927a.a(1);
            } catch (RemoteException e2) {
                C1018Rk.c("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
