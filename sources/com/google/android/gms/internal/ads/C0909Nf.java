package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Nf  reason: case insensitive filesystem */
public abstract class C0909Nf extends C2587sia implements C0831Kf {
    public C0909Nf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static C0831Kf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof C0831Kf ? (C0831Kf) queryLocalInterface : new C0883Mf(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x00dd;
                case 2: goto L_0x00d9;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00c9;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00a5;
                case 8: goto L_0x00a1;
                case 9: goto L_0x0095;
                case 10: goto L_0x0085;
                case 11: goto L_0x0081;
                case 12: goto L_0x0079;
                case 13: goto L_0x0074;
                case 14: goto L_0x0067;
                case 15: goto L_0x0062;
                case 16: goto L_0x0055;
                case 17: goto L_0x004c;
                case 18: goto L_0x0047;
                case 19: goto L_0x003a;
                case 20: goto L_0x0035;
                case 21: goto L_0x002c;
                case 22: goto L_0x001f;
                case 23: goto L_0x0012;
                case 24: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.hqa> r1 = com.google.android.gms.internal.ads.C1824hqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.hqa r1 = (com.google.android.gms.internal.ads.C1824hqa) r1
            r0.c(r1)
            goto L_0x00e0
        L_0x0012:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.hqa> r1 = com.google.android.gms.internal.ads.C1824hqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.hqa r1 = (com.google.android.gms.internal.ads.C1824hqa) r1
            r0.b((com.google.android.gms.internal.ads.C1824hqa) r1)
            goto L_0x00e0
        L_0x001f:
            int r1 = r2.readInt()
            java.lang.String r2 = r2.readString()
            r0.a((int) r1, (java.lang.String) r2)
            goto L_0x00e0
        L_0x002c:
            java.lang.String r1 = r2.readString()
            r0.o(r1)
            goto L_0x00e0
        L_0x0035:
            r0.sa()
            goto L_0x00e0
        L_0x003a:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.b((android.os.Bundle) r1)
            goto L_0x00e0
        L_0x0047:
            r0.qb()
            goto L_0x00e0
        L_0x004c:
            int r1 = r2.readInt()
            r0.f(r1)
            goto L_0x00e0
        L_0x0055:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.jj r1 = com.google.android.gms.internal.ads.C2163mj.a(r1)
            r0.a((com.google.android.gms.internal.ads.C1950jj) r1)
            goto L_0x00e0
        L_0x0062:
            r0.ka()
            goto L_0x00e0
        L_0x0067:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.hj> r1 = com.google.android.gms.internal.ads.C1809hj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.hj r1 = (com.google.android.gms.internal.ads.C1809hj) r1
            r0.a((com.google.android.gms.internal.ads.C1809hj) r1)
            goto L_0x00e0
        L_0x0074:
            r0.Eb()
            goto L_0x00e0
        L_0x0079:
            java.lang.String r1 = r2.readString()
            r0.u(r1)
            goto L_0x00e0
        L_0x0081:
            r0.ma()
            goto L_0x00e0
        L_0x0085:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Hb r1 = com.google.android.gms.internal.ads.C0723Gb.a(r1)
            java.lang.String r2 = r2.readString()
            r0.a((com.google.android.gms.internal.ads.C0749Hb) r1, (java.lang.String) r2)
            goto L_0x00e0
        L_0x0095:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.a((java.lang.String) r1, (java.lang.String) r2)
            goto L_0x00e0
        L_0x00a1:
            r0.I()
            goto L_0x00e0
        L_0x00a5:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00ad
            r1 = 0
            goto L_0x00c1
        L_0x00ad:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C0961Pf
            if (r4 == 0) goto L_0x00bb
            r1 = r2
            com.google.android.gms.internal.ads.Pf r1 = (com.google.android.gms.internal.ads.C0961Pf) r1
            goto L_0x00c1
        L_0x00bb:
            com.google.android.gms.internal.ads.Of r2 = new com.google.android.gms.internal.ads.Of
            r2.<init>(r1)
            r1 = r2
        L_0x00c1:
            r0.a((com.google.android.gms.internal.ads.C0961Pf) r1)
            goto L_0x00e0
        L_0x00c5:
            r0.H()
            goto L_0x00e0
        L_0x00c9:
            r0.M()
            goto L_0x00e0
        L_0x00cd:
            r0.N()
            goto L_0x00e0
        L_0x00d1:
            int r1 = r2.readInt()
            r0.a((int) r1)
            goto L_0x00e0
        L_0x00d9:
            r0.O()
            goto L_0x00e0
        L_0x00dd:
            r0.onAdClicked()
        L_0x00e0:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0909Nf.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
