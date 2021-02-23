package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mj  reason: case insensitive filesystem */
public abstract class C2163mj extends C2587sia implements C1950jj {
    public C2163mj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static C1950jj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof C1950jj ? (C1950jj) queryLocalInterface : new C2092lj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            int F = F();
            parcel2.writeNoException();
            parcel2.writeInt(F);
        }
        return true;
    }
}
