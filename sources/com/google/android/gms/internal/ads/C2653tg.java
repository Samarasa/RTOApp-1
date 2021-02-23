package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.tg  reason: case insensitive filesystem */
public abstract class C2653tg extends C2587sia implements C2441qg {
    public C2653tg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            t(a.C0060a.a(parcel.readStrongBinder()));
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
