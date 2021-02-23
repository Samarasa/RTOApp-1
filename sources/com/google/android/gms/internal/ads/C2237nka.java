package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nka  reason: case insensitive filesystem */
final class C2237nka {

    /* renamed from: a  reason: collision with root package name */
    private final Nma f11499a = new Nma(8);

    /* renamed from: b  reason: collision with root package name */
    private int f11500b;

    private final long b(Wja wja) {
        int i = 0;
        wja.a(this.f11499a.f8013a, 0, 1);
        byte b2 = this.f11499a.f8013a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (i2 ^ -1);
        wja.a(this.f11499a.f8013a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f11499a.f8013a[i] & 255) + (i4 << 8);
        }
        this.f11500b += i3 + 1;
        return (long) i4;
    }

    public final boolean a(Wja wja) {
        Wja wja2 = wja;
        long length = wja.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        wja2.a(this.f11499a.f8013a, 0, 4);
        this.f11500b = 4;
        for (long l = this.f11499a.l(); l != 440786851; l = ((l << 8) & -256) | ((long) (this.f11499a.f8013a[0] & 255))) {
            int i2 = this.f11500b + 1;
            this.f11500b = i2;
            if (i2 == i) {
                return false;
            }
            wja2.a(this.f11499a.f8013a, 0, 1);
        }
        long b2 = b(wja);
        long j2 = (long) this.f11500b;
        if (b2 != Long.MIN_VALUE && (length == -1 || j2 + b2 < length)) {
            while (true) {
                int i3 = this.f11500b;
                long j3 = j2 + b2;
                if (((long) i3) < j3) {
                    if (b(wja) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b3 = b(wja);
                    if (b3 < 0 || b3 > 2147483647L) {
                        return false;
                    }
                    if (b3 != 0) {
                        wja2.a((int) b3);
                        this.f11500b = (int) (((long) this.f11500b) + b3);
                    }
                } else if (((long) i3) == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
