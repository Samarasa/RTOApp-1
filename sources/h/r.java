package h;

import java.io.EOFException;
import java.nio.charset.Charset;

final class r implements g {

    /* renamed from: a  reason: collision with root package name */
    public final e f15353a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final w f15354b;

    /* renamed from: c  reason: collision with root package name */
    boolean f15355c;

    r(w wVar) {
        if (wVar != null) {
            this.f15354b = wVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        if (this.f15355c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a2 = this.f15353a.a(b2, j, j2);
                if (a2 == -1) {
                    e eVar = this.f15353a;
                    long j3 = eVar.f15328c;
                    if (j3 >= j2 || this.f15354b.a(eVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a2;
                }
            }
            return -1;
        }
    }

    public long a(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f15355c) {
            e eVar2 = this.f15353a;
            if (eVar2.f15328c == 0 && this.f15354b.a(eVar2, 8192) == -1) {
                return -1;
            }
            return this.f15353a.a(eVar, Math.min(j, this.f15353a.f15328c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public h a(long j) {
        c(j);
        return this.f15353a.a(j);
    }

    public String a(Charset charset) {
        if (charset != null) {
            this.f15353a.a(this.f15354b);
            return this.f15353a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public boolean a(long j, h hVar) {
        return a(j, hVar, 0, hVar.n());
    }

    public boolean a(long j, h hVar, int i, int i2) {
        if (this.f15355c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || hVar.n() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!e(1 + j2) || this.f15353a.e(j2) != hVar.a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public e b() {
        return this.f15353a;
    }

    public byte[] b(long j) {
        c(j);
        return this.f15353a.b(j);
    }

    public void c(long j) {
        if (!e(j)) {
            throw new EOFException();
        }
    }

    public void close() {
        if (!this.f15355c) {
            this.f15355c = true;
            this.f15354b.close();
            this.f15353a.a();
        }
    }

    public String d(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return this.f15353a.g(a2);
            }
            if (j2 < Long.MAX_VALUE && e(j2) && this.f15353a.e(j2 - 1) == 13 && e(1 + j2) && this.f15353a.e(j2) == 10) {
                return this.f15353a.g(j2);
            }
            e eVar = new e();
            e eVar2 = this.f15353a;
            eVar2.a(eVar, 0, Math.min(32, eVar2.o()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f15353a.o(), j) + " content=" + eVar.m().c() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public boolean e() {
        if (!this.f15355c) {
            return this.f15353a.e() && this.f15354b.a(this.f15353a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public boolean e(long j) {
        e eVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f15355c) {
            do {
                eVar = this.f15353a;
                if (eVar.f15328c >= j) {
                    return true;
                }
            } while (this.f15354b.a(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String f() {
        return d(Long.MAX_VALUE);
    }

    public int g() {
        c(4);
        return this.f15353a.g();
    }

    public short h() {
        c(2);
        return this.f15353a.h();
    }

    public long i() {
        c(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!e((long) i2)) {
                break;
            }
            byte e2 = this.f15353a.e((long) i);
            if ((e2 >= 48 && e2 <= 57) || ((e2 >= 97 && e2 <= 102) || (e2 >= 65 && e2 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(e2)}));
            }
        }
        return this.f15353a.i();
    }

    public byte readByte() {
        c(1);
        return this.f15353a.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            c((long) bArr.length);
            this.f15353a.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                e eVar = this.f15353a;
                long j = eVar.f15328c;
                if (j > 0) {
                    int a2 = eVar.a(bArr, i, (int) j);
                    if (a2 != -1) {
                        i += a2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public int readInt() {
        c(4);
        return this.f15353a.readInt();
    }

    public short readShort() {
        c(2);
        return this.f15353a.readShort();
    }

    public void skip(long j) {
        if (!this.f15355c) {
            while (j > 0) {
                e eVar = this.f15353a;
                if (eVar.f15328c == 0 && this.f15354b.a(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f15353a.o());
                this.f15353a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public y timeout() {
        return this.f15354b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f15354b + ")";
    }
}
