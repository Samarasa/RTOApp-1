package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Ea implements Parcelable.Creator<Ba> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel2, a2);
                    break;
                case 3:
                    str2 = b.d(parcel2, a2);
                    break;
                case 4:
                    str3 = b.d(parcel2, a2);
                    break;
                case 5:
                    str4 = b.d(parcel2, a2);
                    break;
                case 6:
                    str5 = b.d(parcel2, a2);
                    break;
                case 7:
                    str6 = b.d(parcel2, a2);
                    break;
                case 8:
                    str7 = b.d(parcel2, a2);
                    break;
                case 9:
                    str8 = b.d(parcel2, a2);
                    break;
                case 10:
                    z = b.h(parcel2, a2);
                    break;
                case 11:
                    z2 = b.h(parcel2, a2);
                    break;
                case 12:
                    str9 = b.d(parcel2, a2);
                    break;
                case 13:
                    str10 = b.d(parcel2, a2);
                    break;
                case 14:
                    str11 = b.d(parcel2, a2);
                    break;
                case 15:
                    str12 = b.d(parcel2, a2);
                    break;
                case 16:
                    z3 = b.h(parcel2, a2);
                    break;
                case 17:
                    str13 = b.d(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new Ba(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Ba[i];
    }
}
