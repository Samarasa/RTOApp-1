package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Vi  reason: case insensitive filesystem */
public abstract class C1120Vi extends C2587sia implements C1146Wi {
    public C1120Vi() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static C1146Wi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof C1146Wi ? (C1146Wi) queryLocalInterface : new C1198Yi(iBinder);
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
                case 1: goto L_0x0041;
                case 2: goto L_0x003d;
                case 3: goto L_0x0039;
                case 4: goto L_0x0035;
                case 5: goto L_0x0015;
                case 6: goto L_0x0011;
                case 7: goto L_0x0009;
                case 8: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.L()
            goto L_0x0044
        L_0x0009:
            int r1 = r2.readInt()
            r0.b(r1)
            goto L_0x0044
        L_0x0011:
            r0.Y()
            goto L_0x0044
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C0886Mi
            if (r4 == 0) goto L_0x002b
            r1 = r2
            com.google.android.gms.internal.ads.Mi r1 = (com.google.android.gms.internal.ads.C0886Mi) r1
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.Oi r2 = new com.google.android.gms.internal.ads.Oi
            r2.<init>(r1)
            r1 = r2
        L_0x0031:
            r0.a(r1)
            goto L_0x0044
        L_0x0035:
            r0.ea()
            goto L_0x0044
        L_0x0039:
            r0.K()
            goto L_0x0044
        L_0x003d:
            r0.fa()
            goto L_0x0044
        L_0x0041:
            r0.ha()
        L_0x0044:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1120Vi.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
