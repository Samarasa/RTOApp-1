package g.a.e;

import g.a.e.d;
import h.e;
import h.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class u implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f15167a = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final f f15168b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15169c;

    /* renamed from: d  reason: collision with root package name */
    private final e f15170d = new e();

    /* renamed from: e  reason: collision with root package name */
    private int f15171e = 16384;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15172f;

    /* renamed from: g  reason: collision with root package name */
    final d.b f15173g = new d.b(this.f15170d);

    public u(f fVar, boolean z) {
        this.f15168b = fVar;
        this.f15169c = z;
    }

    private static void a(f fVar, int i) {
        fVar.writeByte((i >>> 16) & 255);
        fVar.writeByte((i >>> 8) & 255);
        fVar.writeByte(i & 255);
    }

    private void c(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f15171e, j);
            long j2 = (long) min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f15168b.b(this.f15170d, j2);
        }
    }

    public synchronized void a() {
        if (this.f15172f) {
            throw new IOException("closed");
        } else if (this.f15169c) {
            if (f15167a.isLoggable(Level.FINE)) {
                f15167a.fine(g.a.e.a(">> CONNECTION %s", e.f15076a.c()));
            }
            this.f15168b.write(e.f15076a.p());
            this.f15168b.flush();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i, byte b2, e eVar, int i2) {
        a(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f15168b.b(eVar, (long) i2);
        }
    }

    public void a(int i, int i2, byte b2, byte b3) {
        if (f15167a.isLoggable(Level.FINE)) {
            f15167a.fine(e.a(false, i, i2, b2, b3));
        }
        int i3 = this.f15171e;
        if (i2 > i3) {
            e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            a(this.f15168b, i2);
            this.f15168b.writeByte(b2 & 255);
            this.f15168b.writeByte(b3 & 255);
            this.f15168b.writeInt(i & Integer.MAX_VALUE);
        } else {
            e.a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public synchronized void a(int i, int i2, List<c> list) {
        if (!this.f15172f) {
            this.f15173g.a(list);
            long o = this.f15170d.o();
            int min = (int) Math.min((long) (this.f15171e - 4), o);
            long j = (long) min;
            a(i, min + 4, (byte) 5, o == j ? (byte) 4 : 0);
            this.f15168b.writeInt(i2 & Integer.MAX_VALUE);
            this.f15168b.b(this.f15170d, j);
            if (o > j) {
                c(i, o - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i, b bVar) {
        if (this.f15172f) {
            throw new IOException("closed");
        } else if (bVar.f15049h != -1) {
            a(i, 4, (byte) 3, (byte) 0);
            this.f15168b.writeInt(bVar.f15049h);
            this.f15168b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(int i, b bVar, byte[] bArr) {
        if (this.f15172f) {
            throw new IOException("closed");
        } else if (bVar.f15049h != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f15168b.writeInt(i);
            this.f15168b.writeInt(bVar.f15049h);
            if (bArr.length > 0) {
                this.f15168b.write(bArr);
            }
            this.f15168b.flush();
        } else {
            e.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void a(z zVar) {
        if (!this.f15172f) {
            this.f15171e = zVar.c(this.f15171e);
            if (zVar.b() != -1) {
                this.f15173g.a(zVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f15168b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i, int i2) {
        if (!this.f15172f) {
            a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f15168b.writeInt(i);
            this.f15168b.writeInt(i2);
            this.f15168b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i, int i2, List<c> list) {
        if (!this.f15172f) {
            a(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i, e eVar, int i2) {
        if (!this.f15172f) {
            byte b2 = 0;
            if (z) {
                b2 = (byte) 1;
            }
            a(i, b2, eVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i, List<c> list) {
        if (!this.f15172f) {
            this.f15173g.a(list);
            long o = this.f15170d.o();
            int min = (int) Math.min((long) this.f15171e, o);
            long j = (long) min;
            byte b2 = o == j ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i, min, (byte) 1, b2);
            this.f15168b.b(this.f15170d, j);
            if (o > j) {
                c(i, o - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void b(int i, long j) {
        if (this.f15172f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            a(i, 4, (byte) 8, (byte) 0);
            this.f15168b.writeInt((int) j);
            this.f15168b.flush();
        }
    }

    public synchronized void b(z zVar) {
        if (!this.f15172f) {
            int i = 0;
            a(0, zVar.d() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (zVar.d(i)) {
                    this.f15168b.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f15168b.writeInt(zVar.a(i));
                }
                i++;
            }
            this.f15168b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f15172f = true;
        this.f15168b.close();
    }

    public synchronized void flush() {
        if (!this.f15172f) {
            this.f15168b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public int r() {
        return this.f15171e;
    }
}
