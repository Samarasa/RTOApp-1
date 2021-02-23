package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hi  reason: case insensitive filesystem */
public abstract class C1807hi extends C2587sia implements C1524di {
    public C1807hi() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ji] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.li] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.li] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.li] */
    /* JADX WARNING: type inference failed for: r1v21, types: [com.google.android.gms.internal.ads.li] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x00ce
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L_0x00a5
            r0 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r0) goto L_0x0081
            r0 = 5
            if (r4 == r0) goto L_0x005d
            r0 = 6
            if (r4 == r0) goto L_0x0038
            r0 = 7
            if (r4 == r0) goto L_0x0017
            r4 = 0
            return r4
        L_0x0017:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0022
            goto L_0x0033
        L_0x0022:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2090li
            if (r1 == 0) goto L_0x002e
            r1 = r0
            com.google.android.gms.internal.ads.li r1 = (com.google.android.gms.internal.ads.C2090li) r1
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.ni r1 = new com.google.android.gms.internal.ads.ni
            r1.<init>(r5)
        L_0x0033:
            r3.a((java.lang.String) r4, (com.google.android.gms.internal.ads.C2090li) r1)
            goto L_0x00ca
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.ri> r4 = com.google.android.gms.internal.ads.C2515ri.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.ri r4 = (com.google.android.gms.internal.ads.C2515ri) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2090li
            if (r1 == 0) goto L_0x0053
            r1 = r0
            com.google.android.gms.internal.ads.li r1 = (com.google.android.gms.internal.ads.C2090li) r1
            goto L_0x0058
        L_0x0053:
            com.google.android.gms.internal.ads.ni r1 = new com.google.android.gms.internal.ads.ni
            r1.<init>(r5)
        L_0x0058:
            r3.b(r4, r1)
            goto L_0x00ca
        L_0x005d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.ri> r4 = com.google.android.gms.internal.ads.C2515ri.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.ri r4 = (com.google.android.gms.internal.ads.C2515ri) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x006c
            goto L_0x007d
        L_0x006c:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2090li
            if (r1 == 0) goto L_0x0078
            r1 = r0
            com.google.android.gms.internal.ads.li r1 = (com.google.android.gms.internal.ads.C2090li) r1
            goto L_0x007d
        L_0x0078:
            com.google.android.gms.internal.ads.ni r1 = new com.google.android.gms.internal.ads.ni
            r1.<init>(r5)
        L_0x007d:
            r3.c(r4, r1)
            goto L_0x00ca
        L_0x0081:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.ri> r4 = com.google.android.gms.internal.ads.C2515ri.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.ri r4 = (com.google.android.gms.internal.ads.C2515ri) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2090li
            if (r1 == 0) goto L_0x009c
            r1 = r0
            com.google.android.gms.internal.ads.li r1 = (com.google.android.gms.internal.ads.C2090li) r1
            goto L_0x00a1
        L_0x009c:
            com.google.android.gms.internal.ads.ni r1 = new com.google.android.gms.internal.ads.ni
            r1.<init>(r5)
        L_0x00a1:
            r3.a((com.google.android.gms.internal.ads.C2515ri) r4, (com.google.android.gms.internal.ads.C2090li) r1)
            goto L_0x00ca
        L_0x00a5:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Yh> r4 = com.google.android.gms.internal.ads.C1197Yh.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.Yh r4 = (com.google.android.gms.internal.ads.C1197Yh) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x00b4
            goto L_0x00c7
        L_0x00b4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C1948ji
            if (r1 == 0) goto L_0x00c2
            r1 = r0
            com.google.android.gms.internal.ads.ji r1 = (com.google.android.gms.internal.ads.C1948ji) r1
            goto L_0x00c7
        L_0x00c2:
            com.google.android.gms.internal.ads.ii r1 = new com.google.android.gms.internal.ads.ii
            r1.<init>(r5)
        L_0x00c7:
            r3.a((com.google.android.gms.internal.ads.C1197Yh) r4, (com.google.android.gms.internal.ads.C1948ji) r1)
        L_0x00ca:
            r6.writeNoException()
            goto L_0x00e0
        L_0x00ce:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.Yh> r4 = com.google.android.gms.internal.ads.C1197Yh.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.Yh r4 = (com.google.android.gms.internal.ads.C1197Yh) r4
            com.google.android.gms.internal.ads._h r4 = r3.a(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.b(r6, r4)
        L_0x00e0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1807hi.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
