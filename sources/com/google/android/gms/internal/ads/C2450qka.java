package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qka  reason: case insensitive filesystem */
final class C2450qka {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f11878a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11879b = new byte[8];

    /* renamed from: c  reason: collision with root package name */
    private int f11880c;

    /* renamed from: d  reason: collision with root package name */
    private int f11881d;

    public static int a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f11878a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f11878a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long a(Wja wja, boolean z, boolean z2, int i) {
        if (this.f11880c == 0) {
            if (!wja.a(this.f11879b, 0, 1, z)) {
                return -1;
            }
            this.f11881d = a(this.f11879b[0] & 255);
            if (this.f11881d != -1) {
                this.f11880c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f11881d;
        if (i2 > i) {
            this.f11880c = 0;
            return -2;
        }
        if (i2 != 1) {
            wja.readFully(this.f11879b, 1, i2 - 1);
        }
        this.f11880c = 0;
        return a(this.f11879b, this.f11881d, z2);
    }

    public final void a() {
        this.f11880c = 0;
        this.f11881d = 0;
    }

    public final int b() {
        return this.f11881d;
    }
}
