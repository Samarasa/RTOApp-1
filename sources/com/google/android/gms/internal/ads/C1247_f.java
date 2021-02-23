package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads._f  reason: case insensitive filesystem */
public final class C1247_f extends C2446qia implements C1195Yf {
    C1247_f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final String E() {
        Parcel a2 = a(10, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final float Ea() {
        Parcel a2 = a(23, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    public final double G() {
        Parcel a2 = a(8, c());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }

    public final float Na() {
        Parcel a2 = a(25, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    public final String R() {
        Parcel a2 = a(7, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String S() {
        Parcel a2 = a(9, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final float Sa() {
        Parcel a2 = a(24, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    public final C2076lb U() {
        Parcel a2 = a(5, c());
        C2076lb a3 = C2005kb.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final a Z() {
        Parcel a2 = a(14, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void a(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(22, c2);
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        C2516ria.a(c2, (IInterface) aVar3);
        b(21, c2);
    }

    public final boolean aa() {
        Parcel a2 = a(17, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final void b(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(20, c2);
    }

    public final a ba() {
        Parcel a2 = a(13, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final boolean ga() {
        Parcel a2 = a(18, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final Bundle getExtras() {
        Parcel a2 = a(16, c());
        Bundle bundle = (Bundle) C2516ria.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    public final Sra getVideoController() {
        Parcel a2 = a(11, c());
        Sra a3 = Rra.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final String r() {
        Parcel a2 = a(2, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String s() {
        Parcel a2 = a(6, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String v() {
        Parcel a2 = a(4, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final a w() {
        Parcel a2 = a(15, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final C1580eb x() {
        Parcel a2 = a(12, c());
        C1580eb a3 = C1510db.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final List y() {
        Parcel a2 = a(3, c());
        ArrayList b2 = C2516ria.b(a2);
        a2.recycle();
        return b2;
    }

    public final void z() {
        b(19, c());
    }
}
