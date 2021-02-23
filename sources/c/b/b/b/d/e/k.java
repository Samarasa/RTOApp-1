package c.b.b.b.d.e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class k extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f4076a;

    /* renamed from: b  reason: collision with root package name */
    private long f4077b = -1;

    k(InputStream inputStream, long j) {
        super(inputStream);
        g.a(inputStream);
        this.f4076a = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f4076a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f4077b = this.f4076a;
    }

    public final int read() {
        if (this.f4076a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f4076a--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f4076a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f4076a -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f4077b != -1) {
            this.in.reset();
            this.f4076a = this.f4077b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f4076a));
        this.f4076a -= skip;
        return skip;
    }
}
