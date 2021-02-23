package c.b.b.c.p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.e.i;
import b.j.a.c;

public class b extends c {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final i<String, Bundle> f4894c;

    private b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4894c = new i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4894c.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ b(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public b(Parcelable parcelable) {
        super(parcelable);
        this.f4894c = new i<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4894c + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f4894c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f4894c.b(i2);
            bundleArr[i2] = this.f4894c.d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
