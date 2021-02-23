package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Wf implements Parcelable.Creator<Tf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    j = b.o(parcel2, a2);
                    break;
                case 2:
                    j2 = b.o(parcel2, a2);
                    break;
                case 3:
                    z = b.h(parcel2, a2);
                    break;
                case 4:
                    str = b.d(parcel2, a2);
                    break;
                case 5:
                    str2 = b.d(parcel2, a2);
                    break;
                case 6:
                    str3 = b.d(parcel2, a2);
                    break;
                case 7:
                    bundle = b.a(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new Tf(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Tf[i];
    }
}
