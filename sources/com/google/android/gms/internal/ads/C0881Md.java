package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Md  reason: case insensitive filesystem */
public abstract class C0881Md extends C2587sia implements C0907Nd {
    public C0881Md() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 3
            if (r2 == r5) goto L_0x0051
            r5 = 4
            if (r2 == r5) goto L_0x004a
            r5 = 5
            if (r2 == r5) goto L_0x0022
            r5 = 6
            if (r2 == r5) goto L_0x0016
            r3 = 7
            if (r2 == r3) goto L_0x0011
            r2 = 0
            return r2
        L_0x0011:
            com.google.android.gms.internal.ads.hb r2 = r1.ja()
            goto L_0x0055
        L_0x0016:
            android.os.IBinder r2 = r3.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r2)
            r1.C(r2)
            goto L_0x004d
        L_0x0022:
            android.os.IBinder r2 = r3.readStrongBinder()
            c.b.b.b.c.a r2 = c.b.b.b.c.a.C0060a.a(r2)
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0032
            r3 = 0
            goto L_0x0046
        L_0x0032:
            java.lang.String r5 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C0933Od
            if (r0 == 0) goto L_0x0040
            r3 = r5
            com.google.android.gms.internal.ads.Od r3 = (com.google.android.gms.internal.ads.C0933Od) r3
            goto L_0x0046
        L_0x0040:
            com.google.android.gms.internal.ads.Pd r5 = new com.google.android.gms.internal.ads.Pd
            r5.<init>(r3)
            r3 = r5
        L_0x0046:
            r1.a(r2, r3)
            goto L_0x004d
        L_0x004a:
            r1.destroy()
        L_0x004d:
            r4.writeNoException()
            goto L_0x005b
        L_0x0051:
            com.google.android.gms.internal.ads.Sra r2 = r1.getVideoController()
        L_0x0055:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r4, (android.os.IInterface) r2)
        L_0x005b:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0881Md.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
