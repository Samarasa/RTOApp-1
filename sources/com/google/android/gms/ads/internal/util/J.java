package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;
import com.google.android.gms.internal.ads.C2446qia;
import com.google.android.gms.internal.ads.C2516ria;

public final class J extends C2446qia implements H {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zzap(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(2, c2);
    }

    public final boolean zzd(a aVar, String str, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        c2.writeString(str2);
        Parcel a2 = a(1, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
