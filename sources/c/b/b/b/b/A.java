package c.b.b.b.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class A implements Parcelable.Creator<x> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                iBinder = b.m(parcel, a2);
            } else if (a3 == 3) {
                z = b.h(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                z2 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new x(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new x[i];
    }
}
