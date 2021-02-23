package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jc  reason: case insensitive filesystem */
public abstract class C1936jc extends C2587sia implements C2007kc {
    public C1936jc() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        r3.writeNoException();
        r3.writeList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x010b;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00db;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00d1;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00c7;
                case 13: goto L_0x00c0;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00af;
                case 16: goto L_0x009b;
                case 17: goto L_0x008f;
                case 18: goto L_0x008a;
                case 19: goto L_0x0084;
                case 20: goto L_0x0078;
                case 21: goto L_0x0058;
                case 22: goto L_0x0053;
                case 23: goto L_0x004d;
                case 24: goto L_0x0048;
                case 25: goto L_0x003b;
                case 26: goto L_0x002e;
                case 27: goto L_0x0029;
                case 28: goto L_0x0024;
                case 29: goto L_0x001e;
                case 30: goto L_0x0018;
                case 31: goto L_0x0012;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Mra r1 = com.google.android.gms.internal.ads.Lra.a(r1)
            r0.a((com.google.android.gms.internal.ads.Mra) r1)
            goto L_0x00c3
        L_0x0012:
            com.google.android.gms.internal.ads.Nra r1 = r0.A()
            goto L_0x00f4
        L_0x0018:
            boolean r1 = r0.T()
            goto L_0x00a7
        L_0x001e:
            com.google.android.gms.internal.ads.hb r1 = r0.ja()
            goto L_0x00f4
        L_0x0024:
            r0.Rb()
            goto L_0x00c3
        L_0x0029:
            r0.D()
            goto L_0x00c3
        L_0x002e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zra r1 = com.google.android.gms.internal.ads.Dra.a(r1)
            r0.a((com.google.android.gms.internal.ads.C3102zra) r1)
            goto L_0x00c3
        L_0x003b:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Era r1 = com.google.android.gms.internal.ads.Gra.a(r1)
            r0.a((com.google.android.gms.internal.ads.Era) r1)
            goto L_0x00c3
        L_0x0048:
            boolean r1 = r0.Va()
            goto L_0x00a7
        L_0x004d:
            java.util.List r1 = r0.vb()
            goto L_0x0104
        L_0x0053:
            r0.C()
            goto L_0x00c3
        L_0x0058:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0060
            r1 = 0
            goto L_0x0074
        L_0x0060:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1724gc
            if (r4 == 0) goto L_0x006e
            r1 = r2
            com.google.android.gms.internal.ads.gc r1 = (com.google.android.gms.internal.ads.C1724gc) r1
            goto L_0x0074
        L_0x006e:
            com.google.android.gms.internal.ads.ic r2 = new com.google.android.gms.internal.ads.ic
            r2.<init>(r1)
            r1 = r2
        L_0x0074:
            r0.a((com.google.android.gms.internal.ads.C1724gc) r1)
            goto L_0x00c3
        L_0x0078:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r3, r1)
            goto L_0x0115
        L_0x0084:
            c.b.b.b.c.a r1 = r0.w()
            goto L_0x00f4
        L_0x008a:
            c.b.b.b.c.a r1 = r0.B()
            goto L_0x00f4
        L_0x008f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.f(r1)
            goto L_0x00c3
        L_0x009b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.e(r1)
        L_0x00a7:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x0115
        L_0x00af:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.d(r1)
            goto L_0x00c3
        L_0x00bb:
            com.google.android.gms.internal.ads.eb r1 = r0.x()
            goto L_0x00f4
        L_0x00c0:
            r0.destroy()
        L_0x00c3:
            r3.writeNoException()
            goto L_0x0115
        L_0x00c7:
            java.lang.String r1 = r0.o()
            goto L_0x010f
        L_0x00cc:
            com.google.android.gms.internal.ads.Sra r1 = r0.getVideoController()
            goto L_0x00f4
        L_0x00d1:
            java.lang.String r1 = r0.E()
            goto L_0x010f
        L_0x00d6:
            java.lang.String r1 = r0.S()
            goto L_0x010f
        L_0x00db:
            double r1 = r0.G()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x0115
        L_0x00e6:
            java.lang.String r1 = r0.R()
            goto L_0x010f
        L_0x00eb:
            java.lang.String r1 = r0.s()
            goto L_0x010f
        L_0x00f0:
            com.google.android.gms.internal.ads.lb r1 = r0.U()
        L_0x00f4:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0115
        L_0x00fb:
            java.lang.String r1 = r0.v()
            goto L_0x010f
        L_0x0100:
            java.util.List r1 = r0.y()
        L_0x0104:
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0115
        L_0x010b:
            java.lang.String r1 = r0.r()
        L_0x010f:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0115:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1936jc.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
