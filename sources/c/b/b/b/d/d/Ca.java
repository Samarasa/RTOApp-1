package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

public final class Ca implements Parcelable.Creator<Aa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                arrayList = b.f(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new Aa(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Aa[i];
    }
}
