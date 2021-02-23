package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class qa implements Parcelable.Creator<ra> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 4) {
                l = b.p(parcel, a2);
            } else if (a3 == 5) {
                str3 = b.d(parcel, a2);
            } else if (a3 != 6) {
                b.r(parcel, a2);
            } else {
                l2 = b.p(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new ra(str, str2, l, str3, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ra[i];
    }
}
