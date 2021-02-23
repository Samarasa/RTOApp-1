package h;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class k implements w {

    /* renamed from: a  reason: collision with root package name */
    private int f15336a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final g f15337b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f15338c;

    /* renamed from: d  reason: collision with root package name */
    private final l f15339d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f15340e = new CRC32();

    public k(w wVar) {
        if (wVar != null) {
            this.f15338c = new Inflater(true);
            this.f15337b = p.a(wVar);
            this.f15339d = new l(this.f15337b, this.f15338c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a() {
        this.f15337b.c(10);
        byte e2 = this.f15337b.b().e(3);
        boolean z = ((e2 >> 1) & 1) == 1;
        if (z) {
            a(this.f15337b.b(), 0, 10);
        }
        a("ID1ID2", 8075, (int) this.f15337b.readShort());
        this.f15337b.skip(8);
        if (((e2 >> 2) & 1) == 1) {
            this.f15337b.c(2);
            if (z) {
                a(this.f15337b.b(), 0, 2);
            }
            long h2 = (long) this.f15337b.b().h();
            this.f15337b.c(h2);
            if (z) {
                a(this.f15337b.b(), 0, h2);
            }
            this.f15337b.skip(h2);
        }
        if (((e2 >> 3) & 1) == 1) {
            long a2 = this.f15337b.a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    a(this.f15337b.b(), 0, a2 + 1);
                }
                this.f15337b.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((e2 >> 4) & 1) == 1) {
            long a3 = this.f15337b.a((byte) 0);
            if (a3 != -1) {
                if (z) {
                    a(this.f15337b.b(), 0, a3 + 1);
                }
                this.f15337b.skip(a3 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", (int) this.f15337b.h(), (int) (short) ((int) this.f15340e.getValue()));
            this.f15340e.reset();
        }
    }

    private void a(e eVar, long j, long j2) {
        s sVar = eVar.f15327b;
        while (true) {
            int i = sVar.f15358c;
            int i2 = sVar.f15357b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            sVar = sVar.f15361f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) sVar.f15357b) + j);
            int min = (int) Math.min((long) (sVar.f15358c - i3), j2);
            this.f15340e.update(sVar.f15356a, i3, min);
            j2 -= (long) min;
            sVar = sVar.f15361f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    private void c() {
        a("CRC", this.f15337b.g(), (int) this.f15340e.getValue());
        a("ISIZE", this.f15337b.g(), (int) this.f15338c.getBytesWritten());
    }

    public long a(e eVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f15336a == 0) {
                a();
                this.f15336a = 1;
            }
            if (this.f15336a == 1) {
                long j2 = eVar.f15328c;
                long a2 = this.f15339d.a(eVar, j);
                if (a2 != -1) {
                    a(eVar, j2, a2);
                    return a2;
                }
                this.f15336a = 2;
            }
            if (this.f15336a == 2) {
                c();
                this.f15336a = 3;
                if (!this.f15337b.e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f15339d.close();
    }

    public y timeout() {
        return this.f15337b.timeout();
    }
}
