package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.soa  reason: case insensitive filesystem */
public abstract class C2599soa extends C2587sia implements C2387poa {
    public C2599soa() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Ua();
        } else if (i == 2) {
            eb();
        } else if (i != 3) {
            return false;
        } else {
            i((C1824hqa) C2516ria.a(parcel, C1824hqa.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
