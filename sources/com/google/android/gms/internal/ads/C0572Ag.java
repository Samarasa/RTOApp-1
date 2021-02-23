package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ag  reason: case insensitive filesystem */
public abstract class C0572Ag extends C2587sia implements C0598Bg {
    public C0572Ag() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
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
