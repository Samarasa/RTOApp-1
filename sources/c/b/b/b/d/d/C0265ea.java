package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.C3279d;

/* renamed from: c.b.b.b.d.d.ea  reason: case insensitive filesystem */
public final class C0265ea implements Parcelable.Creator<C0259ba> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        C3279d dVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 1) {
                b.r(parcel, a2);
            } else {
                dVar = (C3279d) b.a(parcel, a2, C3279d.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C0259ba(dVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0259ba[i];
    }
}
