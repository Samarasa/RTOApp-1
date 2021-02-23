package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Si  reason: case insensitive filesystem */
public abstract class C1042Si extends C2587sia implements C0964Pi {
    public C1042Si() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static C0964Pi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof C0964Pi ? (C0964Pi) queryLocalInterface : new C1016Ri(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Wi] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.Ni] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r5.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r5, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x00f6
            r0 = 2
            if (r3 == r0) goto L_0x00f2
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00d4
            r0 = 34
            if (r3 == r0) goto L_0x00cc
            switch(r3) {
                case 5: goto L_0x00c1;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00a9;
                case 10: goto L_0x009d;
                case 11: goto L_0x0091;
                case 12: goto L_0x0085;
                case 13: goto L_0x007c;
                case 14: goto L_0x006f;
                case 15: goto L_0x0063;
                case 16: goto L_0x0044;
                case 17: goto L_0x003b;
                case 18: goto L_0x002e;
                case 19: goto L_0x0025;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            com.google.android.gms.internal.ads.Nra r3 = r2.A()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0104
        L_0x001f:
            boolean r3 = r2.ub()
            goto L_0x00c5
        L_0x0025:
            java.lang.String r3 = r4.readString()
            r2.A((java.lang.String) r3)
            goto L_0x0101
        L_0x002e:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            r2.D(r3)
            goto L_0x0101
        L_0x003b:
            java.lang.String r3 = r4.readString()
            r2.t(r3)
            goto L_0x0101
        L_0x0044:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.C0912Ni
            if (r0 == 0) goto L_0x0059
            r1 = r4
            com.google.android.gms.internal.ads.Ni r1 = (com.google.android.gms.internal.ads.C0912Ni) r1
            goto L_0x005e
        L_0x0059:
            com.google.android.gms.internal.ads.Qi r1 = new com.google.android.gms.internal.ads.Qi
            r1.<init>(r3)
        L_0x005e:
            r2.a((com.google.android.gms.internal.ads.C0912Ni) r1)
            goto L_0x0101
        L_0x0063:
            android.os.Bundle r3 = r2.V()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r5, r3)
            goto L_0x0104
        L_0x006f:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.jra r3 = com.google.android.gms.internal.ads.C2180mra.a(r3)
            r2.a((com.google.android.gms.internal.ads.C1967jra) r3)
            goto L_0x0101
        L_0x007c:
            java.lang.String r3 = r4.readString()
            r2.h(r3)
            goto L_0x0101
        L_0x0085:
            java.lang.String r3 = r2.o()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0104
        L_0x0091:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            r2.O(r3)
            goto L_0x0101
        L_0x009d:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            r2.A((c.b.b.b.c.a) r3)
            goto L_0x0101
        L_0x00a9:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            r2.F(r3)
            goto L_0x0101
        L_0x00b5:
            r2.destroy()
            goto L_0x0101
        L_0x00b9:
            r2.X()
            goto L_0x0101
        L_0x00bd:
            r2.pause()
            goto L_0x0101
        L_0x00c1:
            boolean r3 = r2.oa()
        L_0x00c5:
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x0104
        L_0x00cc:
            boolean r3 = com.google.android.gms.internal.ads.C2516ria.a(r4)
            r2.b(r3)
            goto L_0x0101
        L_0x00d4:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00db
            goto L_0x00ee
        L_0x00db:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.C1146Wi
            if (r0 == 0) goto L_0x00e9
            r1 = r4
            com.google.android.gms.internal.ads.Wi r1 = (com.google.android.gms.internal.ads.C1146Wi) r1
            goto L_0x00ee
        L_0x00e9:
            com.google.android.gms.internal.ads.Yi r1 = new com.google.android.gms.internal.ads.Yi
            r1.<init>(r3)
        L_0x00ee:
            r2.a((com.google.android.gms.internal.ads.C1146Wi) r1)
            goto L_0x0101
        L_0x00f2:
            r2.u()
            goto L_0x0101
        L_0x00f6:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.bj> r3 = com.google.android.gms.internal.ads.C1384bj.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, r3)
            com.google.android.gms.internal.ads.bj r3 = (com.google.android.gms.internal.ads.C1384bj) r3
            r2.a((com.google.android.gms.internal.ads.C1384bj) r3)
        L_0x0101:
            r5.writeNoException()
        L_0x0104:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1042Si.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
