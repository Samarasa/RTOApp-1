package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ed  reason: case insensitive filesystem */
public final class C0673Ed extends C2446qia implements C0621Cd {
    C0673Ed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void c(List<C3002yd> list) {
        Parcel c2 = c();
        c2.writeTypedList(list);
        b(1, c2);
    }
}
