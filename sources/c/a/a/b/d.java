package c.a.a.b;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2923a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f2924b;

    /* renamed from: c  reason: collision with root package name */
    private c f2925c;

    /* renamed from: d  reason: collision with root package name */
    private int f2926d = 0;

    private int[] a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f2924b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f2925c.f2916b = 1;
        }
        return iArr;
    }

    private void b(int i) {
        boolean z = false;
        while (!z && !c() && this.f2925c.f2917c <= i) {
            int d2 = d();
            if (d2 == 33) {
                int d3 = d();
                if (d3 != 1) {
                    if (d3 == 249) {
                        this.f2925c.f2918d = new b();
                        h();
                    } else if (d3 != 254 && d3 == 255) {
                        f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f2923a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            k();
                        }
                    }
                }
                n();
            } else if (d2 == 44) {
                c cVar = this.f2925c;
                if (cVar.f2918d == null) {
                    cVar.f2918d = new b();
                }
                e();
            } else if (d2 != 59) {
                this.f2925c.f2916b = 1;
            } else {
                z = true;
            }
        }
    }

    private boolean c() {
        return this.f2925c.f2916b != 0;
    }

    private int d() {
        try {
            return this.f2924b.get() & 255;
        } catch (Exception unused) {
            this.f2925c.f2916b = 1;
            return 0;
        }
    }

    private void e() {
        this.f2925c.f2918d.f2907a = l();
        this.f2925c.f2918d.f2908b = l();
        this.f2925c.f2918d.f2909c = l();
        this.f2925c.f2918d.f2910d = l();
        int d2 = d();
        boolean z = false;
        boolean z2 = (d2 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        b bVar = this.f2925c.f2918d;
        if ((d2 & 64) != 0) {
            z = true;
        }
        bVar.f2911e = z;
        if (z2) {
            this.f2925c.f2918d.k = a(pow);
        } else {
            this.f2925c.f2918d.k = null;
        }
        this.f2925c.f2918d.j = this.f2924b.position();
        o();
        if (!c()) {
            c cVar = this.f2925c;
            cVar.f2917c++;
            cVar.f2919e.add(cVar.f2918d);
        }
    }

    private void f() {
        this.f2926d = d();
        if (this.f2926d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f2926d) {
                try {
                    i2 = this.f2926d - i;
                    this.f2924b.get(this.f2923a, i, i2);
                    i += i2;
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f2926d, e2);
                    }
                    this.f2925c.f2916b = 1;
                    return;
                }
            }
        }
    }

    private void g() {
        b(Integer.MAX_VALUE);
    }

    private void h() {
        d();
        int d2 = d();
        b bVar = this.f2925c.f2918d;
        bVar.f2913g = (d2 & 28) >> 2;
        boolean z = true;
        if (bVar.f2913g == 0) {
            bVar.f2913g = 1;
        }
        b bVar2 = this.f2925c.f2918d;
        if ((d2 & 1) == 0) {
            z = false;
        }
        bVar2.f2912f = z;
        int l = l();
        if (l < 2) {
            l = 10;
        }
        b bVar3 = this.f2925c.f2918d;
        bVar3.i = l * 10;
        bVar3.f2914h = d();
        d();
    }

    private void i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f2925c.f2916b = 1;
            return;
        }
        j();
        if (this.f2925c.f2922h && !c()) {
            c cVar = this.f2925c;
            cVar.f2915a = a(cVar.i);
            c cVar2 = this.f2925c;
            cVar2.l = cVar2.f2915a[cVar2.j];
        }
    }

    private void j() {
        this.f2925c.f2920f = l();
        this.f2925c.f2921g = l();
        int d2 = d();
        this.f2925c.f2922h = (d2 & 128) != 0;
        this.f2925c.i = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        this.f2925c.j = d();
        this.f2925c.k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.f2923a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            c.a.a.b.c r2 = r3.f2925c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.m = r0
        L_0x001b:
            int r0 = r3.f2926d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.b.d.k():void");
    }

    private int l() {
        return this.f2924b.getShort();
    }

    private void m() {
        this.f2924b = null;
        Arrays.fill(this.f2923a, (byte) 0);
        this.f2925c = new c();
        this.f2926d = 0;
    }

    private void n() {
        int d2;
        do {
            d2 = d();
            this.f2924b.position(Math.min(this.f2924b.position() + d2, this.f2924b.limit()));
        } while (d2 > 0);
    }

    private void o() {
        d();
        n();
    }

    public d a(ByteBuffer byteBuffer) {
        m();
        this.f2924b = byteBuffer.asReadOnlyBuffer();
        this.f2924b.position(0);
        this.f2924b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void a() {
        this.f2924b = null;
        this.f2925c = null;
    }

    public c b() {
        if (this.f2924b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (c()) {
            return this.f2925c;
        } else {
            i();
            if (!c()) {
                g();
                c cVar = this.f2925c;
                if (cVar.f2917c < 0) {
                    cVar.f2916b = 1;
                }
            }
            return this.f2925c;
        }
    }
}
