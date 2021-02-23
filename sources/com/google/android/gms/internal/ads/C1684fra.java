package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fra  reason: case insensitive filesystem */
public abstract class C1684fra extends C2587sia implements C1755gra {
    public C1684fra() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.Tqa] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.ora] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.Sqa] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.ura] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.jra] */
    /* JADX WARNING: type inference failed for: r4v27, types: [com.google.android.gms.internal.ads.Mra] */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.b(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d4, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dc, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x01d8;
                case 2: goto L_0x01d1;
                case 3: goto L_0x01c6;
                case 4: goto L_0x01b9;
                case 5: goto L_0x01b5;
                case 6: goto L_0x01b1;
                case 7: goto L_0x0193;
                case 8: goto L_0x0175;
                case 9: goto L_0x0171;
                case 10: goto L_0x016c;
                case 11: goto L_0x0167;
                case 12: goto L_0x015b;
                case 13: goto L_0x014e;
                case 14: goto L_0x0141;
                case 15: goto L_0x0130;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0124;
                case 19: goto L_0x0117;
                case 20: goto L_0x00f8;
                case 21: goto L_0x00d9;
                case 22: goto L_0x00d0;
                case 23: goto L_0x00ca;
                case 24: goto L_0x00bd;
                case 25: goto L_0x00b4;
                case 26: goto L_0x00ae;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x00a1;
                case 30: goto L_0x0094;
                case 31: goto L_0x008e;
                case 32: goto L_0x0088;
                case 33: goto L_0x0082;
                case 34: goto L_0x0079;
                case 35: goto L_0x0073;
                case 36: goto L_0x0054;
                case 37: goto L_0x004e;
                case 38: goto L_0x0045;
                case 39: goto L_0x0038;
                case 40: goto L_0x002b;
                case 41: goto L_0x0025;
                case 42: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.Mra
            if (r4 == 0) goto L_0x001b
            r4 = r2
            com.google.android.gms.internal.ads.Mra r4 = (com.google.android.gms.internal.ads.Mra) r4
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.Ora r4 = new com.google.android.gms.internal.ads.Ora
            r4.<init>(r1)
        L_0x0020:
            r0.a((com.google.android.gms.internal.ads.Mra) r4)
            goto L_0x01d4
        L_0x0025:
            com.google.android.gms.internal.ads.Nra r1 = r0.A()
            goto L_0x01dc
        L_0x002b:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.loa r1 = com.google.android.gms.internal.ads.C2032koa.a(r1)
            r0.a((com.google.android.gms.internal.ads.C2103loa) r1)
            goto L_0x01d4
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zqa> r1 = com.google.android.gms.internal.ads.C3100zqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zqa r1 = (com.google.android.gms.internal.ads.C3100zqa) r1
            r0.a((com.google.android.gms.internal.ads.C3100zqa) r1)
            goto L_0x01d4
        L_0x0045:
            java.lang.String r1 = r2.readString()
            r0.q(r1)
            goto L_0x01d4
        L_0x004e:
            android.os.Bundle r1 = r0.V()
            goto L_0x015f
        L_0x0054:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x005b
            goto L_0x006e
        L_0x005b:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1967jra
            if (r4 == 0) goto L_0x0069
            r4 = r2
            com.google.android.gms.internal.ads.jra r4 = (com.google.android.gms.internal.ads.C1967jra) r4
            goto L_0x006e
        L_0x0069:
            com.google.android.gms.internal.ads.lra r4 = new com.google.android.gms.internal.ads.lra
            r4.<init>(r1)
        L_0x006e:
            r0.a((com.google.android.gms.internal.ads.C1967jra) r4)
            goto L_0x01d4
        L_0x0073:
            java.lang.String r1 = r0.va()
            goto L_0x0128
        L_0x0079:
            boolean r1 = com.google.android.gms.internal.ads.C2516ria.a(r2)
            r0.b((boolean) r1)
            goto L_0x01d4
        L_0x0082:
            com.google.android.gms.internal.ads.Tqa r1 = r0.yb()
            goto L_0x01dc
        L_0x0088:
            com.google.android.gms.internal.ads.ora r1 = r0.lb()
            goto L_0x01dc
        L_0x008e:
            java.lang.String r1 = r0.Pb()
            goto L_0x0128
        L_0x0094:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Yra> r1 = com.google.android.gms.internal.ads.Yra.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.Yra r1 = (com.google.android.gms.internal.ads.Yra) r1
            r0.a((com.google.android.gms.internal.ads.Yra) r1)
            goto L_0x01d4
        L_0x00a1:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.j> r1 = com.google.android.gms.internal.ads.C1905j.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.j r1 = (com.google.android.gms.internal.ads.C1905j) r1
            r0.a((com.google.android.gms.internal.ads.C1905j) r1)
            goto L_0x01d4
        L_0x00ae:
            com.google.android.gms.internal.ads.Sra r1 = r0.getVideoController()
            goto L_0x01dc
        L_0x00b4:
            java.lang.String r1 = r2.readString()
            r0.h(r1)
            goto L_0x01d4
        L_0x00bd:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Wi r1 = com.google.android.gms.internal.ads.C1120Vi.a(r1)
            r0.a((com.google.android.gms.internal.ads.C1146Wi) r1)
            goto L_0x01d4
        L_0x00ca:
            boolean r1 = r0.q()
            goto L_0x01ca
        L_0x00d0:
            boolean r1 = com.google.android.gms.internal.ads.C2516ria.a(r2)
            r0.f(r1)
            goto L_0x01d4
        L_0x00d9:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00e0
            goto L_0x00f3
        L_0x00e0:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2747ura
            if (r4 == 0) goto L_0x00ee
            r4 = r2
            com.google.android.gms.internal.ads.ura r4 = (com.google.android.gms.internal.ads.C2747ura) r4
            goto L_0x00f3
        L_0x00ee:
            com.google.android.gms.internal.ads.tra r4 = new com.google.android.gms.internal.ads.tra
            r4.<init>(r1)
        L_0x00f3:
            r0.b((com.google.android.gms.internal.ads.C2747ura) r4)
            goto L_0x01d4
        L_0x00f8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00ff
            goto L_0x0112
        L_0x00ff:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.Sqa
            if (r4 == 0) goto L_0x010d
            r4 = r2
            com.google.android.gms.internal.ads.Sqa r4 = (com.google.android.gms.internal.ads.Sqa) r4
            goto L_0x0112
        L_0x010d:
            com.google.android.gms.internal.ads.Uqa r4 = new com.google.android.gms.internal.ads.Uqa
            r4.<init>(r1)
        L_0x0112:
            r0.a((com.google.android.gms.internal.ads.Sqa) r4)
            goto L_0x01d4
        L_0x0117:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.da r1 = com.google.android.gms.internal.ads.C1437ca.a(r1)
            r0.a((com.google.android.gms.internal.ads.C1508da) r1)
            goto L_0x01d4
        L_0x0124:
            java.lang.String r1 = r0.o()
        L_0x0128:
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x01e2
        L_0x0130:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Kh r1 = com.google.android.gms.internal.ads.C0807Jh.a(r1)
            java.lang.String r2 = r2.readString()
            r0.a(r1, r2)
            goto L_0x01d4
        L_0x0141:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Gh r1 = com.google.android.gms.internal.ads.C0703Fh.a(r1)
            r0.a((com.google.android.gms.internal.ads.C0729Gh) r1)
            goto L_0x01d4
        L_0x014e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r1 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.qqa r1 = (com.google.android.gms.internal.ads.C2462qqa) r1
            r0.a((com.google.android.gms.internal.ads.C2462qqa) r1)
            goto L_0x01d4
        L_0x015b:
            com.google.android.gms.internal.ads.qqa r1 = r0.Qb()
        L_0x015f:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r3, r1)
            goto L_0x01e2
        L_0x0167:
            r0.Pa()
            goto L_0x01d4
        L_0x016c:
            r0.rb()
            goto L_0x01d4
        L_0x0171:
            r0.showInterstitial()
            goto L_0x01d4
        L_0x0175:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x017c
            goto L_0x018f
        L_0x017c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2322ora
            if (r4 == 0) goto L_0x018a
            r4 = r2
            com.google.android.gms.internal.ads.ora r4 = (com.google.android.gms.internal.ads.C2322ora) r4
            goto L_0x018f
        L_0x018a:
            com.google.android.gms.internal.ads.qra r4 = new com.google.android.gms.internal.ads.qra
            r4.<init>(r1)
        L_0x018f:
            r0.a((com.google.android.gms.internal.ads.C2322ora) r4)
            goto L_0x01d4
        L_0x0193:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x019a
            goto L_0x01ad
        L_0x019a:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.Tqa
            if (r4 == 0) goto L_0x01a8
            r4 = r2
            com.google.android.gms.internal.ads.Tqa r4 = (com.google.android.gms.internal.ads.Tqa) r4
            goto L_0x01ad
        L_0x01a8:
            com.google.android.gms.internal.ads.Vqa r4 = new com.google.android.gms.internal.ads.Vqa
            r4.<init>(r1)
        L_0x01ad:
            r0.b((com.google.android.gms.internal.ads.Tqa) r4)
            goto L_0x01d4
        L_0x01b1:
            r0.X()
            goto L_0x01d4
        L_0x01b5:
            r0.pause()
            goto L_0x01d4
        L_0x01b9:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r1 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.nqa r1 = (com.google.android.gms.internal.ads.C2249nqa) r1
            boolean r1 = r0.a((com.google.android.gms.internal.ads.C2249nqa) r1)
            goto L_0x01ca
        L_0x01c6:
            boolean r1 = r0.t()
        L_0x01ca:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x01e2
        L_0x01d1:
            r0.destroy()
        L_0x01d4:
            r3.writeNoException()
            goto L_0x01e2
        L_0x01d8:
            c.b.b.b.c.a r1 = r0.Ca()
        L_0x01dc:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x01e2:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1684fra.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
