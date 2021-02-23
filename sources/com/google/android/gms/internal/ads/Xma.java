package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Xma implements Parcelable.Creator<Uma> {
    Xma() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Uma(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Uma[0];
    }
}
