package c.a.a.i;

import java.io.FilterInputStream;
import java.io.InputStream;

public class g extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f3654a = Integer.MIN_VALUE;

    public g(InputStream inputStream) {
        super(inputStream);
    }

    private long f(long j) {
        int i = this.f3654a;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    private void g(long j) {
        int i = this.f3654a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f3654a = (int) (((long) i) - j);
        }
    }

    public int available() {
        int i = this.f3654a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f3654a = i;
    }

    public int read() {
        if (f(1) == -1) {
            return -1;
        }
        int read = super.read();
        g(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int f2 = (int) f((long) i2);
        if (f2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, f2);
        g((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f3654a = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long f2 = f(j);
        if (f2 == -1) {
            return 0;
        }
        long skip = super.skip(f2);
        g(skip);
        return skip;
    }
}
