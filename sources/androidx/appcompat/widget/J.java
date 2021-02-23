package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.F;

class J implements Parcelable.Creator<F.d> {
    J() {
    }

    public F.d createFromParcel(Parcel parcel) {
        return new F.d(parcel);
    }

    public F.d[] newArray(int i) {
        return new F.d[i];
    }
}
