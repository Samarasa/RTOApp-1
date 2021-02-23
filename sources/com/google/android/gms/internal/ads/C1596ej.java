package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.ej  reason: case insensitive filesystem */
public final class C1596ej extends C2446qia implements C1455cj {
    C1596ej(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void E(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(10, c2);
    }

    public final void J(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(5, c2);
    }

    public final void N(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(6, c2);
    }

    public final void a(a aVar, C1809hj hjVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) hjVar);
        b(7, c2);
    }

    public final void b(Bundle bundle) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) bundle);
        b(12, c2);
    }

    public final void b(a aVar, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeInt(i);
        b(2, c2);
    }

    public final void c(a aVar, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeInt(i);
        b(9, c2);
    }

    public final void h(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(3, c2);
    }

    public final void j(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(4, c2);
    }

    public final void n(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(11, c2);
    }

    public final void v(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(1, c2);
    }

    public final void z(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(8, c2);
    }
}
