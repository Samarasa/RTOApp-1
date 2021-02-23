package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<B> f1171a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f1172b;

    /* renamed from: c  reason: collision with root package name */
    C0153c[] f1173c;

    /* renamed from: d  reason: collision with root package name */
    String f1174d = null;

    /* renamed from: e  reason: collision with root package name */
    int f1175e;

    public x() {
    }

    public x(Parcel parcel) {
        this.f1171a = parcel.createTypedArrayList(B.CREATOR);
        this.f1172b = parcel.createStringArrayList();
        this.f1173c = (C0153c[]) parcel.createTypedArray(C0153c.CREATOR);
        this.f1174d = parcel.readString();
        this.f1175e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1171a);
        parcel.writeStringList(this.f1172b);
        parcel.writeTypedArray(this.f1173c, i);
        parcel.writeString(this.f1174d);
        parcel.writeInt(this.f1175e);
    }
}
