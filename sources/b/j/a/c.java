package b.j.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public static final c f2603a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f2604b;

    private c() {
        this.f2604b = null;
    }

    protected c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2604b = readParcelable == null ? f2603a : readParcelable;
    }

    protected c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2604b = parcelable == f2603a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f2604b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2604b, i);
    }
}
