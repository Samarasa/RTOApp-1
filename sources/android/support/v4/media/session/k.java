package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

class k implements Parcelable.Creator<ParcelableVolumeInfo> {
    k() {
    }

    public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    public ParcelableVolumeInfo[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
