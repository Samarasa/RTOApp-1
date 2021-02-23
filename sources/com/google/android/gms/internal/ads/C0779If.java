package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.If  reason: case insensitive filesystem */
public abstract class C0779If extends C2587sia implements C0805Jf {
    public C0779If() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0106, code lost:
        r12.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.b(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        r12.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0232, code lost:
        r12.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026a, code lost:
        r12.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            r13 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            switch(r10) {
                case 1: goto L_0x0271;
                case 2: goto L_0x0266;
                case 3: goto L_0x0237;
                case 4: goto L_0x022f;
                case 5: goto L_0x022b;
                case 6: goto L_0x01ea;
                case 7: goto L_0x01b2;
                case 8: goto L_0x01ad;
                case 9: goto L_0x01a8;
                case 10: goto L_0x0181;
                case 11: goto L_0x0170;
                case 12: goto L_0x016b;
                case 13: goto L_0x015f;
                case 14: goto L_0x011a;
                case 15: goto L_0x0114;
                case 16: goto L_0x010e;
                case 17: goto L_0x0102;
                case 18: goto L_0x00fd;
                case 19: goto L_0x00f8;
                case 20: goto L_0x00e3;
                case 21: goto L_0x00d6;
                case 22: goto L_0x00d0;
                case 23: goto L_0x00b7;
                case 24: goto L_0x00b1;
                case 25: goto L_0x00a8;
                case 26: goto L_0x00a2;
                case 27: goto L_0x009c;
                case 28: goto L_0x006c;
                case 29: goto L_0x0006;
                case 30: goto L_0x005f;
                case 31: goto L_0x0044;
                case 32: goto L_0x0014;
                case 33: goto L_0x000e;
                case 34: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            com.google.android.gms.internal.ads.Rg r10 = r9.ta()
            goto L_0x0106
        L_0x000e:
            com.google.android.gms.internal.ads.Rg r10 = r9.ua()
            goto L_0x0106
        L_0x0014:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r1 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.nqa r1 = (com.google.android.gms.internal.ads.C2249nqa) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x002f
            goto L_0x003f
        L_0x002f:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r0 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x003f
        L_0x003a:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r11)
        L_0x003f:
            r9.c(r10, r1, r2, r13)
            goto L_0x0232
        L_0x0044:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.Bd r13 = com.google.android.gms.internal.ads.C0569Ad.a(r13)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Jd> r0 = com.google.android.gms.internal.ads.C0803Jd.CREATOR
            java.util.ArrayList r11 = r11.createTypedArrayList(r0)
            r9.a((c.b.b.b.c.a) r10, (com.google.android.gms.internal.ads.C0595Bd) r13, (java.util.List<com.google.android.gms.internal.ads.C0803Jd>) r11)
            goto L_0x0232
        L_0x005f:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            r9.K(r10)
            goto L_0x0232
        L_0x006c:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r1 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.nqa r1 = (com.google.android.gms.internal.ads.C2249nqa) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r0 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x0097
        L_0x0092:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r11)
        L_0x0097:
            r9.b(r10, r1, r2, r13)
            goto L_0x0232
        L_0x009c:
            com.google.android.gms.internal.ads.Yf r10 = r9.Ba()
            goto L_0x026a
        L_0x00a2:
            com.google.android.gms.internal.ads.Sra r10 = r9.getVideoController()
            goto L_0x026a
        L_0x00a8:
            boolean r10 = com.google.android.gms.internal.ads.C2516ria.a(r11)
            r9.b(r10)
            goto L_0x0232
        L_0x00b1:
            com.google.android.gms.internal.ads.Hb r10 = r9.Oa()
            goto L_0x026a
        L_0x00b7:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.cj r13 = com.google.android.gms.internal.ads.C1667fj.a(r13)
            java.util.ArrayList r11 = r11.createStringArrayList()
            r9.a((c.b.b.b.c.a) r10, (com.google.android.gms.internal.ads.C1455cj) r13, (java.util.List<java.lang.String>) r11)
            goto L_0x0232
        L_0x00d0:
            boolean r10 = r9._a()
            goto L_0x0163
        L_0x00d6:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            r9.y(r10)
            goto L_0x0232
        L_0x00e3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.nqa r10 = (com.google.android.gms.internal.ads.C2249nqa) r10
            java.lang.String r13 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.a((com.google.android.gms.internal.ads.C2249nqa) r10, (java.lang.String) r13, (java.lang.String) r11)
            goto L_0x0232
        L_0x00f8:
            android.os.Bundle r10 = r9.ib()
            goto L_0x0106
        L_0x00fd:
            android.os.Bundle r10 = r9.getInterstitialAdapterInfo()
            goto L_0x0106
        L_0x0102:
            android.os.Bundle r10 = r9.zzug()
        L_0x0106:
            r12.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r12, r10)
            goto L_0x02ae
        L_0x010e:
            com.google.android.gms.internal.ads.Sf r10 = r9.kb()
            goto L_0x026a
        L_0x0114:
            com.google.android.gms.internal.ads.Rf r10 = r9.xb()
            goto L_0x026a
        L_0x011a:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.nqa r3 = (com.google.android.gms.internal.ads.C2249nqa) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x013b
        L_0x0139:
            r6 = r13
            goto L_0x014c
        L_0x013b:
            android.os.IInterface r13 = r10.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r0 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x0139
        L_0x0146:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r10)
            goto L_0x0139
        L_0x014c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.bb> r10 = com.google.android.gms.internal.ads.C1368bb.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r7 = r10
            com.google.android.gms.internal.ads.bb r7 = (com.google.android.gms.internal.ads.C1368bb) r7
            java.util.ArrayList r8 = r11.createStringArrayList()
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0232
        L_0x015f:
            boolean r10 = r9.isInitialized()
        L_0x0163:
            r12.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r12, (boolean) r10)
            goto L_0x02ae
        L_0x016b:
            r9.showVideo()
            goto L_0x0232
        L_0x0170:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.nqa r10 = (com.google.android.gms.internal.ads.C2249nqa) r10
            java.lang.String r11 = r11.readString()
            r9.a(r10, r11)
            goto L_0x0232
        L_0x0181:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r2 = r10
            com.google.android.gms.internal.ads.nqa r2 = (com.google.android.gms.internal.ads.C2249nqa) r2
            java.lang.String r3 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.cj r4 = com.google.android.gms.internal.ads.C1667fj.a(r10)
            java.lang.String r5 = r11.readString()
            r0 = r9
            r0.a((c.b.b.b.c.a) r1, (com.google.android.gms.internal.ads.C2249nqa) r2, (java.lang.String) r3, (com.google.android.gms.internal.ads.C1455cj) r4, (java.lang.String) r5)
            goto L_0x0232
        L_0x01a8:
            r9.X()
            goto L_0x0232
        L_0x01ad:
            r9.pause()
            goto L_0x0232
        L_0x01b2:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.nqa r3 = (com.google.android.gms.internal.ads.C2249nqa) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x01d3
        L_0x01d1:
            r6 = r13
            goto L_0x01e5
        L_0x01d3:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r13 == 0) goto L_0x01df
            r13 = r11
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x01d1
        L_0x01df:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r10)
            goto L_0x01d1
        L_0x01e5:
            r1 = r9
            r1.a((c.b.b.b.c.a) r2, (com.google.android.gms.internal.ads.C2249nqa) r3, (java.lang.String) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.C0831Kf) r6)
            goto L_0x0232
        L_0x01ea:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r10 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.qqa r3 = (com.google.android.gms.internal.ads.C2462qqa) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.nqa r4 = (com.google.android.gms.internal.ads.C2249nqa) r4
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0214
        L_0x0212:
            r7 = r13
            goto L_0x0226
        L_0x0214:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r13 == 0) goto L_0x0220
            r13 = r11
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x0212
        L_0x0220:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r10)
            goto L_0x0212
        L_0x0226:
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7)
            goto L_0x0232
        L_0x022b:
            r9.destroy()
            goto L_0x0232
        L_0x022f:
            r9.showInterstitial()
        L_0x0232:
            r12.writeNoException()
            goto L_0x02ae
        L_0x0237:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r10 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r1 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.nqa r1 = (com.google.android.gms.internal.ads.C2249nqa) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x0252
            goto L_0x0262
        L_0x0252:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r0 == 0) goto L_0x025d
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x0262
        L_0x025d:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r11)
        L_0x0262:
            r9.a(r10, r1, r2, r13)
            goto L_0x0232
        L_0x0266:
            c.b.b.b.c.a r10 = r9.Lb()
        L_0x026a:
            r12.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02ae
        L_0x0271:
            android.os.IBinder r10 = r11.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r10 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.qqa r3 = (com.google.android.gms.internal.ads.C2462qqa) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r10 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.nqa r4 = (com.google.android.gms.internal.ads.C2249nqa) r4
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0297
        L_0x0295:
            r6 = r13
            goto L_0x02a9
        L_0x0297:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.C0831Kf
            if (r13 == 0) goto L_0x02a3
            r13 = r11
            com.google.android.gms.internal.ads.Kf r13 = (com.google.android.gms.internal.ads.C0831Kf) r13
            goto L_0x0295
        L_0x02a3:
            com.google.android.gms.internal.ads.Mf r13 = new com.google.android.gms.internal.ads.Mf
            r13.<init>(r10)
            goto L_0x0295
        L_0x02a9:
            r1 = r9
            r1.a((c.b.b.b.c.a) r2, (com.google.android.gms.internal.ads.C2462qqa) r3, (com.google.android.gms.internal.ads.C2249nqa) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.C0831Kf) r6)
            goto L_0x0232
        L_0x02ae:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0779If.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
