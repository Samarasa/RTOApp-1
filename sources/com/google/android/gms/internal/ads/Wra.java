package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Wra extends C2587sia implements Tra {
    public Wra() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            wb();
        } else if (i == 2) {
            sa();
        } else if (i == 3) {
            ka();
        } else if (i == 4) {
            ma();
        } else if (i != 5) {
            return false;
        } else {
            e(C2516ria.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
