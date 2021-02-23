package g.a.e;

import g.a.e.d;
import h.e;
import h.g;
import h.h;
import h.w;
import h.y;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class s implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f15138a = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final g f15139b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15140c = new a(this.f15139b);

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15141d;

    /* renamed from: e  reason: collision with root package name */
    final d.a f15142e = new d.a(4096, this.f15140c);

    static final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        private final g f15143a;

        /* renamed from: b  reason: collision with root package name */
        int f15144b;

        /* renamed from: c  reason: collision with root package name */
        byte f15145c;

        /* renamed from: d  reason: collision with root package name */
        int f15146d;

        /* renamed from: e  reason: collision with root package name */
        int f15147e;

        /* renamed from: f  reason: collision with root package name */
        short f15148f;

        public a(g gVar) {
            this.f15143a = gVar;
        }

        private void a() {
            int i = this.f15146d;
            int a2 = s.a(this.f15143a);
            this.f15147e = a2;
            this.f15144b = a2;
            byte readByte = (byte) (this.f15143a.readByte() & 255);
            this.f15145c = (byte) (this.f15143a.readByte() & 255);
            if (s.f15138a.isLoggable(Level.FINE)) {
                s.f15138a.fine(e.a(true, this.f15146d, this.f15144b, readByte, this.f15145c));
            }
            this.f15146d = this.f15143a.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                e.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (this.f15146d != i) {
                e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public long a(e eVar, long j) {
            while (true) {
                int i = this.f15147e;
                if (i == 0) {
                    this.f15143a.skip((long) this.f15148f);
                    this.f15148f = 0;
                    if ((this.f15145c & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long a2 = this.f15143a.a(eVar, Math.min(j, (long) i));
                    if (a2 == -1) {
                        return -1;
                    }
                    this.f15147e = (int) (((long) this.f15147e) - a2);
                    return a2;
                }
            }
        }

        public void close() {
        }

        public y timeout() {
            return this.f15143a.timeout();
        }
    }

    interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<c> list);

        void a(int i, long j);

        void a(int i, b bVar);

        void a(int i, b bVar, h hVar);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<c> list);

        void a(boolean z, int i, g gVar, int i2);

        void a(boolean z, z zVar);
    }

    public s(g gVar, boolean z) {
        this.f15139b = gVar;
        this.f15141d = z;
    }

    static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    static int a(g gVar) {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    private List<c> a(int i, short s, byte b2, int i2) {
        a aVar = this.f15140c;
        aVar.f15147e = i;
        aVar.f15144b = i;
        aVar.f15148f = s;
        aVar.f15145c = b2;
        aVar.f15146d = i2;
        this.f15142e.c();
        return this.f15142e.a();
    }

    private void a(b bVar, int i) {
        int readInt = this.f15139b.readInt();
        bVar.a(i, readInt & Integer.MAX_VALUE, (this.f15139b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void a(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s = (short) (this.f15139b.readByte() & 255);
                }
                bVar.a(z2, i2, this.f15139b, a(i, b2, s));
                this.f15139b.skip((long) s);
                return;
            }
            e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void b(b bVar, int i, byte b2, int i2) {
        if (i < 8) {
            e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f15139b.readInt();
            int readInt2 = this.f15139b.readInt();
            int i3 = i - 8;
            b a2 = b.a(readInt2);
            if (a2 != null) {
                h hVar = h.f15330b;
                if (i3 > 0) {
                    hVar = this.f15139b.a((long) i3);
                }
                bVar.a(readInt, a2, hVar);
                return;
            }
            e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void c(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s = (short) (this.f15139b.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                a(bVar, i2);
                i -= 5;
            }
            bVar.a(z, i2, -1, a(a(i, b2, s), s, b2, i2));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    private void d(b bVar, int i, byte b2, int i2) {
        boolean z = false;
        if (i != 8) {
            e.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f15139b.readInt();
            int readInt2 = this.f15139b.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.a(z, readInt, readInt2);
        } else {
            e.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void e(b bVar, int i, byte b2, int i2) {
        if (i != 5) {
            e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            a(bVar, i2);
        } else {
            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void f(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.f15139b.readByte() & 255);
            }
            bVar.a(i2, this.f15139b.readInt() & Integer.MAX_VALUE, a(a(i - 4, b2, s), s, b2, i2));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void g(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f15139b.readInt();
            b a2 = b.a(readInt);
            if (a2 != null) {
                bVar.a(i2, a2);
                return;
            }
            e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void h(b bVar, int i, byte b2, int i2) {
        if (i2 != 0) {
            e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i == 0) {
                bVar.a();
            } else {
                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i % 6 == 0) {
            z zVar = new z();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f15139b.readShort();
                int readInt = this.f15139b.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            throw null;
                        }
                        break;
                }
                zVar.a(readShort, readInt);
            }
            bVar.a(false, zVar);
        } else {
            e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    private void i(b bVar, int i, byte b2, int i2) {
        if (i == 4) {
            long readInt = ((long) this.f15139b.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.a(i2, readInt);
                return;
            }
            e.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public void a(b bVar) {
        if (!this.f15141d) {
            h a2 = this.f15139b.a((long) e.f15076a.n());
            if (f15138a.isLoggable(Level.FINE)) {
                f15138a.fine(g.a.e.a("<< CONNECTION %s", a2.c()));
            }
            if (!e.f15076a.equals(a2)) {
                e.b("Expected a connection header but was %s", a2.q());
                throw null;
            }
        } else if (!a(true, bVar)) {
            e.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public boolean a(boolean z, b bVar) {
        try {
            this.f15139b.c(9);
            int a2 = a(this.f15139b);
            if (a2 < 0 || a2 > 16384) {
                e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte readByte = (byte) (this.f15139b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f15139b.readByte() & 255);
                int readInt = this.f15139b.readInt() & Integer.MAX_VALUE;
                if (f15138a.isLoggable(Level.FINE)) {
                    f15138a.fine(e.a(true, readInt, a2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(bVar, a2, readByte2, readInt);
                        break;
                    case 1:
                        c(bVar, a2, readByte2, readInt);
                        break;
                    case 2:
                        e(bVar, a2, readByte2, readInt);
                        break;
                    case 3:
                        g(bVar, a2, readByte2, readInt);
                        break;
                    case 4:
                        h(bVar, a2, readByte2, readInt);
                        break;
                    case 5:
                        f(bVar, a2, readByte2, readInt);
                        break;
                    case 6:
                        d(bVar, a2, readByte2, readInt);
                        break;
                    case 7:
                        b(bVar, a2, readByte2, readInt);
                        break;
                    case 8:
                        i(bVar, a2, readByte2, readInt);
                        break;
                    default:
                        this.f15139b.skip((long) a2);
                        break;
                }
                return true;
            }
            e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.f15139b.close();
    }
}
