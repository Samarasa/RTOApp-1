package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Q implements Parcelable.Creator<O> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                str3 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new O(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new O[i];
    }
}
