package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.pqa  reason: case insensitive filesystem */
public final class C2391pqa implements Parcelable.Creator<C2249nqa> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r32) {
        /*
            r31 = this;
            r0 = r32
            int r1 = com.google.android.gms.common.internal.a.b.b(r32)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r3
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r29 = r28
            r8 = r4
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
            r30 = 0
        L_0x0030:
            int r2 = r32.dataPosition()
            if (r2 >= r1) goto L_0x00d0
            int r2 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r32)
            int r3 = com.google.android.gms.common.internal.a.b.a((int) r2)
            switch(r3) {
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00be;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00a2;
                case 9: goto L_0x009d;
                case 10: goto L_0x0092;
                case 11: goto L_0x0087;
                case 12: goto L_0x0082;
                case 13: goto L_0x007d;
                case 14: goto L_0x0078;
                case 15: goto L_0x0073;
                case 16: goto L_0x006e;
                case 17: goto L_0x0069;
                case 18: goto L_0x0064;
                case 19: goto L_0x0059;
                case 20: goto L_0x0054;
                case 21: goto L_0x004f;
                case 22: goto L_0x004a;
                case 23: goto L_0x0045;
                default: goto L_0x0041;
            }
        L_0x0041:
            com.google.android.gms.common.internal.a.b.r(r0, r2)
            goto L_0x0030
        L_0x0045:
            int r30 = com.google.android.gms.common.internal.a.b.n(r0, r2)
            goto L_0x0030
        L_0x004a:
            java.util.ArrayList r29 = com.google.android.gms.common.internal.a.b.f(r0, r2)
            goto L_0x0030
        L_0x004f:
            java.lang.String r28 = com.google.android.gms.common.internal.a.b.d(r0, r2)
            goto L_0x0030
        L_0x0054:
            int r27 = com.google.android.gms.common.internal.a.b.n(r0, r2)
            goto L_0x0030
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.fqa> r3 = com.google.android.gms.internal.ads.C1682fqa.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r0, (int) r2, r3)
            r26 = r2
            com.google.android.gms.internal.ads.fqa r26 = (com.google.android.gms.internal.ads.C1682fqa) r26
            goto L_0x0030
        L_0x0064:
            boolean r25 = com.google.android.gms.common.internal.a.b.h(r0, r2)
            goto L_0x0030
        L_0x0069:
            java.lang.String r24 = com.google.android.gms.common.internal.a.b.d(r0, r2)
            goto L_0x0030
        L_0x006e:
            java.lang.String r23 = com.google.android.gms.common.internal.a.b.d(r0, r2)
            goto L_0x0030
        L_0x0073:
            java.util.ArrayList r22 = com.google.android.gms.common.internal.a.b.f(r0, r2)
            goto L_0x0030
        L_0x0078:
            android.os.Bundle r21 = com.google.android.gms.common.internal.a.b.a(r0, r2)
            goto L_0x0030
        L_0x007d:
            android.os.Bundle r20 = com.google.android.gms.common.internal.a.b.a(r0, r2)
            goto L_0x0030
        L_0x0082:
            java.lang.String r19 = com.google.android.gms.common.internal.a.b.d(r0, r2)
            goto L_0x0030
        L_0x0087:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r0, (int) r2, r3)
            r18 = r2
            android.location.Location r18 = (android.location.Location) r18
            goto L_0x0030
        L_0x0092:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.g> r3 = com.google.android.gms.internal.ads.C1693g.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r0, (int) r2, r3)
            r17 = r2
            com.google.android.gms.internal.ads.g r17 = (com.google.android.gms.internal.ads.C1693g) r17
            goto L_0x0030
        L_0x009d:
            java.lang.String r16 = com.google.android.gms.common.internal.a.b.d(r0, r2)
            goto L_0x0030
        L_0x00a2:
            boolean r15 = com.google.android.gms.common.internal.a.b.h(r0, r2)
            goto L_0x0030
        L_0x00a7:
            int r14 = com.google.android.gms.common.internal.a.b.n(r0, r2)
            goto L_0x0030
        L_0x00ac:
            boolean r13 = com.google.android.gms.common.internal.a.b.h(r0, r2)
            goto L_0x0030
        L_0x00b2:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.a.b.f(r0, r2)
            goto L_0x0030
        L_0x00b8:
            int r11 = com.google.android.gms.common.internal.a.b.n(r0, r2)
            goto L_0x0030
        L_0x00be:
            android.os.Bundle r10 = com.google.android.gms.common.internal.a.b.a(r0, r2)
            goto L_0x0030
        L_0x00c4:
            long r8 = com.google.android.gms.common.internal.a.b.o(r0, r2)
            goto L_0x0030
        L_0x00ca:
            int r7 = com.google.android.gms.common.internal.a.b.n(r0, r2)
            goto L_0x0030
        L_0x00d0:
            com.google.android.gms.common.internal.a.b.g(r0, r1)
            com.google.android.gms.internal.ads.nqa r0 = new com.google.android.gms.internal.ads.nqa
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2391pqa.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2249nqa[i];
    }
}
