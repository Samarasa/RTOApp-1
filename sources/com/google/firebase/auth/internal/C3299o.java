package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.F;
import java.util.ArrayList;

/* renamed from: com.google.firebase.auth.internal.o  reason: case insensitive filesystem */
public final class C3299o implements Parcelable.Creator<C3296l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ArrayList<F> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 1) {
                b.r(parcel, a2);
            } else {
                arrayList = b.c(parcel, a2, F.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C3296l(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3296l[i];
    }
}
