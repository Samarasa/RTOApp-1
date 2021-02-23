package h;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final g f15341a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f15342b;

    /* renamed from: c  reason: collision with root package name */
    private int f15343c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15344d;

    l(g gVar, Inflater inflater) {
        if (gVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f15341a = gVar;
            this.f15342b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void c() {
        int i = this.f15343c;
        if (i != 0) {
            int remaining = i - this.f15342b.getRemaining();
            this.f15343c -= remaining;
            this.f15341a.skip((long) remaining);
        }
    }

    public long a(e eVar, long j) {
        s b2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f15344d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a2 = a();
                try {
                    b2 = eVar.b(1);
                    int inflate = this.f15342b.inflate(b2.f15356a, b2.f15358c, 8192 - b2.f15358c);
                    if (inflate > 0) {
                        b2.f15358c += inflate;
                        long j2 = (long) inflate;
                        eVar.f15328c += j2;
                        return j2;
                    } else if (this.f15342b.finished()) {
                        break;
                    } else if (this.f15342b.needsDictionary()) {
                        break;
                    } else if (a2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            c();
            if (b2.f15357b != b2.f15358c) {
                return -1;
            }
            eVar.f15327b = b2.b();
            t.a(b2);
            return -1;
        }
    }

    public boolean a() {
        if (!this.f15342b.needsInput()) {
            return false;
        }
        c();
        if (this.f15342b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f15341a.e()) {
            return true;
        } else {
            s sVar = this.f15341a.b().f15327b;
            int i = sVar.f15358c;
            int i2 = sVar.f15357b;
            this.f15343c = i - i2;
            this.f15342b.setInput(sVar.f15356a, i2, this.f15343c);
            return false;
        }
    }

    public void close() {
        if (!this.f15344d) {
            this.f15342b.end();
            this.f15344d = true;
            this.f15341a.close();
        }
    }

    public y timeout() {
        return this.f15341a.timeout();
    }
}
