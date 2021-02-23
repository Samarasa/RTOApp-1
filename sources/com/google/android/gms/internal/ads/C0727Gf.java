package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gf  reason: case insensitive filesystem */
public final class C0727Gf extends C2446qia implements C0675Ef {
    C0727Gf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C0805Jf j(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.c()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C0805Jf
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.Jf r0 = (com.google.android.gms.internal.ads.C0805Jf) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.Lf r1 = new com.google.android.gms.internal.ads.Lf
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0727Gf.j(java.lang.String):com.google.android.gms.internal.ads.Jf");
    }

    public final boolean m(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        Parcel a2 = a(2, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }

    public final C0624Cg x(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        Parcel a2 = a(3, c2);
        C0624Cg a3 = C0702Fg.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
