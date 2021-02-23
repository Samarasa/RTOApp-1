package g.a.d;

import g.A;
import g.E;
import g.H;
import g.K;
import g.M;
import g.a.b.g;
import g.a.c.i;
import g.a.c.l;
import g.z;
import h.j;
import h.p;
import h.v;
import h.w;
import h.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class b implements g.a.c.c {

    /* renamed from: a  reason: collision with root package name */
    final E f15010a;

    /* renamed from: b  reason: collision with root package name */
    final g f15011b;

    /* renamed from: c  reason: collision with root package name */
    final h.g f15012c;

    /* renamed from: d  reason: collision with root package name */
    final h.f f15013d;

    /* renamed from: e  reason: collision with root package name */
    int f15014e = 0;

    private abstract class a implements w {

        /* renamed from: a  reason: collision with root package name */
        protected final j f15015a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f15016b;

        private a() {
            this.f15015a = new j(b.this.f15012c.timeout());
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z) {
            b bVar = b.this;
            int i = bVar.f15014e;
            if (i != 6) {
                if (i == 5) {
                    bVar.a(this.f15015a);
                    b bVar2 = b.this;
                    bVar2.f15014e = 6;
                    g gVar = bVar2.f15011b;
                    if (gVar != null) {
                        gVar.a(!z, (g.a.c.c) bVar2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + b.this.f15014e);
            }
        }

        public y timeout() {
            return this.f15015a;
        }
    }

    /* renamed from: g.a.d.b$b  reason: collision with other inner class name */
    private final class C0089b implements v {

        /* renamed from: a  reason: collision with root package name */
        private final j f15018a = new j(b.this.f15013d.timeout());

        /* renamed from: b  reason: collision with root package name */
        private boolean f15019b;

        C0089b() {
        }

        public void b(h.e eVar, long j) {
            if (this.f15019b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                b.this.f15013d.d(j);
                b.this.f15013d.a("\r\n");
                b.this.f15013d.b(eVar, j);
                b.this.f15013d.a("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f15019b) {
                this.f15019b = true;
                b.this.f15013d.a("0\r\n\r\n");
                b.this.a(this.f15018a);
                b.this.f15014e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f15019b) {
                b.this.f15013d.flush();
            }
        }

        public y timeout() {
            return this.f15018a;
        }
    }

    private class c extends a {

        /* renamed from: d  reason: collision with root package name */
        private final A f15021d;

        /* renamed from: e  reason: collision with root package name */
        private long f15022e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15023f = true;

        c(A a2) {
            super();
            this.f15021d = a2;
        }

        private void a() {
            if (this.f15022e != -1) {
                b.this.f15012c.f();
            }
            try {
                this.f15022e = b.this.f15012c.i();
                String trim = b.this.f15012c.f().trim();
                if (this.f15022e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15022e + trim + "\"");
                } else if (this.f15022e == 0) {
                    this.f15023f = false;
                    g.a.c.f.a(b.this.f15010a.h(), this.f15021d, b.this.e());
                    a(true);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        public long a(h.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f15016b) {
                throw new IllegalStateException("closed");
            } else if (!this.f15023f) {
                return -1;
            } else {
                long j2 = this.f15022e;
                if (j2 == 0 || j2 == -1) {
                    a();
                    if (!this.f15023f) {
                        return -1;
                    }
                }
                long a2 = b.this.f15012c.a(eVar, Math.min(j, this.f15022e));
                if (a2 != -1) {
                    this.f15022e -= a2;
                    return a2;
                }
                a(false);
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f15016b) {
                if (this.f15023f && !g.a.e.a((w) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false);
                }
                this.f15016b = true;
            }
        }
    }

    private final class d implements v {

        /* renamed from: a  reason: collision with root package name */
        private final j f15025a = new j(b.this.f15013d.timeout());

        /* renamed from: b  reason: collision with root package name */
        private boolean f15026b;

        /* renamed from: c  reason: collision with root package name */
        private long f15027c;

        d(long j) {
            this.f15027c = j;
        }

        public void b(h.e eVar, long j) {
            if (!this.f15026b) {
                g.a.e.a(eVar.o(), 0, j);
                if (j <= this.f15027c) {
                    b.this.f15013d.b(eVar, j);
                    this.f15027c -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f15027c + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (!this.f15026b) {
                this.f15026b = true;
                if (this.f15027c <= 0) {
                    b.this.a(this.f15025a);
                    b.this.f15014e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.f15026b) {
                b.this.f15013d.flush();
            }
        }

        public y timeout() {
            return this.f15025a;
        }
    }

    private class e extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f15029d;

        public e(long j) {
            super();
            this.f15029d = j;
            if (this.f15029d == 0) {
                a(true);
            }
        }

        public long a(h.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f15016b) {
                long j2 = this.f15029d;
                if (j2 == 0) {
                    return -1;
                }
                long a2 = b.this.f15012c.a(eVar, Math.min(j2, j));
                if (a2 != -1) {
                    this.f15029d -= a2;
                    if (this.f15029d == 0) {
                        a(true);
                    }
                    return a2;
                }
                a(false);
                throw new ProtocolException("unexpected end of stream");
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f15016b) {
                if (this.f15029d != 0 && !g.a.e.a((w) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false);
                }
                this.f15016b = true;
            }
        }
    }

    private class f extends a {

        /* renamed from: d  reason: collision with root package name */
        private boolean f15031d;

        f() {
            super();
        }

        public long a(h.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f15016b) {
                throw new IllegalStateException("closed");
            } else if (this.f15031d) {
                return -1;
            } else {
                long a2 = b.this.f15012c.a(eVar, j);
                if (a2 != -1) {
                    return a2;
                }
                this.f15031d = true;
                a(true);
                return -1;
            }
        }

        public void close() {
            if (!this.f15016b) {
                if (!this.f15031d) {
                    a(false);
                }
                this.f15016b = true;
            }
        }
    }

    public b(E e2, g gVar, h.g gVar2, h.f fVar) {
        this.f15010a = e2;
        this.f15011b = gVar;
        this.f15012c = gVar2;
        this.f15013d = fVar;
    }

    private w b(K k) {
        if (!g.a.c.f.b(k)) {
            return b(0);
        }
        if ("chunked".equalsIgnoreCase(k.e("Transfer-Encoding"))) {
            return a(k.x().g());
        }
        long a2 = g.a.c.f.a(k);
        return a2 != -1 ? b(a2) : d();
    }

    public K.a a(boolean z) {
        int i = this.f15014e;
        if (i == 1 || i == 3) {
            try {
                l a2 = l.a(this.f15012c.f());
                K.a aVar = new K.a();
                aVar.a(a2.f15005a);
                aVar.a(a2.f15006b);
                aVar.a(a2.f15007c);
                aVar.a(e());
                if (z && a2.f15006b == 100) {
                    return null;
                }
                this.f15014e = 4;
                return aVar;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f15011b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f15014e);
        }
    }

    public M a(K k) {
        return new i(k.u(), p.a(b(k)));
    }

    public v a(long j) {
        if (this.f15014e == 1) {
            this.f15014e = 2;
            return new d(j);
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    public v a(H h2, long j) {
        if ("chunked".equalsIgnoreCase(h2.a("Transfer-Encoding"))) {
            return c();
        }
        if (j != -1) {
            return a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public w a(A a2) {
        if (this.f15014e == 4) {
            this.f15014e = 5;
            return new c(a2);
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    public void a() {
        this.f15013d.flush();
    }

    public void a(H h2) {
        a(h2.c(), g.a.c.j.a(h2, this.f15011b.b().a().b().type()));
    }

    public void a(z zVar, String str) {
        if (this.f15014e == 0) {
            this.f15013d.a(str).a("\r\n");
            int b2 = zVar.b();
            for (int i = 0; i < b2; i++) {
                this.f15013d.a(zVar.a(i)).a(": ").a(zVar.b(i)).a("\r\n");
            }
            this.f15013d.a("\r\n");
            this.f15014e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar) {
        y g2 = jVar.g();
        jVar.a(y.f15367a);
        g2.a();
        g2.b();
    }

    public w b(long j) {
        if (this.f15014e == 4) {
            this.f15014e = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    public void b() {
        this.f15013d.flush();
    }

    public v c() {
        if (this.f15014e == 1) {
            this.f15014e = 2;
            return new C0089b();
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    public w d() {
        if (this.f15014e == 4) {
            g gVar = this.f15011b;
            if (gVar != null) {
                this.f15014e = 5;
                gVar.d();
                return new f();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f15014e);
    }

    public z e() {
        z.a aVar = new z.a();
        while (true) {
            String f2 = this.f15012c.f();
            if (f2.length() == 0) {
                return aVar.a();
            }
            g.a.a.f14935a.a(aVar, f2);
        }
    }
}
