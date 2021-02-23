package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class Pra extends C2446qia implements Nra {
    Pra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final String Cb() {
        Parcel a2 = a(2, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String o() {
        Parcel a2 = a(1, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final List<C2745uqa> ob() {
        Parcel a2 = a(3, c());
        ArrayList<C2745uqa> createTypedArrayList = a2.createTypedArrayList(C2745uqa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }
}
