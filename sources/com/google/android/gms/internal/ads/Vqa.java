package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class Vqa extends C2446qia implements Tqa {
    Vqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void H() {
        b(4, c());
    }

    public final void I() {
        b(7, c());
    }

    public final void M() {
        b(5, c());
    }

    public final void N() {
        b(3, c());
    }

    public final void O() {
        b(1, c());
    }

    public final void a(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(2, c2);
    }

    public final void b(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(8, c2);
    }

    public final void onAdClicked() {
        b(6, c());
    }
}
