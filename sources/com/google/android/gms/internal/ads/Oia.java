package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Oia implements Parcelable.Creator<Lia> {
    Oia() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Lia(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Lia[i];
    }
}
