package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

public final class wa implements Parcelable.Creator<xa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ArrayList<va> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.r(parcel, a2);
            } else {
                arrayList = b.c(parcel, a2, va.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new xa(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new xa[i];
    }
}
