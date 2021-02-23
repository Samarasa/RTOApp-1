package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

class l implements Parcelable.Creator<PlaybackStateCompat> {
    l() {
    }

    public PlaybackStateCompat createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    public PlaybackStateCompat[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
