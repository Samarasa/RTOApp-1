package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

class j implements Parcelable.Creator<RatingCompat> {
    j() {
    }

    public RatingCompat createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public RatingCompat[] newArray(int i) {
        return new RatingCompat[i];
    }
}
