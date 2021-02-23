package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ei  reason: case insensitive filesystem */
public final class C1594ei implements Parcelable.Creator<C1382bi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.h(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                arrayList = b.f(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1382bi(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1382bi[i];
    }
}
