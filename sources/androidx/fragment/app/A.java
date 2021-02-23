package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

class A implements Parcelable.Creator<B> {
    A() {
    }

    public B createFromParcel(Parcel parcel) {
        return new B(parcel);
    }

    public B[] newArray(int i) {
        return new B[i];
    }
}
