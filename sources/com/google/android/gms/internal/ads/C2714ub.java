package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.ub  reason: case insensitive filesystem */
public abstract class C2714ub extends C2587sia implements C2572sb {
    public C2714ub() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            e(a.C0060a.a(parcel.readStrongBinder()));
        } else if (i == 2) {
            Kb();
        } else if (i != 3) {
            return false;
        } else {
            c(a.C0060a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
