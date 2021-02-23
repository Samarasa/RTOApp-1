package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uf  reason: case insensitive filesystem */
public final class C1091Uf extends C2446qia implements C1039Sf {
    C1091Uf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String R() {
        Parcel a2 = a(7, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final a Z() {
        Parcel a2 = a(20, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void a(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(14, c2);
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        C2516ria.a(c2, (IInterface) aVar3);
        b(22, c2);
    }

    public final boolean aa() {
        Parcel a2 = a(11, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final void b(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(9, c2);
    }

    public final a ba() {
        Parcel a2 = a(15, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void d(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(10, c2);
    }

    public final boolean ga() {
        Parcel a2 = a(12, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final Bundle getExtras() {
        Parcel a2 = a(13, c());
        Bundle bundle = (Bundle) C2516ria.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    public final Sra getVideoController() {
        Parcel a2 = a(16, c());
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

    public final C2076lb ra() {
        Parcel a2 = a(5, c());
        C2076lb a3 = C2005kb.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
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
        Parcel a2 = a(21, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final C1580eb x() {
        Parcel a2 = a(19, c());
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
        b(8, c());
    }
}
