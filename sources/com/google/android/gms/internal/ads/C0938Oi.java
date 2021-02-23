package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oi  reason: case insensitive filesystem */
public final class C0938Oi extends C2446qia implements C0886Mi {
    C0938Oi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final int F() {
        Parcel a2 = a(2, c());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final String getType() {
        Parcel a2 = a(1, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
