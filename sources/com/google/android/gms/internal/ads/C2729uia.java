package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.uia  reason: case insensitive filesystem */
public final class C2729uia extends C2446qia implements C2658tia {
    C2729uia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void Nb() {
        b(3, c());
    }

    public final void a(a aVar, String str, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        c2.writeString((String) null);
        b(8, c2);
    }

    public final void a(byte[] bArr) {
        Parcel c2 = c();
        c2.writeByteArray(bArr);
        b(5, c2);
    }

    public final void a(int[] iArr) {
        Parcel c2 = c();
        c2.writeIntArray((int[]) null);
        b(4, c2);
    }

    public final void b(a aVar, String str) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        b(2, c2);
    }

    public final void g(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(6, c2);
    }

    public final void h(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(7, c2);
    }
}
