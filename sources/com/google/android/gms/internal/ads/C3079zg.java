package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zg  reason: case insensitive filesystem */
public abstract class C3079zg extends C2587sia implements C2866wg {
    public C3079zg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(C1169Xf.a(parcel.readStrongBinder()));
        } else if (i == 2) {
            e(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            a((C1824hqa) C2516ria.a(parcel, C1824hqa.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
