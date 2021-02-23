package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.h.b;

/* renamed from: com.google.android.gms.internal.ads.Xi  reason: case insensitive filesystem */
public final class C1172Xi implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C0886Mi f9270a;

    public C1172Xi(C0886Mi mi) {
        this.f9270a = mi;
    }

    public final int F() {
        C0886Mi mi = this.f9270a;
        if (mi == null) {
            return 0;
        }
        try {
            return mi.F();
        } catch (RemoteException e2) {
            C1018Rk.c("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    public final String getType() {
        C0886Mi mi = this.f9270a;
        if (mi == null) {
            return null;
        }
        try {
            return mi.getType();
        } catch (RemoteException e2) {
            C1018Rk.c("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
