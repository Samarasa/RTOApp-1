package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

public final class Uja implements Wja {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8927a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final C2170mma f8928b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8929c;

    /* renamed from: d  reason: collision with root package name */
    private long f8930d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8931e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f8932f;

    /* renamed from: g  reason: collision with root package name */
    private int f8933g;

    public Uja(C2170mma mma, long j, long j2) {
        this.f8928b = mma;
        this.f8930d = j;
        this.f8929c = j2;
    }

    private final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f8928b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final boolean a(int i, boolean z) {
        int i2 = this.f8932f + i;
        byte[] bArr = this.f8931e;
        if (i2 > bArr.length) {
            this.f8931e = Arrays.copyOf(this.f8931e, Tma.a(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f8933g - this.f8932f, i);
        while (min < i) {
            min = a(this.f8931e, this.f8932f, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.f8932f += i;
        this.f8933g = Math.max(this.f8933g, this.f8932f);
        return true;
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = this.f8933g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f8931e, 0, bArr, i, min);
        e(min);
        return min;
    }

    private final int d(int i) {
        int min = Math.min(this.f8933g, i);
        e(min);
        return min;
    }

    private final void e(int i) {
        this.f8933g -= i;
        this.f8932f = 0;
        byte[] bArr = this.f8931e;
        int i2 = this.f8933g;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f8931e, i, bArr, 0, this.f8933g);
        this.f8931e = bArr;
    }

    private final void f(int i) {
        if (i != -1) {
            this.f8930d += (long) i;
        }
    }

    public final void a() {
        this.f8932f = 0;
    }

    public final void a(int i) {
        a(i, false);
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (a(i2, false)) {
            System.arraycopy(this.f8931e, this.f8932f - i2, bArr, i, i2);
        }
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int b2 = b(bArr, i, i2);
        while (b2 < i2 && b2 != -1) {
            b2 = a(bArr, i, i2, b2, z);
        }
        f(b2);
        return b2 != -1;
    }

    public final int b(int i) {
        int d2 = d(i);
        if (d2 == 0) {
            byte[] bArr = f8927a;
            d2 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        f(d2);
        return d2;
    }

    public final void c(int i) {
        int d2 = d(i);
        while (d2 < i && d2 != -1) {
            byte[] bArr = f8927a;
            d2 = a(bArr, -d2, Math.min(i, bArr.length + d2), d2, false);
        }
        f(d2);
    }

    public final long getLength() {
        return this.f8929c;
    }

    public final long getPosition() {
        return this.f8930d;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i, i2);
        if (b2 == 0) {
            b2 = a(bArr, i, i2, 0, true);
        }
        f(b2);
        return b2;
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }
}
