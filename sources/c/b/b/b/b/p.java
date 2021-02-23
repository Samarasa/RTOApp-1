package c.b.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class p implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                i = b.n(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                j = b.o(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new d[i];
    }
}
