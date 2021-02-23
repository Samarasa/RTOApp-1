package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads._i  reason: case insensitive filesystem */
public final class C1250_i extends c<C1094Ui> {
    public C1250_i() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final C0964Pi a(Context context, C0675Ef ef) {
        try {
            IBinder b2 = ((C1094Ui) a(context)).b(b.a(context), ef, 203404000);
            if (b2 == null) {
                return null;
            }
            IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof C0964Pi ? (C0964Pi) queryLocalInterface : new C1016Ri(b2);
        } catch (RemoteException | c.a e2) {
            C1018Rk.c("Could not get remote RewardedVideoAd.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof C1094Ui ? (C1094Ui) queryLocalInterface : new C1068Ti(iBinder);
    }
}
