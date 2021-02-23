package com.google.android.material.picker;

import android.os.Parcel;
import android.os.Parcelable;

class b implements Parcelable.Creator<c> {
    b() {
    }

    public c createFromParcel(Parcel parcel) {
        return c.a(parcel.readInt(), parcel.readInt());
    }

    public c[] newArray(int i) {
        return new c[i];
    }
}
