package com.google.android.gms.internal.ads;

public final class Kma {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f7609a;

    /* renamed from: b  reason: collision with root package name */
    private int f7610b;

    /* renamed from: c  reason: collision with root package name */
    private int f7611c;

    /* renamed from: d  reason: collision with root package name */
    private int f7612d;

    public Kma(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private Kma(byte[] bArr, int i) {
        this.f7609a = bArr;
        this.f7612d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r12 == 8) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r12 / 8
            r2 = r12
            r12 = 0
            r3 = 0
        L_0x0009:
            r4 = 1
            r5 = 255(0xff, float:3.57E-43)
            r6 = 8
            if (r12 >= r1) goto L_0x0038
            int r7 = r11.f7611c
            if (r7 == 0) goto L_0x0025
            byte[] r8 = r11.f7609a
            int r9 = r11.f7610b
            byte r10 = r8[r9]
            r10 = r10 & r5
            int r10 = r10 << r7
            int r9 = r9 + r4
            byte r8 = r8[r9]
            r8 = r8 & r5
            int r6 = r6 - r7
            int r6 = r8 >>> r6
            r6 = r6 | r10
            goto L_0x002b
        L_0x0025:
            byte[] r6 = r11.f7609a
            int r7 = r11.f7610b
            byte r6 = r6[r7]
        L_0x002b:
            int r2 = r2 + -8
            r5 = r5 & r6
            int r5 = r5 << r2
            r3 = r3 | r5
            int r5 = r11.f7610b
            int r5 = r5 + r4
            r11.f7610b = r5
            int r12 = r12 + 1
            goto L_0x0009
        L_0x0038:
            if (r2 <= 0) goto L_0x0070
            int r12 = r11.f7611c
            int r12 = r12 + r2
            int r1 = 8 - r2
            int r1 = r5 >> r1
            byte r1 = (byte) r1
            if (r12 <= r6) goto L_0x005d
            byte[] r2 = r11.f7609a
            int r7 = r11.f7610b
            byte r8 = r2[r7]
            r8 = r8 & r5
            int r9 = r12 + -8
            int r8 = r8 << r9
            int r9 = r7 + 1
            byte r2 = r2[r9]
            r2 = r2 & r5
            int r5 = 16 - r12
            int r2 = r2 >> r5
            r2 = r2 | r8
            r1 = r1 & r2
            r1 = r1 | r3
        L_0x0059:
            int r7 = r7 + r4
            r11.f7610b = r7
            goto L_0x006c
        L_0x005d:
            byte[] r2 = r11.f7609a
            int r7 = r11.f7610b
            byte r2 = r2[r7]
            r2 = r2 & r5
            int r5 = 8 - r12
            int r2 = r2 >> r5
            r1 = r1 & r2
            r1 = r1 | r3
            if (r12 != r6) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            r3 = r1
            int r12 = r12 % r6
            r11.f7611c = r12
        L_0x0070:
            int r12 = r11.f7610b
            if (r12 < 0) goto L_0x0083
            int r1 = r11.f7611c
            if (r1 < 0) goto L_0x0083
            if (r1 >= r6) goto L_0x0083
            int r2 = r11.f7612d
            if (r12 < r2) goto L_0x0082
            if (r12 != r2) goto L_0x0083
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            com.google.android.gms.internal.ads.Cma.b(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Kma.a(int):int");
    }
}
