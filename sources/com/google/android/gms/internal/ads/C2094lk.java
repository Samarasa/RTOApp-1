package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lk  reason: case insensitive filesystem */
public abstract class C2094lk extends C2587sia implements C1952jk {
    public C2094lk() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        r5.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r5, (android.os.IInterface) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        r5.writeNoException();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x007c;
                case 2: goto L_0x006d;
                case 3: goto L_0x0052;
                case 4: goto L_0x0045;
                case 5: goto L_0x002b;
                case 6: goto L_0x0011;
                case 7: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Rh> r3 = com.google.android.gms.internal.ads.C1015Rh.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, r3)
            com.google.android.gms.internal.ads.Rh r3 = (com.google.android.gms.internal.ads.C1015Rh) r3
            r2.a(r3)
            goto L_0x0078
        L_0x0011:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            c.b.b.b.c.a r6 = c.b.b.b.c.a.C0060a.a(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.Mh r4 = com.google.android.gms.internal.ads.C0963Ph.a(r4)
            r2.b(r3, r6, r4)
            goto L_0x0078
        L_0x002b:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            c.b.b.b.c.a r6 = c.b.b.b.c.a.C0060a.a(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.Mh r4 = com.google.android.gms.internal.ads.C0963Ph.a(r4)
            r2.a((java.util.List<android.net.Uri>) r3, (c.b.b.b.c.a) r6, (com.google.android.gms.internal.ads.C0885Mh) r4)
            goto L_0x0078
        L_0x0045:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            c.b.b.b.c.a r3 = r2.f(r3)
            goto L_0x0066
        L_0x0052:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            android.os.IBinder r4 = r4.readStrongBinder()
            c.b.b.b.c.a r4 = c.b.b.b.c.a.C0060a.a(r4)
            c.b.b.b.c.a r3 = r2.c(r3, r4)
        L_0x0066:
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x00ac
        L_0x006d:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            r2.s(r3)
        L_0x0078:
            r5.writeNoException()
            goto L_0x00ac
        L_0x007c:
            android.os.IBinder r3 = r4.readStrongBinder()
            c.b.b.b.c.a r3 = c.b.b.b.c.a.C0060a.a(r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.mk> r6 = com.google.android.gms.internal.ads.C2165mk.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, r6)
            com.google.android.gms.internal.ads.mk r6 = (com.google.android.gms.internal.ads.C2165mk) r6
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x0094
            r4 = 0
            goto L_0x00a8
        L_0x0094:
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C1881ik
            if (r1 == 0) goto L_0x00a2
            r4 = r0
            com.google.android.gms.internal.ads.ik r4 = (com.google.android.gms.internal.ads.C1881ik) r4
            goto L_0x00a8
        L_0x00a2:
            com.google.android.gms.internal.ads.kk r0 = new com.google.android.gms.internal.ads.kk
            r0.<init>(r4)
            r4 = r0
        L_0x00a8:
            r2.a((c.b.b.b.c.a) r3, (com.google.android.gms.internal.ads.C2165mk) r6, (com.google.android.gms.internal.ads.C1881ik) r4)
            goto L_0x0078
        L_0x00ac:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2094lk.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
