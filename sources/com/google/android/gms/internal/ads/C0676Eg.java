package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.Eg  reason: case insensitive filesystem */
public final class C0676Eg extends C2446qia implements C0624Cg {
    C0676Eg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final boolean L(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(17, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, C2462qqa qqa, C0754Hg hg) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        C2516ria.a(c2, (Parcelable) bundle);
        C2516ria.a(c2, (Parcelable) bundle2);
        C2516ria.a(c2, (Parcelable) qqa);
        C2516ria.a(c2, (IInterface) hg);
        b(1, c2);
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C0598Bg bg, C0831Kf kf) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) nqa);
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) bg);
        C2516ria.a(c2, (IInterface) kf);
        b(16, c2);
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2441qg qgVar, C0831Kf kf, C2462qqa qqa) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) nqa);
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) qgVar);
        C2516ria.a(c2, (IInterface) kf);
        C2516ria.a(c2, (Parcelable) qqa);
        b(13, c2);
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2795vg vgVar, C0831Kf kf) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) nqa);
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) vgVar);
        C2516ria.a(c2, (IInterface) kf);
        b(14, c2);
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2866wg wgVar, C0831Kf kf) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) nqa);
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) wgVar);
        C2516ria.a(c2, (IInterface) kf);
        b(18, c2);
    }

    public final void b(String str, String str2, C2249nqa nqa, a aVar, C0598Bg bg, C0831Kf kf) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (Parcelable) nqa);
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) bg);
        C2516ria.a(c2, (IInterface) kf);
        b(20, c2);
    }

    public final Sra getVideoController() {
        Parcel a2 = a(5, c());
        Sra a3 = Rra.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void k(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(19, c2);
    }

    public final boolean p(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(15, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final C1014Rg ta() {
        Parcel a2 = a(3, c());
        C1014Rg rg = (C1014Rg) C2516ria.a(a2, C1014Rg.CREATOR);
        a2.recycle();
        return rg;
    }

    public final C1014Rg ua() {
        Parcel a2 = a(2, c());
        C1014Rg rg = (C1014Rg) C2516ria.a(a2, C1014Rg.CREATOR);
        a2.recycle();
        return rg;
    }
}
