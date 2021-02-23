package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

class w implements Parcelable.Creator<x> {
    w() {
    }

    public x createFromParcel(Parcel parcel) {
        return new x(parcel);
    }

    public x[] newArray(int i) {
        return new x[i];
    }
}
