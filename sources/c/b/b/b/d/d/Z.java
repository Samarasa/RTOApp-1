package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Z implements Parcelable.Creator<X> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Ba ba = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 1) {
                b.r(parcel, a2);
            } else {
                ba = (Ba) b.a(parcel, a2, Ba.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new X(ba);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new X[i];
    }
}
