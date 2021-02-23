package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.C3311v;

/* renamed from: c.b.b.b.d.d.fa  reason: case insensitive filesystem */
public final class C0267fa implements Parcelable.Creator<C0263da> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        C3311v vVar = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                vVar = (C3311v) b.a(parcel, a2, C3311v.CREATOR);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0263da(vVar, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0263da[i];
    }
}
