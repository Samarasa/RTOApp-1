package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cra  reason: case insensitive filesystem */
public abstract class C1472cra extends C2587sia implements Zqa {
    public C1472cra() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.Tqa] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.ura] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00c9;
                case 2: goto L_0x00ab;
                case 3: goto L_0x009c;
                case 4: goto L_0x0090;
                case 5: goto L_0x0078;
                case 6: goto L_0x006c;
                case 7: goto L_0x004e;
                case 8: goto L_0x003a;
                case 9: goto L_0x002d;
                case 10: goto L_0x0020;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0013;
                case 14: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Sd r1 = com.google.android.gms.internal.ads.C1011Rd.a(r1)
            r0.a((com.google.android.gms.internal.ads.C1037Sd) r1)
            goto L_0x00a7
        L_0x0013:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Ld> r1 = com.google.android.gms.internal.ads.C0855Ld.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.Ld r1 = (com.google.android.gms.internal.ads.C0855Ld) r1
            r0.a((com.google.android.gms.internal.ads.C0855Ld) r1)
            goto L_0x00a7
        L_0x0020:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads._b r1 = com.google.android.gms.internal.ads.C1512dc.a(r1)
            r0.a((com.google.android.gms.internal.ads.C1243_b) r1)
            goto L_0x00a7
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.i> r1 = com.google.android.gms.ads.formats.i.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.ads.formats.i r1 = (com.google.android.gms.ads.formats.i) r1
            r0.a((com.google.android.gms.ads.formats.i) r1)
            goto L_0x00a7
        L_0x003a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Zb r1 = com.google.android.gms.internal.ads.C1191Yb.a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r4 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r4)
            com.google.android.gms.internal.ads.qqa r2 = (com.google.android.gms.internal.ads.C2462qqa) r2
            r0.a(r1, r2)
            goto L_0x00a7
        L_0x004e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0055
            goto L_0x0068
        L_0x0055:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2747ura
            if (r4 == 0) goto L_0x0063
            r4 = r2
            com.google.android.gms.internal.ads.ura r4 = (com.google.android.gms.internal.ads.C2747ura) r4
            goto L_0x0068
        L_0x0063:
            com.google.android.gms.internal.ads.tra r4 = new com.google.android.gms.internal.ads.tra
            r4.<init>(r1)
        L_0x0068:
            r0.a((com.google.android.gms.internal.ads.C2747ura) r4)
            goto L_0x00a7
        L_0x006c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.bb> r1 = com.google.android.gms.internal.ads.C1368bb.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.bb r1 = (com.google.android.gms.internal.ads.C1368bb) r1
            r0.a((com.google.android.gms.internal.ads.C1368bb) r1)
            goto L_0x00a7
        L_0x0078:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Sb r4 = com.google.android.gms.internal.ads.C1113Vb.a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Rb r2 = com.google.android.gms.internal.ads.C0983Qb.a(r2)
            r0.a(r1, r4, r2)
            goto L_0x00a7
        L_0x0090:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Mb r1 = com.google.android.gms.internal.ads.C0957Pb.a(r1)
            r0.a((com.google.android.gms.internal.ads.C0879Mb) r1)
            goto L_0x00a7
        L_0x009c:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Lb r1 = com.google.android.gms.internal.ads.C0827Kb.a(r1)
            r0.a((com.google.android.gms.internal.ads.C0853Lb) r1)
        L_0x00a7:
            r3.writeNoException()
            goto L_0x00d3
        L_0x00ab:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00b2
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.Tqa
            if (r4 == 0) goto L_0x00c0
            r4 = r2
            com.google.android.gms.internal.ads.Tqa r4 = (com.google.android.gms.internal.ads.Tqa) r4
            goto L_0x00c5
        L_0x00c0:
            com.google.android.gms.internal.ads.Vqa r4 = new com.google.android.gms.internal.ads.Vqa
            r4.<init>(r1)
        L_0x00c5:
            r0.a((com.google.android.gms.internal.ads.Tqa) r4)
            goto L_0x00a7
        L_0x00c9:
            com.google.android.gms.internal.ads.Yqa r1 = r0.Bb()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x00d3:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1472cra.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
