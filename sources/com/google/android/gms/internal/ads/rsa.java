package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class rsa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ osa f12051a;

    rsa(osa osa) {
        this.f12051a = osa;
    }

    public final void run() {
        if (this.f12051a.f11648a.f11407a != null) {
            try {
                this.f12051a.f11648a.f11407a.a(1);
            } catch (RemoteException e2) {
                C1018Rk.c("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
