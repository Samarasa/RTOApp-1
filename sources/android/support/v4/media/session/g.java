package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

class g implements Parcelable.Creator<MediaSessionCompat.QueueItem> {
    g() {
    }

    public MediaSessionCompat.QueueItem createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.QueueItem(parcel);
    }

    public MediaSessionCompat.QueueItem[] newArray(int i) {
        return new MediaSessionCompat.QueueItem[i];
    }
}
