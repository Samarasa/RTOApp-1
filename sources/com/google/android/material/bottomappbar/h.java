package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.BottomAppBar;

class h implements Parcelable.ClassLoaderCreator<BottomAppBar.b> {
    h() {
    }

    public BottomAppBar.b createFromParcel(Parcel parcel) {
        return new BottomAppBar.b(parcel, (ClassLoader) null);
    }

    public BottomAppBar.b createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomAppBar.b(parcel, classLoader);
    }

    public BottomAppBar.b[] newArray(int i) {
        return new BottomAppBar.b[i];
    }
}
