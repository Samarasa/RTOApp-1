package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Li  reason: case insensitive filesystem */
public abstract class C0860Li extends C2587sia implements C0886Mi {
    public C0860Li() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            int F = F();
            parcel2.writeNoException();
            parcel2.writeInt(F);
        }
        return true;
    }
}
