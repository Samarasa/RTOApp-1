package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Lf  reason: case insensitive filesystem */
public final class C0857Lf extends C2446qia implements C0805Jf {
    C0857Lf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1195Yf Ba() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 27
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1195Yf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Yf r1 = (com.google.android.gms.internal.ads.C1195Yf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads._f r2 = new com.google.android.gms.internal.ads._f
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0857Lf.Ba():com.google.android.gms.internal.ads.Yf");
    }

    public final void K(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(30, c2);
    }

    public final a Lb() {
        Parcel a2 = a(2, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void X() {
        b(9, c());
    }

    public final boolean _a() {
        Parcel a2 = a(22, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final void a(a aVar, C0595Bd bd, List<C0803Jd> list) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) bd);
        c2.writeTypedList(list);
        b(31, c2);
    }

    public final void a(a aVar, C1455cj cjVar, List<String> list) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) cjVar);
        c2.writeStringList(list);
        b(23, c2);
    }

    public final void a(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) kf);
        b(3, c2);
    }

    public final void a(a aVar, C2249nqa nqa, String str, C1455cj cjVar, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) cjVar);
        c2.writeString(str2);
        b(10, c2);
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (IInterface) kf);
        b(7, c2);
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf, C1368bb bbVar, List<String> list) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (IInterface) kf);
        C2516ria.a(c2, (Parcelable) bbVar);
        c2.writeStringList(list);
        b(14, c2);
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) qqa);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) kf);
        b(1, c2);
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) qqa);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        c2.writeString(str2);
        C2516ria.a(c2, (IInterface) kf);
        b(6, c2);
    }

    public final void a(C2249nqa nqa, String str) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        b(11, c2);
    }

    public final void b(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) kf);
        b(28, c2);
    }

    public final void b(boolean z) {
        Parcel c2 = c();
        C2516ria.a(c2, z);
        b(25, c2);
    }

    public final void c(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) kf);
        b(32, c2);
    }

    public final void destroy() {
        b(5, c());
    }

    public final Sra getVideoController() {
        Parcel a2 = a(26, c());
        Sra a3 = Rra.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final boolean isInitialized() {
        Parcel a2 = a(13, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1039Sf kb() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 16
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1039Sf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Sf r1 = (com.google.android.gms.internal.ads.C1039Sf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Uf r2 = new com.google.android.gms.internal.ads.Uf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0857Lf.kb():com.google.android.gms.internal.ads.Sf");
    }

    public final void pause() {
        b(8, c());
    }

    public final void showInterstitial() {
        b(4, c());
    }

    public final void showVideo() {
        b(12, c());
    }

    public final C1014Rg ta() {
        Parcel a2 = a(34, c());
        C1014Rg rg = (C1014Rg) C2516ria.a(a2, C1014Rg.CREATOR);
        a2.recycle();
        return rg;
    }

    public final C1014Rg ua() {
        Parcel a2 = a(33, c());
        C1014Rg rg = (C1014Rg) C2516ria.a(a2, C1014Rg.CREATOR);
        a2.recycle();
        return rg;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1013Rf xb() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 15
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1013Rf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Rf r1 = (com.google.android.gms.internal.ads.C1013Rf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Tf r2 = new com.google.android.gms.internal.ads.Tf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0857Lf.xb():com.google.android.gms.internal.ads.Rf");
    }

    public final void y(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(21, c2);
    }
}
