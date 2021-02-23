package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class Dra extends C2587sia implements C3102zra {
    public static C3102zra a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof C3102zra ? (C3102zra) queryLocalInterface : new Cra(iBinder);
    }
}
