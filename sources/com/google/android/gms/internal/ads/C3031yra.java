package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yra  reason: case insensitive filesystem */
public final class C3031yra extends C2446qia implements C2889wra {
    C3031yra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final List<C3002yd> Ta() {
        Parcel a2 = a(13, c());
        ArrayList<C3002yd> createTypedArrayList = a2.createTypedArrayList(C3002yd.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final void a(C0621Cd cd) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) cd);
        b(12, c2);
    }

    public final void a(C0675Ef ef) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) ef);
        b(11, c2);
    }

    public final void a(C1551e eVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) eVar);
        b(14, c2);
    }

    public final void b(String str, a aVar) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) aVar);
        b(6, c2);
    }

    public final String hb() {
        Parcel a2 = a(9, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final void p() {
        b(1, c());
    }
}
