package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gg  reason: case insensitive filesystem */
public abstract class C0728Gg extends C2587sia implements C0754Hg {
    public C0728Gg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            v(parcel.readString());
        } else if (i == 2) {
            b(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            e((C1824hqa) C2516ria.a(parcel, C1824hqa.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
