package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class sa implements Parcelable.Creator<ta> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 3) {
                str3 = b.d(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                j = b.o(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new ta(str, str2, str3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ta[i];
    }
}
