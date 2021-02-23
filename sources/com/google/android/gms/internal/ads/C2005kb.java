package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.kb  reason: case insensitive filesystem */
public abstract class C2005kb extends C2587sia implements C2076lb {
    public C2005kb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static C2076lb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof C2076lb ? (C2076lb) queryLocalInterface : new C2218nb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i == 1) {
            a cb = cb();
            parcel2.writeNoException();
            C2516ria.a(parcel2, (IInterface) cb);
        } else if (i == 2) {
            Uri uri = getUri();
            parcel2.writeNoException();
            C2516ria.b(parcel2, uri);
        } else if (i != 3) {
            if (i == 4) {
                i3 = getWidth();
            } else if (i != 5) {
                return false;
            } else {
                i3 = getHeight();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            double mb = mb();
            parcel2.writeNoException();
            parcel2.writeDouble(mb);
        }
        return true;
    }
}
