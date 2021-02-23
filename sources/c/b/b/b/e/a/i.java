package c.b.b.b.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0564u;
import com.google.android.gms.common.internal.a.b;

public final class i implements Parcelable.Creator<j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        C0564u uVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                uVar = (C0564u) b.a(parcel, a2, C0564u.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new j(i, uVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new j[i];
    }
}
