package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f42a;

    /* renamed from: b  reason: collision with root package name */
    private final float f43b;

    RatingCompat(int i, float f2) {
        this.f42a = i;
        this.f43b = f2;
    }

    public int describeContents() {
        return this.f42a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f42a);
        sb.append(" rating=");
        float f2 = this.f43b;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42a);
        parcel.writeFloat(this.f43b);
    }
}
