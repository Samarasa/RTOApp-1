package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nj  reason: case insensitive filesystem */
public abstract class C2234nj extends C2587sia implements C2305oj {
    public C2234nj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.rj] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.pj] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.sj] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.rj] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r4.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        r4.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00e0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00ac;
                case 5: goto L_0x009d;
                case 6: goto L_0x007f;
                case 7: goto L_0x0073;
                case 8: goto L_0x0067;
                case 9: goto L_0x005b;
                case 10: goto L_0x004b;
                case 11: goto L_0x003f;
                case 12: goto L_0x003a;
                case 13: goto L_0x002d;
                case 14: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r2 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.nqa r2 = (com.google.android.gms.internal.ads.C2249nqa) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C2517rj
            if (r0 == 0) goto L_0x0023
            r0 = r5
            com.google.android.gms.internal.ads.rj r0 = (com.google.android.gms.internal.ads.C2517rj) r0
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.tj r0 = new com.google.android.gms.internal.ads.tj
            r0.<init>(r3)
        L_0x0028:
            r1.b(r2, r0)
            goto L_0x00a8
        L_0x002d:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.Mra r2 = com.google.android.gms.internal.ads.Lra.a(r2)
            r1.a((com.google.android.gms.internal.ads.Mra) r2)
            goto L_0x00a8
        L_0x003a:
            com.google.android.gms.internal.ads.Nra r2 = r1.A()
            goto L_0x0043
        L_0x003f:
            com.google.android.gms.internal.ads.jj r2 = r1.Ib()
        L_0x0043:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x0104
        L_0x004b:
            android.os.IBinder r2 = r3.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r2)
            boolean r3 = com.google.android.gms.internal.ads.C2516ria.a(r3)
            r1.a((c.b.b.b.c.a) r2, (boolean) r3)
            goto L_0x00a8
        L_0x005b:
            android.os.Bundle r2 = r1.V()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r4, r2)
            goto L_0x0104
        L_0x0067:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.Hra r2 = com.google.android.gms.internal.ads.Kra.a(r2)
            r1.a((com.google.android.gms.internal.ads.Hra) r2)
            goto L_0x00a8
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.wj> r2 = com.google.android.gms.internal.ads.C2872wj.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.wj r2 = (com.google.android.gms.internal.ads.C2872wj) r2
            r1.a((com.google.android.gms.internal.ads.C2872wj) r2)
            goto L_0x00a8
        L_0x007f:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0086
            goto L_0x0099
        L_0x0086:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2588sj
            if (r5 == 0) goto L_0x0094
            r0 = r3
            com.google.android.gms.internal.ads.sj r0 = (com.google.android.gms.internal.ads.C2588sj) r0
            goto L_0x0099
        L_0x0094:
            com.google.android.gms.internal.ads.uj r0 = new com.google.android.gms.internal.ads.uj
            r0.<init>(r2)
        L_0x0099:
            r1.a((com.google.android.gms.internal.ads.C2588sj) r0)
            goto L_0x00a8
        L_0x009d:
            android.os.IBinder r2 = r3.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r2)
            r1.l(r2)
        L_0x00a8:
            r4.writeNoException()
            goto L_0x0104
        L_0x00ac:
            java.lang.String r2 = r1.o()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0104
        L_0x00b7:
            boolean r2 = r1.oa()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, (boolean) r2)
            goto L_0x0104
        L_0x00c2:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00c9
            goto L_0x00dc
        L_0x00c9:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2376pj
            if (r5 == 0) goto L_0x00d7
            r0 = r3
            com.google.android.gms.internal.ads.pj r0 = (com.google.android.gms.internal.ads.C2376pj) r0
            goto L_0x00dc
        L_0x00d7:
            com.google.android.gms.internal.ads.qj r0 = new com.google.android.gms.internal.ads.qj
            r0.<init>(r2)
        L_0x00dc:
            r1.a((com.google.android.gms.internal.ads.C2376pj) r0)
            goto L_0x00a8
        L_0x00e0:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r2 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.nqa r2 = (com.google.android.gms.internal.ads.C2249nqa) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x00ef
            goto L_0x0100
        L_0x00ef:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C2517rj
            if (r0 == 0) goto L_0x00fb
            r0 = r5
            com.google.android.gms.internal.ads.rj r0 = (com.google.android.gms.internal.ads.C2517rj) r0
            goto L_0x0100
        L_0x00fb:
            com.google.android.gms.internal.ads.tj r0 = new com.google.android.gms.internal.ads.tj
            r0.<init>(r3)
        L_0x0100:
            r1.a((com.google.android.gms.internal.ads.C2249nqa) r2, (com.google.android.gms.internal.ads.C2517rj) r0)
            goto L_0x00a8
        L_0x0104:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2234nj.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
