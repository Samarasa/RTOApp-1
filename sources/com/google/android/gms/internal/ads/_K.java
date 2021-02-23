package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class _K implements C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private Sqa f9645a;

    public final synchronized void a(Sqa sqa) {
        this.f9645a = sqa;
    }

    public final synchronized void onAdClicked() {
        if (this.f9645a != null) {
            try {
                this.f9645a.onAdClicked();
            } catch (RemoteException e2) {
                C1018Rk.c("Remote Exception at onAdClicked.", e2);
            }
        }
    }
}
