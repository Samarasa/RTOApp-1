package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

class h implements Parcelable.Creator<MediaMetadataCompat> {
    h() {
    }

    public MediaMetadataCompat createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    public MediaMetadataCompat[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
