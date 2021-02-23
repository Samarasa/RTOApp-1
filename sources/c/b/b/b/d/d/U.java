package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.C3311v;

public final class U implements Parcelable.Creator<S> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        C3311v vVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                vVar = (C3311v) b.a(parcel, a2, C3311v.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new S(str, vVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new S[i];
    }
}
