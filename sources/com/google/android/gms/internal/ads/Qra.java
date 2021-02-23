package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

public abstract class Qra extends C2587sia implements Nra {
    public Qra() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = o();
        } else if (i == 2) {
            str = Cb();
        } else if (i != 3) {
            return false;
        } else {
            List<C2745uqa> ob = ob();
            parcel2.writeNoException();
            parcel2.writeTypedList(ob);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
