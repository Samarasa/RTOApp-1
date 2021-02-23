package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class Ora extends C2446qia implements Mra {
    Ora(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void a(C2603sqa sqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) sqa);
        b(1, c2);
    }
}
