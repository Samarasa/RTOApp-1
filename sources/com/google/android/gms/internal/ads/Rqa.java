package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Rqa extends C2587sia implements Sqa {
    public Rqa() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        onAdClicked();
        parcel2.writeNoException();
        return true;
    }
}
