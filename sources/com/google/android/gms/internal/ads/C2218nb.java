package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.nb  reason: case insensitive filesystem */
public final class C2218nb extends C2446qia implements C2076lb {
    C2218nb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final a cb() {
        Parcel a2 = a(1, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int getHeight() {
        Parcel a2 = a(5, c());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final Uri getUri() {
        Parcel a2 = a(2, c());
        Uri uri = (Uri) C2516ria.a(a2, Uri.CREATOR);
        a2.recycle();
        return uri;
    }

    public final int getWidth() {
        Parcel a2 = a(4, c());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final double mb() {
        Parcel a2 = a(3, c());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }
}
