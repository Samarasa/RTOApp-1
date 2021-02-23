package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Hma {

    /* renamed from: a  reason: collision with root package name */
    private int f7206a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f7207b;

    public Hma() {
        this(32);
    }

    private Hma(int i) {
        this.f7207b = new long[32];
    }

    public final int a() {
        return this.f7206a;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f7206a) {
            return this.f7207b[i];
        }
        int i2 = this.f7206a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void a(long j) {
        int i = this.f7206a;
        long[] jArr = this.f7207b;
        if (i == jArr.length) {
            this.f7207b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f7207b;
        int i2 = this.f7206a;
        this.f7206a = i2 + 1;
        jArr2[i2] = j;
    }
}
