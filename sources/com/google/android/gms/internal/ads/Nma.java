package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Nma {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f8013a;

    /* renamed from: b  reason: collision with root package name */
    private int f8014b;

    /* renamed from: c  reason: collision with root package name */
    private int f8015c;

    public Nma() {
    }

    public Nma(int i) {
        this.f8013a = new byte[i];
        this.f8015c = i;
    }

    public Nma(byte[] bArr) {
        this.f8013a = bArr;
        this.f8015c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f8013a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void a(int i) {
        a(a() < i ? new byte[i] : this.f8013a, i);
    }

    public final void a(byte[] bArr, int i) {
        this.f8013a = bArr;
        this.f8015c = i;
        this.f8014b = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f8013a, this.f8014b, bArr, i, i2);
        this.f8014b += i2;
    }

    public final int b() {
        return this.f8014b;
    }

    public final void b(int i) {
        Cma.a(i >= 0 && i <= this.f8013a.length);
        this.f8015c = i;
    }

    public final int c() {
        return this.f8015c;
    }

    public final void c(int i) {
        Cma.a(i >= 0 && i <= this.f8015c);
        this.f8014b = i;
    }

    public final int d() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i3 = this.f8014b;
        this.f8014b = i3 + 1;
        byte b3 = b2 | ((bArr[i3] & 255) << 8);
        int i4 = this.f8014b;
        this.f8014b = i4 + 1;
        return (bArr[i4] & 255) | b3;
    }

    public final void d(int i) {
        c(this.f8014b + i);
    }

    public final long e() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.f8014b;
        this.f8014b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.f8014b;
        this.f8014b = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.f8014b;
        this.f8014b = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.f8014b;
        this.f8014b = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.f8014b;
        this.f8014b = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.f8014b;
        this.f8014b = i8 + 1;
        return j6 | (255 & ((long) bArr[i8]));
    }

    public final String e(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = (this.f8014b + i) - 1;
        String str = new String(this.f8013a, this.f8014b, (i2 >= this.f8015c || this.f8013a[i2] != 0) ? i : i - 1);
        this.f8014b += i;
        return str;
    }

    public final short f() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int g() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        return bArr[i] & 255;
    }

    public final int h() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final void i() {
        this.f8014b = 0;
        this.f8015c = 0;
    }

    public final int j() {
        return this.f8015c - this.f8014b;
    }

    public final int k() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long l() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.f8014b;
        this.f8014b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.f8014b;
        this.f8014b = i4 + 1;
        return j2 | (255 & ((long) bArr[i4]));
    }

    public final long m() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.f8014b;
        this.f8014b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.f8014b;
        this.f8014b = i4 + 1;
        return j2 | ((255 & ((long) bArr[i4])) << 24);
    }

    public final int n() {
        byte[] bArr = this.f8013a;
        int i = this.f8014b;
        this.f8014b = i + 1;
        int i2 = this.f8014b;
        this.f8014b = i2 + 1;
        byte b2 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f8014b += 2;
        return b2;
    }

    public final int o() {
        int d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    public final long p() {
        long e2 = e();
        if (e2 >= 0) {
            return e2;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e2);
        throw new IllegalStateException(sb.toString());
    }

    public final String q() {
        if (j() == 0) {
            return null;
        }
        int i = this.f8014b;
        while (i < this.f8015c && this.f8013a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f8013a;
        int i2 = this.f8014b;
        String str = new String(bArr, i2, i - i2);
        this.f8014b = i;
        int i3 = this.f8014b;
        if (i3 < this.f8015c) {
            this.f8014b = i3 + 1;
        }
        return str;
    }
}
