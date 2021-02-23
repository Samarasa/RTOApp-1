package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public int f56a;

    /* renamed from: b  reason: collision with root package name */
    public int f57b;

    /* renamed from: c  reason: collision with root package name */
    public int f58c;

    /* renamed from: d  reason: collision with root package name */
    public int f59d;

    /* renamed from: e  reason: collision with root package name */
    public int f60e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f56a = parcel.readInt();
        this.f58c = parcel.readInt();
        this.f59d = parcel.readInt();
        this.f60e = parcel.readInt();
        this.f57b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56a);
        parcel.writeInt(this.f58c);
        parcel.writeInt(this.f59d);
        parcel.writeInt(this.f60e);
        parcel.writeInt(this.f57b);
    }
}
