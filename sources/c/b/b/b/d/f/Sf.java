package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class Sf extends C0290a implements Qf {
    Sf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int a() {
        Parcel a2 = a(2, Db());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (Parcelable) bundle);
        Db.writeLong(j);
        b(1, Db);
    }
}
