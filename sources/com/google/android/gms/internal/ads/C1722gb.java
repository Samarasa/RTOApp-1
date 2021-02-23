package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gb  reason: case insensitive filesystem */
public final class C1722gb extends C2446qia implements C1580eb {
    C1722gb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String getText() {
        Parcel a2 = a(2, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final List<C2076lb> ya() {
        Parcel a2 = a(3, c());
        ArrayList b2 = C2516ria.b(a2);
        a2.recycle();
        return b2;
    }
}
