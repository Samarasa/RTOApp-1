package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

public final class nsa extends c<C2960xra> {
    public nsa() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C2960xra ? (C2960xra) queryLocalInterface : new Bra(iBinder);
    }

    public final C2889wra b(Context context) {
        try {
            IBinder e2 = ((C2960xra) a(context)).e(b.a(context), 203404000);
            if (e2 == null) {
                return null;
            }
            IInterface queryLocalInterface = e2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C2889wra ? (C2889wra) queryLocalInterface : new C3031yra(e2);
        } catch (RemoteException | c.a e3) {
            C1018Rk.c("Could not get remote MobileAdsSettingManager.", e3);
            return null;
        }
    }
}
