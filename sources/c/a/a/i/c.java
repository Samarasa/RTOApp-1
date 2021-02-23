package c.a.a.i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f3644a;

    /* renamed from: b  reason: collision with root package name */
    private int f3645b;

    private c(InputStream inputStream, long j) {
        super(inputStream);
        this.f3644a = j;
    }

    public static InputStream a(InputStream inputStream, long j) {
        return new c(inputStream, j);
    }

    private int b(int i) {
        if (i >= 0) {
            this.f3645b += i;
        } else if (this.f3644a - ((long) this.f3645b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f3644a + ", but read: " + this.f3645b);
        }
        return i;
    }

    public synchronized int available() {
        return (int) Math.max(this.f3644a - ((long) this.f3645b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        b(read);
        return read;
    }
}
