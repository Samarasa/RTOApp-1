package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qf  reason: case insensitive filesystem */
public abstract class C0987Qf extends C2587sia implements C1013Rf {
    public C0987Qf() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00ba;
                case 3: goto L_0x00af;
                case 4: goto L_0x00aa;
                case 5: goto L_0x009f;
                case 6: goto L_0x009a;
                case 7: goto L_0x008f;
                case 8: goto L_0x008a;
                case 9: goto L_0x0085;
                case 10: goto L_0x007e;
                case 11: goto L_0x0072;
                case 12: goto L_0x0066;
                case 13: goto L_0x005b;
                case 14: goto L_0x0056;
                case 15: goto L_0x004a;
                case 16: goto L_0x003e;
                case 17: goto L_0x0039;
                case 18: goto L_0x0033;
                case 19: goto L_0x002d;
                case 20: goto L_0x0027;
                case 21: goto L_0x0021;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            android.os.IBinder r4 = r2.readStrongBinder()
            c.b.b.b.c.a r4 = c.b.b.b.c.a.C0060a.a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r2)
            r0.a(r1, r4, r2)
            goto L_0x0081
        L_0x0021:
            c.b.b.b.c.a r1 = r0.w()
            goto L_0x00a3
        L_0x0027:
            c.b.b.b.c.a r1 = r0.Z()
            goto L_0x00a3
        L_0x002d:
            com.google.android.gms.internal.ads.eb r1 = r0.x()
            goto L_0x00a3
        L_0x0033:
            c.b.b.b.c.a r1 = r0.ba()
            goto L_0x00a3
        L_0x0039:
            com.google.android.gms.internal.ads.Sra r1 = r0.getVideoController()
            goto L_0x00a3
        L_0x003e:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            r0.a(r1)
            goto L_0x0081
        L_0x004a:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r3, r1)
            goto L_0x00c4
        L_0x0056:
            boolean r1 = r0.ga()
            goto L_0x005f
        L_0x005b:
            boolean r1 = r0.aa()
        L_0x005f:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x00c4
        L_0x0066:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            r0.d(r1)
            goto L_0x0081
        L_0x0072:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            r0.b(r1)
            goto L_0x0081
        L_0x007e:
            r0.z()
        L_0x0081:
            r3.writeNoException()
            goto L_0x00c4
        L_0x0085:
            java.lang.String r1 = r0.E()
            goto L_0x00be
        L_0x008a:
            java.lang.String r1 = r0.S()
            goto L_0x00be
        L_0x008f:
            double r1 = r0.G()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00c4
        L_0x009a:
            java.lang.String r1 = r0.s()
            goto L_0x00be
        L_0x009f:
            com.google.android.gms.internal.ads.lb r1 = r0.U()
        L_0x00a3:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x00c4
        L_0x00aa:
            java.lang.String r1 = r0.v()
            goto L_0x00be
        L_0x00af:
            java.util.List r1 = r0.y()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r1 = r0.r()
        L_0x00be:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00c4:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0987Qf.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
