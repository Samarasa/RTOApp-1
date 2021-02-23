package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pd  reason: case insensitive filesystem */
public final class C0959Pd extends C2446qia implements C0933Od {
    C0959Pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final void Wa() {
        b(1, c());
    }

    public final void j(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(2, c2);
    }
}
