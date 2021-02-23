package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.J;
import java.util.ArrayList;

public final class ka implements Parcelable.Creator<C0273ia> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        ArrayList<ta> arrayList = null;
        J j = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                arrayList = b.c(parcel, a2, ta.CREATOR);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                j = (J) b.a(parcel, a2, J.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C0273ia(str, arrayList, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0273ia[i];
    }
}
