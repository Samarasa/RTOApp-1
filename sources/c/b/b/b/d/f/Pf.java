package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.Parcel;

public abstract class Pf extends C0360ka implements Hf {
    public Pf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        c((Bundle) r.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
