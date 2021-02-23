package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.ira  reason: case insensitive filesystem */
public final class C1896ira extends C2446qia implements C1755gra {
    C1896ira(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Nra A() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 41
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.Nra
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Nra r1 = (com.google.android.gms.internal.ads.Nra) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Pra r2 = new com.google.android.gms.internal.ads.Pra
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1896ira.A():com.google.android.gms.internal.ads.Nra");
    }

    public final a Ca() {
        Parcel a2 = a(1, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final String Pb() {
        Parcel a2 = a(31, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final C2462qqa Qb() {
        Parcel a2 = a(12, c());
        C2462qqa qqa = (C2462qqa) C2516ria.a(a2, C2462qqa.CREATOR);
        a2.recycle();
        return qqa;
    }

    public final Bundle V() {
        Parcel a2 = a(37, c());
        Bundle bundle = (Bundle) C2516ria.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    public final void X() {
        b(6, c());
    }

    public final void a(Mra mra) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) mra);
        b(42, c2);
    }

    public final void a(Sqa sqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) sqa);
        b(20, c2);
    }

    public final void a(C1146Wi wi) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) wi);
        b(24, c2);
    }

    public final void a(C1508da daVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) daVar);
        b(19, c2);
    }

    public final void a(C1905j jVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) jVar);
        b(29, c2);
    }

    public final void a(C1967jra jra) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) jra);
        b(36, c2);
    }

    public final void a(C2103loa loa) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) loa);
        b(40, c2);
    }

    public final void a(C2322ora ora) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) ora);
        b(8, c2);
    }

    public final void a(C2462qqa qqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) qqa);
        b(13, c2);
    }

    public final void a(C3100zqa zqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) zqa);
        b(39, c2);
    }

    public final boolean a(C2249nqa nqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) nqa);
        Parcel a2 = a(4, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final void b(Tqa tqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) tqa);
        b(7, c2);
    }

    public final void b(boolean z) {
        Parcel c2 = c();
        C2516ria.a(c2, z);
        b(34, c2);
    }

    public final void destroy() {
        b(2, c());
    }

    public final void f(boolean z) {
        Parcel c2 = c();
        C2516ria.a(c2, z);
        b(22, c2);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Sra getVideoController() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 26
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.Sra
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Sra r1 = (com.google.android.gms.internal.ads.Sra) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Ura r2 = new com.google.android.gms.internal.ads.Ura
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1896ira.getVideoController():com.google.android.gms.internal.ads.Sra");
    }

    public final void pause() {
        b(5, c());
    }

    public final void showInterstitial() {
        b(9, c());
    }

    public final boolean t() {
        Parcel a2 = a(3, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final String va() {
        Parcel a2 = a(35, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
