package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.mV  reason: case insensitive filesystem */
public final class C2140mV extends C2446qia implements C2069lV {
    C2140mV(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    public final void B(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(7, c2);
    }

    public final void P(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(4, c2);
    }

    public final a a(String str, a aVar, String str2, String str3, String str4, String str5) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str2);
        c2.writeString(str3);
        c2.writeString(str4);
        c2.writeString(str5);
        Parcel a2 = a(9, c2);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final a a(String str, a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str2);
        c2.writeString(str3);
        c2.writeString(str4);
        c2.writeString(str5);
        c2.writeString(str6);
        c2.writeString(str7);
        c2.writeString(str8);
        Parcel a2 = a(11, c2);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void a(a aVar, a aVar2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        b(8, c2);
    }

    public final a b(String str, a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str2);
        c2.writeString(str3);
        c2.writeString(str4);
        c2.writeString(str5);
        c2.writeString(str6);
        c2.writeString(str7);
        c2.writeString(str8);
        Parcel a2 = a(10, c2);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void b(a aVar, a aVar2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        b(5, c2);
    }

    public final String getVersion() {
        Parcel a2 = a(6, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final boolean o(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(2, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
