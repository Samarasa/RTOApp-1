package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.db  reason: case insensitive filesystem */
public abstract class C1510db extends C2587sia implements C1580eb {
    public C1510db() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static C1580eb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof C1580eb ? (C1580eb) queryLocalInterface : new C1722gb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String text = getText();
            parcel2.writeNoException();
            parcel2.writeString(text);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<C2076lb> ya = ya();
            parcel2.writeNoException();
            parcel2.writeList(ya);
            return true;
        }
    }
}
