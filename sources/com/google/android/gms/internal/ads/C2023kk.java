package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.kk  reason: case insensitive filesystem */
public final class C2023kk extends C2446qia implements C1881ik {
    C2023kk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final void a(String str, String str2, Bundle bundle) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) bundle);
        b(3, c2);
    }

    public final void c(String str, String str2) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        b(1, c2);
    }

    public final void i(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(2, c2);
    }
}
