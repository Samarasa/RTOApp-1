package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class Hla implements C1599eka {

    /* renamed from: a  reason: collision with root package name */
    private final C2028kma f7198a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7199b;

    /* renamed from: c  reason: collision with root package name */
    private final Fla f7200c = new Fla();

    /* renamed from: d  reason: collision with root package name */
    private final Ila f7201d = new Ila();

    /* renamed from: e  reason: collision with root package name */
    private final Nma f7202e = new Nma(32);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f7203f = new AtomicInteger();

    /* renamed from: g  reason: collision with root package name */
    private Kla f7204g;

    /* renamed from: h  reason: collision with root package name */
    private Kla f7205h;
    private Lia i;
    private boolean j;
    private Lia k;
    private long l;
    private int m;
    private Jla n;

    public Hla(C2028kma kma) {
        this.f7198a = kma;
        this.f7199b = kma.g();
        int i2 = this.f7199b;
        this.m = i2;
        this.f7204g = new Kla(0, i2);
        this.f7205h = this.f7204g;
    }

    private final int a(int i2) {
        if (this.m == this.f7199b) {
            this.m = 0;
            Kla kla = this.f7205h;
            if (kla.f7605c) {
                this.f7205h = kla.f7607e;
            }
            Kla kla2 = this.f7205h;
            C1816hma h2 = this.f7198a.h();
            Kla kla3 = new Kla(this.f7205h.f7604b, this.f7199b);
            kla2.f7606d = h2;
            kla2.f7607e = kla3;
            kla2.f7605c = true;
        }
        return Math.min(i2, this.f7199b - this.m);
    }

    private final void a(long j2) {
        while (true) {
            Kla kla = this.f7204g;
            if (j2 >= kla.f7604b) {
                this.f7198a.a(kla.f7606d);
                this.f7204g = this.f7204g.a();
            } else {
                return;
            }
        }
    }

    private final void a(long j2, byte[] bArr, int i2) {
        a(j2);
        long j3 = j2;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j3 - this.f7204g.f7603a);
            int min = Math.min(i2 - i3, this.f7199b - i4);
            C1816hma hma = this.f7204g.f7606d;
            System.arraycopy(hma.f10723a, i4 + 0, bArr, i3, min);
            j3 += (long) min;
            i3 += min;
            if (j3 == this.f7204g.f7604b) {
                this.f7198a.a(hma);
                this.f7204g = this.f7204g.a();
            }
        }
    }

    private final void g() {
        this.f7200c.b();
        Kla kla = this.f7204g;
        if (kla.f7605c) {
            Kla kla2 = this.f7205h;
            C1816hma[] hmaArr = new C1816hma[((kla2.f7605c ? 1 : 0) + (((int) (kla2.f7603a - kla.f7603a)) / this.f7199b))];
            for (int i2 = 0; i2 < hmaArr.length; i2++) {
                hmaArr[i2] = kla.f7606d;
                kla = kla.a();
            }
            this.f7198a.a(hmaArr);
        }
        this.f7204g = new Kla(0, this.f7199b);
        this.f7205h = this.f7204g;
        this.l = 0;
        this.m = this.f7199b;
        this.f7198a.f();
    }

    private final boolean h() {
        return this.f7203f.compareAndSet(0, 1);
    }

    private final void i() {
        if (!this.f7203f.compareAndSet(1, 0)) {
            g();
        }
    }

    public final int a(Nia nia, Ija ija, boolean z, boolean z2, long j2) {
        int i2;
        Ija ija2 = ija;
        int a2 = this.f7200c.a(nia, ija, z, z2, this.i, this.f7201d);
        if (a2 == -5) {
            this.i = nia.f7998a;
            return -5;
        } else if (a2 == -4) {
            if (!ija.c()) {
                if (ija2.f7323d < j2) {
                    ija2.b(Integer.MIN_VALUE);
                }
                if (ija.e()) {
                    Ila ila = this.f7201d;
                    long j3 = ila.f7336b;
                    this.f7202e.a(1);
                    a(j3, this.f7202e.f8013a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.f7202e.f8013a[0];
                    boolean z3 = (b2 & 128) != 0;
                    byte b3 = b2 & Byte.MAX_VALUE;
                    Eja eja = ija2.f7321b;
                    if (eja.f6735a == null) {
                        eja.f6735a = new byte[16];
                    }
                    a(j4, ija2.f7321b.f6735a, (int) b3);
                    long j5 = j4 + ((long) b3);
                    if (z3) {
                        this.f7202e.a(2);
                        a(j5, this.f7202e.f8013a, 2);
                        j5 += 2;
                        i2 = this.f7202e.h();
                    } else {
                        i2 = 1;
                    }
                    int[] iArr = ija2.f7321b.f6738d;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = ija2.f7321b.f6739e;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i2 * 6;
                        this.f7202e.a(i3);
                        a(j5, this.f7202e.f8013a, i3);
                        j5 += (long) i3;
                        this.f7202e.c(0);
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr2[i4] = this.f7202e.h();
                            iArr4[i4] = this.f7202e.o();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = ila.f7335a - ((int) (j5 - ila.f7336b));
                    }
                    C1529dka dka = ila.f7338d;
                    Eja eja2 = ija2.f7321b;
                    eja2.a(i2, iArr2, iArr4, dka.f10175b, eja2.f6735a, dka.f10174a);
                    long j6 = ila.f7336b;
                    int i5 = (int) (j5 - j6);
                    ila.f7336b = j6 + ((long) i5);
                    ila.f7335a -= i5;
                }
                ija2.d(this.f7201d.f7335a);
                Ila ila2 = this.f7201d;
                long j7 = ila2.f7336b;
                ByteBuffer byteBuffer = ija2.f7322c;
                int i6 = ila2.f7335a;
                a(j7);
                while (i6 > 0) {
                    int i7 = (int) (j7 - this.f7204g.f7603a);
                    int min = Math.min(i6, this.f7199b - i7);
                    C1816hma hma = this.f7204g.f7606d;
                    byteBuffer.put(hma.f10723a, i7 + 0, min);
                    j7 += (long) min;
                    i6 -= min;
                    if (j7 == this.f7204g.f7604b) {
                        this.f7198a.a(hma);
                        this.f7204g = this.f7204g.a();
                    }
                }
                a(this.f7201d.f7337c);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    public final int a(Wja wja, int i2, boolean z) {
        if (!h()) {
            int b2 = wja.b(i2);
            if (b2 != -1) {
                return b2;
            }
            throw new EOFException();
        }
        try {
            int read = wja.read(this.f7205h.f7606d.f10723a, this.m + 0, a(i2));
            if (read != -1) {
                this.m += read;
                this.l += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            i();
        }
    }

    public final void a() {
        if (this.f7203f.getAndSet(2) == 0) {
            g();
        }
    }

    public final void a(long j2, int i2, int i3, int i4, C1529dka dka) {
        if (!h()) {
            long j3 = j2;
            this.f7200c.a(j2);
            return;
        }
        long j4 = j2;
        try {
            this.f7200c.a(j2, i2, (this.l - ((long) i3)) - ((long) i4), i3, dka);
        } finally {
            i();
        }
    }

    public final void a(Jla jla) {
        this.n = jla;
    }

    public final void a(Lia lia) {
        Lia lia2 = lia == null ? null : lia;
        boolean a2 = this.f7200c.a(lia2);
        this.k = lia;
        this.j = false;
        Jla jla = this.n;
        if (jla != null && a2) {
            jla.a(lia2);
        }
    }

    public final void a(Nma nma, int i2) {
        if (!h()) {
            nma.d(i2);
            return;
        }
        while (i2 > 0) {
            int a2 = a(i2);
            nma.a(this.f7205h.f7606d.f10723a, this.m + 0, a2);
            this.m += a2;
            this.l += (long) a2;
            i2 -= a2;
        }
        i();
    }

    public final void a(boolean z) {
        int andSet = this.f7203f.getAndSet(z ? 0 : 2);
        g();
        this.f7200c.c();
        if (andSet == 2) {
            this.i = null;
        }
    }

    public final boolean a(long j2, boolean z) {
        long a2 = this.f7200c.a(j2, z);
        if (a2 == -1) {
            return false;
        }
        a(a2);
        return true;
    }

    public final long b() {
        return this.f7200c.a();
    }

    public final int c() {
        return this.f7200c.d();
    }

    public final boolean d() {
        return this.f7200c.e();
    }

    public final Lia e() {
        return this.f7200c.f();
    }

    public final void f() {
        long g2 = this.f7200c.g();
        if (g2 != -1) {
            a(g2);
        }
    }
}
