package h;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f15367a = new x();

    /* renamed from: b  reason: collision with root package name */
    private boolean f15368b;

    /* renamed from: c  reason: collision with root package name */
    private long f15369c;

    /* renamed from: d  reason: collision with root package name */
    private long f15370d;

    public y a() {
        this.f15368b = false;
        return this;
    }

    public y a(long j) {
        this.f15368b = true;
        this.f15369c = j;
        return this;
    }

    public y a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f15370d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public y b() {
        this.f15370d = 0;
        return this;
    }

    public long c() {
        if (this.f15368b) {
            return this.f15369c;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f15368b;
    }

    public void e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f15368b && this.f15369c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f15370d;
    }
}
