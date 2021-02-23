package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import c.b.b.b.c.a;
import com.google.android.gms.internal.ads.C2516ria;
import com.google.android.gms.internal.ads.C2587sia;

public abstract class K extends C2587sia implements H {
    public K() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean zzd = zzd(a.C0060a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            C2516ria.a(parcel2, zzd);
        } else if (i != 2) {
            return false;
        } else {
            zzap(a.C0060a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
