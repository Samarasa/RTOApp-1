package android.support.v4.media.session;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

class i implements Parcelable.Creator<MediaSessionCompat.Token> {
    i() {
    }

    public MediaSessionCompat.Token createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
    }

    public MediaSessionCompat.Token[] newArray(int i) {
        return new MediaSessionCompat.Token[i];
    }
}
