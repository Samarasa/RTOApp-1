package c.b.b.b.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0565v;
import com.google.android.gms.common.internal.a.b;

public final class k implements Parcelable.Creator<l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        C0254b bVar = null;
        int i = 0;
        C0565v vVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                bVar = (C0254b) b.a(parcel, a2, C0254b.CREATOR);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                vVar = (C0565v) b.a(parcel, a2, C0565v.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new l(i, bVar, vVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
