package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Fg  reason: case insensitive filesystem */
public abstract class C0702Fg extends C2587sia implements C0624Cg {
    public C0702Fg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static C0624Cg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof C0624Cg ? (C0624Cg) queryLocalInterface : new C0676Eg(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [com.google.android.gms.internal.ads.qg] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.xg] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.vg] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.vg] */
    /* JADX WARNING: type inference failed for: r2v17, types: [com.google.android.gms.internal.ads.Dg] */
    /* JADX WARNING: type inference failed for: r2v18, types: [com.google.android.gms.internal.ads.Bg] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.google.android.gms.internal.ads.Bg] */
    /* JADX WARNING: type inference failed for: r2v23, types: [com.google.android.gms.internal.ads.yg] */
    /* JADX WARNING: type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.wg] */
    /* JADX WARNING: type inference failed for: r5v13, types: [com.google.android.gms.internal.ads.wg] */
    /* JADX WARNING: type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.Dg] */
    /* JADX WARNING: type inference failed for: r2v29, types: [com.google.android.gms.internal.ads.Bg] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.Bg] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        r16.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r9, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) {
        /*
            r13 = this;
            r8 = r13
            r0 = r14
            r1 = r15
            r9 = r16
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L_0x01f3
            r3 = 2
            if (r0 == r3) goto L_0x01e8
            r3 = 3
            if (r0 == r3) goto L_0x01e3
            r3 = 5
            if (r0 == r3) goto L_0x01d8
            r3 = 10
            if (r0 == r3) goto L_0x01c8
            r3 = 11
            if (r0 == r3) goto L_0x01b8
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            switch(r0) {
                case 13: goto L_0x0167;
                case 14: goto L_0x011f;
                case 15: goto L_0x010b;
                case 16: goto L_0x00c5;
                case 17: goto L_0x00b8;
                case 18: goto L_0x0070;
                case 19: goto L_0x0067;
                case 20: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            java.lang.String r4 = r15.readString()
            java.lang.String r5 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r0 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r6 = r0
            com.google.android.gms.internal.ads.nqa r6 = (com.google.android.gms.internal.ads.C2249nqa) r6
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r7 = c.b.b.b.c.a.C0060a.a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            r11 = r2
            goto L_0x0053
        L_0x0042:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C0598Bg
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Bg r2 = (com.google.android.gms.internal.ads.C0598Bg) r2
            goto L_0x0040
        L_0x004d:
            com.google.android.gms.internal.ads.Dg r2 = new com.google.android.gms.internal.ads.Dg
            r2.<init>(r0)
            goto L_0x0040
        L_0x0053:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.Kf r12 = com.google.android.gms.internal.ads.C0909Nf.a(r0)
            r0 = r13
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.b(r1, r2, r3, r4, r5, r6)
            goto L_0x01d3
        L_0x0067:
            java.lang.String r0 = r15.readString()
            r13.k(r0)
            goto L_0x01d3
        L_0x0070:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r0 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.nqa r5 = (com.google.android.gms.internal.ads.C2249nqa) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r6 = c.b.b.b.c.a.C0060a.a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0091
        L_0x008f:
            r7 = r2
            goto L_0x00a4
        L_0x0091:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.C2866wg
            if (r7 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.wg r2 = (com.google.android.gms.internal.ads.C2866wg) r2
            goto L_0x008f
        L_0x009e:
            com.google.android.gms.internal.ads.yg r2 = new com.google.android.gms.internal.ads.yg
            r2.<init>(r0)
            goto L_0x008f
        L_0x00a4:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.Kf r11 = com.google.android.gms.internal.ads.C0909Nf.a(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.C2249nqa) r3, (c.b.b.b.c.a) r4, (com.google.android.gms.internal.ads.C2866wg) r5, (com.google.android.gms.internal.ads.C0831Kf) r6)
            goto L_0x01d3
        L_0x00b8:
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r0 = c.b.b.b.c.a.C0060a.a(r0)
            boolean r0 = r13.L(r0)
            goto L_0x0117
        L_0x00c5:
            java.lang.String r4 = r15.readString()
            java.lang.String r5 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r0 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r6 = r0
            com.google.android.gms.internal.ads.nqa r6 = (com.google.android.gms.internal.ads.C2249nqa) r6
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r7 = c.b.b.b.c.a.C0060a.a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x00e6
        L_0x00e4:
            r11 = r2
            goto L_0x00f7
        L_0x00e6:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C0598Bg
            if (r3 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.Bg r2 = (com.google.android.gms.internal.ads.C0598Bg) r2
            goto L_0x00e4
        L_0x00f1:
            com.google.android.gms.internal.ads.Dg r2 = new com.google.android.gms.internal.ads.Dg
            r2.<init>(r0)
            goto L_0x00e4
        L_0x00f7:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.Kf r12 = com.google.android.gms.internal.ads.C0909Nf.a(r0)
            r0 = r13
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.C2249nqa) r3, (c.b.b.b.c.a) r4, (com.google.android.gms.internal.ads.C0598Bg) r5, (com.google.android.gms.internal.ads.C0831Kf) r6)
            goto L_0x01d3
        L_0x010b:
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r0 = c.b.b.b.c.a.C0060a.a(r0)
            boolean r0 = r13.p(r0)
        L_0x0117:
            r16.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r9, (boolean) r0)
            goto L_0x0240
        L_0x011f:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r0 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.nqa r5 = (com.google.android.gms.internal.ads.C2249nqa) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r6 = c.b.b.b.c.a.C0060a.a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0140
        L_0x013e:
            r7 = r2
            goto L_0x0153
        L_0x0140:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.C2795vg
            if (r7 == 0) goto L_0x014d
            com.google.android.gms.internal.ads.vg r2 = (com.google.android.gms.internal.ads.C2795vg) r2
            goto L_0x013e
        L_0x014d:
            com.google.android.gms.internal.ads.xg r2 = new com.google.android.gms.internal.ads.xg
            r2.<init>(r0)
            goto L_0x013e
        L_0x0153:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.Kf r11 = com.google.android.gms.internal.ads.C0909Nf.a(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.C2249nqa) r3, (c.b.b.b.c.a) r4, (com.google.android.gms.internal.ads.C2795vg) r5, (com.google.android.gms.internal.ads.C0831Kf) r6)
            goto L_0x01d3
        L_0x0167:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.nqa> r0 = com.google.android.gms.internal.ads.C2249nqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.nqa r5 = (com.google.android.gms.internal.ads.C2249nqa) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r6 = c.b.b.b.c.a.C0060a.a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0188
        L_0x0186:
            r7 = r2
            goto L_0x019b
        L_0x0188:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.C2441qg
            if (r7 == 0) goto L_0x0195
            com.google.android.gms.internal.ads.qg r2 = (com.google.android.gms.internal.ads.C2441qg) r2
            goto L_0x0186
        L_0x0195:
            com.google.android.gms.internal.ads.sg r2 = new com.google.android.gms.internal.ads.sg
            r2.<init>(r0)
            goto L_0x0186
        L_0x019b:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.Kf r11 = com.google.android.gms.internal.ads.C0909Nf.a(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r0 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r12 = r0
            com.google.android.gms.internal.ads.qqa r12 = (com.google.android.gms.internal.ads.C2462qqa) r12
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r7 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01d3
        L_0x01b8:
            java.lang.String[] r0 = r15.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r1 = r15.createTypedArray(r2)
            android.os.Bundle[] r1 = (android.os.Bundle[]) r1
            r13.a(r0, r1)
            goto L_0x01d3
        L_0x01c8:
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r0 = c.b.b.b.c.a.C0060a.a(r0)
            r13.m(r0)
        L_0x01d3:
            r16.writeNoException()
            goto L_0x0240
        L_0x01d8:
            com.google.android.gms.internal.ads.Sra r0 = r13.getVideoController()
            r16.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r9, (android.os.IInterface) r0)
            goto L_0x0240
        L_0x01e3:
            com.google.android.gms.internal.ads.Rg r0 = r13.ta()
            goto L_0x01ec
        L_0x01e8:
            com.google.android.gms.internal.ads.Rg r0 = r13.ua()
        L_0x01ec:
            r16.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r9, r0)
            goto L_0x0240
        L_0x01f3:
            android.os.IBinder r0 = r15.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r0)
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r5 = r0
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.qqa> r0 = com.google.android.gms.internal.ads.C2462qqa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r15, r0)
            r7 = r0
            com.google.android.gms.internal.ads.qqa r7 = (com.google.android.gms.internal.ads.C2462qqa) r7
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0222
            r11 = r2
            goto L_0x0235
        L_0x0222:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C0754Hg
            if (r2 == 0) goto L_0x022f
            com.google.android.gms.internal.ads.Hg r1 = (com.google.android.gms.internal.ads.C0754Hg) r1
            goto L_0x0234
        L_0x022f:
            com.google.android.gms.internal.ads.Jg r1 = new com.google.android.gms.internal.ads.Jg
            r1.<init>(r0)
        L_0x0234:
            r11 = r1
        L_0x0235:
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.a((c.b.b.b.c.a) r1, (java.lang.String) r2, (android.os.Bundle) r3, (android.os.Bundle) r4, (com.google.android.gms.internal.ads.C2462qqa) r5, (com.google.android.gms.internal.ads.C0754Hg) r6)
            goto L_0x01d3
        L_0x0240:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0702Fg.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
