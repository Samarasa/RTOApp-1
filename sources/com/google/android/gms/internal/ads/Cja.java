package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class Cja implements C1385bja {

    /* renamed from: a  reason: collision with root package name */
    private int f6452a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f6453b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Dja f6454c;

    /* renamed from: d  reason: collision with root package name */
    private float f6455d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f6456e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f6457f = C1385bja.f9951a;

    /* renamed from: g  reason: collision with root package name */
    private ShortBuffer f6458g = this.f6457f.asShortBuffer();

    /* renamed from: h  reason: collision with root package name */
    private ByteBuffer f6459h = C1385bja.f9951a;
    private long i;
    private long j;
    private boolean k;

    public final float a(float f2) {
        this.f6455d = Tma.a(f2, 0.1f, 8.0f);
        return this.f6455d;
    }

    public final void a() {
        this.f6454c.a();
        this.k = true;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.i += (long) remaining;
            this.f6454c.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b2 = (this.f6454c.b() * this.f6452a) << 1;
        if (b2 > 0) {
            if (this.f6457f.capacity() < b2) {
                this.f6457f = ByteBuffer.allocateDirect(b2).order(ByteOrder.nativeOrder());
                this.f6458g = this.f6457f.asShortBuffer();
            } else {
                this.f6457f.clear();
                this.f6458g.clear();
            }
            this.f6454c.b(this.f6458g);
            this.j += (long) b2;
            this.f6457f.limit(b2);
            this.f6459h = this.f6457f;
        }
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 != 2) {
            throw new C1597eja(i2, i3, i4);
        } else if (this.f6453b == i2 && this.f6452a == i3) {
            return false;
        } else {
            this.f6453b = i2;
            this.f6452a = i3;
            return true;
        }
    }

    public final float b(float f2) {
        this.f6456e = Tma.a(f2, 0.1f, 8.0f);
        return f2;
    }

    public final ByteBuffer b() {
        ByteBuffer byteBuffer = this.f6459h;
        this.f6459h = C1385bja.f9951a;
        return byteBuffer;
    }

    public final int c() {
        return this.f6452a;
    }

    public final boolean d() {
        return Math.abs(this.f6455d - 1.0f) >= 0.01f || Math.abs(this.f6456e - 1.0f) >= 0.01f;
    }

    public final int e() {
        return 2;
    }

    public final long f() {
        return this.i;
    }

    public final void flush() {
        this.f6454c = new Dja(this.f6453b, this.f6452a);
        this.f6454c.a(this.f6455d);
        this.f6454c.b(this.f6456e);
        this.f6459h = C1385bja.f9951a;
        this.i = 0;
        this.j = 0;
        this.k = false;
    }

    public final long g() {
        return this.j;
    }

    public final void reset() {
        this.f6454c = null;
        this.f6457f = C1385bja.f9951a;
        this.f6458g = this.f6457f.asShortBuffer();
        this.f6459h = C1385bja.f9951a;
        this.f6452a = -1;
        this.f6453b = -1;
        this.i = 0;
        this.j = 0;
        this.k = false;
    }

    public final boolean u() {
        if (!this.k) {
            return false;
        }
        Dja dja = this.f6454c;
        return dja == null || dja.b() == 0;
    }
}
