package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.b.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Fb  reason: case insensitive filesystem */
public final class C0697Fb extends C2446qia implements C0645Db {
    C0697Fb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final a B() {
        Parcel a2 = a(2, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final String R() {
        Parcel a2 = a(8, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final Sra getVideoController() {
        Parcel a2 = a(11, c());
        Sra a3 = Rra.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final String r() {
        Parcel a2 = a(3, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2076lb ra() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 6
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2076lb
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.lb r1 = (com.google.android.gms.internal.ads.C2076lb) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.nb r2 = new com.google.android.gms.internal.ads.nb
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0697Fb.ra():com.google.android.gms.internal.ads.lb");
    }

    public final String s() {
        Parcel a2 = a(7, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final String v() {
        Parcel a2 = a(5, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1580eb x() {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1580eb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.eb r1 = (com.google.android.gms.internal.ads.C1580eb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.gb r2 = new com.google.android.gms.internal.ads.gb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0697Fb.x():com.google.android.gms.internal.ads.eb");
    }

    public final List y() {
        Parcel a2 = a(4, c());
        ArrayList b2 = C2516ria.b(a2);
        a2.recycle();
        return b2;
    }
}
