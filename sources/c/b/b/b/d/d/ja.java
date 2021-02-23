package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.J;

public final class ja implements Parcelable.Creator<C0271ha> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Status status = null;
        J j = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                status = (Status) b.a(parcel, a2, Status.CREATOR);
            } else if (a3 == 2) {
                j = (J) b.a(parcel, a2, J.CREATOR);
            } else if (a3 == 3) {
                str = b.d(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0271ha(status, j, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0271ha[i];
    }
}
