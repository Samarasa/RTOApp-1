package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Kja implements Parcelable.Creator<Lja> {
    Kja() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Lja(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Lja[i];
    }
}
