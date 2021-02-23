package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class T implements Parcelable.Creator<P> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        Ba ba = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                ba = (Ba) b.a(parcel, a2, Ba.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new P(str, ba);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new P[i];
    }
}
