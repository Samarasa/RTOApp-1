package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.bra  reason: case insensitive filesystem */
public final class C1401bra extends C2446qia implements Zqa {
    C1401bra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Yqa Bb() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 1
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.Yqa
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.Yqa r1 = (com.google.android.gms.internal.ads.Yqa) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.ara r2 = new com.google.android.gms.internal.ads.ara
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1401bra.Bb():com.google.android.gms.internal.ads.Yqa");
    }

    public final void a(C0853Lb lb) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) lb);
        b(3, c2);
    }

    public final void a(C0879Mb mb) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) mb);
        b(4, c2);
    }

    public final void a(Tqa tqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) tqa);
        b(2, c2);
    }

    public final void a(C1243_b _bVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) _bVar);
        b(10, c2);
    }

    public final void a(C1368bb bbVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) bbVar);
        b(6, c2);
    }

    public final void a(String str, C1035Sb sb, C1009Rb rb) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) sb);
        C2516ria.a(c2, (IInterface) rb);
        b(5, c2);
    }
}
