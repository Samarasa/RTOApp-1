package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Fra extends C2446qia implements Era {
    Fra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String Q() {
        Parcel a2 = a(1, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String wa() {
        Parcel a2 = a(2, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
