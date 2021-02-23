package c.b.b.b.d.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean a(boolean z) {
        Parcel c2 = c();
        c.a(c2, true);
        Parcel a2 = a(2, c2);
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }

    public final String getId() {
        Parcel a2 = a(1, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final boolean l() {
        Parcel a2 = a(6, c());
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }
}
