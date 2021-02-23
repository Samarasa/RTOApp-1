package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

class c implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    c() {
    }

    public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat$MediaItem(parcel);
    }

    public MediaBrowserCompat$MediaItem[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
