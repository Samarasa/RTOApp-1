package com.google.android.gms.internal.ads;

import android.os.Parcelable;

public final class Doa implements Parcelable.Creator<Aoa> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = com.google.android.gms.common.internal.a.b.b(r13)
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = r2
            r9 = r3
            r7 = 0
            r8 = 0
            r11 = 0
        L_0x000d:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x004c
            int r1 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r13)
            int r2 = com.google.android.gms.common.internal.a.b.a((int) r1)
            r3 = 2
            if (r2 == r3) goto L_0x0042
            r3 = 3
            if (r2 == r3) goto L_0x003d
            r3 = 4
            if (r2 == r3) goto L_0x0038
            r3 = 5
            if (r2 == r3) goto L_0x0033
            r3 = 6
            if (r2 == r3) goto L_0x002e
            com.google.android.gms.common.internal.a.b.r(r13, r1)
            goto L_0x000d
        L_0x002e:
            boolean r11 = com.google.android.gms.common.internal.a.b.h(r13, r1)
            goto L_0x000d
        L_0x0033:
            long r9 = com.google.android.gms.common.internal.a.b.o(r13, r1)
            goto L_0x000d
        L_0x0038:
            boolean r8 = com.google.android.gms.common.internal.a.b.h(r13, r1)
            goto L_0x000d
        L_0x003d:
            boolean r7 = com.google.android.gms.common.internal.a.b.h(r13, r1)
            goto L_0x000d
        L_0x0042:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.a.b.a((android.os.Parcel) r13, (int) r1, r2)
            r6 = r1
            android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6
            goto L_0x000d
        L_0x004c:
            com.google.android.gms.common.internal.a.b.g(r13, r0)
            com.google.android.gms.internal.ads.Aoa r13 = new com.google.android.gms.internal.ads.Aoa
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Doa.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Aoa[i];
    }
}
