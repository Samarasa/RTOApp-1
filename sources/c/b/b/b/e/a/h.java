package c.b.b.b.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.b.b;
import c.b.b.b.d.b.c;

public final class h extends b implements f {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(j jVar, d dVar) {
        Parcel c2 = c();
        c.a(c2, (Parcelable) jVar);
        c.a(c2, (IInterface) dVar);
        a(12, c2);
    }
}
