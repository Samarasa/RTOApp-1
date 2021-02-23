package c.b.b.b.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class o implements Parcelable.Creator<C0254b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.n(parcel, a2);
            } else if (a3 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, a2, PendingIntent.CREATOR);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0254b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0254b[i];
    }
}
