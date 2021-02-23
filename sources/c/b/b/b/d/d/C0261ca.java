package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: c.b.b.b.d.d.ca  reason: case insensitive filesystem */
public final class C0261ca implements Parcelable.Creator<C0257aa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                str3 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0257aa(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0257aa[i];
    }
}
