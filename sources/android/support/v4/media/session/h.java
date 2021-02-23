package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

class h implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper> {
    h() {
    }

    public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public MediaSessionCompat.ResultReceiverWrapper[] newArray(int i) {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }
}
