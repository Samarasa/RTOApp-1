package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;

class n implements Parcelable.ClassLoaderCreator<o> {
    n() {
    }

    public o createFromParcel(Parcel parcel) {
        return new o(parcel, (ClassLoader) null);
    }

    public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new o(parcel, classLoader);
    }

    public o[] newArray(int i) {
        return new o[i];
    }
}
