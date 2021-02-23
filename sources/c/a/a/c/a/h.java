package c.a.a.c.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f2972a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final int f2973b = f2972a.length;

    /* renamed from: c  reason: collision with root package name */
    private static final int f2974c = (f2973b + 2);

    /* renamed from: d  reason: collision with root package name */
    private final byte f2975d;

    /* renamed from: e  reason: collision with root package name */
    private int f2976e;

    public h(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f2975d = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i;
        int i2 = this.f2976e;
        int read = (i2 < 2 || i2 > (i = f2974c)) ? super.read() : i2 == i ? this.f2975d : f2972a[i2 - 2] & 255;
        if (read != -1) {
            this.f2976e++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f2976e;
        int i5 = f2974c;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f2975d;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f2972a, this.f2976e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f2976e += i3;
        }
        return i3;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f2976e = (int) (((long) this.f2976e) + skip);
        }
        return skip;
    }
}
