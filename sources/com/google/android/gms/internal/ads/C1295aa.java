package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.aa  reason: case insensitive filesystem */
public abstract class C1295aa extends C2587sia implements X {
    public C1295aa() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = Ja();
        } else if (i != 2) {
            if (i == 3) {
                k(a.C0060a.a(parcel.readStrongBinder()));
            } else if (i == 4) {
                La();
            } else if (i != 5) {
                return false;
            } else {
                z();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = getContent();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
