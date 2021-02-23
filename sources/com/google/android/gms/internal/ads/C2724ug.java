package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ug  reason: case insensitive filesystem */
public abstract class C2724ug extends C2587sia implements C2795vg {
    public C2724ug() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            na();
        } else if (i == 3) {
            e(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            a((C1824hqa) C2516ria.a(parcel, C1824hqa.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
