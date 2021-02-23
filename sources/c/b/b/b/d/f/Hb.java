package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class Hb extends C0290a implements La {
    Hb(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle c(Bundle bundle) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) bundle);
        Parcel a2 = a(1, Db);
        Bundle bundle2 = (Bundle) r.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
