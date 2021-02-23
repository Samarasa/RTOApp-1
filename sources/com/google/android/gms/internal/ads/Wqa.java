package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Wqa extends C2587sia implements Tqa {
    public Wqa() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                O();
                break;
            case 2:
                a(parcel.readInt());
                break;
            case 3:
                N();
                break;
            case 4:
                H();
                break;
            case 5:
                M();
                break;
            case 6:
                onAdClicked();
                break;
            case 7:
                I();
                break;
            case 8:
                b((C1824hqa) C2516ria.a(parcel, C1824hqa.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
