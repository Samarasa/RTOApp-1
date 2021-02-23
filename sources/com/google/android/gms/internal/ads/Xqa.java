package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Xqa extends C2587sia implements Yqa {
    public Xqa() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = o();
            } else if (i == 3) {
                boolean q = q();
                parcel2.writeNoException();
                C2516ria.a(parcel2, q);
                return true;
            } else if (i == 4) {
                str = va();
            } else if (i != 5) {
                return false;
            } else {
                a((C2249nqa) C2516ria.a(parcel, C2249nqa.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        b((C2249nqa) C2516ria.a(parcel, C2249nqa.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
