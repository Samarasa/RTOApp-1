package c.a.a.i;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final Queue<d> f3646a = k.a(0);

    /* renamed from: b  reason: collision with root package name */
    private InputStream f3647b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f3648c;

    d() {
    }

    public static d a(InputStream inputStream) {
        d poll;
        synchronized (f3646a) {
            poll = f3646a.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.b(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f3648c;
    }

    public int available() {
        return this.f3647b.available();
    }

    /* access modifiers changed from: package-private */
    public void b(InputStream inputStream) {
        this.f3647b = inputStream;
    }

    public void close() {
        this.f3647b.close();
    }

    public void mark(int i) {
        this.f3647b.mark(i);
    }

    public boolean markSupported() {
        return this.f3647b.markSupported();
    }

    public void r() {
        this.f3648c = null;
        this.f3647b = null;
        synchronized (f3646a) {
            f3646a.offer(this);
        }
    }

    public int read() {
        try {
            return this.f3647b.read();
        } catch (IOException e2) {
            this.f3648c = e2;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f3647b.read(bArr);
        } catch (IOException e2) {
            this.f3648c = e2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f3647b.read(bArr, i, i2);
        } catch (IOException e2) {
            this.f3648c = e2;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f3647b.reset();
    }

    public long skip(long j) {
        try {
            return this.f3647b.skip(j);
        } catch (IOException e2) {
            this.f3648c = e2;
            return 0;
        }
    }
}
