package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import com.viewpagerindicator.CirclePageIndicator;

class b implements Parcelable.Creator<CirclePageIndicator.a> {
    b() {
    }

    public CirclePageIndicator.a createFromParcel(Parcel parcel) {
        return new CirclePageIndicator.a(parcel);
    }

    public CirclePageIndicator.a[] newArray(int i) {
        return new CirclePageIndicator.a[i];
    }
}
