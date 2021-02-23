package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final int f15a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDescriptionCompat f16b;

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f15a = parcel.readInt();
        this.f16b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f15a + ", mDescription=" + this.f16b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15a);
        this.f16b.writeToParcel(parcel, i);
    }
}
