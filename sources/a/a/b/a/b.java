package a.a.b.a;

import android.os.Parcel;
import android.os.Parcelable;

class b implements Parcelable.Creator<c> {
    b() {
    }

    public c createFromParcel(Parcel parcel) {
        return new c(parcel);
    }

    public c[] newArray(int i) {
        return new c[i];
    }
}
