package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qd  reason: case insensitive filesystem */
public abstract class C0985Qd extends C2587sia implements C0933Od {
    public C0985Qd() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Wa();
        } else if (i != 2) {
            return false;
        } else {
            j(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
