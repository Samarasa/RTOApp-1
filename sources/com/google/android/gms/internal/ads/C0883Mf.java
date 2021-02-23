package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Mf  reason: case insensitive filesystem */
public final class C0883Mf extends C2446qia implements C0831Kf {
    C0883Mf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void Eb() {
        b(13, c());
    }

    public final void H() {
        b(6, c());
    }

    public final void I() {
        b(8, c());
    }

    public final void M() {
        b(5, c());
    }

    public final void N() {
        b(4, c());
    }

    public final void O() {
        b(2, c());
    }

    public final void a(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(3, c2);
    }

    public final void a(int i, String str) {
        Parcel c2 = c();
        c2.writeInt(i);
        c2.writeString(str);
        b(22, c2);
    }

    public final void a(C0749Hb hb, String str) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) hb);
        c2.writeString(str);
        b(10, c2);
    }

    public final void a(C0961Pf pf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) pf);
        b(7, c2);
    }

    public final void a(C1809hj hjVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hjVar);
        b(14, c2);
    }

    public final void a(C1950jj jjVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) jjVar);
        b(16, c2);
    }

    public final void a(String str, String str2) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        b(9, c2);
    }

    public final void b(Bundle bundle) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) bundle);
        b(19, c2);
    }

    public final void b(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(23, c2);
    }

    public final void c(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(24, c2);
    }

    public final void f(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(17, c2);
    }

    public final void ka() {
        b(15, c());
    }

    public final void ma() {
        b(11, c());
    }

    public final void o(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(21, c2);
    }

    public final void onAdClicked() {
        b(1, c());
    }

    public final void qb() {
        b(18, c());
    }

    public final void sa() {
        b(20, c());
    }

    public final void u(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(12, c2);
    }
}
