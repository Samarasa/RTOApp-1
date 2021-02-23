package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.ld  reason: case insensitive filesystem */
public final class C2080ld implements Parcelable.Creator<C2151md> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    z = b.h(parcel2, a2);
                    break;
                case 2:
                    str = b.d(parcel2, a2);
                    break;
                case 3:
                    i = b.n(parcel2, a2);
                    break;
                case 4:
                    bArr = b.b(parcel2, a2);
                    break;
                case 5:
                    strArr = b.e(parcel2, a2);
                    break;
                case 6:
                    strArr2 = b.e(parcel2, a2);
                    break;
                case 7:
                    z2 = b.h(parcel2, a2);
                    break;
                case 8:
                    j = b.o(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new C2151md(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2151md[i];
    }
}
