package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Vra extends C2446qia implements Tra {
    Vra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void e(boolean z) {
        Parcel c2 = c();
        C2516ria.a(c2, z);
        b(5, c2);
    }

    public final void ka() {
        b(3, c());
    }

    public final void ma() {
        b(4, c());
    }

    public final void sa() {
        b(2, c());
    }

    public final void wb() {
        b(1, c());
    }
}
