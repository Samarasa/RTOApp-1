package c.b.b.b.d.f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.b.b.b.d.f.hc  reason: case insensitive filesystem */
public abstract class C0342hc extends C0360ka implements La {
    public static La a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof La ? (La) queryLocalInterface : new Hb(iBinder);
    }
}
