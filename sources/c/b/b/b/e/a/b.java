package c.b.b.b.e.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.a.b.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.a.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.a.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.a.b.n(parcel, a2);
            } else if (a3 == 2) {
                i2 = com.google.android.gms.common.internal.a.b.n(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.a.b.r(parcel, a2);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.a.b.a(parcel, a2, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.a.b.g(parcel, b2);
        return new c(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
