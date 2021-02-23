package android.support.v4.media;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

class e implements Parcelable.Creator<MediaDescriptionCompat> {
    e() {
    }

    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(f.a(parcel));
    }

    public MediaDescriptionCompat[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
